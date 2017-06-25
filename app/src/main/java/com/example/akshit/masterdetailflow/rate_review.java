package com.example.akshit.masterdetailflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class rate_review extends AppCompatActivity {

    private static Button btn;
    private static RatingBar rb;
    private static TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_review);
        OnSubmit();
        ratingBar();
        Textview_about();
    }

    public void OnSubmit(){
        btn=(Button) findViewById(R.id.review_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rate_review.this,"review submitted , Thank you!!!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(rate_review.this,webpageListActivity.class));
            }
        });
    }

    public void ratingBar(){
        rb=(RatingBar) findViewById(R.id.ratingBar);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating<=2.0){
                    Toast.makeText(rate_review.this,"average"+ratingBar.getRating(),Toast.LENGTH_SHORT).show();
                }
                else if(rating==3.0){
                    Toast.makeText(rate_review.this,"good"+ratingBar.getRating(),Toast.LENGTH_SHORT).show();
                }
                else if(rating==4.0){
                    Toast.makeText(rate_review.this,"very good"+ratingBar.getRating(),Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(rate_review.this,"excellent"+ratingBar.getRating(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void Textview_about(){
        tv=(TextView) findViewById(R.id.textView_about);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rate_review.this,about.class));

            }
        });
    }
}

