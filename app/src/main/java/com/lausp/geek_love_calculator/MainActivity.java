package com.lausp.geek_love_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner dropdown;
    EditText name;
    TextView result;
     String[] options = new String[]{"Java", "C", "C++", "Python", "HTML","css","javascript"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown = findViewById(R.id.lang);
        name = (EditText) findViewById(R.id.name);
        result = (TextView) findViewById(R.id.result);
       // String[] options = new String[]{"Java", "C", "C++", "Python", "HTML","css","javascript"};




        ArrayAdapter <String> languages = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, options);
        languages.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(languages);
        //dropdown.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

    }


       /** public void Item_Selected( View view) {
            String text = dropdown.getSelectedItem().toString();
            switch (text) {
                case "JAVA":
                    Toast.makeText(getApplicationContext(), "Spinner item java!", Toast.LENGTH_SHORT).show();
                    break;
                case "python":
                    //Toast.makeText(parent.getContext(), "Spinner item 2!", Toast.LENGTH_SHORT).show();
                    break;
                case "c":
                    //Toast.makeText(parent.getContext(), "Spinner item 3!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }





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

     public void onItemSelected(AdapterView<?> parent, View view,
     int pos, long id) {
     // An item was selected. You can retrieve the selected item using
     // parent.getItemAtPosition(pos)
     }

     public void onNothingSelected(AdapterView<?> parent) {
     // Another interface callback
     }
     }*/

}