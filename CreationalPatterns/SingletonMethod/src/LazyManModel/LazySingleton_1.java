package LazyManModel;

/**
 * Created by miqi on 2017/8/28.
 * 非线程安全写法
 */
public class LazySingleton_1 {
    private static LazySingleton_1 single = null;
    private LazySingleton_1(){}
    public static LazySingleton_1 getInstance(){
        if(single == null){
            return new LazySingleton_1();
        }
        return single;
    }
}
