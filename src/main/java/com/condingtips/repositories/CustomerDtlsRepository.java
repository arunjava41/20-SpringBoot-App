package com.condingtips.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.condingtips.entities.CustomerDtlsEnity;

public interface CustomerDtlsRepository extends JpaRepository<CustomerDtlsEnity, Serializable> {
	
	
	
	

}
