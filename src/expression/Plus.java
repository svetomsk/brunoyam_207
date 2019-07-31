package expression;

import java.util.Map;

public class Plus implements Expression {
    private Expression left;
    private Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int calculate(Map<String, Integer> values) {
         return left.calculate(values) + right.calculate(values);
    }
}
