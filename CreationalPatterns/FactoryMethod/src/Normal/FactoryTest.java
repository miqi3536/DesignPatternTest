package Normal;

/**
 * Created by miqi on 2017/8/28.
 */
public class FactoryTest {
    public static void main(String[] args){
        SenderFactory senderFactory = new SenderFactory();
        ISender mailSender = senderFactory.produce("mail");
        mailSender.send();

        ISender smsSender = senderFactory.produce("sms");
        smsSender.send();

        senderFactory.produce("");
    }
}
