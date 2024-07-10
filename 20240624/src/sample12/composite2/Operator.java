package sample12.composite2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Operator extends Expression{
    private String operator;
    private List<Expression> children = new ArrayList<>();

    public Operator(String operator) {
        this.operator = operator;
    }

    public void add(Expression e) {
        children.add(e);
    }

    @Override
    public float eval(Map<String, Float> variables) {
        if (children.size() < 2) {
            throw new UnsupportedOperationException("Operator " + operator + " needs at least two operands.");
        }

        float result = children.get(0).eval(variables);
        for (int i = 1; i < children.size(); i++) {
            float nextOperand = children.get(i).eval(variables);
            switch (operator) {
                case "+":
                    result += nextOperand;
                    break;
                case "-":
                    result -= nextOperand;
                    break;
                case "*":
                    result *= nextOperand;
                    break;
                case "/":
                    if (nextOperand == 0) {
                        throw new ArithmeticException("Division by zero.");
                    }
                    result /= nextOperand;
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported operator: " + operator);
            }
        }
        return result;
    }

    @Override
    public void print() {
        if (children.size() < 2) {
            throw new UnsupportedOperationException("Operator " + operator + " needs at least two operands.");
        }

        System.out.print("(");
        for (int i = 0; i < children.size(); i++) {
            if (i > 0) {
                System.out.printf(" %s ", operator);
            }
            children.get(i).print();
        }
        System.out.print(")");
    }
}
