package BinaryTree;

public class TreeMain {
    public static void main(String[] args) {
        Node node = new Node();
        Tree tree = new Tree();

        tree.insert(10,10.0);
        tree.insert(111,10.0);
        tree.insert(5,10.0);
        tree.insert(96,10.0);
        tree.insert(872,10.0);

        System.out.println(tree.find(111).iData);

        System.out.println(tree);
        System.out.println(node);
    }
}
