package com.example.contactsapplocal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import data.DatabaseHandler;
import model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

        Contact jeremy = new Contact();
        jeremy.setName("jeremy");
        jeremy.setPhoneNumber("987456321");

        db.addContact(jeremy);

        //Contact cont = db.getContact(1);
        //cont.setName("New Jeremy");
        //cont.setPhoneNumber("0147852369");

        //int updateRow = db.updateContact(cont);
        //Log.d("Row", "onCreate : " + updateRow);

        //db.deleteContact(jeremy);

        List<Contact> contactList = db.getAllContact();
        for (Contact contact: contactList)
        {
            Log.d("MainActivity", "onCreate: "+contact.getName());
        }
    }
}