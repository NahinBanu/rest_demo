package com.nahin.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nahin.demo.request.ProductDTO;

public interface MyRepository extends JpaRepository<ProductDTO, Integer>  {

}
