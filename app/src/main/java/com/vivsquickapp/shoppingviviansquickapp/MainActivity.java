package com.vivsquickapp.shoppingviviansquickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.rcMusicAppText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.rcbgdMusicAppText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsHomeTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsLoginTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsBlogTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsContactTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsShoppingTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsDuelingTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsRestlessTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.vivsBgdTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void openBrowser(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse(url));

        startActivity(intent);
    }

}