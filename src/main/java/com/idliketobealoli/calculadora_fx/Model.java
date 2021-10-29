package com.idliketobealoli.calculadora_fx;

public class Model {
    private static Model instance;
    private Double result;
    private Character operator;
    private Double num1;
    private Double num2;

    private Model() {}

    public Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public Double calculate(Double n1, Double n2, Character operator) {
        if (n1 != null && n2 != null && operator != null) {
            switch (operator) {
                case '+': return n1 + n2;
                case '-': return n1 - n2;
                case '/': return n1 / n2;
                case '*': return n1 * n2;
                case '%': return n1 % n2;
                default: return null;
            }
        } else return null;
    }

    public Double generateNumber(String string) {
        return Double.parseDouble(string);
    }

    public void reset() {
        num1 = null;
        num2 = null;
        operator = null;
        result = null;
    }
}
