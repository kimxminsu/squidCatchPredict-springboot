package com.example.first_project.model;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Data {
	@Id 
	private String num;
	private String month;
	private String year;
	private String catch1;
	private String temp;
	private String salt;
}
