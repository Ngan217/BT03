package com.example.bt03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    final Button btn = (Button) findViewById(R.id.button);
    final AlertDialog ad = new AlertDialog.Builder(this).create();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Date t = new Date();
                String message = "Thời gian hiện hành : " + t.toLocaleString();
                ad.setMessage(message);
                ad.show();
            }
        });
    }
}