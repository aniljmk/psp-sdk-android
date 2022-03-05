package com.wdp.ominipayandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

import javax.net.ssl.HttpsURLConnection;

public class OminiPay  {

    public static void Call(Context context, String username, String password, String key, String details)  {

        Intent intent = new Intent(context,OminiPayAndroid.class);
        intent.putExtra("username",username);
        intent.putExtra("password",password);
        intent.putExtra("key",key);
        intent.putExtra("details",details);
        ((Activity)context).startActivityForResult(intent,500);

    }
}
