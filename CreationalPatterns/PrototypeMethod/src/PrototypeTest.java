/**
 * Created by miqi on 2017/8/28.
 */
public class PrototypeTest {
    public static void main(String[] args){
        CurrentProtoType cp = new CurrentProtoType();

        for(int i = 0; i < 30; i++){
            try {
                CurrentProtoType currentProtoType =  (CurrentProtoType)cp.clone();
                currentProtoType.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
