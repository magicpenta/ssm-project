package panda.student.project.test;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;

/**
 * 发送信息工具类
 */
public class SendSms {

    public static void main(String[] args) {
        HttpClient client = new HttpClient();
        PostMethod postMethod = new PostMethod("http://gbk.sms.webchinese.cn");
        postMethod.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");
        NameValuePair[] data = {
                new NameValuePair("Uid", "magiccock"),
                new NameValuePair("Key", "36a6760523a7e8422c01"),
                new NameValuePair("smsMob", "15759261008"),
                new NameValuePair("smsText", "这是专用于测试的信息，能否正常发短信呢？")
        };
        postMethod.setRequestBody(data);

        try {
            client.executeMethod(postMethod);
            Header[] headers = postMethod.getResponseHeaders();
            int statusCode = postMethod.getStatusCode();
            System.out.println("statusCode: " + statusCode);
            for ( Header h : headers ) {
                System.out.println("---" + h.toString());
            }
            String result = new String(postMethod.getResponseBodyAsString().getBytes("gbk"));
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
