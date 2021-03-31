package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    TextView maudo;
    TextView xanh;
    TextView den;
    TextView trang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        connect();
        maudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyenmaudo();
            }
        });
    }
public void connect(){
        maudo = (TextView) findViewById(R.id.maudo);
        xanh = (TextView) findViewById(R.id.mauxanh);
        den = (TextView) findViewById(R.id.mauden);
        trang = (TextView) findViewById(R.id.trang);
}
public void chuyenmaudo(){
        dsDienThoai dt = new dsDienThoai();
    List<DienThoai> ds = dt.getdsdienthoai();
    DienThoai dienThoai = ds.get(0);
    Intent intent = new Intent(this,MainActivity2.class);
  //  intent.putExtra("item",dienThoai);
}
}
