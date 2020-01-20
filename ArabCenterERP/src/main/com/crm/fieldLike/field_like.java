package main.com.crm.fieldLike;

import java.util.Date;

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
import main.com.crm.work_field_user.work_field_user;


/**
 * 
 * @author Ahmed.Dakrory
 *
 */


@NamedQueries({
	
	
	@NamedQuery(name="field_like.getAll",
		     query="SELECT c FROM field_like c"
		     )
	,
	@NamedQuery(name="field_like.getById",
	query = "from field_like d where d.id = :id"
			)
	
	
	,
	@NamedQuery(name="field_like.getAllByworkFieldUserIdAndType",
	query = "from field_like d where d.fieldUserId = :fieldUserId and d.type = :type"
			)
	
	,
	@NamedQuery(name="field_like.getAllByworkFieldUserId",
	query = "from field_like d where d.fieldUserId = :fieldUserId"
			)
	
	
	,
	@NamedQuery(name="field_like.getByUserMarkedAndWorkFieldUser",
	query = "from field_like d where d.userIdMarker.id = :userMarkedId and d.fieldUserId.id = :workFieldId"
			)
	
	
	
})

@Entity
@Table(name = "field_like")
public class field_like {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "type")
	private Integer type;

	@ManyToOne
	@JoinColumn(name = "userIdMarker")
	private user userIdMarker;
	

	@ManyToOne
	@JoinColumn(name = "fieldUserId")
	private work_field_user fieldUserId;
	
	

	@Column(name = "dateTime")
	private Date dateTime;



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getType() {
		return type;
	}



	public void setType(Integer type) {
		this.type = type;
	}



	public user getUserIdMarker() {
		return userIdMarker;
	}



	public void setUserIdMarker(user userIdMarker) {
		this.userIdMarker = userIdMarker;
	}



	public work_field_user getFieldUserId() {
		return fieldUserId;
	}



	public void setFieldUserId(work_field_user fieldUserId) {
		this.fieldUserId = fieldUserId;
	}



	public Date getDateTime() {
		return dateTime;
	}



	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}


	
	
}
