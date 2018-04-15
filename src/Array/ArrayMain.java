package Array;

public class ArrayMain {

    public static void main(String[] args) {
        Array array = new Array(20);
        array.insert(5);
        array.insert(99);
        array.insert(65);
        array.insert(44);
        array.insert(71);
        array.insert(798);
        array.insert(245);
        array.insert(784);
        array.insert(547);
        array.insert(88);
        array.insert(789);
        array.diaplay();
        array.insert(6);
        array.diaplay();
        System.out.println(array.find(6));
        array.diaplay();
        System.out.println(array.delete(6));
        array.delete(798);
        array.delete(284);
        array.delete(547);
        array.delete(88);
        array.diaplay();
        System.out.println(array.find(6));
        array.diaplay();
        System.out.println(array.find(5));
        array.diaplay();
        array.insert(6);
        array.diaplay();
        System.out.println(array.find(6));
        array.diaplay();

    }
}
