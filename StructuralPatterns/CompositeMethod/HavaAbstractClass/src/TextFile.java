/**
 * Created by miqi on 2017/8/30.
 */
public class TextFile extends AbstractFile{
    private String name;
    public TextFile(String name){
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法!");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法!");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法!");
        return null;
    }

    public void killVirus() {
        System.out.println("----------文本文件 " + name + " 正在杀毒!");
    }
}
