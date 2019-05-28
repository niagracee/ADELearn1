package com.niyagrace.aplikasiii;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.niyagrace.aplikasiii.activity.DosenActivity;

public class MateriFragment extends Fragment implements View.OnClickListener {

    private CardView materi1, materi2, materi3, materi4, materi5, materi6;
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_materi, container, false);

        materi1 = (CardView) view.findViewById(R.id.judul1);
        materi2 = (CardView) view.findViewById(R.id.judul2);
        materi3 = (CardView) view.findViewById(R.id.judul3);
        materi4 = (CardView) view.findViewById(R.id.judul4);
        materi5 = (CardView) view.findViewById(R.id.judul5);
        materi6 = (CardView) view.findViewById(R.id.judul6);

        materi1.setOnClickListener(this);
        materi2.setOnClickListener(this);
        materi3.setOnClickListener(this);
        materi4.setOnClickListener(this);
        materi5.setOnClickListener(this);
        materi6.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.judul1 :i = new Intent(getActivity(), DosenActivity.class);
                i.putExtra("materi","file:///android_asset/eda.html");
                getActivity().startActivity(i);
                break;

            case R.id.judul2 : i = new Intent(getActivity(), DosenActivity.class);
                i.putExtra("materi","file:///android_asset/steam.html");
                getActivity().startActivity(i);
                break;

            case R.id.judul3 : i = new Intent(getActivity(), DosenActivity.class);
                i.putExtra("materi","file:///android_asset/ringkasandata.html");
                getActivity().startActivity(i);
                break;

            case R.id.judul4 : i = new Intent(getActivity(), DosenActivity.class);
                i.putExtra("materi","file:///android_asset/dotplotboxplot.html");
                getActivity().startActivity(i);
                break;

            case R.id.judul5 : i = new Intent(getActivity(), DosenActivity.class);
                i.putExtra("materi","file:///android_asset/standarisasi.html");
                getActivity().startActivity(i);
                break;

            case R.id.judul6 : i = new Intent(getActivity(), DosenActivity.class);
                i.putExtra("materi","file:///android_asset/smoothing.html");
                getActivity().startActivity(i);
                break;
        }
    }
}