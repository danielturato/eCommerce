package com.acme.ecommerce.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@Component
@Scope("session")
public class CouponCode {

	@Size(min = 5, max = 10, message = "The coupon must be between {min} and {max} in length")
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
