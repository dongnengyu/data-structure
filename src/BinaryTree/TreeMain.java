package BinaryTree;

public class TreeMain {
    public static void main(String[] args) {
        Node node = new Node();
        Tree tree = new Tree();

        tree.insert(50,10.0);
        tree.insert(25,10.0);
        tree.insert(75,10.0);
        tree.insert(12,10.0);
        tree.insert(37,10.0);
        tree.insert(43,10.0);
        tree.insert(30,10.0);
        tree.insert(33,10.0);
        tree.insert(87,10.0);
        tree.insert(93,10.0);
        tree.insert(97,10.0);
        tree.displayTree();

       // System.out.println(tree.find(111).iData);

        System.out.println(tree);
        System.out.println(node);
    }
}
