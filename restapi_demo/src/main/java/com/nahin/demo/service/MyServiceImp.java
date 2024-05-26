package com.nahin.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nahin.demo.repo.MyRepository;
import com.nahin.demo.request.ProductDTO;

@Component
public class MyServiceImp implements MyService {
	
	@Autowired
	private MyRepository repo;

	@Override
	public ProductDTO product(ProductDTO product) {
		
		return repo.save(product);
	}

}
