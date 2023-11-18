package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendIntent(View view) {
        // Create an explicit Intent to start another activity within the same app
        Intent explicitIntent = new Intent(this, SecondActivity.class);
        startActivity(explicitIntent);

        // Create an implicit Intent to open a web page
        Intent implicitIntent = new Intent(Intent.ACTION_VIEW);
        implicitIntent.setData(android.net.Uri.parse("https://www.google.com"));
        startActivity(implicitIntent);
    }
}
