package android.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Get_help extends AppCompatActivity {
    TextView link1;
    TextView link2;
    TextView link3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_help);
        link1 = findViewById(R.id.textView11);
        link2 = findViewById(R.id.textView12);
        link3 = findViewById(R.id.textView13);
    }

    public  void  link1(View v){
        String url = "http://www.bestonhealth.com/";
        Intent intent = new Intent();
        intent.setPackage("com.android.chrome");
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bestonhealth.com/"));
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.setPackage("com.android.chrome");
//        startActivity(intent);
    }
    public  void  link2(View v){
        String url = "https://www.healthline.com/health/juice-immune-system-boost";
        Intent intent = new Intent();
        intent.setPackage("com.android.chrome");
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthline.com/health/juice-immune-system-boost"));
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.setPackage("com.android.chrome");
//        startActivity(intent);
    }

    public  void  link3(View v) {
        String url = "https://www.health.harvard.edu/staying-healthy/how-to-boost-your-immune-system";
        Intent intent = new Intent();
        intent.setPackage("com.android.chrome");
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }




}