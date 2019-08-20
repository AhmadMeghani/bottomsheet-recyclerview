package com.abcx.recyclerview;

import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnOpenBS;
    public List<listItem> listItemsx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItemsx = new ArrayList<>();

        for (int i=0; i<10; i++) {
            listItem listItem = new listItem("Heading" + (i + 1), "abc is a good boy");
            listItemsx.add(listItem);
        }
        btnOpenBS = findViewById(R.id.pullBS);
        btnOpenBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog bottomsheet = new bottomSheetDialog();
                bottomsheet.setListItems(listItemsx);
                bottomsheet.show(getSupportFragmentManager(), "bottomsheet");
            }
        });
    }



    /*public List<listItem> getListItems() {
        return listItems;
    }

    public MainActivity(){
        listItems = new ArrayList<>();

        for (int i=0; i<10; i++){
            listItem listItem = new listItem("Heading" + (i+1), "abc is a good boy");
            listItems.add(listItem);
        }
    }*/



}
