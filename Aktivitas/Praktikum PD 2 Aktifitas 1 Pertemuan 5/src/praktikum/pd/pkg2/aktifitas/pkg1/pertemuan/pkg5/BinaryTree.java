package praktikum.pd.pkg2.aktifitas.pkg1.pertemuan.pkg5;

public class BinaryTree {

    BinaryTreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    void print() {
        if (this.root != null) {
            this.root.print();
        }
    }

    void prefix() {
        if (this.root != null) {
            this.root.prefix();
        }
        System.out.println();
    }

    void infix() {
        if (this.root != null) {
            this.root.infix();
        }
        System.out.println();
    }

    void postfix() {
        if (this.root != null) {
            this.root.postfix();
        }
        System.out.println();
    }

    void push(BinaryTreeNode new_node) {
        if (this.root == null) {
            this.root = new_node;
        } else {
            BinaryTreeNode current = this.root;
            while (current != null) {
                if (new_node.data > current.data) {
                    if (current.right == null) {
                        current.set_right(new_node);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    if (current.left == null) {
                        current.set_left(new_node);
                        break;
                    } else {
                        current = current.left;
                    }
                }
            }
        }
    }

    void delete(BinaryTreeNode deleted) {
        if (this.root != null) {
            if (deleted.has_no_child()) {
                if (deleted == this.root) {
                    this.root = null;
                } else {
                    deleted.unset_parent();
                }
            } else if (deleted.only_has_left() || deleted.only_has_right()) {
                BinaryTreeNode replacement = null;
                if (deleted.only_has_left()) {
                    replacement = deleted.left;
                } else {
                    replacement = deleted.right;
                }
                if (deleted == this.root) {
                    this.root = replacement;
                    this.root.unset_parent();
                } else if (deleted.is_left()) {
                    deleted.parent.set_left(replacement);
                    deleted.unset_parent();
                } else if (deleted.is_right()) {
                    deleted.parent.set_right(replacement);
                    deleted.unset_parent();
                }
            } else {
                BinaryTreeNode replacement = deleted.left;
                if (replacement.right != null) {
                    replacement = replacement.most_right_child();
                }
                BinaryTreeNode parent_of_replacement = replacement.parent;
                if (replacement.only_has_right()) {
                    parent_of_replacement.set_left(replacement.right);
                }
                replacement.unset_parent();
                replacement.set_left(deleted.left);
                replacement.set_right(deleted.right);
                if (deleted == this.root) {
                    this.root = replacement;
                } else if (deleted.is_left()) {
                    deleted.parent.set_left(replacement);
                } else if (deleted.is_right()) {
                    deleted.parent.set_right(replacement);
                }
            }
        }
    }

    BinaryTreeNode traverse(int data) {
        BinaryTreeNode current = this.root;
        while (current != null) {
            if (current.data == data) {
                return current;
            } else {
                if (current.data < data) {
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
        }
        return null;
    }

    void search(int i) {
        BinaryTreeNode temp = root;
        boolean hasil = false;
        while (temp != null) {
            if (temp.data == i) {
                hasil = true;
                break;
            }
            if (i < temp.data)
                temp = temp.left;
            else
                temp = temp.right;
        }
        if (hasil)
            System.out.println("Data Ditemukan");
        else
            System.out.println("Maaf Data Tidak Ditemukan");
    }
    
    public void findmin() {
        BinaryTreeNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        System.out.println("Nilai Minimum : " + temp.data);
    }
    
    public void findmax() {
        BinaryTreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        System.out.println("Nilai Maksimum : " + temp.data);
    }

}
