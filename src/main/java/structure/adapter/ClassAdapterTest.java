package structure.adapter;

/**
 * @author z
 * @since 2022/2/8 11:38
 **/
public class ClassAdapterTest {
    public static void main(String[] args)
    {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
