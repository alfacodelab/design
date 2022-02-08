package create.singleton;

/**
 * 饿汉式单例
 * @author z
 * @since 2022/2/7 17:40
 **/
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
