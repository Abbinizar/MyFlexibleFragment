package com.example.abbinizar.myflexiblefragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailCategoryFragment extends Fragment implements View.OnClickListener {
    private TextView tvCategoryName, tvCategoryDescription;
    private Button btnProfile, btnDialog;
    private String description;
    public static String EXTRA_NAME = "extra_name";
    public DetailCategoryFragment() {
        // Required empty public constructor
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail_category, container, false);
        tvCategoryName = (TextView)view.findViewById(R.id.tvcategory_name);
        tvCategoryDescription = (TextView)view.findViewById(R.id.tv_category_description);
        btnDialog = (Button)view.findViewById(R.id.btn_show_dialog);
        btnProfile = (Button)view.findViewById(R.id.btn_profile);
        btnDialog.setOnClickListener((View.OnClickListener) this);
        btnProfile.setOnClickListener(this);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle saveInstanceeState) {
        super.onActivityCreated(saveInstanceeState);
        String categoryName = getArguments().getString(EXTRA_NAME);
        tvCategoryName.setText(categoryName);
        tvCategoryDescription.setText(getDescription());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_profile:
                break;
            case R.id.btn_show_dialog:
                break;
        }

    }
}
