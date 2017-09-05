package coding.direct.consumer;

import java.util.List;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;

import coding.dubbo.direct.DirectService;
import coding.dubbo.entity.User;

/**
 * @project 基于点对点直连的dubbo服务消费者
 * @file Consumer.java 创建时间:2017年9月4日下午4:03:01
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class Consumer {
    public static void main(String[] args) {
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("yyy");
        
        
        // 此实例很重，封装了与与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
        ReferenceConfig<DirectService> reference = new ReferenceConfig<DirectService>(); 
        reference.setApplication(application);
        reference.setInterface(DirectService.class);
        reference.setVersion("1.0.0");
        
        //基于dubbo协议
        reference.setUrl("dubbo://127.0.0.1:20880/coding.dubbo.direct.DirectService");
        
        //基于rmi协议
        reference.setUrl("rmi://127.0.0.1:1099/coding.dubbo.direct.DirectService");
        
        // 和本地bean一样使用xxxService. 注意：此代理对象内部封装了所有通讯细节，对象较重，请缓存复用
        DirectService apiService = reference.get();
        String res = apiService.sayHello("tom");
        System.out.println(res);
        List<User> users = apiService.getUsers();
        if (users != null && users.size() > 0) {  
            for (int i = 0; i < users.size(); i++) {  
                System.out.println(users.get(i));  
            }  
        }  

    }
}
