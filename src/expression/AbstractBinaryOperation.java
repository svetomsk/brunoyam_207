package expression;

import java.util.Map;

public abstract class AbstractBinaryOperation implements Expression{
    private Expression left;
    private Expression right;

    public AbstractBinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract int operation(int a, int b);

    @Override
    public int calculate(Map<String, Integer> values) {
        return operation(left.calculate(values), right.calculate(values));
    }
}
