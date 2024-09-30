package com.example.adapterappsec16;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class myCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] items;

    public void MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }


    @Override
    public int getCount() {
        return  items.length; //Returns the number of items in your data source.

    }

    @Override
    public Object getItem(int position) {
        return items [position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }



    static class ViewHolder{
        
    }
}
