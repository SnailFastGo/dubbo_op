package coding.direct.provider;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import coding.dubbo.api.APIService;
import coding.dubbo.direct.DirectService;

public class DirectProvider {
    public static void main(String[] args) throws IOException {
        
        // 服务实现
        DirectService service = new DirectServiceImpl();
        
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("xxx");
        
        
        // 服务提供者协议配置
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setHost("127.0.0.1");
        protocol.setPort(12345);
        protocol.setThreads(200);
        
        // 服务提供者暴露服务配置, 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
        ServiceConfig<DirectService> serviceConfig = new ServiceConfig<DirectService>();
        serviceConfig.setApplication(application);
        serviceConfig.setProtocol(protocol); // 多个协议可以用setProtocols()
        serviceConfig.setInterface(DirectService.class);
        serviceConfig.setRef(service);
        serviceConfig.setVersion("1.0.0");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }
}
