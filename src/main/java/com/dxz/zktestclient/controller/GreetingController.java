package com.dxz.zktestclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxz.zktestclient.client.HelloClient;
/**
 * 消费者控制器
 */
@RestController
public class GreetingController {

	@Autowired
    private HelloClient helloClient;

    @GetMapping("/get-greeting")
    public String greeting() {
        return helloClient.hello();
    }
    
    
    
}
