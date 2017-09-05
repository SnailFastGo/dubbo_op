package coding.direct.provider;

import java.io.IOException;
import java.util.Arrays;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import coding.dubbo.direct.DirectService;

/**
 * @project 基于点对点直连的dubbo服务提供者
 * @file DirectProvider.java 创建时间:2017年9月4日下午4:00:09
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class DirectProvider {
    public static void main(String[] args) throws IOException {
        
        // 服务实现
        DirectService service = new DirectServiceImpl();
        
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("xxx");
        
        
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("172.24.8.31:2181");
        
        //使用dubbo协议暴露服务
        ProtocolConfig dubboProtocol = new ProtocolConfig();
        dubboProtocol.setName("dubbo");
        dubboProtocol.setHost("127.0.0.1");
        dubboProtocol.setPort(20880);
        dubboProtocol.setThreads(200);
        
        //使用rmi协议暴露服务
        ProtocolConfig rmiProtocol = new ProtocolConfig();
        rmiProtocol.setName("rmi");
        rmiProtocol.setHost("127.0.0.1");
        rmiProtocol.setPort(1099);
        rmiProtocol.setThreads(200);
        
        // 服务提供者暴露服务配置, 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
        ServiceConfig<DirectService> serviceConfig = new ServiceConfig<DirectService>();
        serviceConfig.setApplication(application);
        serviceConfig.setRegistry(registry); // 多个注册中心可以用setRegistries()
//        serviceConfig.setProtocol(protocol); // 多个协议可以用setProtocols()
        serviceConfig.setProtocols(Arrays.asList(new ProtocolConfig[]{dubboProtocol, rmiProtocol}));
        serviceConfig.setInterface(DirectService.class);
        serviceConfig.setRef(service);
        serviceConfig.setVersion("1.0.0");
        
        // 暴露及注册服务
        serviceConfig.export();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }
}
