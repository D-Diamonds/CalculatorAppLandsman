package com.example.calculatorapplandsman;

public class Calculator {

    private Double value1 = null;
    private Double value2 = null;
    private String operation = null;

    public void setOperation(String operation) {
        if (this.operation != null)
            this.value1 = evaluate();
        this.operation = operation;
    }

    public void setValue(Double value) {
        if (this.value1 == null)
            this.value1 = value;
        else if (this.value1 != null && this.operation == null)
            this.value1 = value;
        else
            this.value2 = value;
    }

    public void clear() {
        this.value1 = null;
        this.value2 = null;
        this.operation = null;
    }

    public Double evaluate() {
        System.out.println(this.value1 + " " + this.operation + " " + this.value2);
        Double toReturn = value1;
        if (value1 != null && value2 != null) {
            if (this.operation.equals("+"))
                toReturn = this.value1 + this.value2;
            else if (this.operation.equals("-"))
                toReturn = this.value1 - this.value2;
            else if (this.operation.equals("*"))
                toReturn = this.value1 * this.value2;
            else if (this.operation.equals("/") && this.value2 != 0)
                toReturn = this.value1 / this.value2;
            else if (this.operation.equals("/") && this.value2 == 0)
                toReturn = null;
        }
        if (this.value2 == null)
            return null;
        this.value1 = toReturn;
        this.value2 = null;
        this.operation = null;
        return toReturn;
    }
}
