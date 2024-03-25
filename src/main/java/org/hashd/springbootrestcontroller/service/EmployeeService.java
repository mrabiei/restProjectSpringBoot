package org.hashd.springbootrestcontroller.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hashd.springbootrestcontroller.entity.EmployeeEntity;
import org.hashd.springbootrestcontroller.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeService {
    @Autowired
    private EmployeeRespository employeeRespository;
    public Optional<EmployeeEntity> getEmployee(int id){
        return employeeRespository.findById(id);
    }

    public EmployeeEntity RegisterEmployee(EmployeeEntity employeeEntity){
        if((employeeEntity!=null)){
            employeeRespository.save(employeeEntity);

        }
        return employeeEntity;

    }


    public List<EmployeeEntity> getAllEmployee(){
        return employeeRespository.findAll();
    }
}
