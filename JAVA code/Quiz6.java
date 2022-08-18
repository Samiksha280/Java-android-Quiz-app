package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz6 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    TextView ans;
    Button bt1;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);
        rg = findViewById(R.id.radioGroup5);
        bt1 = findViewById(R.id.button9);
        ans = findViewById(R.id.textView31);

    }

    public void get_ans(View v){
        int selectedId = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(selectedId);
        answer = rb.getText().toString();

        if(answer.equals("Normal Digestion")){
            ans.setText(" If you are having normal digestion then also, try to do above things in your daily life" +
                    "Eat Real Food.\n" +
                    "Get Plenty of Fiber and protein, avoid calories.\n" +
                    "Also, Healthy Fats to Your Diet. Good digestion may require eating enough fat.\n" +
                    "Stay Hydrated, drink more water\n" +
                    "Manage Your Stress.\n" +
                    "Eat Mindfully.\n" +
                    "Chew Your Food.\n");
        }
        else {
            ans.setText("If you are having normal digestion then also, try to do above things in your daily life" +
                    "Drinking more water and hot water right after your sleep at early morning." +
                    "Ginger Can Relieve Nausea and Vomiting.\n"+
                    "Avoiding lying down.\n" +
                    "Taking a warm bath or using a heating bag.\n" +
                    "Avoiding smoking and drinking alcohol.\n" +
                    "Berries and citrus fruits, such as oranges and grapefruit, " +
                    "contain less fructose, making them easier to tolerate and less likely to cause gas. ");
        }
    }

    public void home(View v){
        Intent intent = new Intent(this,HomeScreen.class);
        startActivity(intent);
    }
}