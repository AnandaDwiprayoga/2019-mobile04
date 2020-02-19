package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        startActivity(new Intent(this, ExplicitIntentActivity.class));
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        startActivity(new Intent(this, ImplicitIntentActivity.class));
    }

    public void handleBundle(View view) {
        startActivity(new Intent(this, BundleActivity.class));
    }

    public void handleParcelable(View view) {
        startActivity(new Intent(this, ParcelableActivity.class));
    }
}
