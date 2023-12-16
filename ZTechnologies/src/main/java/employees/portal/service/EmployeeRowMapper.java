package employees.portal.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import employees.portal.model.EmployeeModel;

public class EmployeeRowMapper implements RowMapper<EmployeeModel> {

	public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeModel employee = new EmployeeModel();
		employee.setEmpid(rs.getInt("ID"));
		employee.setName(rs.getString("NAME"));
		employee.setAge(rs.getInt("AGE"));
		employee.setDeptno(rs.getInt("deptno"));
		employee.setYearjoined(rs.getInt("yearjoined"));
		return employee;
	}
}
