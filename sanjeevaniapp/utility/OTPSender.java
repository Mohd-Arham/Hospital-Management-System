package sanjeevaniapp.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

public class OTPSender implements Sender {

    @Override
    public boolean send(String number, String data) throws Exception {
        Unirest.setTimeouts(0, 0);
        String mobNo=number;
        int otp=Integer.parseInt(data);
        String url="https://2factor.in/API/V1/dfc60f63-b769-11ed-813b-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
        System.out.println("OTP Is "+otp);
        GetRequest rs=Unirest.get(url);
        HttpResponse<String> res=rs.asString();
        String result=res.getBody();
       return result.contains("Success");   
    } 
}
