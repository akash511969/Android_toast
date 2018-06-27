package com.example.user.lifecyclemethods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCREATE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"onSTART", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"onRESUME", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this,"onPAUSE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"onRESTART", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"onSTOP", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {

        super.onDestroy();

        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show();
    }

}
