package main.com.crm.work_field;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


/**
 * 
 * @author Ahmed.Dakrory
 *
 */


@NamedQueries({
	
	
	@NamedQuery(name="work_field.getAll",
		     query="SELECT c FROM work_field c"
		     )
	,
	@NamedQuery(name="work_field.getById",
	query = "from work_field d where d.id = :id"
			)
	
	
	,
	@NamedQuery(name="work_field.getByField",
	query = "from work_field d where d.field = :field"
			)
	
	
	,
	@NamedQuery(name="work_field.getAllWithRelatedToField",
	query = "from work_field d where d.mainField.id = :mainFieldId"
			)
	
	,
	@NamedQuery(name="work_field.getAllWithType",
	query = "from work_field d where d.type = :work_fieldType"
			)
	
})

@Entity
@Table(name = "work_field")
public class work_field {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "type")
	private Integer type;

	@Column(name = "field")
	private String field;
	

	@ManyToOne
	@JoinColumn(name = "mainField")
	private work_field mainField;
	

	public static int work_field_TYPE_SKILL=0;
	public static int work_field_TYPE_EX_SKILL=1;
	
	
	
	
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
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public work_field getMainField() {
		return mainField;
	}
	public void setMainField(work_field mainField) {
		this.mainField = mainField;
	}


	


	
}
