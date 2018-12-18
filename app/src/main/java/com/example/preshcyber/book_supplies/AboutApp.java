package com.example.preshcyber.book_supplies;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class AboutApp extends Activity {

    private TextView upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);

        upload = (TextView) findViewById(R.id.upload_item);

        upload.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutApp.this,
                        UploadItem.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}