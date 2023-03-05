package com.actuator.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Employee {

	private long empId;
	private String name;
	private String location;

}
