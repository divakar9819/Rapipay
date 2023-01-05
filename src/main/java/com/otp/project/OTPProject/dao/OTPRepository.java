package com.otp.project.OTPProject.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.otp.project.OTPProject.entities.OTP;



public interface OTPRepository extends MongoRepository<OTP, Integer> {
	List<OTP> findByEmailAndOtpAndVerified(String email, Integer otp,boolean verified);
    List<OTP> findByEmailAndVerified(String email,boolean verified);
}
