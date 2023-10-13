package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Integer num1=0,num2=0;
String opr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void action_button_num1(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("1");
        if (opr=="")
            num1=num1*10+1;
        else
            num2=num2*10+1;
    }
    public void action_button_num2(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append(String.valueOf("2"));
        if (opr=="")
            num1=num1*10+2;
        else
            num2=num2*10+2;
    }
    public void action_button_num3(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("3");
        if (opr=="")
            num1=num1*10+3;
        else
            num2=num2*10+3;
    }
    public void action_button_num4(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("4");
        if (opr=="")
            num1=num1*10+4;
        else
            num2=num2*10+4;
    }
    public void action_button_num5(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("5");
        if (opr=="")
            num1=num1*10+5;
        else
            num2=num2*10+5;
    }
    public void action_button_num6(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("6");
        if (opr=="")
            num1=num1*10+6;
        else
            num2=num2*10+6;
    }
    public void action_button_num7(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("7");
        if (opr=="")
            num1=num1*10+7;
        else
            num2=num2*10+7;
    }
    public void action_button_num8(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("8");
        if (opr=="")
            num1=num1*10+8;
        else
            num2=num2*10+8;
    }
    public void action_button_num9(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("9");
        if (opr=="")
            num1=num1*10+9;
        else
            num2=num2*10+9;
    }
    public void action_button_num0(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.append("0");
        if (opr=="")
            num1=num1*10+0;
        else
            num2=num2*10+0;
    }
    public void action_button_Clear(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.setText("");
        num1=0;
        num2=0;
        opr="";

    }
    public void action_button_add(View v){

        EditText t1=findViewById(R.id.editTextNumber2);
        t1.setText(t1.getText()+"+");
        //t1.append("+");
        opr="+";
    }
    public void action_button_diff(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.setText(t1.getText()+"-");
        opr="-";
    }
    public void action_button_prod(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.setText(t1.getText()+"*");
        opr="*";
    }
    public void action_button_quotient(View v){
        EditText t1=findViewById(R.id.editTextNumber2);
        t1.setText(t1.getText()+"/");
        opr="/";
    }

    public void action_button_equal(View v) {
        EditText t1 = findViewById(R.id.editTextNumber2);
        if (opr=="+")
            t1.setText(num1+num2);
        else if (opr=="-")
            t1.setText(num1-num2);
        else if (opr=="*")
            t1.setText(num1*num2);
        else if (opr=="/")
            t1.setText(num1/num2);
    }
}