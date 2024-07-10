package sample12.composite2;

import java.util.Map;

public class Variable extends Expression {
    private String value;

    public Variable(String value) {
        this.value = value;
    }

    @Override
    public float eval(Map<String, Float> variables) {
        if (variables.containsKey(value)) {
            return variables.get(value);
        } else {
            throw new IllegalArgumentException("Variable " + value + " not found in variables map.");
        }
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
