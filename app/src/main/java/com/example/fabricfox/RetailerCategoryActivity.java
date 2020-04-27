package com.example.fabricfox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RetailerCategoryActivity extends AppCompatActivity {

    private ImageView tShirts, sportsTShirts, femaleDresses, sweaters;
    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
    private ImageView headphonesHandsFree, laptops, watches, mobilePhones;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_category);

        tShirts= (ImageView) findViewById(R.id.t_shirts);
        sportsTShirts= (ImageView) findViewById(R.id.sports_t_shirts);
        femaleDresses= (ImageView) findViewById(R.id.female_dresses);
        sweaters= (ImageView) findViewById(R.id.sweaters);
        glasses= (ImageView) findViewById(R.id.glasses);
        hatsCaps= (ImageView) findViewById(R.id.hats);
        walletsBagsPurses= (ImageView) findViewById(R.id.purses_bags_wallets);
        shoes= (ImageView) findViewById(R.id.shoes);
        headphonesHandsFree= (ImageView) findViewById(R.id.headphones_handsfree);
        laptops= (ImageView) findViewById(R.id.laptop_pc);
        watches= (ImageView) findViewById(R.id.watches);
        mobilePhones= (ImageView) findViewById(R.id.mobilephones);

        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });

        sportsTShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "sportsTShirts");
                startActivity(intent);
            }
        });

        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "femaleDresses");
                startActivity(intent);
            }
        });

        sweaters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "sweaters");
                startActivity(intent);
            }
        });

        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "glasses");
                startActivity(intent);
            }
        });

        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "hatsCaps");
                startActivity(intent);
            }
        });

        walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "walletsBagsPurses");
                startActivity(intent);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "shoes");
                startActivity(intent);
            }
        });

        headphonesHandsFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "headphonesHandsFree");
                startActivity(intent);
            }
        });

        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "laptops");
                startActivity(intent);
            }
        });

        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "watches");
                startActivity(intent);
            }
        });

        mobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerCategoryActivity.this, RetailerAddNewProductActivity.class);
                intent.putExtra("category", "mobilePhones");
                startActivity(intent);
            }
        });
    }
}
