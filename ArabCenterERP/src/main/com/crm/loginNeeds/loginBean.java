package main.com.crm.loginNeeds;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import main.com.crm.security.AuthenticationService;


@ManagedBean(name = "loginBean")
@SessionScoped
public class loginBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6715784400190397743L;
	private boolean loggedIn;
	private String userNameOfUserLoggedIn;
	private String passwordOfUserLoggedIn;
	private String passwordOfRegisteration;
	private user theUserOfThisAccount;
	

	@ManagedProperty(value = "#{userFacadeImpl}")
	private userAppServiceImpl userDataFacede; 
	 

	@ManagedProperty(value = "#{authenticationService}")
	private AuthenticationService authenticationService;
	
	
	private String passwordConfirm;
	@PostConstruct
	public void init() {
		loggedIn=false;
		theUserOfThisAccount=new user();
		
		
	}
	
	public void refresh(){
		
	}
	
	public void logOut(){

		userNameOfUserLoggedIn="";
		passwordOfUserLoggedIn="";
		authenticationService.logout();
		theUserOfThisAccount=new user();
		loggedIn=false;
		System.out.println("");
		try {
		
			FacesContext.getCurrentInstance()
				   .getExternalContext().redirect("/?faces-redirect=true");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void login(){

		 String hashedPassword= new  Md5PasswordEncoder().encodePassword(passwordOfUserLoggedIn,userNameOfUserLoggedIn);

		theUserOfThisAccount = userDataFacede.getByUserNameAndPassword(userNameOfUserLoggedIn,hashedPassword);

		if(theUserOfThisAccount!=null){
			loggedIn=true;
			
		}else{
			loggedIn=false;
			theUserOfThisAccount=new user();
			wrongPassword();
		}
		if(loggedIn){
			

			
						boolean success = authenticationService.login(theUserOfThisAccount.getUserName(), passwordOfUserLoggedIn);
						if (success) {

								FacesContext.getCurrentInstance().getExternalContext()
											.getSessionMap().put("resetMenu", true);
									

			try {
				if(theUserOfThisAccount.getRole()==user.ROLE_ADMIN) {
					FacesContext.getCurrentInstance()
					   .getExternalContext().redirect("/?faces-redirect=true");
				}else {
				FacesContext.getCurrentInstance()
					   .getExternalContext().redirect("/?faces-redirect=true");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
							}
		}else{
			

		}
		
	}
	

	
   
	public void wrongPassword(){
		PrimeFaces.current().executeScript("new PNotify({\r\n" + 
				"			title: 'wrong Credentials!',\r\n" + 
				"			text: 'Please try Again!',\r\n" + 
				"			type: 'error',\r\n" + 
				"			left:\"1%\"\r\n" + 
				"		});");
		
	
	}
	
	public void updateDataOfUser() {
		
		validateUser(theUserOfThisAccount);
		
	}
	
	
	
	private void validateUser(user theUserOfThisAccount2) {
		// TODO Auto-generated method stub
		boolean ok=false;

			
		if(passwordOfRegisteration.equals(passwordConfirm)&&!passwordOfRegisteration.equals("")&&passwordOfRegisteration!=null){
			ok=true;
		}
		
		
		if(ok){
			
				theUserOfThisAccount2.setPassword(new  Md5PasswordEncoder().encodePassword(passwordOfRegisteration,theUserOfThisAccount2.getUserName()));
				userDataFacede.adduser(theUserOfThisAccount2);
				PrimeFaces.current().executeScript("new PNotify({\r\n" + 
						"			title: 'Success',\r\n" + 
						"			text: 'Your data has been changed.',\r\n" + 
						"			type: 'success'\r\n" + 
						"		});");
			
			
		}else{
			pleaseCheck();
			
		}
	}

	private void pleaseCheck() {
		// TODO Auto-generated method stub
		PrimeFaces.current().executeScript("new PNotify({\r\n" + 
				"			title: 'Check this ',\r\n" + 
				"			text: 'Please Make sure that the Passwords are the same and not empty!',\r\n" + 
				"			left:\"2%\"\r\n" + 
				"		});");
		
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public String getUserNameOfUserLoggedIn() {
		return userNameOfUserLoggedIn;
	}

	public void setUserNameOfUserLoggedIn(String userNameOfUserLoggedIn) {
		this.userNameOfUserLoggedIn = userNameOfUserLoggedIn;
	}

	public String getPasswordOfUserLoggedIn() {
		return passwordOfUserLoggedIn;
	}

	public void setPasswordOfUserLoggedIn(String passwordOfUserLoggedIn) {
		this.passwordOfUserLoggedIn = passwordOfUserLoggedIn;
	}

	public String getPasswordOfRegisteration() {
		return passwordOfRegisteration;
	}

	public void setPasswordOfRegisteration(String passwordOfRegisteration) {
		this.passwordOfRegisteration = passwordOfRegisteration;
	}

	public user getTheUserOfThisAccount() {
		return theUserOfThisAccount;
	}

	public void setTheUserOfThisAccount(user theUserOfThisAccount) {
		this.theUserOfThisAccount = theUserOfThisAccount;
	}

	public userAppServiceImpl getUserDataFacede() {
		return userDataFacede;
	}

	public void setUserDataFacede(userAppServiceImpl userDataFacede) {
		this.userDataFacede = userDataFacede;
	}

	public AuthenticationService getAuthenticationService() {
		return authenticationService;
	}

	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

	
	
	
	
	
	
	
	

	
}
