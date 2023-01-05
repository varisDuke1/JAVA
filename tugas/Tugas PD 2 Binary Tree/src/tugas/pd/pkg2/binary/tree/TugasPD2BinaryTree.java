package tugas.pd.pkg2.binary.tree;

public class TugasPD2BinaryTree {

    public static void main(String[] args) {
        
        BinaryTree a = new BinaryTree();
        a.insert(2);
        a.cekroot();
        a.insert(4);
        a.insert(6);
        a.insert(9);
        a.insert(10);
        a.insert(5);
        a.findmax();
        a.findmin();
    }
    
}
