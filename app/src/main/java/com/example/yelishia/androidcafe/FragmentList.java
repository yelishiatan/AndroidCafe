package com.example.yelishia.androidcafe;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentList extends Fragment {

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        View view = inflater.inflate(R.layout.fragment_list, null);
        setupRecyclerView(view);
        return view;
    }
    private void setupRecyclerView (View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recylerview);
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), MenuData.getListMenu());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
    }
}
