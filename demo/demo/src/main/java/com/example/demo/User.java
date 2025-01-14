package com.example.demo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
@Getter
@Entity
@Table(name = "users")
@Data
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String job;
}
