package com.lance.android.udacity.baking.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lance.android.udacity.baking.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Dan on 2018/1/24.
 */

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeListViewHolder> {

//    private List<>

    @Override
    public RecipeListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_recipe, parent, false);
        return new RecipeListViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecipeListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class RecipeListViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_title_item_list_recipe)
        TextView mRecipeTitleTextView;
        @BindView(R.id.tv_servings_item_list_recipe)
        TextView mRecipeServingsTextView;

        public RecipeListViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
