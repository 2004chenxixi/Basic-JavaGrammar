package _366After.src.javeTeacher.network_programming;

import org.testng.annotations.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IneterAddressTest {
    @Test
    public void test() throws UnknownHostException {
        //实例化ip地址（和实例化File一个意思）
        //1- 获取本机的ip地址
        InetAddress byAddress = InetAddress.getLocalHost();
        System.out.println("获取本机的ip地址= " + byAddress);
        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        System.out.println(loopbackAddress);
    }
}
