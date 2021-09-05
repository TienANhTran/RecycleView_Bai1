package com.example.recycleview_bai1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuAdapter adapter;
    ArrayList<Menu> menus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        menus = new ArrayList<Menu>();
        adapter = new MenuAdapter(menus, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void data()
    {
        menus.add(new Menu("Mua bán có tâm","8K Fan" , "NHÓM ĐÓNG" ,
                "+ 10 bài viết mới nhất" , R.drawable.hinh1 ));
        menus.add(new Menu("Ăn để lăn","8K Fan" , "NHÓM KÍN" ,
                "+ 10 bài viết mới nhất" , R.drawable.hinh2 ));
        menus.add(new Menu("Chia sẻ kiến thức Montessori","1,7K Fan" , "NHÓM MỞ" ,
                "+ 10 bài viết mới nhất" , R.drawable.hinh3 ));
        menus.add(new Menu("THực đơn EAT","11K Fan" , "NHÓM MỞ" ,
                "+ 10 bài viết mới nhất" , R.drawable.hinh4 ));
        menus.add(new Menu("OFB","8K Fan" , "NHÓM Kín" ,
                "+ 10 bài viết mới nhất" , R.drawable.hinh5 ));
        menus.add(new Menu("Mua bán có tâm","8K Fan" , "NHÓM ĐÓNG" ,
                "+ 10 bài viết mới nhất" , R.drawable.hinh6 ));

    }
}