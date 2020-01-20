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
	@NamedQuery(name="work_field_user.getAllUnique",
    query="SELECT c FROM work_field_user c group by c.userId.id"
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
	
	,
	@NamedQuery(name="work_field_user.getAllByFieldHaveEvalDiffLikeAndDislikeMoreThan",
	query = "from work_field_user d where d.work_fieldId.id = :idField and (d.good - d.bad)>= :diff"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllByFieldHaveEvalDiffLikeAndDislikeLessThan",
	query = "from work_field_user d where d.work_fieldId.id = :idField and (d.good - d.bad)<= :diff"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllByFieldHaveEvalLikelessThanAndDislikeMoreThan",
	query = "from work_field_user d where d.work_fieldId.id = :idField and d.good <= :goodLess and d.bad>= :badMore"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllHaveEvalLikelessThanAndDislikeMoreThan",
	query = "from work_field_user d where d.good <= :goodLess and d.bad>= :badMore"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllHaveEvalLikelessThanAndDislikeMoreThanUnique",
	query = "from work_field_user d where d.good <= :goodLess and d.bad>= :badMore group by d.userId.id"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllByFieldAndInVacationStateHaveEvalDiffLikeAndDislikeLessThan",
	query = "from work_field_user d where d.work_fieldId.id = :idField and d.userId.vacationState = :state and (d.good - d.bad)<= :diff"
			)
	
	
	,
	@NamedQuery(name="work_field_user.getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThan",
	query = "from work_field_user d where  d.userId.vacationState = :state and (d.good - d.bad)<= :diff"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThanUnique",
	query = "from work_field_user d where  d.userId.vacationState = :state and (d.good - d.bad)<= :diff group by d.userId.id"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllHaveEvalDiffLikeAndDislikeMoreThan",
	query = "from work_field_user d where  (d.good - d.bad)>= :diff"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllHaveEvalDiffLikeAndDislikeMoreThanUnique",
	query = "from work_field_user d where  (d.good - d.bad)>= :diff group by d.userId.id"
			)
	
	,
	@NamedQuery(name="work_field_user.getAllHaveEvalDiffLikeAndDislikeLessThan",
	query = "from work_field_user d where (d.good - d.bad)<= :diff"
			)
	
	
	,
	@NamedQuery(name="work_field_user.getAllHaveEvalDiffLikeAndDislikeLessThanUnique",
	query = "from work_field_user d where (d.good - d.bad)<= :diff group by d.userId.id"
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
	
	
	
	@Column(name = "good")
	private Integer good;
	
	
	@Column(name = "bad")
	private Integer bad;
	
	


	public static int New_EqualOrLessThanLike=3;
	public static int New_EqualOrMoreThanDisLike=-1;
	public static int HotListEqualOrMoreThan=3;
	public static int ColdListEqualOrLess=2;
	public static int OldLessThanOrEqual=-4;
	
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
	public Integer getGood() {
		return good;
	}
	public void setGood(Integer good) {
		this.good = good;
	}
	public Integer getBad() {
		return bad;
	}
	public void setBad(Integer bad) {
		this.bad = bad;
	}
	

	

	


	

}
