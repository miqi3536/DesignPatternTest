/**
 * Created by miqi on 2017/8/30.
 */
public class Client {
    public static void main(String[] args){
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;

        folder1 = new Folder("金庸的文件夹");
        folder2 = new Folder("图像");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("杨过.jpg");
        file3 = new TextFile("神雕侠侣.txt");
        file4 = new TextFile("射雕英雄传.txt");
        file5 = new VideoFile("天龙八部.rmvb");

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);

        folder1.killVirus();
    }
}
