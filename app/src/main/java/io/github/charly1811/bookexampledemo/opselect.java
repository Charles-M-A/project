package io.github.charly1811.bookexampledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class opselect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opselect);
        Button gotoButton = (Button) findViewById(R.id.button1);

        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(opselect.this, MainActivity.class);
                startActivity(gotoIntent);
            }
        });

        Button gotoButton1 = (Button) findViewById(R.id.button2);
        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),free.rm.skytube.gui.activities.MainActivity.class);
                startActivity(i);
            }
        });

    }
}
