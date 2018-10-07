package com.example.devangi.aasraah;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;




/**
 * A simple {@link Fragment} subclass.
 */
public class Helpline extends Fragment {


    public Helpline() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v= inflater.inflate(R.layout.fragment_helpline, container, false);
        Button button1 = (Button) v.findViewById(R.id.phone1);
        Button button2= (Button) v.findViewById(R.id.phone2);
        Button button3= (Button) v.findViewById(R.id.phone3);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView textView = (TextView)v.findViewById(R.id.number_to_call1);
                // Use format with "tel:" and phone number to create phoneNumber.
                String phoneNumber = String.format("tel: %s", textView.getText().toString());
                // Create the intent.
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                // Set the data for the intent as the phone number.
                dialIntent.setData(Uri.parse(phoneNumber));
                // If package resolves to an app, send intent.
                if (dialIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(dialIntent);
                } else {
                   // Log.e(TAG, "Can't resolve app for ACTION_DIAL Intent.");
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView textView = (TextView)v.findViewById(R.id.number_to_call2);
                // Use format with "tel:" and phone number to create phoneNumber.
                String phoneNumber = String.format("tel: %s", textView.getText().toString());
                // Create the intent.
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                // Set the data for the intent as the phone number.
                dialIntent.setData(Uri.parse(phoneNumber));
                // If package resolves to an app, send intent.
                if (dialIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(dialIntent);
                } else {
                    // Log.e(TAG, "Can't resolve app for ACTION_DIAL Intent.");
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView textView = (TextView)v.findViewById(R.id.number_to_call3);
                // Use format with "tel:" and phone number to create phoneNumber.
                String phoneNumber = String.format("tel: %s", textView.getText().toString());
                // Create the intent.
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                // Set the data for the intent as the phone number.
                dialIntent.setData(Uri.parse(phoneNumber));
                // If package resolves to an app, send intent.
                if (dialIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(dialIntent);
                } else {
                    // Log.e(TAG, "Can't resolve app for ACTION_DIAL Intent.");
                }

            }
        });

        return v;
    }

}
