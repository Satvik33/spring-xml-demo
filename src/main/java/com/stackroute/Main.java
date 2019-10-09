package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        public static void main( String[] args)
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            Movie SOTY3 = context.getBean("movie1", Movie.class);
            SOTY3.toString();

            Movie DDLJ2 = context.getBean("movie2", Movie.class);
            DDLJ2.toString();

            System.out.println(SOTY3==DDLJ2);
        }
    }

