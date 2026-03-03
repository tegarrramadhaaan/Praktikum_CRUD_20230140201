package com.example.demo.model.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;
}
