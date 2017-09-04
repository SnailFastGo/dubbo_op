package coding.xml.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @project 基于XML配置的服务提供者
 * @file XMLProvider.java 创建时间:2017年9月4日下午12:59:03
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @author dzn
 * @version 1.0
 *
 */
public class XMLProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });  
        context.start();  
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }
}
