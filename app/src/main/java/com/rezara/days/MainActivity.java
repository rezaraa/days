package com.rezara.days;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtjan = findViewById(R.id.txtJan);
        txtjan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "January", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgjan = findViewById(R.id.imgjan);
        imgjan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "January", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtfeb = findViewById(R.id.txtfeb);
        txtfeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "February", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgfeb = findViewById(R.id.imgfeb);
        imgfeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "February", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtmar = findViewById(R.id.txtmar);
        txtmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "March", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgmar = findViewById(R.id.imgmar);
        imgmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "March", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtapr = findViewById(R.id.txtapr);
        txtapr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "April", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgapr = findViewById(R.id.imgapr);
        imgapr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "April", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtmay = findViewById(R.id.txtmay);
        txtmay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "May", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgmay = findViewById(R.id.imgmay);
        imgmay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "May", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgjun = findViewById(R.id.imgjun);
        imgjun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "June", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtjun = findViewById(R.id.txtjun);
        txtjun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "June", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtjul = findViewById(R.id.txtjul);
        txtjul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "July", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgjul = findViewById(R.id.imgjul);
        imgjul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "July", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView imgaug = findViewById(R.id.imgaug);
        imgaug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "August", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtaug = findViewById(R.id.txtaug);
        txtaug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "August", Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgsep = findViewById(R.id.imgsep);
        imgsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "September", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtsep = findViewById(R.id.txtsep);
        txtsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "September", Toast.LENGTH_LONG).show();
            }
        });

        ImageView imgoct = findViewById(R.id.imgoct);
        imgoct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "October", Toast.LENGTH_LONG).show();
            }
        });
        TextView txtoct = findViewById(R.id.txtoct);
        txtoct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "October", Toast.LENGTH_LONG).show();
            }
        });
    TextView txtnov=findViewById(R.id.txtnov);
    txtnov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"November",Toast.LENGTH_LONG).show();
        }
    });
   ImageView imgnov=findViewById(R.id.imgnov);
   imgnov.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Toast.makeText(MainActivity.this,"November",Toast.LENGTH_LONG).show();
       }
   });

        TextView txtdec=findViewById(R.id.txtdec);
        txtdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"December",Toast.LENGTH_LONG).show();
            }
        });
        ImageView imgdec=findViewById(R.id.imgdec);
        imgdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Decmber",Toast.LENGTH_LONG).show();
            }
        }); }
}
