package com.lijing.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "deparment")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private  String name;
}
