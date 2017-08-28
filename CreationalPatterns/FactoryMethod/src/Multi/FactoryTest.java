package Multi;

/**
 * Created by miqi on 2017/8/28.
 */
public class FactoryTest {
    public static void main(String[] args){
        SenderFactory senderFactory = new SenderFactory();
        ISender mailSender = senderFactory.SendMail();
        mailSender.send();

        ISender smsSender = senderFactory.SendSms();
        smsSender.send();
    }
}
