package com.niyagrace.aplikasiii;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.niyagrace.aplikasiii.activity.LoginActivity;
import com.niyagrace.aplikasiii.activity.ProfilActivity;
import com.niyagrace.aplikasiii.util.SharedPrefManager;
import com.niyagrace.aplikasiii.util.api.BaseApiService;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        Button btnMateri = (Button) view.findViewById(R.id.btnMateri);
        btnMateri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fl_container, new MateriFragment(), "fragment_screen");
                ft.commit();
            }
        });

        Button btnLatihan = (Button) view.findViewById(R.id.btnLatihan);
        btnLatihan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fl_container, new LatihanFragment(), "fragment_screen");
                ft.commit();
            }
        });

        Button btnPengolah = (Button) view.findViewById(R.id.btnPengolah);
        btnPengolah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fl_container, new PengolahFragment(), "fragment_screen");
                ft.commit();
            }
        });

        Button btnProfil = (Button) view.findViewById(R.id.btnProfil);
        btnProfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), ProfilActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }


}