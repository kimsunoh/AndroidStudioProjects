package com.example.kimsno.firstand;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public EditText et;
    public TextView tvText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et = (EditText)findViewById(R.id.editText);
        tvText = (TextView)findViewById(R.id.textView2);

        et.addTextChangedListener(watcher);
    }

    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if(et.isFocusable())
            {
                try
                {
                    byte[] bytetext = et.getText().toString().getBytes("KSC5601");
                    tvText.setText(Integer.toString(bytetext.length)+" Byte");
                }catch(Exception ex){}
            }
        }

        @Override
        public void afterTextChanged(Editable s) {
            String after_text = s.toString();
            try
            {
                byte[] getbyte = after_text.getBytes("KSC5601");
                if(getbyte.length > 80)
                {
                    s.delete(s.length()-2, s.length()-1);
                }
            }catch (Exception e) {}
        }
    };


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

    private int etGetLength(EditText editText) {
        return editText.getText().toString().length();
    }

    public void btnSendOnClick(View v){
        showToast("Send Button On Click");
    }
    public void btnCloseOnClick(View v){
        showToast("Close Button On Click");
        moveTaskToBack(true);
        finish();
    }

    public void showToast(String s){
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
        return;
    }
}
