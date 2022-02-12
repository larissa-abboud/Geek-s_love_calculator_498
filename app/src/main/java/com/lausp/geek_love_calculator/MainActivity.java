package com.lausp.geek_love_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner dropdown;
    EditText name;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown = findViewById(R.id.lang);
        String[] options = new String[]{"Java", "C", "C++", "Python", "HTML","css","javascript"};

        ArrayAdapter <String> languages = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, options);

        dropdown.setAdapter(languages);
    }


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