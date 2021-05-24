package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;



import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.newsapp.model.Popular;
import com.example.newsapp.model.Results;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    int period=7;
    RecyclerView recyclerView;
    Adapter adapter;
    final String API_KEY="srwUVBAgth1bhLYJZvGniXVdQNhPWA8W";
    Button refreshButton ;
    List<Results> results= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.findViewById(R.id.recycler);
        refreshButton.findViewById(R.id.refresh);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        fetchJSON(period,API_KEY);
    }

    private void fetchJSON(int period, String api_key) {
        Call<Popular> call=Client.getInstance().getApi().getMostPopular(period, api_key);
        call.enqueue(new Callback<Popular>() {
            @Override
            public void onResponse(Call<Popular> call, Response<Popular> response) {
                if(response.isSuccessful()&& response.body().getResults()!=null)
                {
                    results.clear();
                    results=response.body().getResults();
                    adapter= new Adapter(MainActivity.this,results);

                }
            }

            @Override
            public void onFailure(Call<Popular> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Check internet connection!",Toast.LENGTH_SHORT);
            }
        });
}
}