package LazyManModel;

/**
 * Created by miqi on 2017/8/28.
 * 在getInstance方法上同步
 */
public class LazySingleton_2 {
    private LazySingleton_2(){}
    private static LazySingleton_2 single = null;

    public synchronized static LazySingleton_2 getInstance(){
        if(null == single){
            return new LazySingleton_2();
        }
        return single;
    }
}
