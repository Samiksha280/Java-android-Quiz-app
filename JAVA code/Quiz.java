package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    TextView ans;
    Button bt1;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        rg = findViewById(R.id.radiogroup);
        bt1 = findViewById(R.id.button7);
        ans = findViewById(R.id.textView16);

    }

    public void get_ans(View v){
        int selectedId = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(selectedId);
        answer = rb.getText().toString();

        if(answer.equals("3 times or more a year")){
            ans.setText("you should take precautions like \n" +
                    "Keep your surroundings clean.\n" +
                    "Avoid getting close to people who are sick.\n" +
                    "Use alcohol-based hand sanitizer.");
        }
        else {
            ans.setText("you should take precautions like \n" +
                    "Cover your nose and mouth with a tissue when you cough or sneeze.\n" +
                    "Wash your hands often with soap and water, especially after you cough or sneeze.\n" +
                    "Avoid touching your eyes, nose or mouth.\n" +
                    "Try to avoid close contact with sick people.");
        }
    }

    public void que2(View v){
        Intent intent = new Intent(this,Quiz2.class);
        startActivity(intent);
    }
}