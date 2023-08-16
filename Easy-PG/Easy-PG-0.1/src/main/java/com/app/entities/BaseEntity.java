package com.app.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass // mandatory annotation to tell hibernate that the following is common super class
					// containing common fields, with no table associated with it !

@Getter
@Setter
public class BaseEntity {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) ///auto generation of ids : auto_increment
	private Long id;// why Long why not long	
}
