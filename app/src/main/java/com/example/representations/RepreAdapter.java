package com.example.representations;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RepreAdapter extends RecyclerView.Adapter<RepreAdapter.ViewHolder> {
    private List<Representatives> listRepre;
    private Context context;

    public RepreAdapter(List<Representatives> listRepre, Context context) {
        this.listRepre = listRepre;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.people, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Representatives repre = listRepre.get(i);
        viewHolder.title.setText(repre.getTitle());
        viewHolder.name.setText(repre.getName());
        viewHolder.email.setText(repre.getEmail());
        viewHolder.phoneNumber.setText(repre.getPhoneNumber());
        viewHolder.photo.setImageDrawable(context.getResources().getDrawable(repre.getImage()));
        if (repre.getParty() == 'd') {
            viewHolder.itemView.setBackgroundColor(context.getResources().getColor(R.color.democrat));
        } else if (repre.getParty() == 'r') {
            viewHolder.itemView.setBackgroundColor(context.getResources().getColor(R.color.republican));
        }
    }

    @Override
    public int getItemCount() {
        return listRepre.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView email;
        public TextView phoneNumber;
        public ImageView photo;
        public TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            name = (TextView) itemView.findViewById(R.id.people_name);
            email = (TextView) itemView.findViewById(R.id.people_email);
            phoneNumber = (TextView) itemView.findViewById(R.id.people_phonenumber);
            photo = (ImageView) itemView.findViewById(R.id.people_photo);
        }
    }
}
