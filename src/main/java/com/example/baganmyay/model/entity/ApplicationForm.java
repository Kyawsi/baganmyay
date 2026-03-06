package com.example.baganmyay.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "applications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplicationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private String phone;

    private String socialMedia;

    private String gender;

    private String nrcPassport;

    @Column(columnDefinition = "TEXT")
    private String address;

    private String contestDay;

}