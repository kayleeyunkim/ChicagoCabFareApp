package bbobbo216.chicagocabfareapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;

public class FillInfo extends AppCompatActivity {
    double input_mile;
    double initial_fee = 3.00;
    double fee_per_mile = 3.25;
    double total_cost;
    String car_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_info);
        final EditText mileage = (EditText)findViewById(R.id.mileage);
        final Spinner car = (Spinner)findViewById(R.id.car_group);
        Button cost = (Button)findViewById(R.id.calculate);

        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result1 = ((TextView)findViewById(R.id.result1));
            final TextView result2 = ((TextView)findViewById(R.id.result2));
            public void onClick(View v) {
                input_mile = Double.parseDouble(mileage.getText().toString());
                total_cost = initial_fee + (input_mile * fee_per_mile);
                car_choice = car.getSelectedItem().toString();
                result1.setText("You choosed " + car_choice + "\nwith " + input_mile + " miles.");
                result2.setText("Your estimated cost is\n$ " + (String.format("%.2f", total_cost)));

            }
        });
    }
}
