package com.example.calculatorapplandsman;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CalcNumButton extends CalcButton {

    private int value;

    public CalcNumButton(Button button, int value, TextView result, Calculator calculator) {
        super(button, result, calculator);
        this.value = value;
        //System.out.println(this.value);
        this.getButton().setOnClickListener(this);
    }

    public void onClick(View view) {
        System.out.println("CLICKED " + this.value);
        getCalculator().setValue(this.value * 1.0);
        getResult().setText(Integer.toString(this.value));
    }
}
