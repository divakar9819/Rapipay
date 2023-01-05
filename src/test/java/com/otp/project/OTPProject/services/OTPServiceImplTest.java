//package com.otp.project.OTPProject.services;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//
//import com.otp.project.OTPProject.entities.OTP;
//import com.otp.project.OTPProject.entities.OTPResponse;
//import com.otp.project.OTPProject.exception.ExceededAttemptsException;
//import com.otp.project.OTPProject.exception.InvalidInputException;
//import com.otp.project.OTPProject.exception.InvalidOTPException;
//
//@SpringBootTest
//class OTPServiceImplTest {
//
//	@Test
//	@DisplayName("Validate Email 1")
//	void testCheckEmail1() {
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		boolean expected = true;
//		boolean actual = otpService.checkEmail("abc@gmail.com");
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	@DisplayName("Validate Email 2")
//	void testCheckEmail2() {
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		boolean expected = true;
//		boolean actual = otpService.checkEmail("something@kiet.edu");
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	@DisplayName("Validate Email 3")
//	void testCheckEmail3() {
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		boolean expected = false;
//		boolean actual = otpService.checkEmail("54@34");
//		assertEquals(expected, actual);
//	}
//
//	@Test
//	void testGetOTP() throws InvalidInputException {
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		OTP otpObj = new OTP(1, "email", 1, false, "something@kiet.edu");
//		int otp = otpService.generateOTP();
//		
//		
//		
//		assertThrows(Exception.class, () -> {
//			otpService.sendOTP(otpObj);
//		});
//	}
//
//	@Test
//	void testVerifyOTP() {
//		OTPServiceImpl otpService = new OTPServiceImpl();
//
//		assertThrows(Exception.class, () -> {
//			otpService.validateOTP("email", "abc@gmail.com", 1, 120221);
//		});
//	}
//
//	@Test
//	void testLengthOTP() {
//
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		OTP otp = new OTP(1, "email", 1, false, "something@kiet.edu");
//		assertThrows(Exception.class, () -> {
//			int expected = 6;
//			int actual = (otpService.sendOTP(otp) + "").length();
//			assertEquals(expected, actual);
//		});
//
//	}
//	
//	@Test
//	@DisplayName("OTP Format")
//	public void generateOTP2(){
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		String expected = "";
//		expected = String.valueOf(otpService.generateOTP());
//		assertTrue(expected.matches("[0-9]+"));
//	}
//	
//	@Autowired
//    private JavaMailSender emailSender;
//	@Autowired
//    private  OTPService services;
//	
//	@Test
//	@DisplayName("Validate OTP 1")
//	void validateOTP1() throws ExceededAttemptsException {
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		String expected = "";
//		String actual = services.validateOTP("email", "prabal@gmail.com", 1021, 0);
//		assertEquals(expected, actual);
//	}
//	
//	@Test
//	@DisplayName("Email Send OTP 1")
//	void emailSend()  {
//		OTPServiceImpl otpService = new OTPServiceImpl();
//		 otpService.sendOTPMail("divakar@gmail.com", 0, 1021);
//	}
//	
//	@Test
//	@DisplayName("send otp")
//	public void sendMessage() {
//		SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("kartikya2020@gmail.com");
//        message.setTo("prabal@gmail.com");
//        message.setSubject("OTP verification");
//        message.setText("otp");
//        emailSender.send(message);
//	}
//	
//	@Test
//	@DisplayName("opt response")
//	public void setOtpResponse() {
//		OTPResponse res1 = new OTPResponse();
//		res1.setMessage("otp");
//		res1.setStatus(true);
//		
//		OTPResponse res2 = new OTPResponse("otp test",true);
//		String m = res1.getMessage();
//		
//	}
//
//}
