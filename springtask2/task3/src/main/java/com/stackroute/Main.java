package com.stackroute;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanPostProcessorDemo processordemo = context.getBean("processor", BeanPostProcessorDemo.class);
        System.out.println("PostProcessor Demo");
        context.close();
    }
}

