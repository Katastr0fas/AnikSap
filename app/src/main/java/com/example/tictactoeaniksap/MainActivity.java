package com.example.tictactoeaniksap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Boolean tic=true;
    Boolean isStarted=false;
    Boolean ret=true;
    Integer count =0;

    Button btn0;
    Button btn01;
    Button btn02;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn20;
    Button btn21;
    Button btn22;
    Button btnStart;
    TextView outgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button)findViewById(R.id.btn00);
        btn01= (Button)findViewById(R.id.btn01);
        btn02 = (Button)findViewById(R.id.btn02);
        btn10 = (Button)findViewById(R.id.btn10);
        btn11 = (Button)findViewById(R.id.btn11);
        btn12 = (Button)findViewById(R.id.btn12);
        btn20 = (Button)findViewById(R.id.btn20);
        btn21 = (Button)findViewById(R.id.btn21);
        btn22 = (Button)findViewById(R.id.btn22);
        btnStart = (Button)findViewById(R.id.btnStart);
        outgame = (TextView) findViewById(R.id.outgame);

    }
    public void onCLick(View v)
    {
        if (isStarted) {


            Button vv = (Button) v;
            if (tic) {
                vv.setText("X");
                vv.setEnabled(false);
                tic = !tic;
            } else {
                vv.setText("O");
                vv.setEnabled(false);
                tic = !tic;
            }

            //----------------


            if (btn0.getText().toString() == btn01.getText().toString()&& btn0.getText().toString()==btn02.getText().toString()&& btn0.getText().toString().length()!=0)
            {
                outgame.setText(btn0.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }
            if (btn10.getText().toString() == btn11.getText().toString()&& btn10.getText().toString()==btn12.getText().toString()&&btn10.getText().toString().length()!=0)
            {
                outgame.setText(btn10.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }
            if (btn20.getText().toString() == btn21.getText().toString()&& btn20.getText().toString()==btn22.getText().toString()&&btn20.getText().toString().length()!=0)
            {
                outgame.setText(btn20.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }//
            if (btn0.getText().toString() == btn10.getText().toString()&& btn0.getText().toString()==btn20.getText().toString()&& btn0.getText().toString().length()!=0)
            {
                outgame.setText(btn0.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }
            if (btn01.getText().toString() == btn11.getText().toString()&& btn01.getText().toString()==btn21.getText().toString()&&btn01.getText().toString().length()!=0)
            {
                outgame.setText(btn01.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }
            if (btn02.getText().toString() == btn12.getText().toString()&& btn02.getText().toString()==btn22.getText().toString()&&btn02.getText().toString().length()!=0)
            {
                outgame.setText(btn02.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }//
            if (btn0.getText().toString() == btn11.getText().toString()&& btn0.getText().toString()==btn22.getText().toString()&& btn0.getText().toString().length()!=0)
            {
                outgame.setText(btn0.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }
            if (btn02.getText().toString() == btn11.getText().toString()&& btn02.getText().toString()==btn20.getText().toString()&&btn02.getText().toString().length()!=0)
            {
                outgame.setText(btn02.getText().toString()+" Выиграл");
                isStarted=!isStarted;
            }
            if (count==8&& outgame.getText().toString().length()==15)
            {
                outgame.setText("Ничья");
            }
            count++;

        }
    }

    public void onClickStart(View v)
    {
        if (ret)
        {
            Button vv =(Button)v;
            isStarted=true;
            vv.setText("Заново");
            ret=false;
        }
        else
        {
            Intent act = new Intent(this, MainActivity.class);
            startActivity(act);
        }

    }

}