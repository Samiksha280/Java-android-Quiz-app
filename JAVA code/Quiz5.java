package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz5 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    TextView ans;
    Button bt1;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        rg = findViewById(R.id.radioGroup4);
        bt1 = findViewById(R.id.button8);
        ans = findViewById(R.id.textView28);

    }

    public void get_ans(View v){
        int selectedId = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(selectedId);
        answer = rb.getText().toString();

        if(answer.equals("Often")){
            ans.setText("If you are stressed often then," +
                    "Exercise. Exercise is one of the most important things you can do to combat stress," +
                    "Consider supplements. Several supplements promote stress and anxiety reduction," +
                    "Light a candle,Reduce your caffeine intake," +
                    "Write it down,whatever you feel," +
                    "Spend time with friends and family and Laugh.");
        }
        else {
            ans.setText("If you feel stressed occasionally then," +
                    "Do exercise, Exercise is a great way to lower your stress," +
                    "Take a Break,Meditation and Prayer offer you ways to calm, focus your thoughts, and feel more positive," +
                    "Massage can work wonders on a stressed-out body,Have a good cry.");
        }
    }

    public void que6(View v){
        Intent intent = new Intent(this,Quiz6.class);
        startActivity(intent);
    }
}