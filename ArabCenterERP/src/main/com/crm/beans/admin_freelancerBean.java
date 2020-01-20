package main.com.crm.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.primefaces.event.TabChangeEvent;

import main.com.crm.loginNeeds.user;
import main.com.crm.models.fieldMainFields;
import main.com.crm.models.userModificationFreelancer;
import main.com.crm.work_field.work_field;
import main.com.crm.work_field.work_fieldAppServiceImpl;
import main.com.crm.work_field_user.work_field_user;
import main.com.crm.work_field_user.work_field_userAppServiceImpl;


@ManagedBean(name = "admin_freelancerBean")
@SessionScoped
public class admin_freelancerBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6715784400190397743L;

    private List<String> selectedSkills;
    private List<String> selectedEx_Skills;
    

	@ManagedProperty(value = "#{work_fieldFacadeImpl}")
	private work_fieldAppServiceImpl work_fieldDataFacede; 
	

	@ManagedProperty(value = "#{work_field_userFacadeImpl}")
	private work_field_userAppServiceImpl work_field_userDataFacede; 
	
	
	

	@ManagedProperty(value = "#{loginBean}")
	private main.com.crm.loginNeeds.loginBean loginBean; 
	
	private user selectedFreelancer;
	
	

    private List<work_field> listOfAllMainGateg;
    

    private List<work_field_user> listOfAllUser;

    private List<fieldMainFields> listOfAllMainGategStructure;
   
    

    private List<work_field> allFields;
    private List<work_field> allExFields;
    
    

    private List<work_field_user> newListUsers; 
    private List<work_field_user> hotListUsers; 
    private List<work_field_user> coldListUsers; 
    private List<work_field_user> oldListUsers; 


    private userModificationFreelancer selectedUserToBeModified;
    
	@PostConstruct
	public void init() {
		allFields= work_fieldDataFacede.getAllWithType(work_field.work_field_TYPE_SKILL);
	}
	
	 public void onUserTabChange(TabChangeEvent event) {
		 
		 int fieldUserId = Integer.valueOf((event.getTab().getTitletip()));
		 System.out.println("MohamedAbas: "+fieldUserId);
		 selectedUserToBeModified( fieldUserId);
	    }
	
	public void selectedUserToBeModified(int idFieldUser) {
		
		work_field_user wFU = work_field_userDataFacede.getById(idFieldUser);
		List<String>comments=new ArrayList<String>();
		comments.add("please modify it8");
		comments.add("please modify it7");
		comments.add("please modify it6");
		comments.add("please modify it5");
		comments.add("please modify it4");
		comments.add("please modify it3");
		comments.add("please modify it1");
		comments.add("please modify it2");
		selectedUserToBeModified=new userModificationFreelancer(wFU, loginBean.getTheUserOfThisAccount(), "99", "99", "99", "99", comments,userModificationFreelancer.IsLike);

		
		PrimeFaces.current().executeScript("reloadAllselectedUserToBeModified();");
	}
	
	public void modifyFreelancer(int userId) {
		selectedFreelancer =loginBean.getUserDataFacede().getById(userId);
		
		if(selectedFreelancer!=null) {
			List<work_field_user>selectedSkills_User = work_field_userDataFacede.getAllFieldsOfUserOfType(selectedFreelancer.getId(),work_field.work_field_TYPE_SKILL);
			 selectedSkills = new ArrayList<String>();
			 if(selectedSkills_User!=null) {
				 for(int i=0;i<selectedSkills_User.size();i++) {
					 selectedSkills.add(selectedSkills_User.get(i).getWork_fieldId().getField());
				}
			 }
			 
			
			 
			 List<work_field_user>selectedExSkills_User = work_field_userDataFacede.getAllFieldsOfUserOfType(selectedFreelancer.getId(),work_field.work_field_TYPE_EX_SKILL);
			 selectedEx_Skills = new ArrayList<String>();
			 if(selectedExSkills_User!=null) {
				 for(int i=0;i<selectedExSkills_User.size();i++) {
					 selectedEx_Skills.add(selectedExSkills_User.get(i).getWork_fieldId().getField());
				}
			 }
			}
		
		
		try {
			
			FacesContext.getCurrentInstance()
				   .getExternalContext().redirect("/pages/ar/secured/admin/modifyfreelancer.jsf?faces-redirect=true");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void fetchlistOfAllUserOfGateg() {
		
		
		listOfAllMainGateg=work_fieldDataFacede.getAllWithType(work_field.work_field_TYPE_SKILL);
		listOfAllUser=work_field_userDataFacede.getAll();
		
		newListUsers = work_field_userDataFacede.getAllHaveEvalLikelessThanAndDislikeMoreThan( work_field_user.New_EqualOrLessThanLike, work_field_user.New_EqualOrMoreThanDisLike);
		hotListUsers = work_field_userDataFacede.getAllHaveEvalDiffLikeAndDislikeMoreThan( work_field_user.HotListEqualOrMoreThan);
		coldListUsers = work_field_userDataFacede.getAllHaveEvalDiffLikeAndDislikeLessThan( work_field_user.ColdListEqualOrLess);
		oldListUsers = work_field_userDataFacede.getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThan( user.VACATIONSTATE_In_VACATION,work_field_user.OldLessThanOrEqual);

		
		listOfAllMainGategStructure=new ArrayList<fieldMainFields>();
		
		for(int i=0;i<listOfAllMainGateg.size();i++) {
			fieldMainFields fieldMF=new fieldMainFields(listOfAllMainGateg.get(i), work_fieldDataFacede, work_field_userDataFacede);
			listOfAllMainGategStructure.add(fieldMF);
		}
		  
	}
	
	
	public void refresh(){
		allFields= work_fieldDataFacede.getAllWithType(work_field.work_field_TYPE_SKILL);
		
		selectedFreelancer=new user();
		
	}
	
	public void fetchAllExFields() {
		System.out.println("AhmedOk");
		
		if(selectedSkills.size()>0) {
			allExFields= new ArrayList<work_field>();
			
		for(int i=0;i<selectedSkills.size();i++) {
			work_field wf = work_fieldDataFacede.getByField(selectedSkills.get(i));
			
			List<work_field>wFList =  work_fieldDataFacede.getAllWithRelatedToField(wf.getId());
			if(wFList!=null) {
			allExFields.addAll(wFList);
			
			}
		}
		
		
		}
	        
		FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("formMain:user_skills-panel");
		
	}
	
	

	public void addNewFreelancer() {
		loginBean.getUserDataFacede().adduser(selectedFreelancer);
		List<work_field_user> deletedworkFieldForThisUser = work_field_userDataFacede.getAllFieldsOfUserOfType(selectedFreelancer.getId(),work_field.work_field_TYPE_SKILL);
		
		if(deletedworkFieldForThisUser!=null) {
		deletedworkFieldForThisUser.addAll(work_field_userDataFacede.getAllFieldsOfUserOfType(selectedFreelancer.getId(),work_field.work_field_TYPE_EX_SKILL));
		System.out.println("AhmedSize: "+deletedworkFieldForThisUser.size());
		for(int i=0;i<deletedworkFieldForThisUser.size();i++) {
			work_field_userDataFacede.delete(deletedworkFieldForThisUser.get(i));
		}
		}
		
		if(selectedSkills!=null) {	
	    	System.out.println("Ahmed3: "+selectedSkills.size());
		for(int i=0;i<selectedSkills.size();i++) {
			work_field wf =work_fieldDataFacede.getByField(selectedSkills.get(i));
			work_field_user workFieldUser=new work_field_user();
			workFieldUser.setUserId(selectedFreelancer);
			workFieldUser.setWork_fieldId(wf);

			work_field_userDataFacede.addwork_field_user(workFieldUser);
			
		}
		
	}
		if(selectedEx_Skills!=null) {
		for(int i=0;i<selectedEx_Skills.size();i++) {
			
			work_field wf =work_fieldDataFacede.getByField(selectedEx_Skills.get(i));
			work_field_user workFieldUser=new work_field_user();
			workFieldUser.setUserId(selectedFreelancer);
			workFieldUser.setWork_fieldId(wf);

			work_field_userDataFacede.addwork_field_user(workFieldUser);
			
		
			
		}
		}
		
		try {
			
			FacesContext.getCurrentInstance()
				   .getExternalContext().redirect("/pages/ar/secured/admin/freelancersList.jsf?faces-redirect=true");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> getSelectedSkills() {
		return selectedSkills;
	}

	public void setSelectedSkills(List<String> selectedSkills) {
		this.selectedSkills = selectedSkills;
	}

	
	public work_fieldAppServiceImpl getWork_fieldDataFacede() {
		return work_fieldDataFacede;
	}

	public void setWork_fieldDataFacede(work_fieldAppServiceImpl work_fieldDataFacede) {
		this.work_fieldDataFacede = work_fieldDataFacede;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public main.com.crm.loginNeeds.loginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(main.com.crm.loginNeeds.loginBean loginBean) {
		this.loginBean = loginBean;
	}

	public List<String> getSelectedEx_Skills() {
		return selectedEx_Skills;
	}

	public void setSelectedEx_Skills(List<String> selectedEx_Skills) {
		this.selectedEx_Skills = selectedEx_Skills;
	}

	public work_field_userAppServiceImpl getWork_field_userDataFacede() {
		return work_field_userDataFacede;
	}

	public void setWork_field_userDataFacede(work_field_userAppServiceImpl work_field_userDataFacede) {
		this.work_field_userDataFacede = work_field_userDataFacede;
	}

	public user getSelectedFreelancer() {
		return selectedFreelancer;
	}

	public void setSelectedFreelancer(user selectedFreelancer) {
		this.selectedFreelancer = selectedFreelancer;
	}


	public List<work_field> getListOfAllMainGateg() {
		return listOfAllMainGateg;
	}

	public void setListOfAllMainGateg(List<work_field> listOfAllMainGateg) {
		this.listOfAllMainGateg = listOfAllMainGateg;
	}

	public List<fieldMainFields> getListOfAllMainGategStructure() {
		return listOfAllMainGategStructure;
	}

	public void setListOfAllMainGategStructure(List<fieldMainFields> listOfAllMainGategStructure) {
		this.listOfAllMainGategStructure = listOfAllMainGategStructure;
	}

	public List<work_field_user> getListOfAllUser() {
		return listOfAllUser;
	}

	public void setListOfAllUser(List<work_field_user> listOfAllUser) {
		this.listOfAllUser = listOfAllUser;
	}

	
	public List<work_field> getAllFields() {
		return allFields;
	}

	public void setAllFields(List<work_field> allFields) {
		this.allFields = allFields;
	}

	public List<work_field> getAllExFields() {
		return allExFields;
	}

	public void setAllExFields(List<work_field> allExFields) {
		this.allExFields = allExFields;
	}

	public List<work_field_user> getNewListUsers() {
		return newListUsers;
	}

	public void setNewListUsers(List<work_field_user> newListUsers) {
		this.newListUsers = newListUsers;
	}

	public List<work_field_user> getHotListUsers() {
		return hotListUsers;
	}

	public void setHotListUsers(List<work_field_user> hotListUsers) {
		this.hotListUsers = hotListUsers;
	}

	public List<work_field_user> getColdListUsers() {
		return coldListUsers;
	}

	public void setColdListUsers(List<work_field_user> coldListUsers) {
		this.coldListUsers = coldListUsers;
	}

	public List<work_field_user> getOldListUsers() {
		return oldListUsers;
	}

	public void setOldListUsers(List<work_field_user> oldListUsers) {
		this.oldListUsers = oldListUsers;
	}


	public userModificationFreelancer getSelectedUserToBeModified() {
		return selectedUserToBeModified;
	}


	public void setSelectedUserToBeModified(userModificationFreelancer selectedUserToBeModified) {
		this.selectedUserToBeModified = selectedUserToBeModified;
	}
     
	
	
	
	
	
	
	
	

	
}
