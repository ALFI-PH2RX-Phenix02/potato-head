package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< HEAD
=======
import android.view.View;
import android.widget.CheckBox;
>>>>>>> orientation
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======

>>>>>>> orientation
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
    }

<<<<<<< HEAD
=======
    public void cbMouth(View view){
        CheckBox cb_mouth = findViewById(R.id.cb_mouth);
        if(cb_mouth.isChecked())
            mouth.setVisibility(View.VISIBLE);
        else
            mouth.setVisibility(View.GONE);
    }
    public void cbArms(View view){
        CheckBox cb_arms = findViewById(R.id.cb_arms);
        if(cb_arms.isChecked())
            arms.setVisibility(View.VISIBLE);
        else
            arms.setVisibility(View.GONE);
    }
    public void cbEars(View view){
        CheckBox cb_ears = findViewById(R.id.cb_ears);
        if(cb_ears.isChecked())
            ears.setVisibility(View.VISIBLE);
        else
            ears.setVisibility(View.GONE);
    }
    public void cbHat(View view){
        CheckBox cb_hat = findViewById(R.id.cb_hat);
        if(cb_hat.isChecked())
            hat.setVisibility(View.VISIBLE);
        else
            hat.setVisibility(View.GONE);
    }
    public void cbEyebrow(View view){
        CheckBox cb_eyebrow = findViewById(R.id.cb_eyebrow);
        if(cb_eyebrow.isChecked())
            eyebrows.setVisibility(View.VISIBLE);
        else
            eyebrows.setVisibility(View.GONE);
    }
    public void cbEye(View view){
        CheckBox cb_eye = findViewById(R.id.cb_eye);
        if(cb_eye.isChecked())
            eyes.setVisibility(View.VISIBLE);
        else
            eyes.setVisibility(View.GONE);
    }
    public void cbGlasses(View view){
        CheckBox cb_glasses = findViewById(R.id.cb_glasses);
        if(cb_glasses.isChecked())
            glasses.setVisibility(View.VISIBLE);
        else
            glasses.setVisibility(View.GONE);
    }
    public void cbMustache(View view){
        CheckBox cb_mustache = findViewById(R.id.cb_mustache);
        if(cb_mustache.isChecked())
            mustache.setVisibility(View.VISIBLE);
        else
            mustache.setVisibility(View.GONE);
    }
    public void cbNose(View view){
        CheckBox cb_nose = findViewById(R.id.cb_nose);
        if(cb_nose.isChecked())
            nose.setVisibility(View.VISIBLE);
        else
            nose.setVisibility(View.GONE);
    }
    public void cbShoes(View view){
        CheckBox cb_shoes = findViewById(R.id.cb_shoes);
        if(cb_shoes.isChecked())
            shoes.setVisibility(View.VISIBLE);
        else
            shoes.setVisibility(View.GONE);
    }

>>>>>>> orientation
}
