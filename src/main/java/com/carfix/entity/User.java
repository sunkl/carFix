package com.carfix.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="user")
@Data
public class User {
	@Id
	private long id;
	private String logUser;
	private String logPass;
	private String userName;
	private int role;
}
