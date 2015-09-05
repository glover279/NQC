/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nq;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Robert
 */
public class NQ {
    final String uri = "http://localhost:8080/springrestexample/employees.json";
     
    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);
     
    System.out.println(result);
    
    public static void main(String[] args) {
        
    }
    
}
