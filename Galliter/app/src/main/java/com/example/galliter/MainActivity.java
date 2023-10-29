package com.example.galliter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.galliter.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {


    EditText editTextNumber;
    TextView resultTextView;
    TextView nameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText("An app by Vrushali More");
        editTextNumber = findViewById(R.id.editTextNumber);
        resultTextView = findViewById(R.id.resultTextView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editTextNumber.getText().toString();
                if (!input.equals("")) {
                    double liters = Double.parseDouble(input);
                    double gallons = liters * 0.219;
                    resultTextView.setText(String.format("%.2f gallons", gallons));
                }
            }
        });

    }
}