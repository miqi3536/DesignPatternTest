import java.util.Hashtable;

/**
 * Created by miqi on 2017/8/30.
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;
    private IgoChessmanFactory(){
        ht = new Hashtable();
        IgoChessman black = new BlackIgoChessman();
        IgoChessman white = new WhiteIgoChessman();
        ht.put("w", white);
        ht.put("b", black);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public static IgoChessman getIgoChessman(String color){
        return (IgoChessman)ht.get(color);
    }
}
