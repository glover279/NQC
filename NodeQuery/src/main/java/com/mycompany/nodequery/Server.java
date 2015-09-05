/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nodequery;

import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.client.MockRestServiceServer;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author Robert
 */
public class Server {
    private static void getAccount()
{
    final String uri = "https://nodequery.com/api/account?api_key=R0ScJcFjU3v6T1VjllIy7m7iRQHMoBW40d5oceDCJKhqhxNg";
     
    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);
     
    System.out.println(result);
}
    
   
    
    public static void main(String[] args) {

        getAccount();
        
        
        // TODO code application logic here
    }
    public String getAPI()
    {
    JSONObject obj = new JSONObject(" .... ");
String pageName = obj.getJSONObject("pageInfo").getString("pageName");

JSONArray arr = obj.getJSONArray("posts");
for (int i = 0; i < arr.length(); i++)
{
    String post_id = arr.getJSONObject(i).getString("post_id");
    ......
}
    
    }
    
}
    
}
