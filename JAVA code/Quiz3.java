package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    TextView ans;
    Button bt1;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        rg = findViewById(R.id.radioGroup2);
        bt1 = findViewById(R.id.button6);
        ans = findViewById(R.id.textView22);

    }

    public void get_ans(View v){
        int selectedId = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(selectedId);
        answer = rb.getText().toString();

        if(answer.equals("Regularly/ 1-2 times or more a week")){
            ans.setText("Regular physical activity can improve your muscle strength and boost your endurance." +
                    " Exercise delivers oxygen and nutrients to your tissues and helps your cardiovascular system work more efficiently." +
                    " And when your heart and lung health improve, " +
                    "you have more energy to tackle daily chores.");
        }
        else {
            ans.setText("If you do less exercise or activity you will become deconditioned. " +
                    "Your muscles weaken and lose bulk including the muscles you need for breathing and the large muscles in your legs and arms." +
                    " You will become more breathless as you do less activity.");
        }
    }

    public void que4(View v){
        Intent intent = new Intent(this,Quiz4.class);
        startActivity(intent);
    }
}