/**
 * Pengertian Binaary Tree dalam Struktur Data
 * Pohon biner adalah pohon dengan syarat bahwa tiap node hanya memiliki boleh
 * maksimal dua subtree dan kedua subtree tersebut harus terpisah.
 * Sesuai dengan definisi tersebut, maka tiap node dalam binary tree hanya
 * boleh memiliki paling banyak dua anak/child.
 * Program membuat binary tree yang memiliki 2 anak dimana insertion
 * dilakukan secara terurut, dimana data yang lebih kecil diletakkan di kiri
 * dan yang lebih besar diletakkan di kanan.
 */
import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int x) {
        this.data = x;
    }
}

public class binary {

    private static Node root;

    /**
     * Mengecek apakah tree masih kosong
     *
     */
    private static boolean isEmpty() {
        return (root == null);
    }

    /**
     * Memasukkan suatu nilai ke dalam tree. Jika nilai tersebut lebih kecil
     * dari nilai node, maka bergerak ke kiri terus hingga menjadi child, begitu
     * juga sebaliknya.
     *
     */
    public static void insert(int input) {
        Node temp = new Node(input);
        if (isEmpty()) {
            root = temp;
        } else {
            Node cursor = root,
                    parent = null;
            while (cursor != null) {
                parent = cursor;
                if (input < cursor.data) {
                    cursor = cursor.left;
                } else {
                    cursor = cursor.right;
                }
            }
            /**
             * Menambahkan Node baru pada kiri/kanan Node parent bergantung pada
             * nilai input dan nilai yang disimpan Node parent
             *
             */
            if (input < parent.data) {
                parent.left = temp;
                return;
            } else {
                parent.right = temp;
                return;
            }
        }
    }

    /**
     * Method traverse untuk mengelilingi Node-Node dalam tree
     *
     */
    public void traverse(int tipe) {
        switch (tipe) {
            case 1:
                System.out.print("\nPreorder traversal:\n");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal:\n");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal:\n");
                postOrder(root);
                break;
        }
        System.out.println('\n');
    }

    private static void preOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        System.out.print(localRoot.data + " ");
        preOrder(localRoot.left);
        preOrder(localRoot.right);
    }

    private static void inOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        inOrder(localRoot.left);
        System.out.print(localRoot.data + " ");
        inOrder(localRoot.right);
    }

    private static void postOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        postOrder(localRoot.left);
        postOrder(localRoot.right);
        System.out.print(localRoot.data + " ");
    }

    public static void main(String[] args) {
        insert(60);
        insert(53);
        insert(57);
        insert(67);
        insert(40);
        insert(55);
        insert(7);
        insert(100);
        postOrder(root);
        System.out.println("");
        inOrder(root);
        System.out.println("");
        preOrder(root);
    }
}
