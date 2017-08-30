import java.util.LinkedList;

/**
 * Created by miqi on 2017/8/30.
 */
public class Folder extends AbstractFile{
    private String name;
    public Folder(String name){
        this.name = name;
    }

    private LinkedList<AbstractFile> fileList = new LinkedList<AbstractFile>();
    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****************正在对文件夹" + name + "进行杀毒!");

        for(AbstractFile f : fileList){
            f.killVirus();
        }
    }
}
