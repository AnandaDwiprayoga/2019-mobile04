package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText etName;
    private TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        etName = findViewById(R.id.input_name);
        tvName = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        if (TextUtils.isEmpty(etName.getText())){
            Toast.makeText(this, "Fill the blank", Toast.LENGTH_SHORT).show();
        }else{
            tvName.setText("Hello " + etName.getText().toString() + " , Congratulation!!");
        }
    }
}
