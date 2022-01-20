import github.bme01.HelloService;
import github.bme01.config.RpcServiceConfig;
import github.bme01.remoting.transport.socket.SocketRpcServer;
import github.bme01.serviceimpl.HelloServiceImpl;


public class SocketServerMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}
