public class program3_1 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 5, 8, 2, 0, 4, 9, 3 };
        int[] result = new int[array.length];
        result = shareArray(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] shareArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        int[] arrayB = new int[array.length / 2];
        System.arraycopy(array, 0, arrayB, 0, array.length / 2);
        int[] arrayC = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayC, 0, array.length - array.length / 2);
        arrayB = shareArray(arrayB);
        arrayC = shareArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }

    public static int[] mergeArray(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int posA = 0;
        int posB = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (posA == arrayA.length) {
                arrayC[i] = arrayA[i - posA];
                posB++;
            } else if (posB == arrayB.length) {
                arrayC[i] = arrayB[i - posB];
                posA++;
            } else if (arrayA[i - posA] < arrayB[i - posB]) {
                arrayC[i] = arrayA[i - posA];
                posB++;
            } else {
                arrayC[i] = arrayB[i - posB];
                posA++;
            }
        }
        return arrayC;
    }
}
