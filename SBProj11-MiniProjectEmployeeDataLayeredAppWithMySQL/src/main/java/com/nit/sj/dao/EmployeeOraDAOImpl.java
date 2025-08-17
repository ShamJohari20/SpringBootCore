package com.nit.sj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.sj.model.Employee;

@Repository("eoradao")
public class EmployeeOraDAOImpl implements IEmpolyeeDAO {

	@Autowired
	private DataSource ds;
	private static final String INSERT_EMP = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES (EMP_SEQ.NEXTVAL,?,?,?)";
	private static final String GET_EMPS_BY_DESGS = "SELECT EMPNO, ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";

	public EmployeeOraDAOImpl() {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
	}

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		System.out.println("EmployeeDAOImpl.insertEmployee()");
		int insert=0;
		try (
				Connection con = ds.getConnection(); 
				PreparedStatement ps = con.prepareStatement(INSERT_EMP);

		) {
			
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getDesg());
			ps.setDouble(3, emp.getSalary());
			
			insert = ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return insert;
	}

	@Override
	public List<Employee> showEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.showEmployeesByDesgs()");

		List<Employee> list = null;

		try (
				// Creating Connection with JDBS Poll
				Connection con = ds.getConnection();
				// Creating PrepareStatement
				PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS);

		) {
			// Add Values into PrepareStatement
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			try (
					// Executing prepareSatement and getting ResultSet Object
					ResultSet rs = ps.executeQuery()) {
				// Creating List Collection to store Employee Data
				list = new ArrayList();
				// fetching Data from the rs and creating employee object and set the data into
				// employee pojo class
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEid(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					// add object employee data into LIst Collection
					list.add(emp);
				}

			}
		} catch (Exception e) {
			throw e;
		}

		return list;

	}

}
