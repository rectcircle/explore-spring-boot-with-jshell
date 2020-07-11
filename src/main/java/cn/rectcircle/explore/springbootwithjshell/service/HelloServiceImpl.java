package cn.rectcircle.explore.springbootwithjshell.service;

import org.springframework.stereotype.Service;

/**
 * @author rectcircle
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String word) {
        return "hello " + word;
    }

    
}