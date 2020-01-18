package main.com.crm.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import main.com.crm.tags.tag;
import main.com.crm.tags.tagAppServiceImpl;


@ManagedBean(name = "admin_freelancerBean")
@SessionScoped
public class admin_freelancerBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6715784400190397743L;

    private List<String> selectedSkills;
    private List<String> selectedEx_Skills;
    

	@ManagedProperty(value = "#{tagFacadeImpl}")
	private tagAppServiceImpl tagDataFacede; 
	
	
	

	@ManagedProperty(value = "#{loginBean}")
	private main.com.crm.loginNeeds.loginBean loginBean; 
	
	
	@PostConstruct
	public void init() {
	
	}
	
	public void refresh(){
		
	}
	
	
	public List<String> completeTagSkills(String query) {
        String queryLowerCase = query.toLowerCase();
        List<tag> allTags= tagDataFacede.getAllWithType(tag.TAG_TYPE_SKILL);
        
        
        List<tag> filteredTags =  allTags.stream().filter(t -> t.getTag().toLowerCase().startsWith(queryLowerCase)).collect(Collectors.toList());
        List<String> results = new ArrayList<>();
        for(int i = 0; i < filteredTags.size(); i++) {
            results.add(filteredTags.get(i).getTag());
        }
        

        return results;
    }
	
	public List<String> completeTagExSkills(String query) {
		
		 String queryLowerCase = query.toLowerCase();
	        List<tag> allTags= tagDataFacede.getAllWithType(tag.TAG_TYPE_EX_SKILL);
	        
	        
	        List<tag> filteredTags =  allTags.stream().filter(t -> t.getTag().toLowerCase().startsWith(queryLowerCase)).collect(Collectors.toList());
	        List<String> results = new ArrayList<>();
	        for(int i = 0; i < filteredTags.size(); i++) {
	            results.add(filteredTags.get(i).getTag());
	        }
	        

	        return results;
	        
      }

	public List<String> getSelectedSkills() {
		return selectedSkills;
	}

	public void setSelectedSkills(List<String> selectedSkills) {
		this.selectedSkills = selectedSkills;
	}

	public tagAppServiceImpl getTagDataFacede() {
		return tagDataFacede;
	}

	public void setTagDataFacede(tagAppServiceImpl tagDataFacede) {
		this.tagDataFacede = tagDataFacede;
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
     
	
	
	
	
	
	
	
	

	
}
