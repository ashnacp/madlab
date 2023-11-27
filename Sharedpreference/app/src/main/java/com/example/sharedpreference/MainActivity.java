package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "MyPrefsFile"; // Name of the SharedPreferences file

    private EditText editText;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        Button saveButton = findViewById(R.id.saveButton);
        Button loadButton = findViewById(R.id.loadButton);
        sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });
    }
    private void saveData() {
        String dataToSave = editText.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("saved_data", dataToSave);
        editor.apply();
    }
    private void loadData() {
        String savedData = sharedPreferences.getString("saved_data", "");
        editText.setText("Saved data:"+savedData);
    }
}
