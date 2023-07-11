public class HWTaskFour {
    public static int[] arrayDif (int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("ОШИБКА: Разные длины массивов");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {1, 2, 3};

        try {
            for (int i : arrayDif(arr1, arr2)) {
                System.out.println(i);
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
