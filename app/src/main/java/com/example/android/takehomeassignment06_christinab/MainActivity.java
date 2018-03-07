package com.example.android.takehomeassignment06_christinab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void makeReceipt(View view) {
        double amountText;
        double taxAmount;
        double tipAmount;


        EditText amountInput = findViewById(R.id.amount_text);
        String amount = amountInput.getText().toString();
        amountText = Double.parseDouble(amount);

        EditText tip = findViewById(R.id.tip_percentage);
        String tipPercentage = tip.getText().toString();
        tipAmount = Double.parseDouble((tipPercentage));

        EditText tax = findViewById(R.id.tax_percentage);
        String taxPercentage = tax.getText().toString();
        taxAmount = Double.parseDouble((taxPercentage));

        Receipt receiptOutput = new Receipt(amountText, taxAmount, tipAmount);

        Intent intent = new Intent(this, ReceiptActivity.class);
        intent.putExtra(Keys.TIP_KEY, receiptOutput);
        startActivity(intent);

    }

}
