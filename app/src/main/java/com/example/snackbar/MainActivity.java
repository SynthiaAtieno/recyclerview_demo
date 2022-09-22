package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Synthia","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Eva","eva@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Milly","milly@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Gift","gift@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","hope@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        contacts.add(new Contacts("Hope","synthia@gmail.com","https://static.remove.bg/remove-bg-web/3ad3b721d276f1af1fb7121aff638a866139749a/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg"));
        //create a list of contact
        SnackbarAdapter adapter = new SnackbarAdapter(this);
        //set the list of contacts to the adapter created
        adapter.setContacts(contacts);
        recyclerView.setAdapter(adapter);
        //creating a layout manager for the recycler class

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}