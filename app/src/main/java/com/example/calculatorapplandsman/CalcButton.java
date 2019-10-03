package com.example.calculatorapplandsman;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public abstract class CalcButton extends MainActivity implements View.OnClickListener {

    private Button button;
    private TextView result;
    private Calculator calculator;

    public CalcButton(Button button, TextView result, Calculator calculator) {
        this.button = button;
        this.result = result;
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public Button getButton() {
        return button;
    }

    public TextView getResult() {
        return result;
    }

    public abstract void onClick(View view);

}
