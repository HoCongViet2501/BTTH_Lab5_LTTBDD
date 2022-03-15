package com.example.lab5.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.lab5.R;
import com.example.lab5.models.Donut;

import java.util.List;

public class DonutAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Donut> listDonut;

    public DonutAdapter(Context context, int idLayout, List<Donut> listDonut) {
        this.context = context;
        this.idLayout = idLayout;
        this.listDonut = listDonut;
    }

    @Override
    public int getCount() {
        if (listDonut.size() != 0) {
            return listDonut.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView desc = (TextView) view.findViewById(R.id.desc);
        TextView price = (TextView) view.findViewById(R.id.price);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        final ConstraintLayout itemLayout = (ConstraintLayout) view.findViewById(R.id.idItemLayout);
        final ConstraintLayout cardLayout = (ConstraintLayout) view.findViewById(R.id.cardConstraint);
        final ConstraintLayout imgLayout = (ConstraintLayout) view.findViewById(R.id.imgConstraint);
        final Donut donut = listDonut.get(i);

        if(!listDonut.isEmpty()) {
            name.setText(donut.getName());
            desc.setText(donut.getDesc());
            price.setText(donut.getPrice());
            img.setImageResource(donut.getImg());
        }

        return view;
    }
}
