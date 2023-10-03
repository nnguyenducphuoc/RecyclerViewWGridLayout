package com.phuoc.recyclerviewwgridlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private Context context;
    private List<User> listUser;

    public UserAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<User> list) {
        this.listUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = listUser.get(position);
        if (user == null) {
            return;
        }
        holder.tv_user.setText(user.getName());
        holder.img_user.setImageResource(user.getResourceImage());
    }

    @Override
    public int getItemCount() {
        if (listUser != null) {
            return listUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private ImageView img_user;
        private TextView tv_user;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            img_user = itemView.findViewById(R.id.img_user);
            tv_user = itemView.findViewById(R.id.tv_name);
        }
    }
}
