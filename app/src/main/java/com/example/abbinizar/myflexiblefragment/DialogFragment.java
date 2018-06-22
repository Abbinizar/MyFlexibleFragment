package com.example.abbinizar.myflexiblefragment;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.sql.Statement;


/**
 * A simple {@link Fragment} subclass.
 */
public class DialogFragment extends android.support.v4.app.DialogFragment implements View.OnClickListener {
    private Button btnChoose,btnClose;
    private RadioGroup rgOptions;
    private RadioButton rbSaf, rbMou, rbLvg, rbMoyes;
    private OnOptionDialogListener onOptionDialogListener;

    public OnOptionDialogListener getOnOptionDialogListener() {
        return onOptionDialogListener;
    }

    public void setOnOptionDialogListener(OnOptionDialogListener onOptionDialogListener){
        this.onOptionDialogListener = onOptionDialogListener;
    }

    public DialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dialog, container, false);
        btnChoose = (Button)view.findViewById(R.id.btn_choose);
        btnClose = (Button)view.findViewById(R.id.btn_close);
        rgOptions = (RadioGroup)view.findViewById(R.id.rg_options);
        rbLvg = (RadioButton)view.findViewById(R.id.rb_lvg);
        rbMou = (RadioButton)view.findViewById(R.id.rb_mou);
        rbMoyes = (RadioButton)view.findViewById(R.id.rb_moyes);
        rbSaf = (RadioButton)view.findViewById(R.id.rb_saf);
        btnClose.setOnClickListener(this);
        btnChoose.setOnClickListener((View.OnClickListener) this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_close:
                getDialog().cancel();
                break;
            case R.id.btn_choose:
                int checkedRadioButtoniId = rgOptions.getCheckedRadioButtonId();
                if (checkedRadioButtoniId != -1){
                    String coach = null;
                    switch (checkedRadioButtoniId){
                        case R.id.rb_lvg:
                            coach = rbLvg.getText().toString().trim();
                            break;
                        case R.id.rb_mou:
                            coach = rbMou.getText().toString().trim();
                            break;
                        case R.id.rb_moyes:
                            coach = rbMoyes.getText().toString().trim();
                            break;
                        case R.id.rb_saf:
                            coach = rbSaf.getText().toString().trim();
                            break;
                    }
                    getOnOptionDialogListener().onOptionChoosen(coach);
                    getDialog().cancel();
                }
                break;
        }

    }
    public interface OnOptionDialogListener{
        void onOptionChoosen(String text);
    }
}
