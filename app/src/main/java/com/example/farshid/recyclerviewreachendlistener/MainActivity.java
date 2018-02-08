package com.example.farshid.recyclerviewreachendlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.recyclerviewreachendlistener.RecyclerViewReachEndListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ItemAdapter itemAdapter;
   private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count=1;
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        itemAdapter=new ItemAdapter(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.Addtem(createList());
        RecyclerViewReachEndListener.setEndListener(recyclerView, new RecyclerViewReachEndListener.OnSchoolReachEnd() {
            @Override
            public void OnReachEnd() {
                Toast.makeText(MainActivity.this, "Reach End...", Toast.LENGTH_SHORT).show();
                itemAdapter.Addtem(createList());
            }
        });
    }
    private List<String> createList(){
        List<String> strings=new ArrayList<>();
        strings.add("Load Part "+String.valueOf(count));
        count=count+1;
        for (int i = 1; i <= 50; i++) {
            strings.add("Item "+String.valueOf(i));
        }

        return strings;
    }
}
