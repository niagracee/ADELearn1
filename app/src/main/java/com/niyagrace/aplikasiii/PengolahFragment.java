package com.niyagrace.aplikasiii;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.niyagrace.aplikasiii.activity.PengolahActivity;

public class PengolahFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pengolah, container, false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);

        Button btnLihatDosen = (Button) view.findViewById(R.id.btnLihatDosen);
        btnLihatDosen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), PengolahActivity.class);
                getActivity().startActivity(intent);
            }
        });


        return view;
    }
}