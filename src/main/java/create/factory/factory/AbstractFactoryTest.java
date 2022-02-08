package create.factory.factory;

/**
 * @author z
 * @since 2022/2/8 9:16
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            Class<?> c = Class.forName("create.factory.factory.ConcreteFactoryB");
            Object obj = c.getDeclaredConstructor().newInstance();
            af = (AbstractFactory) obj;
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
