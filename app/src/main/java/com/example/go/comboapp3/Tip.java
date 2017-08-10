package com.example.go.comboapp3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tip extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);


        EditText perc = (EditText) findViewById(R.id.perc);
        EditText bill = (EditText)findViewById(R.id.bill);
        TextView kaka = (TextView)findViewById(R.id.kaka);





        String str = bill.getText().toString();
        String str2 = perc.getText().toString();

        float billTotal = Float.parseFloat(str);
        float percn = Float.parseFloat(str2);

        float TOTAL = billTotal * (percn/100);

        kaka.setText("TIP $"+ TOTAL +"!");
    }
}
