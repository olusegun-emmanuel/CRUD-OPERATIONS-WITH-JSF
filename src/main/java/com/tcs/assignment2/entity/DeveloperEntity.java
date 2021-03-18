package com.tcs.assignment2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "DEVELOPER_ENTITY")
public class DeveloperEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
	private String skills;
}
