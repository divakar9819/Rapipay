package com.otp.project.OTPProject.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("otp")
public class OTP {

    @Id
    Integer orderId;
    @NotNull(message="Email can not be null")
    
    @Email
    private String email; //userId
    
    
    private int otp;
    private boolean verified;
    
   // private LocalDate created_at;
    
    @NotNull(message="Channel Name can not be null")
    private String channelname;
    private int attempts;
    //Attempts
    
    public OTP() {
    	
    }

   public OTP(Integer orderId ,String email,int otp,boolean verified,String channelName) {
	   this.orderId=orderId;
	   this.email = email;
	   this.otp = otp;
	   this.verified = verified;
	   this.channelname = channelName;
   }
   
  

	public Integer getOrderId() {
	return orderId;
}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getChannelName() {
		return channelname;
	}

	public void setChannelName(String channelName) {
		this.channelname = channelName;
	}

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

   

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
    
    

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	@Override
	public String toString() {
		return "OTP [orderId=" + orderId + ", email=" + email + ", otp=" + otp + ", verified=" + verified
				+ ", channelname=" + channelname + ", attempts=" + attempts + "]";
	}
	
	

	
	
    
    

    

	


    
}
