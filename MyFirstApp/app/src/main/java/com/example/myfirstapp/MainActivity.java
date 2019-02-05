package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public double bst2usd_rate = 3458.72;
    public String usd = "0";
    public String bst = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button

        EditText BstText = (EditText) findViewById(R.id.number_bst);
        EditText UsdText = (EditText) findViewById(R.id.number_usd);

        String number_bst = BstText.getText().toString();
        String number_usd = UsdText.getText().toString();

        if (number_bst.isEmpty() || number_bst.equals(bst)) {
            double number = Double.valueOf(number_usd);
            double convert_number = number / bst2usd_rate;
            BstText.setText(String.valueOf(convert_number));
        }

        else {
            double number = Double.valueOf(number_bst);
            double convert_number = number * bst2usd_rate;
            UsdText.setText(String.valueOf(convert_number));
        }

        bst = String.valueOf(number_bst);
        usd = String.valueOf(number_usd);

    }
}
