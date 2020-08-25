package com.biswa.linkdn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class CustomerSupport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String customerFirstName;
	@Column
	private String customerLastName;

	public CustomerSupport(String customerFirstName, String customerLastName) {
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
	}
}
