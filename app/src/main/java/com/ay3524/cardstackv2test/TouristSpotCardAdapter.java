package com.ay3524.cardstackv2test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TouristSpotCardAdapter extends ArrayAdapter<TouristSpot> {

    public TouristSpotCardAdapter(Context context) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, View contentView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (contentView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            contentView = inflater.inflate(R.layout.item_card, parent, false);
            holder = new ViewHolder(contentView);
            contentView.setTag(holder);
        } else {
            holder = (ViewHolder) contentView.getTag();
        }

        TouristSpot spot = getItem(position);

        holder.name.setText("PAGE No. : " + (position + 1));
//        holder.city.setText(spot.city);
//        holder.image.setBackgroundColor(Color.WHITE);
//        Glide.with(getContext()).load(spot.url).into(holder.image);

        holder.ivInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Go to info!", Toast.LENGTH_SHORT).show();
            }
        });

        return contentView;
    }

    private static class ViewHolder {
        public TextView name;
        public TextView city;
        public ImageView image;
        public ImageView ivInfo;

        public ViewHolder(View view) {
            this.name = view.findViewById(R.id.item_tourist_spot_card_name);
            this.city = view.findViewById(R.id.item_tourist_spot_card_city);
            this.image = view.findViewById(R.id.item_tourist_spot_card_image);
            this.ivInfo = view.findViewById(R.id.iv_info);
        }
    }

}

