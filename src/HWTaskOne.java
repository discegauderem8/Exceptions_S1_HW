import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HWTaskOne {

    static int divide (int a, int b) throws Exception{
        return a/b;
    }

    static int getArraySum (ArrayList<Integer> a) throws Exception{
        int result = 0;
        for (int i = 0; i < a.size(); i++){
            result += a.get(i);
        }
        return result;
    }

    static int getElement (int[] a, int index) throws Exception{
        return a[index];
    }

    public static void main(String[] args) throws Exception{
//        divide(10,0);
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, null));
//        getArraySum(arr);
        arr.set(2, 1);
        int[] trueArr = {1, 2, 3, 4};
        getElement(trueArr, 5);
    }
}
