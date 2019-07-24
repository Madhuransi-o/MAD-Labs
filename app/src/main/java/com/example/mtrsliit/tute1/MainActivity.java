package com.example.mtrsliit.tute1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set the text view within the layout for class object
        txtview2 = findViewById(R.id.textView3);

        //this set the value of message2 as the text string
        txtview2.setText(R.string.msg2);


        Log.i("LifeCycle", "onCreate() Invoked !! ");

    }

    public void onStart()

    {
        super.onStart();
        Log.i("LifeCycle", "onStart() Invoked!!! ");
    }

public void onRestart()
{
    super.onRestart();
    Log.i("LifeCycle", "onRestart() Invoked!!! ");

}
public void onStop()
{
    super.onStop();
    Log.i("LifeCycle", "onStop() invoked!!!");

}
public void onResume(){

        super.onResume();
    Log.i("Lifecycle", "onResume() Invoked!!! ");
}
    }

