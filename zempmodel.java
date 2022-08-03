package Application;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

@Table(name = "emp")
@Entity
@Component
public class zempmodel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@ApiModelProperty(notes = "The name of the employee")
	private String name;
	@ApiModelProperty(notes = "The age of the employee")
	private int age;
	@ApiModelProperty(notes = "The deptno in which the employee is working ")
	private int deptno;
	@ApiModelProperty(notes = "The year in which the  employee is joined")
	private int yearjoined;
	@ApiModelProperty(notes = "Email of the employee")
	private String email;

	@ManyToOne(optional = false)
	@JoinColumn(name = "deptno", referencedColumnName = "deptno", insertable = false, updatable = false)
	private zdeptmodel deptmodel;

	public zdeptmodel getDeptmodel() {
		return deptmodel;
	}

	public void setDeptmodel(zdeptmodel deptmodel) {
		this.deptmodel = deptmodel;
	}

	public zempmodel() {
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getYearjoined() {
		return yearjoined;
	}

	public void setYearjoined(int yearjoined) {
		this.yearjoined = yearjoined;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public zempmodel(int empid, String name, int age, int deptno, int yearjoined, String email, zdeptmodel deptmodel) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.deptno = deptno;
		this.yearjoined = yearjoined;
		this.email = email;
		this.deptmodel = deptmodel;
	}

}
