package coding.utils;

import java.util.Iterator;
import java.util.ServiceLoader;

import coding.spi.demo.SPIDemoService;

/**
 * @project 实例生成工具
 * @file InstanceUtil.java 创建时间:2017年9月5日下午4:08:04
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class InstanceUtil {
    public static SPIDemoService getSPIDemoServiceInstance(){
        ServiceLoader<SPIDemoService> serviceLoader = ServiceLoader.load(SPIDemoService.class);
        Iterator<SPIDemoService> iterator = serviceLoader.iterator();
        while(iterator.hasNext()){
            SPIDemoService service = iterator.next();
            if(null != service){
                return service;
            }
        }
        return null;
    }
}
