package com.example.preshcyber.book_supplies;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentMain extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_lists);

        button = (Button) findViewById(R.id.Button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentMain.this,
                        FacultyOfScience.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}