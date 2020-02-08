package com.example.eastersunday;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity ;
import android.os.Bundle ;
import android.widget.TextView ;


public class ResultActivity extends AppCompatActivity {
    String year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        year = getIntent().getExtras().getString("Year") ;
        ExampleInstrumentedTest cal = new ExampleInstrumentedTest(year);

        TextView resultInYear = findViewById(R.id.resultYear) ;
        String resultYear = "In " + year + ", Easter falls on" ;
        resultInYear.setText(resultYear);

        TextView resultInDate = findViewById(R.id.resultDate) ;
        String resultDate = "Sunday, "+ cal.getEasterDay() ;
        resultInDate.setText(resultDate);


    }
}
