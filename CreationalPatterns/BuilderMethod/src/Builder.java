import java.util.ArrayList;
import java.util.List;

/**
 * Created by miqi on 2017/8/28.
 */
public class Builder {
    private List<ISender> list = new ArrayList<ISender>();

    public List<ISender> produceMailSender(int count){
        for(int i = 0; i < count; i++){
            list.add(new MailSender());
        }
        return list;
    }

    public List<ISender> produceSmsSender(int count){
        for(int i = 0; i < count; i++){
            list.add(new SmsSender());
        }
        return list;
    }


}
