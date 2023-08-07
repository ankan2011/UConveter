package com.example.uconveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private TextView textview3;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        textview3 =findViewById(R.id.textView3);
        editText =findViewById(R.id.editText);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Done ", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg =Integer.parseInt(s);
                double pound = 2.205 * kg;
                textview3.setText("The corresponding value in pounds is "+pound);

            }
        });


    }
}