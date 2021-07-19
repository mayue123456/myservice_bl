package com.dxz.zktestclient.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxz.zktestclient.entity.User;
import com.dxz.zktestclient.service.InfoService;
/**
 * 消费者控制器
 */
@Controller
public class loginController {

	 @Autowired	
	private InfoService InfoService;//注入Service
	 
	 
    @GetMapping("/login")
    public String greeting() {
        return "index";
    }
    
   
	
	@ResponseBody
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestParam(value = "userName", required = true) String userName,
    		@RequestParam(value = "userPassword", required = true) String userPassword) {
		Map<String,Object> result = new HashMap<String, Object>();
		User user = null;  
		String retCode = "";
        String retMsg = "";  
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(userPassword)){  
        	retCode = "01";  
        	retMsg = "用户名和密码不能为空";  
        }else{  
            user = InfoService.selectUserByName(userName);  
            if(null == user){  
            	retCode = "01";  
            	retMsg = "用户不存在";  
            }else{  
                if(userPassword.equals(user.getUserPassword())){  
                	retCode = "00";  
                	retMsg = "登录成功";  
                }else{  
                	retCode = "01";  
                	retMsg = "密码有误";  
                }  
            }  
        }  
        result.put("SystemConst.retCode", retCode);  
        result.put("SystemConst.retMsg", retMsg);  
		return result;
	}
    
}
