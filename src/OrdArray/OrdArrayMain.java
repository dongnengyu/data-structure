package OrdArray;

public class OrdArrayMain {
    public static void main(String[] args) {
        OrdArray ordArray = new OrdArray(20);
        ordArray.insert(20);
        ordArray.insert(21);
        ordArray.insert(18);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.insert(966);
        ordArray.display();
        long find = 966;


        if (ordArray.find(find)==ordArray.size()){
            System.out.println("无法找到"+find);
        }else {
            System.out.println(find+" 位置在 "+ordArray.find(find));
        }

        System.out.println(ordArray.size());

        ordArray.delete(21);
        ordArray.display();
        ordArray.delete(966);
        ordArray.display();
    }
}
