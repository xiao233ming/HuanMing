package cn.studjams.s1.sj53.huanming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button city_btn1,city_btn2,city_btn3,city_btn4,city_btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city_btn1 = (Button) findViewById(R.id.btn1);
        city_btn2 = (Button) findViewById(R.id.btn2);
        city_btn3 = (Button) findViewById(R.id.btn3);
        city_btn4 = (Button) findViewById(R.id.btn4);
        city_btn5 = (Button) findViewById(R.id.btn5);

        city_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(i);
            }
        });

        city_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this,"2", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });

        city_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Toast.makeText(MainActivity.this,"3", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(i);
            }
        });

        city_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Toast.makeText(MainActivity.this,"4", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,FourthActivity.class);
                startActivity(i);
            }
        });

        city_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Toast.makeText(MainActivity.this,"5", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,NoteActivity.class);
                startActivity(i);
            }
        });
    }
}
