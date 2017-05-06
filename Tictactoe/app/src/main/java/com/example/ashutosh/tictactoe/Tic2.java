package com.example.ashutosh.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

/**
 * Created by Ashutosh on 03-05-2017.
 */
public class Tic2 extends Activity {
    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9,clb;
    int counter = 0;
    char a = 'X';
    TextView t;
    protected void onCreate(Bundle abc) {
        super.onCreate(abc);

        setContentView(R.layout.avtivity_tict2);
        clb = (Button)findViewById(R.id.cl1);
        clb.setVisibility(View.INVISIBLE);
        Context context = getApplicationContext();
        CharSequence text="Game starts from Player 1";
        int duration= Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(context,text,duration);
        toast.setGravity(15,45,500);
        toast.show();
        bu1 = (Button) findViewById(R.id.button);
        bu2 = (Button) findViewById(R.id.button2);
        bu3 = (Button) findViewById(R.id.button3);
        bu4 = (Button) findViewById(R.id.button4);
        bu5 = (Button) findViewById(R.id.button5);
        bu6 = (Button) findViewById(R.id.button6);
        bu7 = (Button) findViewById(R.id.button7);
        bu8 = (Button) findViewById(R.id.button8);
        bu9 = (Button) findViewById(R.id.button9);
        t = (TextView) findViewById(R.id.tv2);
        bu1.setText("");
        bu2.setText("");
        bu3.setText("");
        bu4.setText("");
        bu5.setText("");
        bu6.setText("");
        bu7.setText("");
        bu8.setText("");
        bu9.setText("");
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu1.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu1.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu2.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu2.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu3.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu3.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu4.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu4.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu5.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu5.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu6.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu6.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu7.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu7.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu8.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu8.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bu9.setText("" + a);
                if (a == 'X')
                    a = 'O';
                else
                    a = 'X';
                bu9.setEnabled(false);
                counter++;
                getval(counter);
            }
        });
        clb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gh = new Intent(Tic2.this , Tic1.class);
                startActivity(gh);
                finish();
            }
        });
    }

    public void getval(int counter) {

        if(((bu1.getText().equals( bu3.getText()) && bu3.getText().equals( bu7.getText()) && !bu1.getText().equals("") && !bu3.getText().equals("") && !bu7.getText().equals("")))
                || ((bu1.getText().equals(bu2.getText() )&& bu2.getText().equals(bu5.getText()) && !bu1.getText().equals("") && !bu2.getText().equals("") && !bu5.getText().equals("")))
                || ((bu2.getText().equals(bu4.getText() )&& bu4.getText().equals(bu8.getText()) && !bu2.getText().equals("") && !bu4.getText().equals("") && !bu8.getText().equals("")))
                || ((bu5.getText().equals(bu6.getText() )&& bu6.getText().equals(bu9.getText()) && !bu5.getText().equals("") && !bu6.getText().equals("") && !bu9.getText().equals("")))
                || ((bu3.getText().equals(bu4.getText()) && bu4.getText().equals(bu6.getText()) && !bu3.getText().equals("") && !bu4.getText().equals("") && !bu6.getText().equals("")))
                || ((bu7.getText().equals( bu8.getText() )&& bu8.getText().equals(bu9.getText()) && !bu7.getText().equals("") && !bu8.getText().equals("") && !bu9.getText().equals("")))
                || ((bu5.getText().equals(bu4.getText())  && bu4.getText().equals(bu7.getText()) && !bu5.getText().equals("") && !bu4.getText().equals("") && !bu7.getText().equals("")))
                || (bu1.getText().equals(bu4.getText())  && bu4.getText().equals(bu9.getText()) && !bu1.getText().equals("") && !bu4.getText().equals("") && !bu9.getText().equals(""))){
            if(a == 'X'){
                Bundle getbundle1=getIntent().getExtras();
                String b=getbundle1.getString("key2");
                t.setTextSize(40);
                t.setText("Winner is "+b);
                clb.setVisibility(View.VISIBLE);
            }
            else if(a == 'O')
            {
                Bundle getbundle=getIntent().getExtras();
                String a=getbundle.getString("key1");
                t.setTextSize(40);
                t.setText("Winner is "+a);
                clb.setVisibility(View.VISIBLE);
            }
            bu1.setEnabled(false);
            bu2.setEnabled(false);
            bu3.setEnabled(false);
            bu4.setEnabled(false);
            bu5.setEnabled(false);
            bu6.setEnabled(false);
            bu7.setEnabled(false);
            bu8.setEnabled(false);
            bu9.setEnabled(false);
        }
        else
        {
            if(counter == 9) {
                t.setTextSize(40);
                t.setText("Try next time");
                clb.setVisibility(View.VISIBLE);
            }
        }
    }
}
