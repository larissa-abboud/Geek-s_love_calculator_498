package com.lausp.geek_love_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Spinner dropdown;
    EditText name;
    TextView result;
    String[] options = new String[]{"java", "C", "C++", "Python", "HTML","css","javascript"};
    TextView show_results;
    int min = 0;
    int max = 100;
    int random;
    ImageView heart ;
    int saved_counter;
    TextView text1 ,text2 , text3;
    String texted;
    ImageView logo;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown =  findViewById(R.id.lang);
        name = (EditText) findViewById(R.id.name);

        result = (TextView) findViewById(R.id.result);

        show_results = (TextView) findViewById(R.id.textView3);
        heart = (ImageView) findViewById(R.id.show_r);
        text1 = (TextView) findViewById(R.id.show1);
        text2 = (TextView) findViewById(R.id.show2);
        text3 = (TextView) findViewById(R.id.show3);





        ArrayAdapter <String> languages = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, options);
        languages.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(languages);


    }
    public void calculate(View view) { // calculates normally ,gives a button to show results ,reset image show reuslt
        if (name.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(this, "input Name", Toast.LENGTH_SHORT).show();


        }else {
            saved_counter++;

            reset_result(view);


            random = new Random().nextInt((max - min));

            String text = dropdown.getSelectedItem().toString();


        }

    }
    public void reset_name(View view){
        name.setText("");
        result.setText("");
        //logo.setImageResource(R.drawable.cpuheart1);
    }

    public void show_results(View view){

        show_results.setText("");
        String text_list = dropdown.getSelectedItem().toString();
        logo = (ImageView) view;
        String amount  = String.valueOf(random);
        logo.setTranslationY(-1500);
        logo.setTag(text_list);
        Log.d(logo.getTag().toString() , text_list);

        if (text_list.equalsIgnoreCase("Java")) {
            if (name.getText().toString().equalsIgnoreCase("")){
                logo.setImageResource(R.drawable.cpuheart1);
                Toast.makeText(this, "input Name", Toast.LENGTH_SHORT).show();
            }else{



            logo.setImageResource(R.drawable.java);
            result.setText(amount + " %");
            texted =  text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";}


        } else if (text_list.equalsIgnoreCase("C++")) {

            logo.setImageResource(R.drawable.cplus);
            result.setText(amount + " %");
            texted =  text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";


        }else if (text_list.equalsIgnoreCase("css")) {

            logo.setImageResource(R.drawable.css);
            result.setText(amount + " %");
            texted =  text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";


        }else if (text_list.equalsIgnoreCase("javascript")) {

            logo.setImageResource(R.drawable.javascript);
            result.setText(amount + " %");
            texted =  text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";


        }else if (text_list.equalsIgnoreCase("HTML")) {

            logo.setImageResource(R.drawable.html);
            result.setText(amount + " %");
            texted =  text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";


        }
        else if (text_list.equalsIgnoreCase("Python")) {

            logo.setImageResource(R.drawable.python);
            result.setText(amount + " %");
            texted = text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";


        }else if (text_list.equalsIgnoreCase("C")) {

            logo.setImageResource(R.drawable.c);
            result.setText(amount + " %");
            texted =  text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";


        }
                logo.animate().translationYBy(1500).rotation(3600).setDuration(600);



        // show calculated amount on screen up to 3 places
        if (saved_counter == 1 ){
            text1.setText(texted);
        }else if(saved_counter == 2){
           text2.setText(texted);
        }else if(saved_counter == 3){
            text3.setText(texted);
            //must reset
            saved_counter =0 ;

        }else{

            text1.setText("");
            text2.setText("");
            text3.setText("");
        }




    }
    public void reset_result(View view){
        show_results.setText(" click to show results");
        result.setText("");
        heart.setImageResource(R.drawable.cpuheart1);
    }


}