package com.firstbuild.androidapp.addProduct;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firstbuild.androidapp.R;

public class AddProductSelectFragment extends Fragment {

    public AddProductSelectFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_add_product_paragon, container, false);

        view.findViewById(R.id.layoutParagon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().
                        beginTransaction().
                        replace(R.id.content_frame, new AddProductSearchingParagonFragment()).
                        addToBackStack(null).
                        commit();
            }
        });


        return view;
    }


}
