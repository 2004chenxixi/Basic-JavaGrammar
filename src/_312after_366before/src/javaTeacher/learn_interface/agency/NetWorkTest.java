package _312after_366before.src.javaTeacher.learn_interface.agency;
/*
接口的使用：---代理模式

总结：
     1- 让"被代理类"和"代理类都实现接口
     2- 在测试里面，让"被代理类"走个过程
     3- 用"代理类"直接可以调出"被代理类"
 */

//测试
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

//接口
interface NetWork {
    public void browse();
}

//被代理类（我们自己）
class Server implements NetWork {
    @Override
    public void browse() {
        System.out.println("真实的服务器访问");
    }
}

//代理类（我们的助理）
class ProxyServer implements NetWork {

    //###（重点）下面这个，用来链接server层，调用server的工作
    private NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }


    //代理类还要做的事情--检查
    public void check() {
        System.out.println("网络前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();//调用Server层的内容
        System.out.println("代理类的工作");
    }
}
