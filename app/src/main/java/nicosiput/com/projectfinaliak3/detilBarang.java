package nicosiput.com.projectfinaliak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class detilBarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_barang);

        isi();
    }

    public void isi()
    {
        TextView txtDeskripsi = (TextView) findViewById(R.id.mIsiDeskripsi);

        txtDeskripsi.setText("APEX M650\n" +
            "\n" +
            "Dynamic RGB Backlighting\n" +
            "Individually positioned LEDs for maximum brightness and customization lets you show off a range of 16.8 million colors and 20 levels of brightness control.\n" +
            "\n" +
            "QX2 Mechanical Gaming Switches\n" +
            "Developed with Gateron, SteelSeries QX2 Mechanical Gaming Switch deliver dramatically faster gameplay with their low force and actuation point. Available in a wide array of switches to best suit your gameplay.\n" +
            "\n" +
            "*Harap konfirmasi terlebih dahulu untuk ketersediaan barang.");
    }

    public void onClickOrder(View v)
    {
        startActivity(new Intent(this, OrderActivity.class));
    }
}
