package ${package}.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 * 
 * Generated with com.github.mistifiou.webproject
 *
 */
@Entity
@Table(name="User_table")
public class User_entity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="firstName")
	private String firstName;

	@Column(name="subName")
	private String subName;
	
	public String getSubName(){
		return this.subName;
	}
	
	public void setSubName(String subName){
		this.subName = subName;
	}
	
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
   
}
