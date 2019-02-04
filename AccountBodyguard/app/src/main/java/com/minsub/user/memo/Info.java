package com.minsub.user.memo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 2016-02-21.
 */
public class Info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        Button bt1 = (Button) findViewById(R.id.back_bt);
        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Info.this, Simple_NotepadActivity.class);
                // Start next activity
                startActivity(intent);
                Info.this.finish();

            }
        });

    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Info.this, Simple_NotepadActivity.class);
        // Start next activity
        startActivity(intent);

        Info.this.finish();

    }
}
