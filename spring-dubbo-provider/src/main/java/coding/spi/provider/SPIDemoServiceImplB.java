package coding.spi.provider;

import java.util.ArrayList;
import java.util.List;

import coding.dubbo.entity.User;
import coding.spi.demo.SPIDemoService;

/**
 * @project SPI demo 接口实现类
 * @file SPIDemoServiceImplB.java 创建时间:2017年9月5日下午4:08:54
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class SPIDemoServiceImplB implements SPIDemoService{
    @Override
    public String sayHello(String name) {
        System.out.println("我是SPIDemoServiceImplB");
        return "hello " + name;
    }

    @Override
    public List<User> getUsers() {
        System.out.println("我是SPIDemoServiceImplB");
        List<User> list = new ArrayList<>();  
        User u1 = new User(); 
        u1.setId(1);
        u1.setName("hejingyuan");  
        u1.setAge(20);  
        u1.setSex("f");  
  
        User u2 = new User();  
        u2.setId(2);
        u2.setName("xvshu");  
        u2.setAge(21);  
        u2.setSex("m");  
          
        list.add(u1);  
        list.add(u2);  
          
        return list; 
    }
}
