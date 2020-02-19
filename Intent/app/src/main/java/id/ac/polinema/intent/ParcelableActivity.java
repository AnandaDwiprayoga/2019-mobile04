package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import id.ac.polinema.intent.Model.User;

import static id.ac.polinema.intent.ProfileParcelableActivity.USER_KEY;

public class ParcelableActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText namaInput;
    private EditText ageInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameInput       = findViewById(R.id.input_username);
        namaInput           = findViewById(R.id.input_name);
        ageInput            = findViewById(R.id.input_age);
    }

    public void handleParcelableSubmit(View view) {
        if (TextUtils.isEmpty(usernameInput.getText()) ||
                TextUtils.isEmpty(namaInput.getText()) ||
                TextUtils.isEmpty(ageInput.getText())){

            Toast.makeText(this, "Fill the blank", Toast.LENGTH_SHORT).show();
        }else{
            String username = usernameInput.getText().toString();
            String name = namaInput.getText().toString();
            String age = ageInput.getText().toString();

            User user = new User(username,name,Integer.parseInt(age));
            Intent intent = new Intent(this, ProfileParcelableActivity.class);
            intent.putExtra(USER_KEY, user);
            startActivity(intent);
        }
    }
}
