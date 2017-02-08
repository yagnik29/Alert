package demo.example.com.alert;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    String name,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = e1.getText().toString();
                pass = e1.getText().toString();
                SharedPreferences sp =getSharedPreferences("me", MODE_PRIVATE);
                SharedPreferences.Editor ed=sp.edit();
                ed.putString("user",name);
                ed.putString("pass",pass);
                ed.commit();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }

        });

    }
}
