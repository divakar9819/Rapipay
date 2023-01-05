package com.otp.OTP.service

import com.otp.OTP.entity.OTP
import com.otp.OTP.repository.OtpRepository
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class OtpServiceImpl(private val otpRepo:OtpRepository, private val emailSender: JavaMailSender):OtpService {

    fun randomNumber():Long{
        var rand = Math.random()*1000000
        return rand.toLong();

    }



    fun sendOtp(emailId:String,otp:Long):String{
        val message = SimpleMailMessage()
        var tempOtp :String = otp.toString()
        message.setSubject("OTP for mail varification")
        message.setText("Your OTP for mail verification is "+tempOtp)
        message.setTo(emailId)
        emailSender.send(message)

        return "Mail send successfully"
    }
    override fun generateOtp(otpObj: OTP): String {
//        var otpObj : OTP = OTP();
//        otpObj.userId=userId
//        otpObj.password=password
        var otp = randomNumber()
        otpObj.otp = otp
        otpRepo.save(otpObj)
        var temp: String = sendOtp(otpObj.userId,otpObj.otp)
        return temp;

    }

    override fun validateOtp(otpObj:OTP): String {
        var list :List<OTP> = otpRepo.findAll()
        for(o in list){
            if(o.userId ==otpObj.userId && o.password==otpObj.password  && o.otp==otpObj.otp){
                return "Valid OTP"

            }

        }

        return "OTP is not valid"
    }
}