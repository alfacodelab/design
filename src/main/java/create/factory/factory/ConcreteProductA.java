package create.factory.factory;

/**
 * 产品A
 *
 * @author z
 * @since 2022/2/8 8:53
 **/
public class ConcreteProductA implements Product {
    /**
     * 产品显示
     **/
    @Override
    public void show() {
        System.out.println("具体产品A显示...");
    }
}
