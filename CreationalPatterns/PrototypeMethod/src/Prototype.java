/**
 * Created by miqi on 2017/8/28.
 */
public class Prototype implements Cloneable {
    Prototype prototype = null;
    public Object clone(){
        try {
            prototype = (Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}

