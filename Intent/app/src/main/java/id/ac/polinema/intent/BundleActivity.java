package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    private EditText usernameInput;
    private EditText namaInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        usernameInput       = findViewById(R.id.input_username);
        namaInput           = findViewById(R.id.input_name);
        ageInput            = findViewById(R.id.input_age);

    }

    public void handleSubmitBundle(View view) {
        if (TextUtils.isEmpty(usernameInput.getText()) ||
            TextUtils.isEmpty(namaInput.getText()) ||
            TextUtils.isEmpty(ageInput.getText())){

            Toast.makeText(this, "Fill the blank", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(this, ProfileBundleActivity.class);
            intent.putExtra(USERNAME_KEY, usernameInput.getText().toString());
            intent.putExtra(NAME_KEY, namaInput.getText().toString());
            intent.putExtra(AGE_KEY, ageInput.getText().toString());

            startActivity(intent);
        }
    }
}
