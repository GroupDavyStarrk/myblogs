package com.feign.user.application;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class MainClass {
    public static void main(String[] args) throws Exception{
        final String url = "http://localhost:9000/app-user/user/test";
        final CloseableHttpClient httpClient = HttpClients.createDefault();
        for(int i = 0 ;i<6;i++){
            Thread t = new Thread(){
                @Override
                public void run(){
                    try {
                        HttpGet httpGet = new HttpGet(url);
                        HttpResponse httpResponse = httpClient.execute(httpGet);
                        System.out.println(EntityUtils.toString(httpResponse.getEntity()));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }
        Thread.sleep(10000);
    }
}
