package cn.rectcircle.explore.springbootwithjshell.service;

/**
 * @author rectcircle
 */
public interface HelloService {

    /**
     * 测试 service 方法
     * @param word
     * @return "hello $word"
     */
    String sayHello(String word);
}