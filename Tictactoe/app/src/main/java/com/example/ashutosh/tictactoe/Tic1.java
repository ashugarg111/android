package com.example.ashutosh.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Ashutosh on 03-05-2017.
 */
public class Tic1 extends Activity {
    Button bt;
    EditText ed1,ed2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tict1);
        bt=(Button) findViewById(R.id.bt1);
        ed1=(EditText) findViewById(R.id.et1);
        ed2=(EditText) findViewById(R.id.et2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()==0 || ed2.length()==0)
                {
                    if(ed1.length()==0){
                        Context context = getApplicationContext();
                        CharSequence text = "Enter player 1 Name";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context,text,duration);
                        toast.show();
                    }
                    else if(ed2.length()==0){
                        Context context = getApplicationContext();
                        CharSequence text = "Enter player 2 Name";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context,text,duration);
                        toast.show();
                    }
                }
                else {
                    s1 = ed1.getText().toString();
                    s2 = ed2.getText().toString();
                    Bundle basket1 = new Bundle();
                    Bundle basket2 = new Bundle();
                    basket1.putString("key1", s1);
                    basket2.putString("key2", s2);
                    Intent g = new Intent(Tic1.this, Tic2.class);
                    g.putExtras(basket1);
                    g.putExtras(basket2);
                    startActivity(g);
                    finish();
                }
            }
        });

    }
}
