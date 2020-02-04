package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myText;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.myButton);
        myText = findViewById(R.id.textView);
        View.OnClickListener buttonPress = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText("You have clicked the button");
            }
        };

        myButton.setOnClickListener(buttonPress);
    }
}
