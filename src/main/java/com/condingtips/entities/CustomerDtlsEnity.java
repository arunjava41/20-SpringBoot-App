package com.condingtips.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CUTOMER_DTLS")
@Data
public class CustomerDtlsEnity {
		@Id
		@GeneratedValue
		private Integer customerId;
		private String customerName;
		private String customerEmail;
	}