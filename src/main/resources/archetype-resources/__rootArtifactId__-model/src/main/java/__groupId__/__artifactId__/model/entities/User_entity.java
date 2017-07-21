package ${groupId}.${artifactId}.model.entities;

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
	
	@column(name="firstName")
	private string firstName;

	@column(name="subName")
	private string subName;
	
	public string getSubName(){
		return this.subName;
	}
	
	public void setSubName(string name){
		this.subName = subName;
	}
	
	
	public string getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(string name){
		this.firstName = firstName;
	}
   
}
