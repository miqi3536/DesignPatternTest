package BridgeTest_1;

/**
 * Created by miqi on 2017/8/29.
 */
public abstract class Shape {
    // 声明颜色
    IColor color;

    // 定义画图方法（自己的特有方法）
    public abstract void draw();

    // 设置颜色
    public void setColor(IColor color) {
        this.color = color;
    }
}
