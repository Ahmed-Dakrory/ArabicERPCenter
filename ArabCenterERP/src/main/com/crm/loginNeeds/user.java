package main.com.crm.loginNeeds;

import java.util.Calendar;

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
	
	@Column(name = "address")
	private String address;

	public static int ROLE_ADMIN=0;
	public static int ROLE_GeneralManager=1;
	public static int ROLE_MoneyManager=2;
	public static int ROLE_Freelancer=3;

	@Column(name = "role")
	private Integer role;
	
	
	@Column(name="image")
	private String image;


	@Column(name = "active")
	private Integer active;
	
	
	@Column(name = "lastUpdate")
	private Calendar lastUpdate;
	
	@Column(name = "createdDate")
	private Calendar createdDate;

	


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




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
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




	public Calendar getLastUpdate() {
		return lastUpdate;
	}




	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}




	public Calendar getCreatedDate() {
		return createdDate;
	}




	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
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
