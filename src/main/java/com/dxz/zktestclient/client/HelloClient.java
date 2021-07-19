package com.dxz.zktestclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Feign远程接口 通过引入spring-cloud-starter-openfeign组件包使用声明式服务调用方式调用远程服务，使用@FeignClient（“service-name”）注解一个接口并将它自动连接到我们的应用程序中，以便我们以编程方式访问此服务。
 */
@FeignClient("Provider")
public interface HelloClient {

    @GetMapping("/hello")
    public String hello();
}
