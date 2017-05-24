package nicosiput.com.projectfinaliak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    Spinner mSpinnerKurir;
    Spinner mSpinnerPaket;
    List<String> mListKurir = new ArrayList<>();

    private String[] arraySpinner;

    int qty = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        mSpinnerKurir = (Spinner) findViewById(R.id.mCbKurir);
        mListKurir.add("JNE");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mListKurir);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinnerKurir.setAdapter(dataAdapter);

        this.arraySpinner = new String[] {
                "Reguler", "YES"
        };
        Spinner s = (Spinner) findViewById(R.id.mCbPaket);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter);
    }

    public void onClickTambah(View v)
    {
        if (qty == 100)
        {
            return;
        }
        qty = qty + 1;
        displayQuantity(qty);
    }

    public void onClickKurang(View v)
    {
        if (qty == 0)
        {
            return;
        }
        qty = qty - 1;
        displayQuantity(qty);
    }

    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.mTxtQty);
        quantityTextView.setText("" + number);
    }

    public void onClickBeli(View v)
    {
        startActivity(new Intent(this, MainActivity.class));
    }
}
