package Application;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class zdeptdto {
	private int deptno;
	private String deptname;
	private String deptloc;
	
	
	
	public String getDeptloc() {
		return deptloc;
	}
	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}
	private List<zempmodel> empmodel;
	
	public List<zempmodel> getEmpmodel() {
		return empmodel;
	}
	public void setEmpmodel(List<zempmodel> empmodel) {
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
	
	public zdeptdto() {
		
	}
	public zdeptdto(int deptno, String deptname, List<zempmodel> empmodel) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.empmodel = empmodel;
	}
		
	
	
	
	}

	

