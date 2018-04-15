package OrdArray;

public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;

    }

    //查看元素个数
    public int size() {
        return nElems;
    }

    //线性查找,然后插入
    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];

        }

        a[j] = value;
        nElems++;

    }

    public boolean delete(long value) {

        int find = find(value);

        if (find == nElems) {
            return false;
        } else {
            for (int i = find; i < nElems; i++) {
                a[i] = a[i + 1];
            }
            nElems--;
            return true;
        }
    }

    //二分法查找
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

}
