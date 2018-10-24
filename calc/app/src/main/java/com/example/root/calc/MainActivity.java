package com.example.root.calc;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    Button btClear;
    Button btClearAll;
    Button btNine;
    Button btEight;
    Button btSeven;
    Button btSix;
    Button btFive;
    Button btFour;
    Button btThree;
    Button btTwo;
    Button btOne;
    Button btZero;
    Button btDoubleZero;
    Button btAdd;
    Button btDiv;
    Button btMylty;
    Button btVid;
    Button btEqual;
    Button btTochka;
    Boolean tovcka_flag = true;
    Boolean vid_flag = true;
    Boolean add_flag = true;
    Boolean mylty_flag = true;
    Boolean div_flag = true;

    Button menubutton;
    Toolbar tools;

    TextView tvHistory;
    TextView tvResult;

    String processing;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        tools.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) menu);
        getMenuInflater().inflate(R.menu.menu, menu);

    }




            //////Create new Activity//////////////
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Settings) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }
        return true;
    }




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btClear = (Button) findViewById(R.id.btn_Backspace);
         btClearAll= (Button) findViewById(R.id.btn_Clear);
         btNine= (Button) findViewById(R.id.btn_Nine);
         btEight= (Button) findViewById(R.id.btn_Eight);
         btSeven = (Button) findViewById(R.id.btn_Seven);
         btSix = (Button) findViewById(R.id.btn_Six);
         btFive = (Button) findViewById(R.id.btn_Five);
         btFour = (Button) findViewById(R.id.btn_Four);
         btThree = (Button) findViewById(R.id.btn_Three);
         btTwo = (Button) findViewById(R.id.btn_Two);
         btOne = (Button) findViewById(R.id.btn_One);
         btZero = (Button) findViewById(R.id.btn_Zero);
         btDoubleZero = (Button) findViewById(R.id.btn_DoubleZero);
         btEqual = (Button) findViewById(R.id.btn_Equal);

         btAdd = (Button) findViewById(R.id.btn_Add);
         btDiv = (Button) findViewById(R.id.btn_Devide);
         btMylty = (Button) findViewById(R.id.btn_Myltiply);
         btVid = (Button) findViewById(R.id.btn_Minus);
         btTochka = (Button) findViewById(R.id.btn_Dot);
         menubutton = (Button) findViewById(R.id.menu_button);

         tvHistory  = (TextView) findViewById(R.id.tv_userInput);
         tvResult = (TextView) findViewById(R.id.tv_userResult);

         tools = findViewById(R.id.toolbar);
         tools.collapseActionView();
         setActionBar(tools);

         menubutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

             }
         });



         btClearAll.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick (View v){
                 tvHistory.setText("");
                 tvResult.setText("0");
                 tovcka_flag = true;
                 vid_flag = true;
                 add_flag = true;
                 mylty_flag = true;
                 div_flag = true;
             }
         });

         btOne.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 processing = tvHistory.getText().toString();
                 tvHistory.setText(processing + "1");
             }
         });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "2");
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "3");
            }
        });
        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "4");
            }
        });
        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "5");
            }
        });
        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "6");
            }
        });
        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "7");
            }
        });
        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "8");
            }
        });
        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "9");
            }
        });
        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "0");
            }
        });
        btDoubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                tvHistory.setText(processing + "00");
            }
        });
        btTochka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tovcka_flag) {
                    processing = tvHistory.getText().toString();
                    if (processing.contentEquals("")) {
                        tvHistory.setText("0.");
                        tovcka_flag = false;
                    } else {
                        tvHistory.setText(processing + ".");
                        tovcka_flag = false;
                    }
                }
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add_flag) {
                    processing = tvHistory.getText().toString();
                    tvHistory.setText(processing + "+");
                    add_flag = false;
                }

            }
        });
        btMylty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mylty_flag) {
                    processing = tvHistory.getText().toString();
                    tvHistory.setText(processing + "*");
                    mylty_flag = false;
                }


            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (div_flag) {
                    processing = tvHistory.getText().toString();
                    tvHistory.setText(processing + "/");
                    div_flag = false;
                }

            }
        });
        btVid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vid_flag) {
                    processing = tvHistory.getText().toString();
                    tvHistory.setText(processing + "-");
                    vid_flag = false;
                }

            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processing = tvHistory.getText().toString();
                if(processing.length() > 0) {
                    processing = processing.substring(0, processing.length() - 1);
                    tvHistory.setText(processing);
                    }
                tovcka_flag = true;
                vid_flag = true;
                add_flag = true;
                mylty_flag = true;
                div_flag = true;
            }
        });
        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    processing = tvHistory.getText().toString();
                    Expression e = new Expression(processing);
                    String result = String.valueOf(e.calculate());

                    tvResult.setText(result);
            }
        });


    }
}
