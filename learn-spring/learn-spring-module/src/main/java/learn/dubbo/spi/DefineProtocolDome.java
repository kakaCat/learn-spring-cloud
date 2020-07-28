package learn.dubbo.spi;


import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @ClassName DefineProtocolDome
 * @Description DefineProtocolDome
 * @Author yunp
 * @Date 2020/7/6 15:08
 * @Version 1.0
 **/
public class DefineProtocolDome {

    public static void main(String[] args) {

        Protocol myProtocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
        System.out.println(myProtocol.getDefaultPort());
    }

}
