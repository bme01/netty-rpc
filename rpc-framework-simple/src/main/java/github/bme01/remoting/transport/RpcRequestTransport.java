package github.bme01.remoting.transport;

import github.bme01.extension.SPI;
import github.bme01.remoting.dto.RpcRequest;

/**
 * send RpcRequest。
 *
 */
@SPI
public interface RpcRequestTransport {
    /**
     * send rpc request to server and get result
     *
     * @param rpcRequest message body
     * @return data from server
     */
    Object sendRpcRequest(RpcRequest rpcRequest);
}
