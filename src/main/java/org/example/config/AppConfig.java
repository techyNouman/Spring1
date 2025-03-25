package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    // no need of below code when we use @Component on top of the classes, spring will do it by itself, but you have say spring to do it by adding
    // one more annotation called @ComponentScan("package")

//    @Bean
//    public Alien alien(@Autowired Computer computer){
////    public Alien alien(@Qualifier("desktop") Computer computer){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComputer(computer);
//        return obj;
//    }
//
//    // change bean name, use -> @Bean(name = "name1") or provide multiple names to one bean, use -> @Bean(name = {"name1","name2"})
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
