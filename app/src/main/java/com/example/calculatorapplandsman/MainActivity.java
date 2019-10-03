package com.example.calculatorapplandsman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calculator = new Calculator();
        ArrayList<CalcNumButton> numBtns = new ArrayList<>();
        ArrayList<CalcOpButton> opBtns = new ArrayList<>();

        TextView result = findViewById(R.id.inputDisplay);

        TableLayout calcTable = findViewById(R.id.calcTable);
        for (int i = 0; i < calcTable.getChildCount(); i++) {
            TableRow row = (TableRow) calcTable.getChildAt(i);
            for (int j = 0; j < row.getChildCount(); j++) {
                Button btn = (Button) row.getChildAt(j);
                btn.setTextSize(20);
                if (btn.getTag() != null && btn.getTag().toString().equals("num")) {
                    //System.out.println(btn.getTag().toString());
                    numBtns.add(new CalcNumButton(btn, Integer.parseInt(btn.getText() + ""), result, calculator));
                }
                else
                    opBtns.add(new CalcOpButton(btn, btn.getText().toString() + "", result, calculator));
            }
        }
    }
}
