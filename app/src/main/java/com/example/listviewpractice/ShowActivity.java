package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        int imageId=bundle.getInt("imageId");
        String cquId=bundle.getString("cquId");
        bundle.clear();
        intent.putExtras(bundle);
        ImageView iv_icon=findViewById(R.id.iv_icon);
        TextView tv_show=findViewById(R.id.tv_name);
        iv_icon.setBackgroundResource(imageId);
        tv_show.setText(cquId);

    }

    public void back(View v){
        finish();
    }
}
