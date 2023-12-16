package employees.portal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "dept")
public class DepartmentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptno;
	private String deptname;
	private String deptloc;
	@Size(min = 1, max = 30)
	private String deptmanager;
	private int managerid;

	@JsonIgnore
	@OneToMany(mappedBy = "deptmodel", cascade = CascadeType.ALL)
	private List<EmployeeModel> empmodel;

	public List<EmployeeModel> getEmpmodel() {
		return empmodel;
	}

	public void setEmpmodel(List<EmployeeModel> empmodel) {
		this.empmodel = empmodel;
	}

	public DepartmentModel() {

	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptloc() {
		return deptloc;
	}

	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}

	public String getDeptmanager() {
		return deptmanager;
	}

	public void setDeptmanager(String deptmanager) {
		this.deptmanager = deptmanager;
	}

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	public DepartmentModel(int deptno, String deptname, String deptloc, @Size(min = 1, max = 30) String deptmanager,
			int managerid, List<EmployeeModel> empmodel) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.deptloc = deptloc;
		this.deptmanager = deptmanager;
		this.managerid = managerid;
		this.empmodel = empmodel;
	}

}
