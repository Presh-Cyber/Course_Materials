package com.example.preshcyber.book_supplies;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class FacultyOfScience extends Activity {

    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_lists);

        cardView = (CardView) findViewById(R.id.cardView);

        cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyOfScience.this,
                        BioLists.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}