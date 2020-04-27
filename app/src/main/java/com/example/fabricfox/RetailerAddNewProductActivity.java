package com.example.fabricfox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class RetailerAddNewProductActivity extends AppCompatActivity {

    private String CategoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_add_new_product);

        CategoryName= getIntent().getExtras().get("category").toString();

        Toast.makeText(this, CategoryName, Toast.LENGTH_SHORT).show();

    }
}
