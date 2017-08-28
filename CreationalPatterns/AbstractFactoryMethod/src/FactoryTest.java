/**
 * Created by miqi on 2017/8/28.
 */
public class FactoryTest {
    public static void main(String[] args){
        IFactoryProvider mailProvider = new SendMailFactory();
        mailProvider.produce().send();
    }
}
