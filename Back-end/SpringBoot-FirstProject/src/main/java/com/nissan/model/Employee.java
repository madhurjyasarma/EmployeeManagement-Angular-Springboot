package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Tbl_Employee")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_Id")
	@Setter(AccessLevel.NONE)
	private Integer empId;
	
	@Column(name = "Emp_Name", nullable = false)
	private String empName;
	
	@Column(name = "Designation")
	private String designation;
	
	@Column(name = "Date_Of_Joining")
	private LocalDate dateOfJoining;
	
	@Column(name = "Salary")
	private Double salary;
	
	@Column(name = "Emp_Phone_No", unique = true, nullable = false)
	private String empPhoneNumber;
	
	@Column(name = "Is_Active", nullable = false)
	private Boolean isActive;
	
	@Column
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime createdAt;
	
	@Column
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime updatedAt;
	
	@Column(name = "Dept_Id")
	private Integer deptId;

	@JoinColumn(name = "dept_Id", insertable = false, updatable = false)
	@ManyToOne
	private Department department;
	
	// default constructor
	public Employee() {}

	// overloaded constructor
	
	public Employee(Integer empId, String empName, String designation, LocalDate dateOfJoining, Double salary,
			String empPhoneNumber, Boolean isActive, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.empPhoneNumber = empPhoneNumber;
		this.isActive = isActive;
		this.department = department;
	}
	
	public Employee(Integer empId, String empName, String designation, LocalDate dateOfJoining, Double salary,
			String empPhoneNumber, Boolean isActive, DateTime createdAt, DateTime updatedAt, Integer deptId) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.empPhoneNumber = empPhoneNumber;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deptId = deptId;
	}

	// getters and setters
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmpPhoneNumber() {
		return empPhoneNumber;
	}

	public void setEmpPhoneNumber(String empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	// To String
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", dateOfJoining="
				+ dateOfJoining + ", salary=" + salary + ", empPhoneNumber=" + empPhoneNumber + ", isActive=" + isActive
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deptId=" + deptId + "]";
	}
	
}
