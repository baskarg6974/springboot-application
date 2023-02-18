package Application;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<ZempModel> {

	public ZempModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		ZempModel employee = new ZempModel();
		employee.setEmpid(rs.getInt("ID"));
		employee.setName(rs.getString("NAME"));
		employee.setAge(rs.getInt("AGE"));
		employee.setDeptno(rs.getInt("deptno"));
		employee.setYearjoined(rs.getInt("yearjoined"));
		return employee;
	}
}