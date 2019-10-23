package com.example.andinurnaf.tugaspemula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        President presidentku = getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView mulai = (TextView)findViewById(R.id.content_lahir);
        TextView selesai = (TextView)findViewById(R.id.content_wafat);

        Glide.with(this).load(presidentku.getPhoto()).override(350,550).into(gamabar);
        name.setText(presidentku.getName());
        remarks.setText(presidentku.getRemarks());
        deskripsi.setText(presidentku.getDeskripsi());
        mulai.setText(presidentku.getLahir());
        selesai.setText(presidentku.getWafat());

        Log.i("photo", presidentku.getPhoto());
        Log.i("deskripsi", presidentku.getDeskripsi());
    }
}
