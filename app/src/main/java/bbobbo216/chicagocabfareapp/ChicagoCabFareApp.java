package bbobbo216.chicagocabfareapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChicagoCabFareApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicago_cab_fare_app);
        Button first_btn = (Button) findViewById(R.id.Estimated_btn);
        first_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity (new Intent(ChicagoCabFareApp.this, FillInfo.class));
            }
        });
    }
}
