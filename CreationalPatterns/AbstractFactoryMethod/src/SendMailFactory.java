/**
 * Created by miqi on 2017/8/28.
 */
public class SendMailFactory implements IFactoryProvider{
    public ISender produce() {
        return new MailSender();
    }
}
