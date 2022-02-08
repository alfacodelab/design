package structure.proxy;

/**
 * 真实主题
 * @author z
 * @since 2022/2/8 11:16
 **/
public class RealSubject implements Subject{
    /**
     * 请求
     **/
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");

    }
}
