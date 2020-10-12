package com.example.demo.base.HTTP;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过httpClient包来进行发送post请求
 */
public class HttpClientPost {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://localhost:8081/network/networkRemove");
        //这里发送的是键值对形式的请求体
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("params", "{\"region\":\"ceshi\",\"hostname\":\"xxb\"\n" +
                ",\"userId\":\"admin\"}"));
        httpPost.setEntity(new UrlEncodedFormEntity(nvps));
        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            HttpEntity entity = response.getEntity();
            System.out.println(EntityUtils.toString(entity));
        } catch (Exception e) {
            response.close();
        }

    }
}
