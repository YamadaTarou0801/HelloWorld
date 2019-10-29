package sample.example.helloworld;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "test dayo-n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"HelloWorld",Toast.LENGTH_SHORT).show();

        Log.d(TAG,"LOG TEST");
        Log.d(TAG,"LOG TEST2");

    }
}
