package nicosiput.com.projectfinaliak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class lupaPassword_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        TextView txtRegister = (TextView) findViewById(R.id.mTxtRegister);

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), registerActivity.class));
            }
        });
    }

    public void onClickButton(View v)
    {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
