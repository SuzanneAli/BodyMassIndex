package com.gmail.alisuzan97.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText weight,height;
TextView result;
Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
        click  = (Button) findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick(View view){
        BMI();
    }
        });

    }

    private void BMI() {
        String heights = height.getText().toString();
        String weights = weight.getText().toString();

        if(heights != null && !"".equals(heights) && weights != null && !"".equals(weights)){
            float heightval = Float.parseFloat(heights)/100;
            float weightval = Float.parseFloat(weights);
            float BMI = weightval/(heightval * heightval);
            
            display(BMI);
        }


    }

    private void display(float bmi) {
        String bmishow = "";
        if(Float.compare(bmi,15f) <= 0) {
            bmishow = "Underweight";
        } else if(Float.compare(bmi,15f) > 0 && Float.compare(bmi,16f) <= 0){
            bmishow = "Underweight";
        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            bmishow ="Underweight";
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmishow = "Normal";
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmishow = "Overweight";
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmishow = "Overweight";
        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
            bmishow = "Overweight";
        } else {
            bmishow = "Overweight";
        }
        bmishow = bmi + "\n" + bmishow;
        result.setText(bmishow);
        }

    }
