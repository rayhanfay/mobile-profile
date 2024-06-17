package com.example.prouas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(R.drawable.photo1, "Veronika", "veronika@example.com", "+123456789", "http://www.veronika.com"));
        contactList.add(new Contact(R.drawable.photo2, "Jihanda", "jihanda@example.com", "+98712321", "http://www.jihanda.com"));
        contactList.add(new Contact(R.drawable.photo3, "Daniel", "daniel@example.com", "+91256125", "http://www.daniel.com"));
        contactList.add(new Contact(R.drawable.photo4, "Rika", "rika@example.com", "+9843731", "http://www.rika.com"));
        contactList.add(new Contact(R.drawable.photo5, "Bayu", "bayu@example.com", "+923723321", "http://www.bayu.com"));
        contactList.add(new Contact(R.drawable.photo6, "Jennifer", "jenni@example.com", "+12535321", "http://www.jenni.com"));
        contactList.add(new Contact(R.drawable.photo7, "Chika", "chika@example.com", "+62354321", "http://www.chika.com"));
        contactList.add(new Contact(R.drawable.photo8, "Satrio", "satrio@example.com", "+7235321", "http://www.stario.com"));
        contactList.add(new Contact(R.drawable.photo9, "Ariel", "ariel@example.com", "+453221", "http://www.ariel.com"));
        ListView listView = findViewById(R.id.contact_list_view);
        ContactAdapter adapter = new ContactAdapter(this, contactList);
        listView.setAdapter(adapter);
    }
}
