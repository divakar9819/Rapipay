package com.otp.OTP.service

import com.otp.OTP.entity.OTP
import javax.persistence.Id

interface OtpService {

    fun generateOtp(otp: OTP):String
    fun validateOtp(otp:OTP):String
}