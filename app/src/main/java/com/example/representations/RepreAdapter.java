package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class RepreAdapter extends RecyclerView.Adapter<RepreAdapter.ViewHolder> {
    private List<Official> listRepre;
    private Context context;

    public RepreAdapter(List<Official> list, Context context) {
        this.listRepre = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.people, viewGroup, false);
        /**v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(v.getContext(), RepProfile.class);
                profile.putExtra("official", listRepre.get(count));
                context.startActivity(profile);
            }
        });
         **/
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Official repre = listRepre.get(i);
        viewHolder.title.setText(repre.getTitle());
        viewHolder.name.setText(repre.getName());
        viewHolder.email.setText(repre.getEmail());
        viewHolder.phoneNumber.setText(repre.getPhoneNumber());
        viewHolder.photo.setImageDrawable(repre.getDrawable(context));
        if (repre.getParty().equals("d")) {
            viewHolder.itemView.setBackgroundColor(context.getResources().getColor(R.color.democrat));
        } else if (repre.getParty().equals("r")) {
            viewHolder.itemView.setBackgroundColor(context.getResources().getColor(R.color.republican));
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(v.getContext(), RepProfile.class);
                profile.putExtra("official", listRepre.get(i));
                context.startActivity(profile);
            }
        });
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
            title = itemView.findViewById(R.id.title);
            name = itemView.findViewById(R.id.people_name);
            email = itemView.findViewById(R.id.people_email);
            phoneNumber = itemView.findViewById(R.id.people_phonenumber);
            photo = itemView.findViewById(R.id.people_photo);
        }

    }
}
