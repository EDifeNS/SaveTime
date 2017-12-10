package com.example.mvdmvn.savetime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAuthClick(View view)
    {
        Intent intent = new Intent(getApplicationContext(), AuthActivity.class);
        startActivity(intent);
    }
    public void onRegistClick(View view)
    {
        Intent intent = new Intent(getApplicationContext(), Registrctivity.class);
        startActivity(intent);
    }
}
