package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz4 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    TextView ans;
    Button bt1;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        rg = findViewById(R.id.radioGroup3);
        bt1 = findViewById(R.id.button7);
        ans = findViewById(R.id.textView25);

    }

    public void get_ans(View v){
        int selectedId = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(selectedId);
        answer = rb.getText().toString();

        if(answer.equals("Quickly")){
            ans.setText("Get your rest. Recent research published in the Journal of Applied Psychology suggested that getting more sleep can help wounds heal faster,\n" +
                    "Eat your vegetables,\n" +
                    "Stay active,\n" +
                    "Don't smoke,\n" +
                    "Keep the wound clean and dressed.");
        }
        else {
            ans.setText("Fresh fruits and vegetables eaten daily will also supply your body with other nutrients essential to wound healing such as vitamin A," +
                    " copper and zinc," +
                    "It may help to supplement your diet with extra vitamin C," +
                    "Keep your wound dressed. Wounds heal faster if they are kept warm.");
        }
    }

    public void que5(View v){
        Intent intent = new Intent(this,Quiz5.class);
        startActivity(intent);
    }
}