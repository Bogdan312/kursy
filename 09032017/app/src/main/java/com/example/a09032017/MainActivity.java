package com.example.a09032017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn;
    Button btn2;
    TextView text;
    EditText vvod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = (Button) findViewById(R.id.button2);
    text = (TextView) findViewById(R.id.textView2);
        vvod = (EditText) findViewById(R.id.editText);
      btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int text2 = Integer.parseInt(vvod.getText().toString());
                if (text2==1){
                    text.setText("Зима");
                    text.setBackgroundResource(R.color.siniy);
                }

                else if(text2==2){
                    text.setText("Весна");
                    text.setBackgroundResource(R.color.jeltiy);
                }
                else if(text2==3){
                    text.setText("Лето");
                    text.setBackgroundResource(R.color.green);
                }
                else if(text2==4){
                    text.setText("Осень");
                    text.setBackgroundResource(R.color.colorAccent);
                }
            }
        });
btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int text2 = Integer.parseInt(vvod.getText().toString());
        if (text2 == 1)
        {
            Intent intent = new Intent(MainActivity.this, Deva.class);
            startActivity(intent);
        }
       else if (text2 == 2)
        {
            Intent intent = new Intent(MainActivity.this, Kozerog.class);
            startActivity(intent);
        }
        else if (text2 == 3)
        {
            Intent intent = new Intent(MainActivity.this, Oven.class);
            startActivity(intent);
        }
        else if (text2 == 4)
        {
            Intent intent = new Intent(MainActivity.this, Ribi.class);
            startActivity(intent);
        }

        else if (text2 == 5)
        {
            Intent intent = new Intent(MainActivity.this, Skorpion.class);
            startActivity(intent);
        }

        else if (text2 == 6)
        {
            Intent intent = new Intent(MainActivity.this, Strelec.class);
            startActivity(intent);
        }
        else if (text2 == 7)
        {
            Intent intent = new Intent(MainActivity.this, Telec.class);
            startActivity(intent);
        }

        else if (text2 == 8)
        {
            Intent intent = new Intent(MainActivity.this, Vesi.class);
            startActivity(intent);
        }
        else if (text2 == 9)
        {
            Intent intent = new Intent(MainActivity.this, Vodoley.class);
            startActivity(intent);
        }
        else if (text2 == 10)
        {
            Intent intent = new Intent(MainActivity.this, Lev.class);
            startActivity(intent);
        }

        else if (text2 == 11)
        {
            Intent intent = new Intent(MainActivity.this, Blizneci.class);
            startActivity(intent);
        }
        else if (text2 == 12)
        {
            Intent intent = new Intent(MainActivity.this, Rak.class);
            startActivity(intent);
        }
    }
});
    }
}
