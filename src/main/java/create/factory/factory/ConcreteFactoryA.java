package create.factory.factory;

/**
 * @author z
 * @since 2022/2/8 9:14
 **/
public class ConcreteFactoryA implements AbstractFactory {
    /**
     * 生产产品
     *
     * @return create.factory.factory.Product
     **/
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProductA();
    }
}
