package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    TextView ans;
    Button bt1;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        rg = findViewById(R.id.radioGroup);
        bt1 = findViewById(R.id.button5);
        ans = findViewById(R.id.textView19);

    }

    public void get_ans(View v){
        int selectedId = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(selectedId);
        answer = rb.getText().toString();

        if(answer.equals("Every once in a while")){
            ans.setText("If you get exhausted or feel down every once in a while then you should to take proper sleep, " +
                    "keep a regular schedule," +
                    "lose wight if you are overweight" +
                    "try to include protein and carbs in your meal" +
                    "concern a doctor if needed.");
        }
        else {
            ans.setText("If you feel low or exhausted frequently then please make sure you are having good sleep with proper schedule" +
                    "also, sleeping at wrong time can reduce your energy" +
                    "which will lead to low energy feeling and exhausted schedule\n" +
                    "quit smoking, and you may need a CPAP device to help keep your airway passages open while you sleep.");
        }
    }

    public void que3(View v){
        Intent intent = new Intent(this,Quiz3.class);
        startActivity(intent);
    }
}