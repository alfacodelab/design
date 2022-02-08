package structure.adapter;

/**
 * @author z
 * @since 2022/2/8 11:42
 **/
public class ObjectAdapterTest {

    public static void main(String[] args)
    {
        System.out.println("对象适配器模式测试：");
        Adapter adapter = new Adapter();
        Target target = new ObjectAdapter(adapter);
        target.request();
    }
}
