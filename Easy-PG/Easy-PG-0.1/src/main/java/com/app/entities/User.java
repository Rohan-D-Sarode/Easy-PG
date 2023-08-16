package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // mark a class as an entity
@Table(name = "new_users") // to speciffy table name
//lombok annotations
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class User extends BaseEntity{
	
	@Column(name = "first_name", length = 20)
	private String firstName;
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length = 20, nullable = false)
	private String password;
	@Column(length = 10)
	private String location;

}
