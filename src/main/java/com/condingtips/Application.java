package com.condingtips;

import java.awt.print.Pageable;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.condingtips.entities.CustomerDtlsEnity;
import com.condingtips.repositories.CustomerDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//Profiles progarm is not completed. I will do this program.
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
		CustomerDtlsRepository dtlsRepository = applicationContext.getBean(CustomerDtlsRepository.class);

		CustomerDtlsEnity entity = new CustomerDtlsEnity();
		
		entity.setCustomerEmail("john.java@gmail.com");
		
		entity.setCustomerName("john");
		
		CustomerDtlsEnity customerDtlsEnity = dtlsRepository.save(entity);
		
		System.out.println("Customer details ==> "+ customerDtlsEnity);
		
		applicationContext.close();
	}

}  
