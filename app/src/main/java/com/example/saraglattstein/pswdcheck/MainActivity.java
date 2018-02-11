package com.example.saraglattstein.pswdcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private EditText pswd1;
    private EditText pswd2;
    private TextView matchText;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pswd1 = findViewById(R.id.pswd1);
        pswd2 = findViewById(R.id.pswd2);
        matchText = findViewById(R.id.matchText);

        btn = findViewById(R.id.btn);
        btn.setTag(1);

        View.OnClickListener onClickListener = new View.OnClickListener() {



            public void onClick(View view) {
                int tag = (Integer) view.getTag();
                String fin;
                switch (tag) {
                    case 1:

                        String p1 = pswd1.getText().toString();
                        String p2 = pswd2.getText().toString();

                        //Log.e("Testing","Here is pswd1: "+ p1);
                        //Log.e("Testing","Here is pswd2: "+ p2);

                        if (p1.equals(p2)) {
                            fin = "THANK YOU";
                        }
                        else {
                            fin = "PASSWORDS MUST MATCH";
                        }

                     matchText.setText(fin);
                }

            }
        };
        btn.setOnClickListener(onClickListener);
    }
}
