package org.ftninformatika.jelovnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1.findViewById(R.id.tvOpis);
        textView2.findViewById(R.id.tvCena);
        textView1.setText("jela");
    }
}
