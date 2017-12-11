package com.example.pjanu.shuriken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    public void ruch (View view){

        ImageView shuriken = (ImageView) findViewById(R.id.shuriken);
        ImageView shuriken2 = (ImageView) findViewById(R.id.shuriken2);
        ImageView shuriken3 = (ImageView) findViewById(R.id.shuriken3);
        ImageView shuriken4 = (ImageView) findViewById(R.id.shuriken4);
        ImageView shuriken5 = (ImageView) findViewById(R.id.shuriken5);
        ImageView shuriken6 = (ImageView) findViewById(R.id.shuriken6);
        ImageView shuriken7 = (ImageView) findViewById(R.id.shuriken7);
        ImageView shuriken8 = (ImageView) findViewById(R.id.shuriken8);

        ImageView tab[] = new ImageView[] {shuriken,shuriken2,shuriken3,shuriken4,shuriken5,shuriken6,shuriken7,shuriken8};
        Button button  = (Button) findViewById(R.id.button);
        ImageView fasola = findViewById(R.id.fasola);
        TextView KN = (TextView) findViewById(R.id.KN);

        button.setVisibility(View.INVISIBLE);
        fasola.animate()
                .alpha(1f)
                .setDuration(2700)
                .scaleX(1f)
                .scaleY(1f);
        KN.animate()
                .alpha(1f)
                .translationYBy(1000f)
                .rotation(1440f)
                .setDuration(3000);


        float lel =0;
        for(int i= 0; i < 8; i++){
            tab[i].setVisibility(View.VISIBLE);
            tab[i].animate().translationXBy(1100f).rotation((i+1)*720f).setDuration((i+1)*500);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView KN = (TextView) findViewById(R.id.KN);
        KN.setTranslationY(-1000f);
    }
}
