package com.nissan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Employee;

@Repository
public interface IEmployeeDao extends JpaRepositoryImplementation<Employee, Integer>
{
	//FindAll()
	//save()
	//deleteById()
	
//	//custom methods---JPQL ---HQL
	@Query("from Employee where empPhoneNumber=?1 and isActive=true")
	public Employee searchByPhoneNumber(String _empPhone);

	

}
