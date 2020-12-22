package com.consumer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientSpaceX{
  public static void main(String[] args){
    int codeResp = 0;
    
    URL url = new URL();
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept","application/json");
    codeResp = conn.getResponseCode();
    
    InputStreamReader input = new InputStreamReader(conn.getInputStream());
    
    BufferedReader br = new BufferedReader(input);
    
  }
}