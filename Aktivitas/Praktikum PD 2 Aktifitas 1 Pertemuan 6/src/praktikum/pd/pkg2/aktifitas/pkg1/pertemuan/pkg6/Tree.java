package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg6;

public class Tree {

    TreeNode root;

    public Tree() {
        this.root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    void print() {
        if (this.root == null) {
            System.out.println();
        } else {
            this.root.print();
        }
    }

}
