package com.example.dbinitialization.model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_EMPLOYEES")
public class TBL_EMPLOYEES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    public TBL_EMPLOYEES() {
    }

    public TBL_EMPLOYEES(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
