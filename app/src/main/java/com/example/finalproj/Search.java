package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {

    private MyAdapter adapter;
    private List<ItemModel> itemList;
    private List<ItemModel> filteredList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize your item list (you can replace this with your data)
        itemList = new ArrayList<>();
        itemList.add(new ItemModel("Bamboo Map", R.drawable.bmap));
        itemList.add(new ItemModel("Bamboo Bazaar", R.drawable.bbaz));
        itemList.add(new ItemModel("Events", R.drawable.events));
        itemList.add(new ItemModel("Plant Pioneers", R.drawable.pion));
        itemList.add(new ItemModel("BWP Profile", R.drawable.bwprofile));
        itemList.add(new ItemModel("About Us", R.drawable.aboutus));

        // Initialize filteredList with all items
        filteredList = new ArrayList<>(itemList);
        adapter = new MyAdapter(filteredList);
        recyclerView.setAdapter(adapter);

        // Set item click listener
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ItemModel item) {
                handleItemClick(item);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        assert searchView != null;
        searchView.setQueryHint("Search Here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterItems(newText);
                return true;
            }
        });
        return true;
    }

    private void filterItems(String searchText) {
        // Clear the filteredList
        filteredList.clear();

        // Convert search text to lowercase
        String searchTextLower = searchText.toLowerCase();

        // Add items that contain the searchText (case-insensitive)
        for (ItemModel item : itemList) {
            if (item.getName() != null && item.getName().toLowerCase().contains(searchTextLower)) {
                filteredList.add(item);
            }
        }

        adapter.notifyDataSetChanged(); // Notify the adapter of the data change
    }
    private void handleItemClick(@NonNull ItemModel item) {
        String itemName = item.getName().toLowerCase();

        if (itemName.contains("bwp profile")) {
            startActivity(new Intent(this, BWP_Profile.class));
        } else if (itemName.contains("bamboo bazaar")) {
            startActivity(new Intent(this, Bamboo_Bazaar.class));
        } else if (itemName.contains("bamboo map")) {
            startActivity(new Intent(this, Bamboo_Map.class));
        } else if (itemName.contains("events")) {
            startActivity(new Intent(this, Events.class));
        } else if (itemName.contains("plant pioneers")) {
            startActivity(new Intent(this, Plant_Pioneers.class));
        } else if (itemName.contains("about us")) {
            startActivity(new Intent(this, About_Us.class));
        } else {
            // Handle the case where the input does not match any of the expected keywords.
            // You can display a message or take appropriate action.
        }
    }

    public void Editback(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }


}
