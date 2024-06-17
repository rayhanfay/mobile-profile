package com.example.prouas;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private Context context;
    private List<Contact> contactList;
    private LayoutInflater inflater;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.contact_item, parent, false);
        }

        Contact contact = contactList.get(position);

        ImageView contactPhoto = convertView.findViewById(R.id.contact_photo);
        TextView contactName = convertView.findViewById(R.id.contact_name);
        TextView contactEmail = convertView.findViewById(R.id.contact_email);
        TextView contactPhone = convertView.findViewById(R.id.contact_phone);
        TextView contactWebsite = convertView.findViewById(R.id.contact_website);
        ImageView emailIcon = convertView.findViewById(R.id.email_icon);
        ImageView phoneIcon = convertView.findViewById(R.id.phone_icon);
        ImageView websiteIcon = convertView.findViewById(R.id.website_icon);

        // Set the contact details
        contactPhoto.setImageResource(contact.getPhotoResId());
        contactName.setText(contact.getName());
        contactEmail.setText(contact.getEmail());
        contactPhone.setText(contact.getPhone());
        contactWebsite.setText(contact.getWebsite());

        // Set click listeners for the icons
        emailIcon.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", contact.getEmail(), null));
            context.startActivity(Intent.createChooser(emailIntent, "Send email..."));
        });

        phoneIcon.setOnClickListener(v -> {
            Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", contact.getPhone(), null));
            context.startActivity(phoneIntent);
        });

        websiteIcon.setOnClickListener(v -> {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(contact.getWebsite()));
            context.startActivity(webIntent);
        });

        return convertView;
    }
}
