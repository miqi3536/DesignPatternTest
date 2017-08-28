package HungryManModel;

/**
 * Created by miqi on 2017/8/28.
 * 饿汉式写法
 */
public class HungrySingleton {
    private HungrySingleton(){}
    private static HungrySingleton single = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return single;
    }
}
