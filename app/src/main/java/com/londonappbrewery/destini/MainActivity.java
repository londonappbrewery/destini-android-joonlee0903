package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.y;
import static com.londonappbrewery.destini.R.id.buttonTop;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mbuttonTop;
    Button mbuttonBottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mbuttonTop = (Button) findViewById(buttonTop);
        mbuttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mbuttonTop.getText() == mbuttonTop.getResources().getString(R.string.T1_Ans1)) {
                    mbuttonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mbuttonBottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                }
                else if (mbuttonTop.getText() == mbuttonTop.getResources().getString(R.string.T3_Ans1)){
                    mStoryTextView.setText(getResources().getString(R.string.T6_End));
                    mbuttonBottom.setVisibility(View.GONE);
                    mbuttonTop.setVisibility(View.GONE);
                }
                else if(mbuttonTop.getText() == mbuttonTop.getResources().getString(R.string.T2_Ans1)){
                    mbuttonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mbuttonBottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mbuttonBottom.getText() == mbuttonBottom.getResources().getString(R.string.T1_Ans2)){
                    mbuttonTop.setText(getResources().getString(R.string.T2_Ans1));
                    mbuttonBottom.setText(getResources().getString(R.string.T2_Ans2));
                    mStoryTextView.setText(getResources().getString(R.string.T2_Story));
                } else if (mbuttonBottom.getText() == mbuttonBottom.getResources().getString(R.string.T2_Ans2)) {
                    mStoryTextView.setText(getResources().getString(R.string.T4_End));
                    mbuttonBottom.setVisibility(View.GONE);
                    mbuttonTop.setVisibility(View.GONE);
                } else if (mbuttonBottom.getText() == mbuttonBottom.getResources().getString(R.string.T3_Ans2)){
                    mStoryTextView.setText(getResources().getString(R.string.T5_End));
                    mbuttonBottom.setVisibility(View.GONE);
                    mbuttonTop.setVisibility(View.GONE);
                }

            }
        });

    }
}
