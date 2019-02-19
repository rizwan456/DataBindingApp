package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.myapplication.databinding.UserViewBinding;

import java.util.List;

public class RAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<String> list;
    Context context;

    public RAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new UserViewHolder(UserViewBinding.inflate(layoutInflater));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if(viewHolder instanceof UserViewHolder)
        {
            UserViewHolder userViewHolder = (UserViewHolder) viewHolder;

           userViewHolder.bindData(list.get(i));

           // userViewHolder.userViewBinding.setName(list.get(i));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class UserViewHolder extends RecyclerView.ViewHolder
    {
        UserViewBinding userViewBinding;
        public UserViewHolder(UserViewBinding userViewBinding) {
            super(userViewBinding.getRoot());
            this.userViewBinding = userViewBinding;
        }

        public void bindData(String name)
        {
            this.userViewBinding.nameView.setText(name);
        }
    }
}
