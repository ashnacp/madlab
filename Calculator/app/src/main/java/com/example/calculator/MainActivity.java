package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextNumber2);
        n2=findViewById(R.id.editTextNumber);
        t1=findViewById(R.id.textView);

    }
    public void sum(View view) {
        t1.setText("Sum is :"+(Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
    public void diff(View view) {
        t1.setText("Difference is :"+(Integer.parseInt(n1.getText().toString())-Integer.parseInt(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
    public void prod(View view) {
        t1.setText("Product is :"+(Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
    public void quotient(View view) {
        t1.setText("Division is :" + (Double.parseDouble(n1.getText().toString()) / Double.parseDouble(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
}