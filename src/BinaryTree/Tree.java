package BinaryTree;

import java.io.*;
import java.util.*;

public class Tree {
    private Node root;

    public Tree() {
        root = null;

    }

    //插入节点
    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.dData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;

        boolean isLeftChild = true;
        while (current.iData != key) {
            parent = root;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;

            } else {
                isLeftChild = false;
                current = current.rightChild;

            }
            if (current == null) {
                return false;//没有找到要删除的节点
            }


        }

        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }

        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;

            } else {
                parent.rightChild = successor;

            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    //向右子节点下找继承者节点
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;

        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }


    //遍历
    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1://从上到下，从左到右
                System.out.print("从上到下,从左至右： ");
                preOrder(root);
                break;
            case 2://从下到上，从左到右
                System.out.print("从上到下,从左到右：");
                inOrder(root);
                break;
            case 3:
                System.out.print("从下到上，从右到左");
                postOrder(root);
                break;
        }

        System.out.println();
    }

    private void preOrder(Node localRoot) {
        //从上到下，从左到右
        if (localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }

    }

    private void inOrder(Node localRoot) {
        //从下到上，从左到右
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }

    }

    private void postOrder(Node localRoot) {
        //从下到上，从右到左
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }

    }

    public void displayTree() {

        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("============================");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty =true;
            for (int j = 0;j<nBlanks;j++){
                System.out.print(" ");
            }
            while (globalStack.isEmpty() == false){
                Node temp = (Node)globalStack.pop();
                if (temp!= null){
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild !=null || temp.rightChild!=null){
                        isRowEmpty=false;

                    }
                }
                else {
                    System.out.print("-");
                    localStack.push(null);
                    localStack.push(null);

                }

                for (int j = 0; j<nBlanks*2-2;j++){
                    System.out.print(" ");

                }
            }//while end

            System.out.println();

            nBlanks/=2;
            while(localStack.isEmpty() == false){
                globalStack.push(localStack.pop());

            }

        }
        System.out.println("=========================================");






    }


}
