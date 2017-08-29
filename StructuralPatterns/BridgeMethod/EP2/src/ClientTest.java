/**
 * Created by miqi on 2017/8/29.
 */
public class ClientTest {
    public static void main(String[] args){
        White white = new White();
        Black black = new Black();

        Shape square = new Square();
        square.setColor(white);
        square.draw();

        Shape rectangle = new Rectangle();
        rectangle.setColor(black);
        rectangle.draw();

    }
}
