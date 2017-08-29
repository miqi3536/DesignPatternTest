package BridgeTest_1;

/**
 * Created by miqi on 2017/8/29.
 */
public class Client {
    public static void main(String[] args){
        IColor white = new White();
        Shape square = new Square();
        square.setColor(white);
        square.draw();

        IColor black = new Black();
        Shape circle = new Circle();
        circle.setColor(black);
        circle.draw();
    }
}
