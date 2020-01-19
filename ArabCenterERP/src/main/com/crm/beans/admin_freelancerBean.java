package main.com.crm.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import main.com.crm.loginNeeds.user;
import main.com.crm.models.fieldExFields;
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

    private List<work_field> selectedSkills;
    private List<work_field> selectedEx_Skills;
    

	@ManagedProperty(value = "#{work_fieldFacadeImpl}")
	private work_fieldAppServiceImpl work_fieldDataFacede; 
	

	@ManagedProperty(value = "#{work_field_userFacadeImpl}")
	private work_field_userAppServiceImpl work_field_userDataFacede; 
	
	
	

	@ManagedProperty(value = "#{loginBean}")
	private main.com.crm.loginNeeds.loginBean loginBean; 
	
	private user selectedFreelancer;
	
	

    private List<work_field> listOfAllGateg;
    

    private List<work_field_user> listOfAllUser;

    private List<work_field_user> listOfAllUserOfGateg1;
    private List<work_field_user> listOfAllUserOfGateg1_Type1;
    private List<work_field_user> listOfAllUserOfGateg1_Type2;
    private List<work_field_user> listOfAllUserOfGateg1_Type3;
    private List<work_field_user> listOfAllUserOfGateg1_Type4;
    /**
     * this contain all fields related to the main field with the user include
     * in the extended field
     */
    
    private fieldExFields listOfAllFieldRelatedToGateg1;
    
    

    private List<work_field_user> listOfAllUserOfGateg2;
    private List<work_field_user> listOfAllUserOfGateg2_Type1;
    private List<work_field_user> listOfAllUserOfGateg2_Type2;
    private List<work_field_user> listOfAllUserOfGateg2_Type3;
    private List<work_field_user> listOfAllUserOfGateg2_Type4;
    

    private List<work_field_user> listOfAllUserOfGateg3;
    private List<work_field_user> listOfAllUserOfGateg3_Type1;
    private List<work_field_user> listOfAllUserOfGateg3_Type2;
    private List<work_field_user> listOfAllUserOfGateg3_Type3;
    private List<work_field_user> listOfAllUserOfGateg3_Type4;
    

    private List<work_field_user> listOfAllUserOfGateg4;
    private List<work_field_user> listOfAllUserOfGateg4_Type1;
    private List<work_field_user> listOfAllUserOfGateg4_Type2;
    private List<work_field_user> listOfAllUserOfGateg4_Type3;
    private List<work_field_user> listOfAllUserOfGateg4_Type4;
    
    

    private List<work_field_user> listOfAllUserOfGateg5;
    private List<work_field_user> listOfAllUserOfGateg5_Type1;
    private List<work_field_user> listOfAllUserOfGateg5_Type2;
    private List<work_field_user> listOfAllUserOfGateg5_Type3;
    private List<work_field_user> listOfAllUserOfGateg5_Type4;
    
    

    private List<work_field_user> listOfAllUserOfGateg6;
    private List<work_field_user> listOfAllUserOfGateg6_Type1;
    private List<work_field_user> listOfAllUserOfGateg6_Type2;
    private List<work_field_user> listOfAllUserOfGateg6_Type3;
    private List<work_field_user> listOfAllUserOfGateg6_Type4;
    
    

    private List<work_field_user> listOfAllUserOfGateg7;
    private List<work_field_user> listOfAllUserOfGateg7_Type1;
    private List<work_field_user> listOfAllUserOfGateg7_Type2;
    private List<work_field_user> listOfAllUserOfGateg7_Type3;
    private List<work_field_user> listOfAllUserOfGateg7_Type4;
    
    
    
	@PostConstruct
	public void init() {
	
	}
	
	public void fetchlistOfAllUserOfGateg() {
		
		
		listOfAllGateg=work_fieldDataFacede.getAll();
		listOfAllUser=work_field_userDataFacede.getAll();
		
		   listOfAllUserOfGateg1=work_field_userDataFacede.getAllByField(29);
		   listOfAllUserOfGateg1_Type1=work_field_userDataFacede.getAllByField( 29);
		   listOfAllUserOfGateg1_Type2=work_field_userDataFacede.getAllByField( 29);
		   listOfAllUserOfGateg1_Type3=work_field_userDataFacede.getAllByField( 29);
		   listOfAllUserOfGateg1_Type4=work_field_userDataFacede.getAllByField( 29);		   
		   listOfAllFieldRelatedToGateg1=new fieldExFields(listOfAllGateg.get(0), work_fieldDataFacede, work_field_userDataFacede);
		
		   
		   
		   
		   listOfAllUserOfGateg2=work_field_userDataFacede.getAllByField( 30);
		   listOfAllUserOfGateg2_Type1=work_field_userDataFacede.getAllByField( 30);
		   listOfAllUserOfGateg2_Type2=work_field_userDataFacede.getAllByField( 30);
		   listOfAllUserOfGateg2_Type3=work_field_userDataFacede.getAllByField( 30);
		   listOfAllUserOfGateg2_Type4=work_field_userDataFacede.getAllByField( 30);
		
		   
		   listOfAllUserOfGateg3=work_field_userDataFacede.getAllByField( 31);
		   listOfAllUserOfGateg3_Type1=work_field_userDataFacede.getAllByField( 31);
		   listOfAllUserOfGateg3_Type2=work_field_userDataFacede.getAllByField( 31);
		   listOfAllUserOfGateg3_Type3=work_field_userDataFacede.getAllByField( 31);
		   listOfAllUserOfGateg3_Type4=work_field_userDataFacede.getAllByField( 31);
		
		   
		   listOfAllUserOfGateg4=work_field_userDataFacede.getAllByField( 42);
		   listOfAllUserOfGateg4_Type1=work_field_userDataFacede.getAllByField( 42);
		   listOfAllUserOfGateg4_Type2=work_field_userDataFacede.getAllByField( 42);
		   listOfAllUserOfGateg4_Type3=work_field_userDataFacede.getAllByField( 42);
		   listOfAllUserOfGateg4_Type4=work_field_userDataFacede.getAllByField( 42);
		
		   
		   listOfAllUserOfGateg5=work_field_userDataFacede.getAllByField( 43);
		   listOfAllUserOfGateg5_Type1=work_field_userDataFacede.getAllByField( 43);
		   listOfAllUserOfGateg5_Type2=work_field_userDataFacede.getAllByField( 43);
		   listOfAllUserOfGateg5_Type3=work_field_userDataFacede.getAllByField( 43);
		   listOfAllUserOfGateg5_Type4=work_field_userDataFacede.getAllByField( 43);
		
		   
		   listOfAllUserOfGateg6=work_field_userDataFacede.getAllByField( 44);
		   listOfAllUserOfGateg6_Type1=work_field_userDataFacede.getAllByField( 44);
		   listOfAllUserOfGateg6_Type2=work_field_userDataFacede.getAllByField( 44);
		   listOfAllUserOfGateg6_Type3=work_field_userDataFacede.getAllByField( 44);
		   listOfAllUserOfGateg6_Type4=work_field_userDataFacede.getAllByField( 44);
	
		   
		   listOfAllUserOfGateg7=work_field_userDataFacede.getAllByField( 45);
		   listOfAllUserOfGateg7_Type1=work_field_userDataFacede.getAllByField( 45);
		   listOfAllUserOfGateg7_Type2=work_field_userDataFacede.getAllByField( 45);
		   listOfAllUserOfGateg7_Type3=work_field_userDataFacede.getAllByField( 45);
		   listOfAllUserOfGateg7_Type4=work_field_userDataFacede.getAllByField( 45);
		
	}
	
	
	public void refresh(){
		
		
		selectedFreelancer=loginBean.getUserDataFacede().getById(1);
		if(selectedFreelancer!=null) {
		List<work_field_user>selectedSkills_User = work_field_userDataFacede.getAllFieldsOfUserOfType(selectedFreelancer.getId(),work_field.work_field_TYPE_SKILL);
		 selectedSkills = new ArrayList<work_field>();
		 if(selectedSkills_User!=null) {
			 for(int i=0;i<selectedSkills_User.size();i++) {
				 selectedSkills.add(selectedSkills_User.get(i).getWork_fieldId());
			}
		 }
		 
		
		 
		 List<work_field_user>selectedExSkills_User = work_field_userDataFacede.getAllFieldsOfUserOfType(selectedFreelancer.getId(),work_field.work_field_TYPE_EX_SKILL);
		 selectedEx_Skills = new ArrayList<work_field>();
		 if(selectedExSkills_User!=null) {
			 for(int i=0;i<selectedExSkills_User.size();i++) {
				 selectedEx_Skills.add(selectedExSkills_User.get(i).getWork_fieldId());
			}
		 }
		}
	}
	
	
	public List<work_field> completeSkills(String query) {
        String queryLowerCase = query.toLowerCase();
        List<work_field> allTags= work_fieldDataFacede.getAllWithType(work_field.work_field_TYPE_SKILL);
        List<work_field> filteredTags=null;
        if(allTags!=null) {
         filteredTags =  allTags.stream().filter(t -> t.getField().toLowerCase().startsWith(queryLowerCase)).collect(Collectors.toList());
        }
        

        return filteredTags;
    }
	
	public List<work_field> completeExSkills(String query) {
		
		 String queryLowerCase = query.toLowerCase();
	        List<work_field> allTags= work_fieldDataFacede.getAllWithType(work_field.work_field_TYPE_EX_SKILL);
	        
	        
	        List<work_field> filteredTags=null;
	        if(allTags!=null) {
	         filteredTags =  allTags.stream().filter(t -> t.getField().toLowerCase().startsWith(queryLowerCase)).collect(Collectors.toList());
	        }
	        

	        return filteredTags;
	        
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
			work_field_user workFieldUser=new work_field_user();
			workFieldUser.setUserId(selectedFreelancer);
			workFieldUser.setWork_fieldId(selectedSkills.get(i));

	    	System.out.println("Ahmed3: "+String.valueOf(workFieldUser.getWork_fieldId().getField()));
			work_field_userDataFacede.addwork_field_user(workFieldUser);
			
		}
		
	}
		if(selectedEx_Skills!=null) {
		for(int i=0;i<selectedEx_Skills.size();i++) {
			work_field_user workFieldUser=new work_field_user();
			workFieldUser.setUserId(selectedFreelancer);
			workFieldUser.setWork_fieldId(selectedEx_Skills.get(i));
			work_field_userDataFacede.addwork_field_user(workFieldUser);
			
		}
		}
		
		
	}
	public List<work_field> getSelectedSkills() {
		return selectedSkills;
	}

	public void setSelectedSkills(List<work_field> selectedSkills) {
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

	public List<work_field> getSelectedEx_Skills() {
		return selectedEx_Skills;
	}

	public void setSelectedEx_Skills(List<work_field> selectedEx_Skills) {
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

	public List<work_field_user> getListOfAllUserOfGateg1() {
		return listOfAllUserOfGateg1;
	}

	public void setListOfAllUserOfGateg1(List<work_field_user> listOfAllUserOfGateg1) {
		this.listOfAllUserOfGateg1 = listOfAllUserOfGateg1;
	}

	public List<work_field_user> getListOfAllUserOfGateg1_Type1() {
		return listOfAllUserOfGateg1_Type1;
	}

	public void setListOfAllUserOfGateg1_Type1(List<work_field_user> listOfAllUserOfGateg1_Type1) {
		this.listOfAllUserOfGateg1_Type1 = listOfAllUserOfGateg1_Type1;
	}

	public List<work_field_user> getListOfAllUserOfGateg1_Type2() {
		return listOfAllUserOfGateg1_Type2;
	}

	public void setListOfAllUserOfGateg1_Type2(List<work_field_user> listOfAllUserOfGateg1_Type2) {
		this.listOfAllUserOfGateg1_Type2 = listOfAllUserOfGateg1_Type2;
	}

	public List<work_field_user> getListOfAllUserOfGateg1_Type3() {
		return listOfAllUserOfGateg1_Type3;
	}

	public void setListOfAllUserOfGateg1_Type3(List<work_field_user> listOfAllUserOfGateg1_Type3) {
		this.listOfAllUserOfGateg1_Type3 = listOfAllUserOfGateg1_Type3;
	}

	public List<work_field_user> getListOfAllUserOfGateg1_Type4() {
		return listOfAllUserOfGateg1_Type4;
	}

	public void setListOfAllUserOfGateg1_Type4(List<work_field_user> listOfAllUserOfGateg1_Type4) {
		this.listOfAllUserOfGateg1_Type4 = listOfAllUserOfGateg1_Type4;
	}

	public List<work_field_user> getListOfAllUserOfGateg2() {
		return listOfAllUserOfGateg2;
	}

	public void setListOfAllUserOfGateg2(List<work_field_user> listOfAllUserOfGateg2) {
		this.listOfAllUserOfGateg2 = listOfAllUserOfGateg2;
	}

	public List<work_field_user> getListOfAllUserOfGateg2_Type1() {
		return listOfAllUserOfGateg2_Type1;
	}

	public void setListOfAllUserOfGateg2_Type1(List<work_field_user> listOfAllUserOfGateg2_Type1) {
		this.listOfAllUserOfGateg2_Type1 = listOfAllUserOfGateg2_Type1;
	}

	public List<work_field_user> getListOfAllUserOfGateg2_Type2() {
		return listOfAllUserOfGateg2_Type2;
	}

	public void setListOfAllUserOfGateg2_Type2(List<work_field_user> listOfAllUserOfGateg2_Type2) {
		this.listOfAllUserOfGateg2_Type2 = listOfAllUserOfGateg2_Type2;
	}

	public List<work_field_user> getListOfAllUserOfGateg2_Type3() {
		return listOfAllUserOfGateg2_Type3;
	}

	public void setListOfAllUserOfGateg2_Type3(List<work_field_user> listOfAllUserOfGateg2_Type3) {
		this.listOfAllUserOfGateg2_Type3 = listOfAllUserOfGateg2_Type3;
	}

	public List<work_field_user> getListOfAllUserOfGateg2_Type4() {
		return listOfAllUserOfGateg2_Type4;
	}

	public void setListOfAllUserOfGateg2_Type4(List<work_field_user> listOfAllUserOfGateg2_Type4) {
		this.listOfAllUserOfGateg2_Type4 = listOfAllUserOfGateg2_Type4;
	}

	public List<work_field_user> getListOfAllUserOfGateg3() {
		return listOfAllUserOfGateg3;
	}

	public void setListOfAllUserOfGateg3(List<work_field_user> listOfAllUserOfGateg3) {
		this.listOfAllUserOfGateg3 = listOfAllUserOfGateg3;
	}

	public List<work_field_user> getListOfAllUserOfGateg3_Type1() {
		return listOfAllUserOfGateg3_Type1;
	}

	public void setListOfAllUserOfGateg3_Type1(List<work_field_user> listOfAllUserOfGateg3_Type1) {
		this.listOfAllUserOfGateg3_Type1 = listOfAllUserOfGateg3_Type1;
	}

	public List<work_field_user> getListOfAllUserOfGateg3_Type2() {
		return listOfAllUserOfGateg3_Type2;
	}

	public void setListOfAllUserOfGateg3_Type2(List<work_field_user> listOfAllUserOfGateg3_Type2) {
		this.listOfAllUserOfGateg3_Type2 = listOfAllUserOfGateg3_Type2;
	}

	public List<work_field_user> getListOfAllUserOfGateg3_Type3() {
		return listOfAllUserOfGateg3_Type3;
	}

	public void setListOfAllUserOfGateg3_Type3(List<work_field_user> listOfAllUserOfGateg3_Type3) {
		this.listOfAllUserOfGateg3_Type3 = listOfAllUserOfGateg3_Type3;
	}

	public List<work_field_user> getListOfAllUserOfGateg3_Type4() {
		return listOfAllUserOfGateg3_Type4;
	}

	public void setListOfAllUserOfGateg3_Type4(List<work_field_user> listOfAllUserOfGateg3_Type4) {
		this.listOfAllUserOfGateg3_Type4 = listOfAllUserOfGateg3_Type4;
	}

	public List<work_field_user> getListOfAllUserOfGateg4() {
		return listOfAllUserOfGateg4;
	}

	public void setListOfAllUserOfGateg4(List<work_field_user> listOfAllUserOfGateg4) {
		this.listOfAllUserOfGateg4 = listOfAllUserOfGateg4;
	}

	public List<work_field_user> getListOfAllUserOfGateg4_Type1() {
		return listOfAllUserOfGateg4_Type1;
	}

	public void setListOfAllUserOfGateg4_Type1(List<work_field_user> listOfAllUserOfGateg4_Type1) {
		this.listOfAllUserOfGateg4_Type1 = listOfAllUserOfGateg4_Type1;
	}

	public List<work_field_user> getListOfAllUserOfGateg4_Type2() {
		return listOfAllUserOfGateg4_Type2;
	}

	public void setListOfAllUserOfGateg4_Type2(List<work_field_user> listOfAllUserOfGateg4_Type2) {
		this.listOfAllUserOfGateg4_Type2 = listOfAllUserOfGateg4_Type2;
	}

	public List<work_field_user> getListOfAllUserOfGateg4_Type3() {
		return listOfAllUserOfGateg4_Type3;
	}

	public void setListOfAllUserOfGateg4_Type3(List<work_field_user> listOfAllUserOfGateg4_Type3) {
		this.listOfAllUserOfGateg4_Type3 = listOfAllUserOfGateg4_Type3;
	}

	public List<work_field_user> getListOfAllUserOfGateg4_Type4() {
		return listOfAllUserOfGateg4_Type4;
	}

	public void setListOfAllUserOfGateg4_Type4(List<work_field_user> listOfAllUserOfGateg4_Type4) {
		this.listOfAllUserOfGateg4_Type4 = listOfAllUserOfGateg4_Type4;
	}

	public List<work_field_user> getListOfAllUserOfGateg5() {
		return listOfAllUserOfGateg5;
	}

	public void setListOfAllUserOfGateg5(List<work_field_user> listOfAllUserOfGateg5) {
		this.listOfAllUserOfGateg5 = listOfAllUserOfGateg5;
	}

	public List<work_field_user> getListOfAllUserOfGateg5_Type1() {
		return listOfAllUserOfGateg5_Type1;
	}

	public void setListOfAllUserOfGateg5_Type1(List<work_field_user> listOfAllUserOfGateg5_Type1) {
		this.listOfAllUserOfGateg5_Type1 = listOfAllUserOfGateg5_Type1;
	}

	public List<work_field_user> getListOfAllUserOfGateg5_Type2() {
		return listOfAllUserOfGateg5_Type2;
	}

	public void setListOfAllUserOfGateg5_Type2(List<work_field_user> listOfAllUserOfGateg5_Type2) {
		this.listOfAllUserOfGateg5_Type2 = listOfAllUserOfGateg5_Type2;
	}

	public List<work_field_user> getListOfAllUserOfGateg5_Type3() {
		return listOfAllUserOfGateg5_Type3;
	}

	public void setListOfAllUserOfGateg5_Type3(List<work_field_user> listOfAllUserOfGateg5_Type3) {
		this.listOfAllUserOfGateg5_Type3 = listOfAllUserOfGateg5_Type3;
	}

	public List<work_field_user> getListOfAllUserOfGateg5_Type4() {
		return listOfAllUserOfGateg5_Type4;
	}

	public void setListOfAllUserOfGateg5_Type4(List<work_field_user> listOfAllUserOfGateg5_Type4) {
		this.listOfAllUserOfGateg5_Type4 = listOfAllUserOfGateg5_Type4;
	}

	public List<work_field_user> getListOfAllUserOfGateg6() {
		return listOfAllUserOfGateg6;
	}

	public void setListOfAllUserOfGateg6(List<work_field_user> listOfAllUserOfGateg6) {
		this.listOfAllUserOfGateg6 = listOfAllUserOfGateg6;
	}

	public List<work_field_user> getListOfAllUserOfGateg6_Type1() {
		return listOfAllUserOfGateg6_Type1;
	}

	public void setListOfAllUserOfGateg6_Type1(List<work_field_user> listOfAllUserOfGateg6_Type1) {
		this.listOfAllUserOfGateg6_Type1 = listOfAllUserOfGateg6_Type1;
	}

	public List<work_field_user> getListOfAllUserOfGateg6_Type2() {
		return listOfAllUserOfGateg6_Type2;
	}

	public void setListOfAllUserOfGateg6_Type2(List<work_field_user> listOfAllUserOfGateg6_Type2) {
		this.listOfAllUserOfGateg6_Type2 = listOfAllUserOfGateg6_Type2;
	}

	public List<work_field_user> getListOfAllUserOfGateg6_Type3() {
		return listOfAllUserOfGateg6_Type3;
	}

	public void setListOfAllUserOfGateg6_Type3(List<work_field_user> listOfAllUserOfGateg6_Type3) {
		this.listOfAllUserOfGateg6_Type3 = listOfAllUserOfGateg6_Type3;
	}

	public List<work_field_user> getListOfAllUserOfGateg6_Type4() {
		return listOfAllUserOfGateg6_Type4;
	}

	public void setListOfAllUserOfGateg6_Type4(List<work_field_user> listOfAllUserOfGateg6_Type4) {
		this.listOfAllUserOfGateg6_Type4 = listOfAllUserOfGateg6_Type4;
	}

	public List<work_field_user> getListOfAllUserOfGateg7() {
		return listOfAllUserOfGateg7;
	}

	public void setListOfAllUserOfGateg7(List<work_field_user> listOfAllUserOfGateg7) {
		this.listOfAllUserOfGateg7 = listOfAllUserOfGateg7;
	}

	public List<work_field_user> getListOfAllUserOfGateg7_Type1() {
		return listOfAllUserOfGateg7_Type1;
	}

	public void setListOfAllUserOfGateg7_Type1(List<work_field_user> listOfAllUserOfGateg7_Type1) {
		this.listOfAllUserOfGateg7_Type1 = listOfAllUserOfGateg7_Type1;
	}

	public List<work_field_user> getListOfAllUserOfGateg7_Type2() {
		return listOfAllUserOfGateg7_Type2;
	}

	public void setListOfAllUserOfGateg7_Type2(List<work_field_user> listOfAllUserOfGateg7_Type2) {
		this.listOfAllUserOfGateg7_Type2 = listOfAllUserOfGateg7_Type2;
	}

	public List<work_field_user> getListOfAllUserOfGateg7_Type3() {
		return listOfAllUserOfGateg7_Type3;
	}

	public void setListOfAllUserOfGateg7_Type3(List<work_field_user> listOfAllUserOfGateg7_Type3) {
		this.listOfAllUserOfGateg7_Type3 = listOfAllUserOfGateg7_Type3;
	}

	public List<work_field_user> getListOfAllUserOfGateg7_Type4() {
		return listOfAllUserOfGateg7_Type4;
	}

	public void setListOfAllUserOfGateg7_Type4(List<work_field_user> listOfAllUserOfGateg7_Type4) {
		this.listOfAllUserOfGateg7_Type4 = listOfAllUserOfGateg7_Type4;
	}

	public List<work_field> getListOfAllGateg() {
		return listOfAllGateg;
	}

	public void setListOfAllGateg(List<work_field> listOfAllGateg) {
		this.listOfAllGateg = listOfAllGateg;
	}

	public List<work_field_user> getListOfAllUser() {
		return listOfAllUser;
	}

	public void setListOfAllUser(List<work_field_user> listOfAllUser) {
		this.listOfAllUser = listOfAllUser;
	}

	public fieldExFields getListOfAllFieldRelatedToGateg1() {
		return listOfAllFieldRelatedToGateg1;
	}

	public void setListOfAllFieldRelatedToGateg1(fieldExFields listOfAllFieldRelatedToGateg1) {
		this.listOfAllFieldRelatedToGateg1 = listOfAllFieldRelatedToGateg1;
	}
     
	
	
	
	
	
	
	
	

	
}
