package nicosiput.com.projectfinaliak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class registerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView txtRegister = (TextView) findViewById(R.id.mTxtLupaPassword);
        TextView txtLogin = (TextView) findViewById(R.id.mTxtLogin);

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), lupaPassword_activity.class);
                startActivity(in);
            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(in);
            }
        });
    }

    public void onClickButton(View v)
    {
        Intent in = new Intent(this, LoginActivity.class);
        startActivity(in);
    }
}
