import java.util.Scanner;

public class Main {
    public  static  class IllegalTriangleException extends Exception{
        public IllegalTriangleException(String errorMessage){
            super(errorMessage);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a : ");
        int a = sc.nextInt();
        System.out.println("Nhập vào cạnh b : ");
        int b = sc.nextInt();
        System.out.println("Nhập vào cạnh c : ");
        int c = sc.nextInt();

        try {
            if (a < 0 || b < 0 || c < 0 || (a + b) < c || (b + c) < a || (a + c) < b) {
                throw new IllegalTriangleException("Không phải là tam giác");
            } else {
                System.out.println("Là tam giác");
            }
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}