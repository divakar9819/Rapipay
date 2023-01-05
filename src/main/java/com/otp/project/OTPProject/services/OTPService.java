package com.otp.project.OTPProject.services;

import com.otp.project.OTPProject.entities.OTP;
import com.otp.project.OTPProject.exception.ExceededAttemptsException;
import com.otp.project.OTPProject.exception.InvalidInputException;


public interface OTPService {
	public int sendOTP(OTP otp) throws InvalidInputException;
	public String validateOTP(String channelName,String email,Integer orderId,int otp) throws ExceededAttemptsException;

}
