public class Main {
    public static void main(String[] args) {

        Integer i1 = 100;//int 在-128 127之间会调用共享元模式
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        Integer i5 = new Integer(100);//不会调用共享元模式，会新创一个对象

        System.out.println(i1==i2);
        System.out.println(i3==i4);
        System.out.println(i1==i5);
    }
}