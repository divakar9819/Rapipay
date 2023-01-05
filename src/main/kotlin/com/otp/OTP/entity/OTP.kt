package com.otp.OTP.entity

import javax.persistence.*

@Entity
@Table(name = "otp_table")
class OTP{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var orderId:Int=0
    var userId:String =""
    var password:String=""
    var otp:Long=0


}