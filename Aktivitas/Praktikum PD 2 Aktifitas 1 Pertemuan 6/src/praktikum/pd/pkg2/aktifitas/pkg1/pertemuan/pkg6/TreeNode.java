package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg6;

import java.util.ArrayList;

public class TreeNode {

    TreeNode parent;
    double distance;
    ArrayList<TreeNode> children;
    int data;

    public TreeNode(int new_data) {
        this.data = new_data;
        this.parent = null;
        this.distance = 0.0;
        this.children = new ArrayList<TreeNode>();
    }

    void set_parent(TreeNode new_parent, double distance) {
        this.parent = new_parent;
        this.distance = distance;
        if (this.parent != null) {
            this.parent.children.add(this);
        }
    }

    void set_parent(TreeNode new_parent) {
        this.set_parent(new_parent, 0);
    }

    void add_child(TreeNode new_child, double distance) {
        new_child.set_parent(this, distance);
    }

    void remove_child(TreeNode child) {
        child.parent = null;
        child.distance = 0.0;
        this.children.remove(child);
    }

    void print(String spaces, double distance) {
        System.out.println(spaces + this.data + " distance from parent : " + this.distance + " distance from initial node : " + (distance + this.distance));
        for (int i = 0; i < this.children.size(); i++) {
            this.children.get(i).print(spaces + " ", distance + this.distance);
        }
    }

    void print() {
        this.print("", 0);
    }

}
