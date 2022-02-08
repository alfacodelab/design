package create.factory.simple;

/**
 * 简单工厂
 *
 * @author z
 * @since 2022/2/8 8:55
 **/
public class SimpleFactory {
    static final int PRODUCT_A = 0;
    static final int PRODUCT_B = 1;
    static final int PRODUCT_C = 2;

    public static Product makeProduct(int kind) {
        return switch (kind) {
            case PRODUCT_A -> new ConcreteProductA();
            case PRODUCT_B -> new ConcreteProductB();
            default -> null;
        };
    }
}
