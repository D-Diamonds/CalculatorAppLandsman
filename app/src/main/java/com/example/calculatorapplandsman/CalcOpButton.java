package com.example.calculatorapplandsman;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalcOpButton extends CalcButton {

    private String operation;

    public CalcOpButton(Button button, String operation, TextView result, Calculator calculator) {
        super(button, result, calculator);
        this.operation = operation;
        this.getButton().setOnClickListener(this);
    }

    public void onClick(View view) {
        System.out.println("CLICKED " + this.operation);
        if (this.operation.equals("=")) {
            Double result = getCalculator().evaluate();
            if (result != null)
                getResult().setText(Double.toString(result));
            else
                getResult().setText("INVALID");
        }
        else if (this.operation.equals("C")) {
            getCalculator().clear();
            getResult().setText("");
        }
        else
            getCalculator().setOperation(this.operation);
    }

}
