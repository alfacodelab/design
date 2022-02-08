package create.factory.factory;

/**
 * 抽象工厂
 *
 * @author z
 * @since 2022/2/8 9:13
 **/
public interface AbstractFactory {

    /**
     * 生产产品
     * @return create.factory.factory.Product
    **/
    Product newProduct();
}
