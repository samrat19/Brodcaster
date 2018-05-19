package com.example.samrat.brodcaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.a);
    }

    public void SendEmail(View v) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        String[] array = {" "};
        i.putExtra(Intent.EXTRA_EMAIL, array);
        i.putExtra(Intent.EXTRA_SUBJECT, " ");
        String msg = a.getText().toString();
        i.putExtra(Intent.EXTRA_TEXT, msg);
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    }
}