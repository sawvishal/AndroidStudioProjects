package com.example.volumecalculator;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private Arraylist<Shape> shapesArraylist;
    Context context;


    public MyCustomAdapter(Arraylist<Shape> shapesArraylist, Context context) {
        super(context, R.layout.grid_item_layout, (List<Shape>) shapesArraylist);
        this.context = context;
        this.shapesArraylist = shapesArraylist;
    }

    // View holder: Used to cache references to the views within the item layout

    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }

    // GetView(): Used to create and return a view for a specific item in grid.


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);

        //1- get the shape object for the current position
        Shape shapes= getItem(position);

        // 2- Inflating Layout;
        MyViewHolder myViewHolder;

        if(convertView == null){
            //no views weint off-screen -->Create a new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            //Finding the views:
            myViewHolder.shapeName = ( TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg = (ImageView) convertView.findViewById((R.id.imageView));

            convertView.setTag(myViewHolder);
        }
        else{
            //A view went off-screen --> re-use it
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        // Getting the data from the model class (Shape)



        myViewHolder.shapeName.setText(shapes.getshapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getshapeImg());

        return convertView;
    }
}


