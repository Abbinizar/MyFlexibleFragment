package com.example.abbinizar.myflexiblefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment implements View.OnClickListener{

    private Button btnDetailsCategory;

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        btnDetailsCategory = (Button)view.findViewById(R.id.btn_details_category);
        btnDetailsCategory.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (getId() == R.id.btn_details_category){

        }
    }
}
