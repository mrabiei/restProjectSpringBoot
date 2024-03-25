package org.hashd.springbootrestcontroller.repository;

import org.hashd.springbootrestcontroller.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // it's type of component but with transactional 
public interface EmployeeRespository extends JpaRepository<EmployeeEntity,Integer> {
}
