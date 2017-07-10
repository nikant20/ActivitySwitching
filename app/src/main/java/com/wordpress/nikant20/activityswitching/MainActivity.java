package com.wordpress.nikant20.activityswitching;

import android.content.Intent;
import android.graphics.Camera;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity1 = (Button) findViewById(R.id.btnActivity1);
        btnActivity1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    //Code to create options menu explicitly
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Group ID, Item ID, Order of options menu, Title of menu
        menu.add(1,101,1,"Settings");
        menu.add(2,102,3,"Camera");
        menu.add(3,103,2,"Music");
        menu.add(3,104,4,"Contacts");

        return super.onCreateOptionsMenu(menu);
    }


    //to handle on click on options menu button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case 101:
                startActivityForResult(new Intent(Settings.ACTION_SETTINGS),0);
                break;
            case 102:
                startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE),1);
                break;
            case 103:
                startActivityForResult(new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER),1);
                break;
            case 104:
                startActivityForResult(new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI),1);
                break;
            default:
                Toast.makeText(getApplicationContext(),"Invalid Response",Toast.LENGTH_SHORT).show();


        }




        return super.onOptionsItemSelected(item);
    }
}
