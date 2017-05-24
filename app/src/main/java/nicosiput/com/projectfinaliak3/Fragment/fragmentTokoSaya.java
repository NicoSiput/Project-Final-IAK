package nicosiput.com.projectfinaliak3.Fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import nicosiput.com.projectfinaliak3.R;
import nicosiput.com.projectfinaliak3.detail_transaksi;
import nicosiput.com.projectfinaliak3.detilBarang;

public class fragmentTokoSaya extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_fragment_toko_saya, container, false);

        CardView b1 = (CardView) v.findViewById(R.id.cardView1);
        CardView b2 = (CardView) v.findViewById(R.id.cardView2);
        CardView b3 = (CardView) v.findViewById(R.id.cardView3);
        CardView b4 = (CardView) v.findViewById(R.id.cardView4);
        CardView b5 = (CardView) v.findViewById(R.id.cardView5);
        CardView b6 = (CardView) v.findViewById(R.id.cardView6);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detail_transaksi.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detail_transaksi.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detail_transaksi.class);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detail_transaksi.class);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detail_transaksi.class);
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), detail_transaksi.class);
                startActivity(i);
            }
        });



        return v;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
