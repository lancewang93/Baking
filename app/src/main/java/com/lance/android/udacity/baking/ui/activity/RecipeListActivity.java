package com.lance.android.udacity.baking.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.lance.android.udacity.baking.R;

import butterknife.BindView;

public class RecipeListActivity extends AppCompatActivity {

    //菜谱列表RecyclerView
    @BindView(R.id.rv_recipe_list)
    RecyclerView mRecipeListRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

    }
}
