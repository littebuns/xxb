package com.example.demo.utils.httpClient;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class post {

    public static void main(String[] args){
        //创建一个httpClient
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "http://localhost:55006/api/csp/v1/upcdb/combo_groups?params=[{\"param\":{\"is_enabled\":true},\"sign\":\"EQ\"},{\"param\":{\"type\":\"UPDRDB\"},\"sign\":\"EQ\"}]";
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpResponse response = null;
        try {
            List<NameValuePair> list = new ArrayList<>();
            list.add(new BasicNameValuePair("params","[{\"param\":{\"is_enabled\":true},\"sign\":\"EQ\"},{\"param\":{\"type\":\"UPDRDB\"},\"sign\":\"EQ\"}]"));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, "utf-8");
            httpPost.setEntity(entity);
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            log.info("响应状态",response.getStatusLine());

            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
