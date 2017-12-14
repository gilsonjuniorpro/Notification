package br.notification.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it = getIntent();
        String msg = it.getStringExtra("msg");
        Log.i("msg", msg);

        TextView tvMsg = findViewById(R.id.tvMsg);
        tvMsg.setText(msg);
    }
}