public class Main {
    static void printIter(int[] a, int size){
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\t", a[i]);
        }
        System.out.println();
    }

    static void arrayCrIter(int[] a, int size, int min, int max){
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * (max - min)) + min;
        }
    }

    static void taskIter(int[] a, int size){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(a[i] > 0 && a[i] % 2 == 0){
                count++;
                sum += a[i];
                a[i] = 0;
            }
        }
        System.out.println("Кількість: " + count);
        System.out.println("Сума: " + sum);
    }

    public static void main(String[] args) {
        int size = 25;
        int[] a = new int[size];

        arrayCrIter(a, size, -10, 10);
        printIter(a, size);
        taskIter(a, size);
        printIter(a, size);
/*      int min = -20;
        int max = 30;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min)) + min;
        }

        System.out.println("Вигляд до змін: ");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] % 2 == 0) {
                a[i] = 0;
            }
        }

        System.out.println("Вигляд після змін: ");
        System.out.println(Arrays.toString(a));  */

    }
}