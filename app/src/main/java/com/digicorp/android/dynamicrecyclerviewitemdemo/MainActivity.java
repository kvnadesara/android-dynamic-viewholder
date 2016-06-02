package com.digicorp.android.dynamicrecyclerviewitemdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.BaseRecyclerViewAdapter;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.BaseModel;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.CompanyModel;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.PersonModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        ArrayList<BaseModel> data = prepareDummyData();
        BaseRecyclerViewAdapter adapter = new BaseRecyclerViewAdapter(this, data);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(adapter);

    }

    private ArrayList<BaseModel> prepareDummyData() {
        ArrayList<BaseModel> data = new ArrayList<>();
        for (int ii = 0; ii < 20; ii++) {
            if (ii % 5 == 0) {
                data.add(new CompanyModel("Digicorp", "Digicorp House, Near Kashiram Hall, Ambawadi, Ahmedabad, Gujarat 380015"));
            } else {
                data.add(new PersonModel("P" + ii, "L" + ii, "pl" + ii + "@gmail.com"));
            }
        }
        return data;
    }
}
