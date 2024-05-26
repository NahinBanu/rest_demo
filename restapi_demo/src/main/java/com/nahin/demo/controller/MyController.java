package com.nahin.demo.controller;

import java.util.Arrays;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nahin.demo.request.ProductDTO;
import com.nahin.demo.response.ProductResponse;
import com.nahin.demo.service.MyService;

@RestController
public class MyController {
	@Autowired
	private MyService service;
	
	@Autowired
	private ProductResponse response;
	
	@PostMapping("/product")
	public ResponseEntity<ProductResponse> product(@RequestBody ProductDTO product){
		ProductDTO Dto=service.product(product);
		if(Dto!=null) {
			response.setError(false);
			response.setMsg("data add successful");
			response.setProducts(Arrays.asList(Dto));
				return new ResponseEntity<>(response,HttpStatus.OK);
				
	}else {
		response.setError(true);
		response.setMsg("falied to add");
		response.setProducts(Arrays.asList(Dto));
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);

	}
		
	}
}
