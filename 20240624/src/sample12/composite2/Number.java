package sample12.composite2;

import java.util.Map;

public class Number extends Expression{
    private float value;

    public Number(float value) {
        this.value = value;
    }


    @Override
    public float eval(Map<String, Float> variables) {
        return value;
    }

    public void print() {
        System.out.printf("%f", value);
    }
}