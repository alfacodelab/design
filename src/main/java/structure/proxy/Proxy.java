package structure.proxy;

/**
 * 代理主题
 *
 * @author z
 * @since 2022/2/8 11:16
 **/
public class Proxy implements Subject{
    private RealSubject realSubject;

    /**
     * 请求
     **/
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
