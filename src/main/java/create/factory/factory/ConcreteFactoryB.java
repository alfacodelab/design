package create.factory.factory;

/**
 * @author z
 * @since 2022/2/8 9:15
 **/
public class ConcreteFactoryB implements AbstractFactory {
    /**
     * 生产产品
     *
     * @return create.factory.factory.Product
     **/
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProductB();
    }
}
