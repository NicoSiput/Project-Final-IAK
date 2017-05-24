package nicosiput.com.projectfinaliak3.Fragment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import nicosiput.com.projectfinaliak3.MainActivity;
import nicosiput.com.projectfinaliak3.R;
import nicosiput.com.projectfinaliak3.detilBarang;

public class fragmentBarangSaya extends Fragment {

    public ProgressBar pb;
    boolean b = false;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_barang_saya, container, false);

        CardView b1 = (CardView) view.findViewById(R.id.mCardViewBarang1);
        CardView b2 = (CardView) view.findViewById(R.id.mCardViewBarang2);
        CardView b3 = (CardView) view.findViewById(R.id.mCardViewBarang3);
        CardView b4 = (CardView) view.findViewById(R.id.mCardViewBarang4);
        CardView b5 = (CardView) view.findViewById(R.id.mCardViewBarang5);
        CardView b6 = (CardView) view.findViewById(R.id.mCardViewBarang6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detilBarang.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detilBarang.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detilBarang.class);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detilBarang.class);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detilBarang.class);
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detilBarang.class);
                startActivity(i);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pb = (ProgressBar) getView().findViewById(R.id.progressBar);
                pb.setVisibility(View.GONE);
            }
        },3000);

        return view;
    }



}
