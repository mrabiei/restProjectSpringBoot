package org.hashd.springbootrestcontroller.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntityDto {

    private String firstName;
    private String lastName;
}
