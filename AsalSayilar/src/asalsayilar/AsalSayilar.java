
package asalsayilar;


public class AsalSayilar {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {
            boolean asal = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                stack.push(i);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}