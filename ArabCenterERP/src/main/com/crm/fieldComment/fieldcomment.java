package main.com.crm.fieldComment;

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
	
	
	@NamedQuery(name="fieldcomment.getAll",
		     query="SELECT c FROM fieldcomment c"
		     )
	,
	@NamedQuery(name="fieldcomment.getById",
	query = "from fieldcomment d where d.id = :id"
			)
	
	
	,
	@NamedQuery(name="fieldcomment.getByFieldUser",
	query = "from fieldcomment d where d.fieldUser_on_who_comment.id = :fieldUser_on_who_comment"
			)
	
	
	
	
})

@Entity
@Table(name = "fieldcomment")
public class fieldcomment {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "comment")
	private String comment;


	@Column(name = "date")
	private String date;
	

	@ManyToOne
	@JoinColumn(name = "user_who_comment")
	private user user_who_comment;
	

	@ManyToOne
	@JoinColumn(name = "fieldUser_on_who_comment")
	private work_field_user fieldUser_on_who_comment;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public user getUser_who_comment() {
		return user_who_comment;
	}


	public void setUser_who_comment(user user_who_comment) {
		this.user_who_comment = user_who_comment;
	}


	public work_field_user getFieldUser_on_who_comment() {
		return fieldUser_on_who_comment;
	}


	public void setFieldUser_on_who_comment(work_field_user fieldUser_on_who_comment) {
		this.fieldUser_on_who_comment = fieldUser_on_who_comment;
	}
	

	


	
}
