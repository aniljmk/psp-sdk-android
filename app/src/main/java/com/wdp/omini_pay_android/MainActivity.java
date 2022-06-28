package com.wdp.omini_pay_android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.wdp.ominipayment.OminiPay;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    //sir account
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String username = "psp_test.sgkvcacb.c2drdmNhY2I2YTc3MA==";
        String password = "b3pFSnVJb3V3SW5QTnFneVRFSy9wQT09";
        String key = "b3pFSnVJb3V3SW5QTnFneVRFSy9wQT09";
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name","Dharmraj Kumhar");
            jsonObject.put("email","developers.wdp@gmail.com");
            jsonObject.put("amount","11");
            jsonObject.put("mobile_number","966557877988");
            jsonObject.put("merchant_note","Testing");
            String params = jsonObject.toString();

            OminiPay.StcPay(MainActivity.this,username,password,key,params);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}