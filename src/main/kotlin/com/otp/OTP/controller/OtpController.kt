package com.otp.OTP.controller

import com.otp.OTP.entity.OTP
import com.otp.OTP.service.OtpService

import org.springframework.web.bind.annotation.*

@RestController

class OtpController(private val otpService: OtpService) {

    @GetMapping("/home")
    fun home():String{
        return "Home page"
    }


    @PostMapping("/getOtp")
    fun genrateOtp(@RequestBody otp :OTP):String{
        return otpService.generateOtp(otp)

    }

    @PostMapping("/validateOtp")
    fun valadateOtp(@RequestBody otp:OTP):String{
        return otpService.validateOtp(otp)
    }
}