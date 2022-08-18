package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    Button about_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        about_us = findViewById(R.id.button2);
    }
    public void about_us_info(View v){

        Intent intent = new Intent(this,AboutUsInfo.class);
        startActivity(intent);

    }
    public void help_us(View v){
        Intent help1 = new Intent(this,Get_help.class);
        startActivity(help1);
    }

    public void start_quiz(View v){
        Intent start = new Intent(this,Quiz.class);
        startActivity(start);
    }
}