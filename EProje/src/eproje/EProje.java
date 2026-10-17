
package eproje;


import java.math.BigDecimal;
import java.math.MathContext;

public class EProje {
    public static void main(String[] args) {
        MathContext mc = new MathContext(25);
        BigDecimal e = BigDecimal.ONE;
        BigDecimal terim = BigDecimal.ONE;

        for (int i = 1; i <= 1000; i++) {
            terim = terim.divide(BigDecimal.valueOf(i), mc);
            e = e.add(terim, mc);

            if (i % 100 == 0) {
                System.out.println("i = " + i + " : " + e);
            }
        }
    }
}