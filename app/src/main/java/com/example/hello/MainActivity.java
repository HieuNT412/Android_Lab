package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnCal);
        TextView text = findViewById(R.id.txtR);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText v1 = findViewById(R.id.txtv1);
                EditText v2 = findViewById(R.id.txtv2);
                int vl1 = Integer.parseInt(String.valueOf(v1.getText()));
                int vl2 = Integer.parseInt(String.valueOf(v2.getText()));
                // Code here executes on main thread after user presses button
                Cal c = new Cal();
                text.setText("Result : " + c.sum(vl1, vl2));
            }
        });
    }
}