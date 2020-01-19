package main.com.crm.work_field_user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import main.com.crm.loginNeeds.user;
import main.com.crm.work_field.work_field;


/**
 * 
 * @author Ahmed.Dakrory
 *
 */


@NamedQueries({
	
	
	@NamedQuery(name="work_field_user.getAll",
		     query="SELECT c FROM work_field_user c"
		     )
	,
	@NamedQuery(name="work_field_user.getById",
	query = "from work_field_user d where d.id = :id"
			)
	
	
	,
	@NamedQuery(name="work_field_user.getAllByField",
	query = "from work_field_user d where d.work_fieldId.id = :id"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllFieldsOfUserOfType",
	query = "from work_field_user d where d.userId.id = :idUser and d.work_fieldId.type = :type"
			)
	
})

@Entity
@Table(name = "work_field_user")
public class work_field_user {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;


	@ManyToOne
	@JoinColumn(name = "work_fieldId")
	private work_field work_fieldId;

	@ManyToOne
	@JoinColumn(name = "userId")
	private user userId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public work_field getWork_fieldId() {
		return work_fieldId;
	}
	public void setWork_fieldId(work_field work_fieldId) {
		this.work_fieldId = work_fieldId;
	}
	public user getUserId() {
		return userId;
	}
	public void setUserId(user userId) {
		this.userId = userId;
	}

	

	


	

}
