package expression;

import java.util.HashMap;
import java.util.Map;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression two = new Const(12);
        Expression three = new Const(23);
        Expression plus = new Minus(two, three);
        System.out.println(plus.calculate(null));


        Expression x = new Var("x");
        Expression x2 = new Mul(x, x);

        Expression twoX = new Mul(new Const(2), x);
        Expression full = new Minus(x2, twoX);

        Map<String, Integer> values = new HashMap<>();
        values.put("x", 1);
        System.out.println(full.calculate(values));
        int max = 0;
        for(int i = -100; i < 100; i++) {
            values.put("x", i);
            max = Math.max(max, full.calculate(values));
        }
        System.out.println(max);
    }
}
