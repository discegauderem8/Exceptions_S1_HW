public class HWTaskTwo {

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { //Возможен ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3"},{"4","5","6"}};//Возможно NullPointerException
        sum2d(arr);//Возможно IllegalArgumentException
    }

}
