package com.rafsan.class229forlooppart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button,loopButton;
    TextView textView;
    LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        myLayout = findViewById(R.id.myLayout);
        loopButton = findViewById(R.id.loopButton);

        loopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int x=1; x<=15; x++){
                    Button button = new Button(MainActivity.this);
                    button.setText("BUTTON LOOP "+x);

                    myLayout.addView(button);
                }

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                textView.setText("");
                for(int x=1; x<=30; x++){

                    if(x%2 == 0){
                        textView.append(" "+x);
                    }


                }

            }
        });




    }
}