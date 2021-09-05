package com.example.recycleview_bai1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter  extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private List mMenu;
    private Context mContext;

    public MenuAdapter(List _Menu, Context mContext) {
        this.mMenu = _Menu;
        this.mContext = mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private View menuView;
        public ImageView icon;
        public TextView groupname;
        public TextView fan;
        public TextView newpost;
        public TextView status;

        public ViewHolder(@NonNull View menuView){
            super(menuView);
            menuView = menuView;
            icon = menuView.findViewById(R.id.icon);
            groupname = menuView.findViewById(R.id.groupname);
            fan = menuView.findViewById(R.id.fan);
            newpost = menuView.findViewById(R.id.newpost);
            status = menuView.findViewById(R.id.status);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View menuItem = inflater.inflate(R.layout.memu_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(menuItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Menu menu = (Menu) mMenu.get(position);

        holder.groupname.setText(menu.getmName());
        holder.fan.setText(menu.getmFan());
        holder.newpost.setText(menu.getmNewPost());
        holder.status.setText(menu.getmStatus());
        holder.icon.setImageResource(menu.getmImage());
    }
    @Override
    public int getItemCount() {
        return mMenu.size();
    }

}
