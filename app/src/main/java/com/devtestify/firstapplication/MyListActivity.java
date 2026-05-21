package com.devtestify.firstapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyListActivity extends ListActivity {

    String myArray[] = {"Apple", "Google", "Facebook", "Claude", "OpenAI", "Microsoft"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(MyListActivity.this, android.R.layout.simple_list_item_1, myArray));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this, "Clicked Position is : " + position, Toast.LENGTH_SHORT).show();
    }
}
