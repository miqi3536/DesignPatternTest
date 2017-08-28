package LazyManModel;

/**
 * Created by miqi on 2017/8/28.
 * 使用静态内部类
 */
public class LazySingleton_4 {
    private LazySingleton_4(){}
    private static LazySingleton_4 single = null;
    private static class SingletonHolder{
        private static final LazySingleton_4 INSTANCE = new LazySingleton_4();
    }

    public static LazySingleton_4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
