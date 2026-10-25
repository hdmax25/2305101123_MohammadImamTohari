package com.example.teknisigo_modul_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {

    private static final int JUMLAH_GAMBAR = 15;

    private final Context context;
    private final int[] gambar = new int[JUMLAH_GAMBAR];

    public ImageAdapter(Context context) {
        this.context = context;
        // Ambil pic_1 sampai pic_15 dari res/drawable
        for (int i = 0; i < JUMLAH_GAMBAR; i++) {
            gambar[i] = context.getResources().getIdentifier(
                    "pic_" + (i + 1), "drawable", context.getPackageName());
        }
    }

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int position) {
        return gambar[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.gridview, parent, false);
            holder = new ViewHolder();
            holder.img = convertView.findViewById(R.id.imgItem);
            holder.label = convertView.findViewById(R.id.tvLabel);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.img.setImageResource(gambar[position]);
        holder.label.setText("Foto " + (position + 1));

        return convertView;
    }

    private static class ViewHolder {
        ImageView img;
        TextView label;
    }
}