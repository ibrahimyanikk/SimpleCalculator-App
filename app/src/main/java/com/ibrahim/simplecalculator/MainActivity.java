package com.ibrahim.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number1text;
    EditText number2text;
    TextView resulttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        number1text=findViewById(R.id.editTextText);
        number2text=findViewById(R.id.editTextText2);
        resulttext=findViewById(R.id.textView);

    }
    public void sum(View view){
        if(number1text.getText().toString().matches("")||number1text.getText().toString().matches(""))
        {
            resulttext.setText("ENTER NUMBER!!!");
        }
        else{
            Integer number1=Integer.parseInt(number1text.getText().toString());
            int number2=Integer.parseInt(number2text.getText().toString());
            int result=number1+number2;
            resulttext.setText("Result: "+ result);
        }



    }
    public void subriction(View view){
        if(number1text.getText().toString().matches("")||number1text.getText().toString().matches(""))
        {
            resulttext.setText("ENTER NUMBER!!!");
        }
        else{
            Integer number1=Integer.parseInt(number1text.getText().toString());
            int number2=Integer.parseInt(number2text.getText().toString());
            int result=number1-number2;
            resulttext.setText("Result: "+ result);
        }

    }
    public void multiply(View view){
        if(number1text.getText().toString().matches("")||number1text.getText().toString().matches(""))
        {
            resulttext.setText("ENTER NUMBER!!!");
        }
        else{
            Integer number1=Integer.parseInt(number1text.getText().toString());
            int number2=Integer.parseInt(number2text.getText().toString());
            int result=number1*number2;
            resulttext.setText("Result: "+ result);
        }

    }

    public void divide(View view){
        if(number1text.getText().toString().matches("")||number1text.getText().toString().matches(""))
        {
            resulttext.setText("ENTER NUMBER!!!");
        }
        else{
            Integer number1=Integer.parseInt(number1text.getText().toString());
            int number2=Integer.parseInt(number2text.getText().toString());
            int result=number1/number2;
            resulttext.setText("Result: "+ result);
        }
    }
}