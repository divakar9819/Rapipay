package com.otp.OTP.repository

import com.otp.OTP.entity.OTP
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OtpRepository: JpaRepository<OTP,String>{
}