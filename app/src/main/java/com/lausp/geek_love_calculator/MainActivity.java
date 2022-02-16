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
    Tag file_name;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown =  findViewById(R.id.lang);
        name = (EditText) findViewById(R.id.name);
        result = (TextView) findViewById(R.id.result);
       // String[] options = new String[]{"Java", "C", "C++", "Python", "HTML","css","javascript"};
        show_results = (TextView) findViewById(R.id.textView3);

        heart = (ImageView) findViewById(R.id.show_r);
        text1 = (TextView) findViewById(R.id.show1);
        text2 = (TextView) findViewById(R.id.show2);
        text3 = (TextView) findViewById(R.id.show3);




        ArrayAdapter <String> languages = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, options);
        languages.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(languages);
        //dropdown.setOnItemSelectedListener( this);

    }
    public void calculate(View view) { // calculates normally ,gives a button to show results ,reset image show reuslt
        saved_counter ++;
        reset_result(view);

        random = new Random().nextInt((max - min) );

        String text = dropdown.getSelectedItem().toString();




    }
    public void show_results(View view){

        show_results.setText("");
        String text_list = dropdown.getSelectedItem().toString();
        ImageView logo = (ImageView) view;
        String amount  = String.valueOf(random);
        logo.setTranslationY(-1500);
        logo.setTag(text_list);
        Log.d(logo.getTag().toString() , text_list);
        if (text_list.equalsIgnoreCase("Java")) {



            logo.setImageResource(R.drawable.java);
            result.setText(amount + " %");
            texted =  text_list +" x  "+ name.getText().toString() + " = " + amount + " % ";


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


        }logo.animate().translationYBy(1500).rotation(3600).setDuration(600);
        if (name.getText().equals("")){
            saved_counter = 0;text1.setText("");
            text2.setText("");
            text3.setText("");


        }
        else if (saved_counter == 1 ){
            text1.setText(texted);


        }else if(saved_counter == 2){
           text2.setText(texted);
        }else if(saved_counter == 3){
            text3.setText(texted);
            //must reset

        }else{
            saved_counter =0 ;
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
/**
 *  fix logo sizes
 *  add random amount
 *  reset settings
 *  ***/

    /**public void Item_Selected(View view) {
     String text = dropdown.getSelectedItem().toString();
     switch (text) {
     case "JAVA":
        Toast.makeText(getApplicationContext(), "Spinner item java!", Toast.LENGTH_SHORT).show();
     break;

                }

     }

     app:srcCompat="@drawable/java"



    /*

    * */

/* on click the button :
* give randome result and print to text view,
* show loading heart
* after fiew option , reset button , after 6 automatic reset
* */


    /**Spinner spinner = (Spinner) findViewById(R.id.spinner);
     // Create an ArrayAdapter using the string array and a default spinner layout
     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
     R.array.planets_array, android.R.layout.simple_spinner_item);
     // Specify the layout to use when the list of choices appears
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     // Apply the adapter to the spinner
     spinner.setAdapter(adapter);

     public class SpinnerActivity extends Activity implements OnItemSelectedListener {
     ...

     public void onItemSelected(AdapterView parent, View view,
     int pos, long id) {
     // An item was selected. You can retrieve the selected item using
     // parent.getItemAtPosition(pos)
     }

     public void onNothingSelected(AdapterView parent) {
     // Another interface callback
     }
     }*/


}