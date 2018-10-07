package com.example.devangi.aasraah;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {


    public Home() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        String[] menu_items = {"You only have one life. Live it.","When you feel like giving up, just remember the reason why you held on for so long."
                ,"They cant rescue you if they dont know you need it. Ask for help to fight another day.",
                "You have the power to say that this is not how my story will end.",
                "The person who suicides dies once, but those they leave behind die a thousand deaths, trying to relive those terrible moments.",
                "Life has its ups and downs, keep on swinging.",
                "When you come to the end of your rope, tie a knot and hang on.",
        "When things are tough, you must be tougher.",
        "Even the darkest night will end and the sun will rise.",
        "Suicide doesnt end the pain, it just passes it on to someone else.",
        "There is nothing greater provided by God and your parents to you than your precious life, so live it.",
        "Life is meant to be lived with hope and happiness, not fear and suicide.",
        "Having a rough day? Place your hand over your heart, can you feel it? That is called purpose. You are alive for a reason. SO dont ever give up.",
        "Dont be so hard on yourself.",
        "A person who lives his entire life has a lot lot more to give back to scoiety and the needy, and death wont make the society any better.",
        "The world is a better place with you in it.",
        "There are far far better things ahead than what we leave behind.",
        "Keep holding on.",
        "YOU MATTER!!!"};


        ListView listView = (ListView) view.findViewById(R.id.menu_list);

        ArrayAdapter<String> st = new ArrayAdapter<String>(

                getActivity(), android.R.layout.simple_list_item_1, menu_items

        );

        listView.setAdapter(st);

        // Inflate the layout for this fragment
        return view;
    }

}
