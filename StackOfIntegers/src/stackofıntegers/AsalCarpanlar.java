package stackofıntegers;


import java.util.Scanner;

public class AsalCarpanlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfIntegers stack = new StackOfIntegers();

        System.out.print("Pozitif bir tam sayı girin: ");
        int sayi = input.nextInt();

        for (int i = 2; i <= sayi; i++) {
            while (sayi % i == 0) {
                stack.push(i);
                sayi /= i;
            }
        }

        System.out.print("Asal çarpanlar: ");

        while (!stack.empty()) {
            System.out.print(stack.pop());

            if (!stack.empty()) {
                System.out.print(", ");
            }
        }

        input.close();
    }
}