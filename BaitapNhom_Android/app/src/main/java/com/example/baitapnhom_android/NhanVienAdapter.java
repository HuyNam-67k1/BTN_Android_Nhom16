package com.example.baitapnhom_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NhanVienAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;

    public NhanVienAdapter(Context ctx, int layoutItem, ArrayList<NhanVien> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    ArrayList<NhanVien> arrayList;

    @Override
    public int getCount() {
        return arrayList.size();
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
        view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup, false);
        TextView tvName = view.findViewById(R.id.txt_tenNvThem);
        TextView tvAge = view.findViewById(R.id.txt_tuoiNV);
        ImageView imgAnh = view.findViewById(R.id.img_nvlistview);

        tvName.setText(arrayList.get(i).getName());
        tvAge.setText(arrayList.get(i).getAge());
        imgAnh.setImageResource(arrayList.get(i).getImgNV());
        return view;
    }
}
