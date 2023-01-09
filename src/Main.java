import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so cac phan tu: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Phan tu nho nhat trong mang vua nhap la: " + findMin(array));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }//----------------------------------------------------------------
        //for i loops
        //for (int i = 1; i < array.length; i++) {
        //        if (array[i] < min) {
        //        min = array[i];
        //        }
        //        }
        //----------------------------------------------------------------
        return min;
    }
}
