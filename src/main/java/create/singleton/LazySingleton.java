package create.singleton;

/**
 * 懒汉单例
 *
 * @author z
 * @since 2022/2/7 17:37
 **/
public class LazySingleton {
    /**
     * 保证 instance 在所有线程中同步
     */
    private static volatile LazySingleton INSTANCE = null;
    /**
     * private 避免类在外部被实例化
     */
    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        //getInstance 方法前加同步
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}