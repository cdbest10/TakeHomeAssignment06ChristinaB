package com.example.android.takehomeassignment06_christinab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class ReceiptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);


        Bundle receiptInputs = getIntent().getExtras();
        if (receiptInputs == null) {
            return;
        }
        TextView receiptOutput = findViewById(R.id.receipt_info);

        Receipt tipCalculator = (Receipt) getIntent().getSerializableExtra(Keys.TIP_KEY);
        receiptOutput.setText(tipCalculator.toString());

    }
}
