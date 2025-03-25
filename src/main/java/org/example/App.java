package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        // java based
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();
//
//        Desktop dst = context.getBean(Desktop.class);
//        dst.compile();
//
//        Desktop dst1 = context.getBean(Desktop.class);
//        dst1.compile();


        // xml based
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien");
////        obj.setAge(21);
//        System.out.println(obj.getAge());
//        obj.code();

//        Desktop dsk = context.getBean(Desktop.class);
    }
}
