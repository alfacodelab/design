package create.factory.simple;

/**
 * 产品B
 *
 * @author z
 * @since 2022/2/8 8:54
 **/
public class ConcreteProductB implements Product {

    /**
     * 产品显示
     **/
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}