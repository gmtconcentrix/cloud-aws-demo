package com.concentrix.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concentrix.rest.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

	public EmployeeEntity findByEmployeeId(Long empId);

}
