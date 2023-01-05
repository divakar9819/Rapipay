package com.otp.project.OTPProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;



@SpringBootApplication
@OpenAPIDefinition(info=@Info (title="OTP API", version="3.0", description="OTP generation and validation project"))
public class OtpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtpProjectApplication.class, args);
	}

}
