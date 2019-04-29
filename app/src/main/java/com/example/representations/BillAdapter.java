package com.example.representations;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
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

public class BillAdapter extends RecyclerView.Adapter<BillAdapter.ViewHolder> {
    private List<Bill> listBill;
    private Context context;

    public BillAdapter(List<Bill> list, Context context) {
        this.listBill = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.bill_info, viewGroup, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Bill bill = listBill.get(i);
        viewHolder.billid.setText(bill.getBillID());
        viewHolder.topic.setText(bill.getTopic());
        viewHolder.active.setText(bill.getActive());
        viewHolder.sponsorName.setText(bill.getSponsorName());
        if (bill.getParty() != null) {
            if (bill.getParty().equals("D")) {
                viewHolder.itemView.setBackgroundColor(context.getResources().getColor(R.color.democrat));
            } else if (bill.getParty().equals("R")) {
                viewHolder.itemView.setBackgroundColor(context.getResources().getColor(R.color.republican));
            }
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(v.getContext(), RepProfile.class);
                profile.putExtra("bill", (Parcelable) listBill.get(i));
                context.startActivity(profile);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBill.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView billid;
        public TextView topic;
        public TextView active;
        public TextView sponsorName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            billid = itemView.findViewById(R.id.bill_id);
            topic = itemView.findViewById(R.id.bill_topic);
            active = itemView.findViewById(R.id.active);
            sponsorName = itemView.findViewById(R.id.sponsor);

        }

    }
}
