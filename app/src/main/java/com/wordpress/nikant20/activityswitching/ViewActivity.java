package com.wordpress.nikant20.activityswitching;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class ViewActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    CheckBox checkBoxHindi, checkBoxEnglish, checkBoxBhojpuri, checkBoxMaithli;
    RadioButton radioButtonMale, radioButtonFemale, radioButtonOthers;
    Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    RatingBar ratingBar;
    Button buttonSubmit;

    ArrayAdapter<String> adapter, autoadapter;


    void initViews() {

        checkBoxBhojpuri = (CheckBox) findViewById(R.id.checkboxBhojpuri);
        checkBoxEnglish = (CheckBox) findViewById(R.id.checkboxEnglish);
        checkBoxHindi = (CheckBox) findViewById(R.id.checkboxHindi);
        checkBoxMaithli = (CheckBox) findViewById(R.id.checkboxMaithli);

        radioButtonFemale = (RadioButton) findViewById(R.id.radioButtonFeMale);
        radioButtonMale = (RadioButton) findViewById(R.id.radioButtonMale);
        radioButtonOthers = (RadioButton) findViewById(R.id.radioButtonOthers);

        spinner = (Spinner) findViewById(R.id.spinner);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


        checkBoxEnglish.setOnCheckedChangeListener(this);
        checkBoxMaithli.setOnCheckedChangeListener(this);
        checkBoxHindi.setOnCheckedChangeListener(this);
        checkBoxBhojpuri.setOnCheckedChangeListener(this);

        radioButtonOthers.setOnCheckedChangeListener(this);
        radioButtonMale.setOnCheckedChangeListener(this);
        radioButtonFemale.setOnCheckedChangeListener(this);

        buttonSubmit.setOnClickListener(this);

    }

    void runspinner(){
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
        adapter.add("-------Select City-------");
        adapter.add("Gurgaon");
        adapter.add("Banglore");
        adapter.add("California");
        adapter.add("Chandigarh");

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String city = adapter.getItem(position);
                if(position!=0){
                    Toast.makeText(getApplicationContext(),"You choosed: "+city,Toast.LENGTH_LONG);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                  Toast.makeText(getApplicationContext(),"You didn't choosed any option",Toast.LENGTH_SHORT);
            }
        });

    }
    void runautocomplete(){

        autoadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
        autoadapter.add("Gurgaon");
        autoadapter.add("GuruGram");
        autoadapter.add("Gujrat");
        autoadapter.add("Ahemdabad");
        autoadapter.add("Aashram");
        autoadapter.add("Aagni V");
        autoadapter.add("Bombay");
        autoadapter.add("Burhanpur");
        autoCompleteTextView.setAdapter(autoadapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        initViews();
        runspinner();
        runautocomplete();

    }

    @Override
    public void onClick(View view) {

        String str = autoCompleteTextView.getText().toString().trim();
        Toast.makeText(this,"You Clicked Button: "+str,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        int id = compoundButton.getId();
        switch (id){
            case R.id.checkboxBhojpuri:
                if(b)
                    Toast.makeText(getApplicationContext(),"You Checked Bhojpuri",Toast.LENGTH_SHORT);
                else
                    Toast.makeText(getApplicationContext(),"You Unchcked Bhojpuri",Toast.LENGTH_SHORT);
                break;
            case R.id.checkboxEnglish:
                if(b)
                    Toast.makeText(getApplicationContext(),"You Checked English",Toast.LENGTH_SHORT);
                else
                    Toast.makeText(getApplicationContext(),"You Unchcked English",Toast.LENGTH_SHORT);
                break;
            case R.id.checkboxHindi:
                if(b)
                    Toast.makeText(getApplicationContext(),"You Checked Hindi",Toast.LENGTH_SHORT);
                else
                    Toast.makeText(getApplicationContext(),"You Unchcked Hindi",Toast.LENGTH_SHORT);
                break;
            case R.id.checkboxMaithli:
                if(b)
                    Toast.makeText(getApplicationContext(),"You Checked Maithli",Toast.LENGTH_SHORT);
                else
                    Toast.makeText(getApplicationContext(),"You Unchcked Maithli",Toast.LENGTH_SHORT);
                break;
            case R.id.radioButtonFeMale:
                Toast.makeText(getApplicationContext(),"You selected Female",Toast.LENGTH_SHORT);
                break;
            case R.id.radioButtonMale:
                Toast.makeText(getApplicationContext(),"You selected Male",Toast.LENGTH_SHORT);
                break;
            case R.id.radioButtonOthers:
                Toast.makeText(getApplicationContext(),"You selected Others",Toast.LENGTH_SHORT);
                break;

        }

    }
}
