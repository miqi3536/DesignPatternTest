/**
 * Created by miqi on 2017/8/29.
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup(){
        System.out.println("begin to start computer!");
        System.out.println("-----------------------------");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("-----------------------------");
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close computer!");
        System.out.println("-----------------------------");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("-----------------------------");
        System.out.println("computer closed!");
    }
}
