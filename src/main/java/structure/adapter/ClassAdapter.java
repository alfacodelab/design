package structure.adapter;

/**
 * 类适配器类
 *
 * @author z
 * @since 2022/2/8 11:38
 **/
public class ClassAdapter extends Adapter implements Target{
    /**
     * 请求接口
     **/
    @Override
    public void request() {
        specificRequest();
    }
}
