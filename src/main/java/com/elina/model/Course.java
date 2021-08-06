package com.elina.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    //@ManyToOne
    //@JoinColumn(name="department_id")
    //@JsonBackReference
    private Department department;
}
