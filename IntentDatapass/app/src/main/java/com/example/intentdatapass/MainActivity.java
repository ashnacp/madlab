package com.example.intentdatapass;

// MainActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNavigate = findViewById(R.id.btnNavigate);

        btnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Pass data to SecondActivity using Intent extras
                intent.putExtra("message", "Hello from MainActivity!");

                // Start SecondActivity
                startActivity(intent);
            }
        });
    }
}
