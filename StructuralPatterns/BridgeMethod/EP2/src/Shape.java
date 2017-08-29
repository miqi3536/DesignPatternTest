/**
 * Created by miqi on 2017/8/29.
 */
public abstract class Shape {
    IColor color;

    public abstract void draw();

    public void setColor(IColor color) {
        this.color = color;
    }
}
