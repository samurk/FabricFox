package com.example.fabricfox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RetailerAddNewProductActivity extends AppCompatActivity {

    private String CategoryName;
    private Button AddNewProductBtn;
    private EditText InputProductName, InputProductDescription, InputProductPrice;
    private ImageView InputProductImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_add_new_product);

        CategoryName= getIntent().getExtras().get("category").toString();

        AddNewProductBtn = (Button) findViewById(R.id.add_new_product);
        InputProductImage = (ImageView) findViewById(R.id.select_product_image);
        InputProductName = (EditText) findViewById(R.id.product_name);
        InputProductDescription = (EditText) findViewById(R.id.product_description);
        InputProductPrice = (EditText) findViewById(R.id.product_price);

    }
}
