package com.abcx.recyclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class bottomSheetDialog extends BottomSheetDialogFragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    //private MainActivity mainActivity;
    private List<listItem> listItems = new ArrayList<>();

    public void setListItems(List<listItem> myList){
        listItems.clear();
        this.listItems.addAll(myList);
        if (recyclerViewAdapter!= null){
            recyclerViewAdapter.notify();
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_layout,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));

     //   mainActivity = new MainActivity();
       // List<listItem> list = mainActivity.getListItems();
        recyclerViewAdapter = new Adapter(listItems,getActivity());
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
