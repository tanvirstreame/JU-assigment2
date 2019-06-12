package com.timewaste.juassignmenttvshow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner showSpinner;
    Button getShowButton;
    TextView msgTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showSpinner = (Spinner) findViewById(R.id.spinner);
        getShowButton = (Button) findViewById(R.id.button);
        msgTextView = (TextView) findViewById(R.id.textview);
        setContentView(R.layout.activity_main);
        String[] arraySpinner = new String[] {
                "9.00 - 1.00", "2.00 - 5.00", "6.00 - 8.00"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        showSpinner.setAdapter(adapter);

        getShowButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String showListText = showSpinner.getSelectedItem().toString();
                if(showListText=="9.00 - 1.00"){
                    msgTextView.setText("1.Vorer Khobor\n2.Krishi o Manus\n3.Banglar Git");
                }
                else if (showListText=="2.00 - 5.00" ){
                    msgTextView.setText("1.Dupurer Khobor\n2.Kishor Kontho\n3.Rabindro Git");
                }
                else{
                    msgTextView.setText("1.Rater Khobor\n2.Sobar Kontho\n3.Nazrul Git");
                }
            }
        });
    }

    public void GetShowList(View view) {

    }
}
