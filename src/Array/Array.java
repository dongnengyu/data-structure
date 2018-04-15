package Array;

public class Array {
    private long[] a;
    private int nElems;

    public Array(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchKey) {
                break;
            }
        }
        if (j < nElems) {
            //System.out.println("数组长度为"+nElems+";查找的元素"+searchKey+"在第"+ j + "位");
            return true;
        }

        //System.out.println("数组长度为"+nElems+";查找的元素"+searchKey+"不存在");
        return false;
    }

    public boolean insert(long value) {
        a[nElems] = value;
        nElems++;
        return true;
    }

    public void diaplay() {
        for (int i =0; i<nElems;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();

    }

    public boolean delete(long value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (a[i] == value) {
                break;
            }

        }
        if (i == nElems) {
            return false;
        } else {

            for (int j = i; j < nElems; j++) {
                a[j] = a[j + 1];
            }
            nElems--;

            return true;
        }


    }
}
