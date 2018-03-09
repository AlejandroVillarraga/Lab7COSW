package com.example.davillarraga.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private Stack<Double> numbers =new Stack<Double>();
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Este comando oculta la barra de notificaciones
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.resultado);

        //Cero
        findViewById(R.id.button_cero).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(0.0);
                    text.setText("0.0");
                }else text.setText("Error");
            }
        });

        //Uno
        findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(1.0);
                    text.setText("1.0");
                }else text.setText("Error");
            }
        });

        //Dos
        findViewById(R.id.button_two).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(2.0);
                    text.setText("2.0");
                }else text.setText("Error");

            }
        });

        //Tres
        findViewById(R.id.button_three).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(3.0);
                    text.setText("3.0");
                }else text.setText("Error");
            }
        });

        //Cuatro
        findViewById(R.id.button_four).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(4.0);
                    text.setText("4.0");
                }else text.setText("Error");

            }
        });

        findViewById(R.id.button_five).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(5.0);
                    text.setText("5.0");
                }else text.setText("Error");

            }
        });

        findViewById(R.id.button_six).setOnClickListener(new View.OnClickListener() { public void onClick(View v) {
            if(numbers.size()<2){
                numbers.push(6.0);  text.setText("6.0");
            }else text.setText("Error");
        }});

        findViewById(R.id.button_seven).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(7.0);
                    text.setText("7.0");
                }else text.setText("Error");

            }
        });

        findViewById(R.id.button_eight).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(numbers.size()<2){
                    numbers.push(8.0);
                    text.setText("8.0");
                }else text.setText("Error");

            }
        });


        findViewById(R.id.button_nine).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(numbers.size()<2){
                    numbers.push(9.0);
                    text.setText("9.0");
                }else text.setText("Error");

            }
        });

        findViewById(R.id.button_ten).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(numbers.size()<2){
                    numbers.push(10.0);
                    text.setText("10.0");
                }else text.setText("Error");

            }
        });

        findViewById(R.id.button_hundred).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(numbers.size()<2){
                    numbers.push(100.0);
                    text.setText("100.0");
                }else text.setText("Error");

            }
        });

        findViewById(R.id.button_thousand).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(numbers.size()<2){
                    numbers.push(1000.0);
                    text.setText("1000.0");
                }else text.setText("Error");

            }
        });

    }


    public void sum(View view) {
        if(numbers.size()>1){
            double a= numbers.pop();
            double b= numbers.pop();
            numbers.push((a+b));
        }
        text.setText(""+ numbers.peek());

    }

    public void division(View view) {
        if(numbers.size()>1){
            double a= numbers.pop();
            double b= numbers.pop();
            numbers.push((a/b));
        }
        text.setText(""+ numbers.peek());
    }

    public void multiplication(View view) {
        if(numbers.size()>1){
            double a= numbers.pop();
            double b= numbers.pop();
            numbers.push((a*b));
        }
        text.setText(""+ numbers.peek());
    }

    public void substract(View view) {
        if(numbers.size()>1){
            double a= numbers.pop();
            double b= numbers.pop();
            numbers.push((a-b));
        }
        text.setText(""+ numbers.peek());
    }


    public void tan(View view) {
        if(numbers.size()==1){
            double a= numbers.pop();
            numbers.push(Math.tan(Math.toDegrees(a)));
            text.setText(""+ numbers.peek());
        }else text.setText("Error");
    }

    public void cos(View view) {
        if(numbers.size()==1){
            double a= numbers.pop();
            numbers.push(Math.cos(Math.toDegrees(a)));
            text.setText(""+ numbers.peek());
        }else text.setText("Error");
    }

    public void sin(View view) {
        if(numbers.size()==1){
            double a= numbers.pop();
            numbers.push(Math.sin(Math.toDegrees(a)));
            text.setText(""+ numbers.peek());
        }else text.setText("Error");
    }

    public void clear(View view) {
        numbers.clear();
        text.setText("0");
    }

    public void changeOfSign(View view) {
        if(numbers.size()==1){
            double a= numbers.pop();
            numbers.push(a*(-1));
            text.setText(""+ numbers.peek());
        }else text.setText("Error");
    }

    public void potency2(View view) {
        if(numbers.size()==1){
            double a= numbers.pop();
            numbers.push((Math.pow(a,2)));
            text.setText(""+ numbers.peek());
        }else text.setText("Error");
    }

    public void potencyY(View view) {
        if(numbers.size()>1){
            double a= numbers.pop();
            double b= numbers.pop();
            numbers.push((Math.pow(a,b)));
        }
        text.setText(""+ numbers.peek());
    }

    public void inverse(View view) {

        if(numbers.size()==1){
            double a= numbers.pop();
            numbers.push((1/a));
            text.setText(""+ numbers.peek());
        }else text.setText("Error");

    }

    public void submit(View view) {

    }

}


