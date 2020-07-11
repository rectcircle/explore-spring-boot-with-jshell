package cn.rectcircle.explore.springbootwithjshell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.rectcircle.explore.springbootwithjshell.dto.RespDTO;
import cn.rectcircle.explore.springbootwithjshell.service.HelloService;

/**
 * @author rectcircle
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public RespDTO<String> hello(String word) {
        // curl "http://127.0.0.1:8080/hello?word=world"
        return RespDTO.success(helloService.sayHello(word));
    }
}