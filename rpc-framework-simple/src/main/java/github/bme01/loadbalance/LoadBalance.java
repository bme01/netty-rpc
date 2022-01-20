package github.bme01.loadbalance;

import github.bme01.extension.SPI;
import github.bme01.remoting.dto.RpcRequest;

import java.util.List;

/**
 * Interface to the load balancing policy
 *
 */
@SPI
public interface LoadBalance {
    /**
     * Choose one from the list of existing service addresses list
     *
     * @param serviceAddresses Service address list
     * @return target service address
     */
    String selectServiceAddress(List<String> serviceAddresses, RpcRequest rpcRequest);
}
