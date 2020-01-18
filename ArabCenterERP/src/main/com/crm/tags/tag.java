package main.com.crm.tags;

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


/**
 * 
 * @author Ahmed.Dakrory
 *
 */


@NamedQueries({
	
	
	@NamedQuery(name="tag.getAll",
		     query="SELECT c FROM tag c"
		     )
	,
	@NamedQuery(name="tag.getById",
	query = "from tag d where d.id = :id"
			)
	
	
	,
	@NamedQuery(name="tag.getByUserIdAndTagType",
	query = "from tag d where d.userId.id = :idUser and d.tagType = :tagType"
			)
	
	,
	@NamedQuery(name="tag.getAllWithType",
	query = "from tag d where d.tagType = :tagType"
			)
	
})

@Entity
@Table(name = "tag")
public class tag {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "tagType")
	private Integer tagType;

	@Column(name = "tag")
	private String tag;
	

	@ManyToOne
	@JoinColumn(name = "userId")
	private user userId;
	

	public static int TAG_TYPE_SKILL=0;
	public static int TAG_TYPE_EX_SKILL=1;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTagType() {
		return tagType;
	}
	public void setTagType(Integer tagType) {
		this.tagType = tagType;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public user getUserId() {
		return userId;
	}
	public void setUserId(user userId) {
		this.userId = userId;
	}


	


	

}
