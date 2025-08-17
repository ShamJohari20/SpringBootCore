package com.nit.sj.factory;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.nit.sj.dao.EmployeeMysqlDAOImpl;
import com.nit.sj.dao.EmployeeOraDAOImpl;
import com.nit.sj.dao.IEmpolyeeDAO;

public class DAOFactory implements FactoryBean<IEmpolyeeDAO> {
	
	@Value ("${choose.dao}")
	private String daoid;
	
	@Autowired
	private DataSource ds;

	@Override
	public IEmpolyeeDAO getObject() throws Exception {
		
		if(daoid.equalsIgnoreCase("mysqldao")) {
			return new EmployeeMysqlDAOImpl(ds);
		}
		else if(daoid.equalsIgnoreCase("oradao")) {
			return new EmployeeOraDAOImpl(ds);
			
		}else {
			throw new IllegalArgumentException("Invalid DAO");
		}
		
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return IEmpolyeeDAO.class;
	}

}
