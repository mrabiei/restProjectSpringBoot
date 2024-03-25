package org.hashd.springbootrestcontroller.controller;

import org.hashd.springbootrestcontroller.entity.EmployeeEntity;
import org.hashd.springbootrestcontroller.entity.EmployeeEntityDto;
import org.hashd.springbootrestcontroller.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Optional;

//@Controller
@RestController
@RequestMapping("/hsd")
//@CrossOrigin(origins = "http://localhost:3000") it's use when we want to allow other
//request accept to the controller like react (the front end server )
// this anotation will alow the above origin to access to this controller

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/get-emp/{id}")
    public Optional<EmployeeEntity> getEmployee(@PathVariable Integer id) {

        return employeeService.getEmployee(id);
    }

    @GetMapping("/html")
    public String returnPage(){
        return "index";
    }



    @GetMapping()
    public List<EmployeeEntity> getAllEntity() {
        return employeeService.getAllEmployee();
    }


    @PostMapping(value = "/register", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}
//            produces = {
//                   // MediaType.APPLICATION_ATOM_XML_VALUE,
//                    MediaType.APPLICATION_JSON_VALUE,
//                  //  MediaType.TEXT_EVENT_STREAM_VALUE,
//                  //  MediaType.APPLICATION_FORM_URLENCODED_VALUE
//
//
//            }
    )
//@PostMapping(value = "/register")
    public String RegisterEmployee(@RequestBody MultiValueMap<String, String> paramMap) {


        //employeeService.RegisterEmployee(employeeEntity);
        return "new EmployeeEntity() " + paramMap.get("firstName");
    }


}