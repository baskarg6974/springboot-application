package Application;

import org.springframework.stereotype.Component;

@Component
public class ZempDto {

	private int empid;
	private String name;
	private int deptno;
	private String deptname;
	private String deptloc;

	public String getDeptloc() {
		return deptloc;
	}

	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
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

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public ZempDto() {

	}

	public ZempDto(int empid, String name, int deptno, String deptname, String deptloc) {

		super();

		this.empid = empid;
		this.name = name;
		this.deptno = deptno;
		this.deptname = deptname;
		this.deptloc = deptloc;
	}

}
