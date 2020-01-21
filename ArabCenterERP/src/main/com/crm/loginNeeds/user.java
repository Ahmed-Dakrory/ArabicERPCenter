package main.com.crm.loginNeeds;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


/**
 * 
 * @author Ahmed.Dakrory
 *
 */


@NamedQueries({
	
	
	@NamedQuery(name="user.getAll",
		     query="SELECT c FROM user c"
		     )
	,
	@NamedQuery(name="user.getById",
	query = "from user d where d.id = :id"
			)
	
	,
	@NamedQuery(name="user.getByUsername",
	query = "from user d where d.userName = :userName"
			)
	
	,
	@NamedQuery(name="user.getAllWithRole",
	query = "from user d where d.role = :role"
			)
	
	,
	@NamedQuery(name="user.getByUsernameAndPassword",
	query = "from user d where d.userName = :userName and d.password = :password and active = :active"
			)
	
})

@Entity
@Table(name = "user")
public class user {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "vacationState")
	private Integer vacationState;

	@Column(name = "name")
	private String name;
	

	@Column(name = "userName")
	private String userName;
	
	
	@Column(name = "email")
	private String email;
	

	@Column(name = "password")
	private String password;
	

	@Column(name = "phone")
	private String phone;
	

	public static int ROLE_ADMIN=0;
	public static int ROLE_GeneralManager=1;
	public static int ROLE_MoneyManager=2;
	public static int ROLE_Freelancer=3;
	
	

	public static int VACATIONSTATE_In_VACATION=0;
	public static int VACATIONSTATE_Avaialbe=1;

	@Column(name = "role")
	private Integer role;
	
	
	@Column(name="image")
	private String image;

	@Column(name="city")
	private String city;
	

	@Column(name="about")
	private String about;
	

	@Column(name="otherPaymentMethods")
	private String otherPaymentMethods;
	

	@Column(name="workSampleLink")
	private String workSampleLink;
	
	

	@Column(name="workRegLink")
	private String workRegLink;
	
	

	@Column(name="moneyreportLink")
	private String moneyreportLink;
	
	

	@Column(name="whatsupLink")
	private String whatsupLink;
	

	@Column(name="facebookLink")
	private String facebookLink;
	

	@Column(name="vodafoneCashLink")
	private String vodafoneCashLink;
	
	

	@Column(name="postalCodeName")
	private String postalCodeName;
	

	@Column(name="nationalId")
	private String nationalId;
	


	@Column(name = "active")
	private Integer active;
	
	
	@Column(name = "lastUpdate")
	private Date lastUpdate;
	
	@Column(name = "createdDate")
	private Date createdDate;

	


	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}


	


	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}








	public Integer getRole() {
		return role;
	}




	public void setRole(Integer role) {
		this.role = role;
	}




	public String getImage() {
		return image;
	}




	public void setImage(String image) {
		this.image = image;
	}




	public Integer getActive() {
		return active;
	}




	public void setActive(Integer active) {
		this.active = active;
	}




	public Date getLastUpdate() {
		return lastUpdate;
	}




	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}




	public Date getCreatedDate() {
		return createdDate;
	}




	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	


	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getAbout() {
		return about;
	}




	public void setAbout(String about) {
		this.about = about;
	}




	public String getWorkSampleLink() {
		return workSampleLink;
	}




	public void setWorkSampleLink(String workSampleLink) {
		this.workSampleLink = workSampleLink;
	}




	public String getWorkRegLink() {
		return workRegLink;
	}




	public void setWorkRegLink(String workRegLink) {
		this.workRegLink = workRegLink;
	}




	public String getMoneyreportLink() {
		return moneyreportLink;
	}




	public void setMoneyreportLink(String moneyreportLink) {
		this.moneyreportLink = moneyreportLink;
	}




	public String getWhatsupLink() {
		return whatsupLink;
	}




	public void setWhatsupLink(String whatsupLink) {
		this.whatsupLink = whatsupLink;
	}




	public String getFacebookLink() {
		return facebookLink;
	}




	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}




	public String getVodafoneCashLink() {
		return vodafoneCashLink;
	}




	public void setVodafoneCashLink(String vodafoneCashLink) {
		this.vodafoneCashLink = vodafoneCashLink;
	}




	public String getPostalCodeName() {
		return postalCodeName;
	}




	public void setPostalCodeName(String postalCodeName) {
		this.postalCodeName = postalCodeName;
	}



	

	public String getOtherPaymentMethods() {
		return otherPaymentMethods;
	}




	public void setOtherPaymentMethods(String otherPaymentMethods) {
		this.otherPaymentMethods = otherPaymentMethods;
	}




	public String getNationalId() {
		return nationalId;
	}




	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}




	public Integer getVacationState() {
		return vacationState;
	}




	public void setVacationState(Integer vacationState) {
		this.vacationState = vacationState;
	}




	public String getRoleString() {
		if(role==ROLE_ADMIN) {
			return "حساب رئيسى";
		}else if(role==ROLE_GeneralManager) {
			return "مدير عام";
		}else if(role==ROLE_Freelancer) {
			return "مستقل";
		}else {
			return "مدير مالى";
		}
	}

	

}
