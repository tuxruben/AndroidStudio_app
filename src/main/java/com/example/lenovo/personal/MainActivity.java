package com.example.lenovo.personal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
    RadioButton rb1, rb2, rb3, rb4, rb5;
    EditText txt1, txt2;
    TextView txtVResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton)findViewById(R.id.radioButton2);
        rb2 = (RadioButton)findViewById(R.id.radioButton3);
        rb3 = (RadioButton)findViewById(R.id.radioButton4);
        rb4 = (RadioButton)findViewById(R.id.radioButton5);
        rb5 = (RadioButton)findViewById(R.id.radioButton6);
        txt1 = findViewById(R.id.editText2);
        txt2 = findViewById(R.id.editText3);
        txtVResult=findViewById(R.id.textView);
    }
    public void seleccionar(View V){

        if(rb1.isChecked()){
            sumarClick();
        }
        if(rb2.isChecked()){
            restaClick();
        }
        if(rb3.isChecked()){
            multiplicarClick();
        }
        if(rb4.isChecked()){
            dividirClick();
        }
        if(rb5.isChecked()){
            potenciaClick();
        }
    }
    public void sumarClick(){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado "+(num1+num2));
    }
    public void restaClick(){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado : "+(num1-num2));
    }
    public void multiplicarClick(){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado "+(num1*num2));
    }
    public void dividirClick(){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado "+(num1/num2));
    }
    public void potenciaClick() {

        String n1 = txt1.getText().toString();
        String n2 = txt2.getText().toString();
        float num1 = Float.parseFloat(n1);
        float num2 = Float.parseFloat(n2);
        if (num1>num2) {
            txtVResult.setText("el mayor es " + (num1));
        }else{

            txtVResult.setText("el mayor es " + (num2));
        }

    }
}
