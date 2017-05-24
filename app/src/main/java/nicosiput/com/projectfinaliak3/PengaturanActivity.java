package nicosiput.com.projectfinaliak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PengaturanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);
    }

    public void onClickSimpan(View v)
    {
        startActivity(new Intent(this, MainActivity.class));
    }
}
