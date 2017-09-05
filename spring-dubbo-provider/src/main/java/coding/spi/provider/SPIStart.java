package coding.spi.provider;

import coding.spi.demo.SPIDemoService;
import coding.utils.InstanceUtil;

/**
 * @project SPI demo 测试类
 * @file SPIStart.java 创建时间:2017年9月5日下午4:09:08
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class SPIStart {
    public static void main(String[] args) {
//        ServiceLoader<SPIDemoService> serviceLoader = ServiceLoader.load(SPIDemoService.class);
//        Iterator<SPIDemoService> iterator = serviceLoader.iterator();
//        while(iterator.hasNext()){
//            SPIDemoService service = iterator.next();
//            String sayHello = service.sayHello("tom");
//            System.out.println(sayHello);
//        }
        SPIDemoService spiDemoServiceInstance = InstanceUtil.getSPIDemoServiceInstance();
        String sayHello = spiDemoServiceInstance.sayHello("tom");
        System.out.println(sayHello);
    }
}
