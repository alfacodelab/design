package structure.adapter;

/**
 * 对象适配器
 *
 * @author z
 * @since 2022/2/8 11:39
 **/
public record ObjectAdapter(Adapter adapter) implements Target {

    /**
     * 请求接口
     **/
    @Override
    public void request() {
        adapter.specificRequest();

    }
}
