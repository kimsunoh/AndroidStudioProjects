package com.example.kimsno.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_plus;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_minur;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_multiply;
    Button btn_reset;
    Button btn_0;
    Button btn_delete;
    Button btn_divide;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_minur = (Button)findViewById(R.id.btn_minur);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        btn_reset = (Button)findViewById(R.id.btn_reset);
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_delete = (Button)findViewById(R.id.btn_delete);
        btn_divide = (Button)findViewById(R.id.btn_divide);
        textView = (TextView)findViewById(R.id.editText);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
