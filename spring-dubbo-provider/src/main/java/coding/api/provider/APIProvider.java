package coding.api.provider;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import coding.dubbo.api.APIService;

public class APIProvider {
    public static void main(String[] args) throws IOException {
        
        // 服务实现
        APIService service = new APIServiceImpl();
        
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("xxx");
        
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("172.24.8.31:2181");
//        registry.setUsername("aaa");
//        registry.setPassword("bbb");
        
        // 服务提供者协议配置
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setHost("127.0.0.1");
        protocol.setPort(12345);
        protocol.setThreads(200);
        
        // 服务提供者暴露服务配置, 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
        ServiceConfig<APIService> serviceConfig = new ServiceConfig<APIService>();
        serviceConfig.setApplication(application);
        serviceConfig.setRegistry(registry); // 多个注册中心可以用setRegistries()
        serviceConfig.setProtocol(protocol); // 多个协议可以用setProtocols()
        serviceConfig.setInterface(APIService.class);
        serviceConfig.setRef(service);
        serviceConfig.setVersion("1.0.0");
        
        // 暴露及注册服务
        serviceConfig.export();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }
}
