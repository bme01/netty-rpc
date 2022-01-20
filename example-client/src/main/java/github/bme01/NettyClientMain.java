package github.bme01;

import github.bme01.annotation.RpcScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@RpcScan(basePackage = {"github.bme01"})
public class NettyClientMain {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NettyClientMain.class);
        HelloController helloController = (HelloController) applicationContext.getBean("helloController");
        helloController.test();
    }
}
