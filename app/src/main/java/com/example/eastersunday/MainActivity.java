package com.example.eastersunday;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submitButton);
        submitListener submitClick = new submitListener();
        submitButton.setOnClickListener(submitClick);
    }

    private class submitListener implements View.OnClickListener {
        public void onClick(View v){
            EditText enterYear = findViewById(R.id.enterYear);
            String year = enterYear.getText().toString() ;

            Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
            intent.putExtra("Year",year);
            startActivity(intent);
        }
    }
}
