package com.aastu.model;

import javax.persistence.*;

/**
 * Created by Abdurahman on 7/31/2017.
 */
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
