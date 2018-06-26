package com.example.deer.autoscrollviewpager.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.example.deer.autoscrollviewpager.view.SliderImageListItem;
import com.github.demono.adapter.InfinitePagerAdapter;

import java.util.List;

public class SliderImageAdapter extends InfinitePagerAdapter {

    private List<String> data;

    public SliderImageAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public View getItemView(int i, View view, ViewGroup viewGroup) {

        SliderImageListItem item;

        if (view != null) {
            item = (SliderImageListItem) view;
        } else {
            item = new SliderImageListItem(viewGroup.getContext());
        }

        item.setSliderImage(data.get(i));

        return item;
    }
}
