package cn.rectcircle.explore.springbootwithjshell.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 用于向不受 Spring 管理的 Bean 访问 Bean 工厂（谨慎使用）
 * @author rectcircle
 */
@Component
public class SpringBeanUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        SpringBeanUtils.applicationContext = applicationContext;
    }

    public static ApplicationContext getInstance() {
        return applicationContext;
    }

}