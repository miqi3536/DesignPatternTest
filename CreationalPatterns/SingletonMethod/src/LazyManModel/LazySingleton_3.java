package LazyManModel;

/**
 * Created by miqi on 2017/8/28.
 * 双重检查锁定
 */
public class LazySingleton_3 {
    private LazySingleton_3(){}
    private static LazySingleton_3 single = null;

    public static LazySingleton_3 getInstance(){
        if(null == single){
            synchronized (LazySingleton_3.class){
                if(null == single){
                    return new LazySingleton_3();
                }
            }
        }
        return single;
    }
}
