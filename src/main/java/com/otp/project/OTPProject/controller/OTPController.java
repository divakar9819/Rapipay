package com.otp.project.OTPProject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.otp.project.OTPProject.entities.OTP;
import com.otp.project.OTPProject.exception.InvalidInputException;
import com.otp.project.OTPProject.services.OTPServiceImpl;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/otp/app/v1")
public class OTPController {

	@Autowired
	OTPServiceImpl otpService;

	private static final Logger LOGGER = LoggerFactory.getLogger(OTPController.class);
	
	@PostMapping("/sendOtp")
	@Operation(summary="API for OTP generation,Enter ChannelName and Email for otp")
	@ApiResponses(value = {
		@ApiResponse(responseCode ="200",description = "OTP send successfully"),
		@ApiResponse(responseCode = "401", description = "Unotherized access"),
		@ApiResponse(responseCode = "400", description = "Missing or invalid request body"),
		@ApiResponse(responseCode="500", description  = "Internal error")
		    
		})
	public String sendOTP(@RequestBody OTP otp) throws InvalidInputException {
		
		LOGGER.info("Sending post request");
		try {
			otpService.sendOTP(otp);
		
		}catch(Exception e){
			return e.toString();
		}
		
		return "OTP sent successfully";
	}

	@GetMapping("/verifyOTP")
	@Operation(summary="API for validate OTP,Enter ChannelName,email,orderId and OTP for validation")
	@ApiResponses(value = {
			@ApiResponse(responseCode ="200",description = "OTP send successfully"),
			@ApiResponse(responseCode = "400", description = "Missing or invalid request body"),
			@ApiResponse(responseCode = "401", description = "Unotherized access"),
			@ApiResponse(responseCode="500", description  = "Internal error")
			    
			})
	public String verifyOTP(@RequestParam String channelName, @RequestParam String email,@RequestParam Integer orderId,@RequestParam Integer otp){
		LOGGER.info("Validate otp");
		try {
			
			return otpService.validateOTP(channelName,email,orderId,otp);
		}catch(Exception e) {
			return e.toString();
		}
		
	}
	
	
	@Operation(summary = "check Monitor", tags = "GET")
	@GetMapping("/monitor")
	public String monitor() {
		LOGGER.info("Inside Monitor controller");

		try {
			boolean condition = true;
			while (condition) {
				Runnable r = () -> {
					while (true) {

					}
				};
				new Thread(r).start();
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "OTP api monitor running";
	}
	
	

}
