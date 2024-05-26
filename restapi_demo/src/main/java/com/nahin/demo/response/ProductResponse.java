package com.nahin.demo.response;
import java.util.List;
import org.springframework.stereotype.Component;
import com.nahin.demo.request.ProductDTO;

@Component
public class ProductResponse {
	private Boolean error;
	private String msg;
	private List<ProductDTO>products;
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<ProductDTO> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}
}
