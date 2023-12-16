package employees.portal.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DepartmentDto {
	private int deptno;
	private String deptname;
	private String deptloc;

	public String getDeptloc() {
		return deptloc;
	}

	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}

	private List<EmployeeModel> empmodel;

	public List<EmployeeModel> getEmpmodel() {
		return empmodel;
	}

	public void setEmpmodel(List<EmployeeModel> empmodel) {
		this.empmodel = empmodel;
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

	public DepartmentDto() {

	}

	public DepartmentDto(int deptno, String deptname, List<EmployeeModel> empmodel) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.empmodel = empmodel;
	}

}
