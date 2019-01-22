package com.lance.sutdy.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Lance(ZYH)
 * @Date: 2019-01-22 11:07
 * @Description:
 *
 */
@FeignClient(name = "eureka-client-A")
public interface FeginRemote {

    //restful api 调用
    @GetMapping("/hello")
    public String hello();
}
