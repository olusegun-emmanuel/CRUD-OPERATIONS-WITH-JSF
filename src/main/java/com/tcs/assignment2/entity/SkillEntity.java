package com.tcs.assignment2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "SKILL_ENTITY")
public class SkillEntity {
	@Id
	private Long id;
	private String skill;
}
