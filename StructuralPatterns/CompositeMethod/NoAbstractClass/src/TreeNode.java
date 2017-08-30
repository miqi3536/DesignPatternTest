import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by miqi on 2017/8/30.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children;

    // 构造器（名称）
    public TreeNode(String name) {
        this.name = name;
    }

    // 每个字段的get set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }

    // 添加节点
    public void add(TreeNode node){
        children.add(node);
    }

    // 删除节点
    public void remove(TreeNode node){
        children.remove(node);
    }

    // 获取所有节点
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
