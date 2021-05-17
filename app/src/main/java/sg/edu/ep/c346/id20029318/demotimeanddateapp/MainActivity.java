package sg.edu.ep.c346.id20029318.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button DisTime;
    Button DisDate;
    TextView txtView;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker) ;
        DisDate = findViewById(R.id.butDisDate);
        DisTime = findViewById(R.id.butDisTime);
        txtView = findViewById(R.id.textViewDisplay);
        reset = findViewById(R.id.butReset);


       DisTime.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View viewTim) {
               String time = "Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
               txtView.setText(time);
           }
       }
    );

       DisDate.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View viewDat){
               int d = dp.getDayOfMonth();
               int m = dp.getMonth() + 1;
               int y = dp.getYear();

               txtView.setText("Date is " + d + "/" + m + "/"+y);
           }
       });

       reset.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View viewRe) {
               dp.updateDate(2020,0,1);
               tp.setCurrentHour(0);
               tp.setCurrentMinute(0);
           }

       });







    }

}