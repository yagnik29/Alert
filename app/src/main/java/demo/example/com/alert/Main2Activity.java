package demo.example.com.alert;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences sp=getSharedPreferences("me",MODE_PRIVATE);

        t1.setText(sp.getString("user",null));
        t2.setText(sp.getString("pass",null));
    }
}
