package com.example.android.chapada;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;

public class ListAdapter extends ArrayAdapter<ListItens> {

    public ListAdapter(Activity context, ArrayList<ListItens> ListItens) {
        super(context, 0, ListItens);
    }

    @NonNull
    @Override
    public View getView( int position, @Nullable View convertView, @NonNull ViewGroup parent ) {
        View listItemView = convertView;
        //Check if this view isbeing used, otherwise inflate the view
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    //Set which layout file will be inflated
                    R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        ListItens getItemListOnPosition = getItem(position);
        // Find TextView on XML inflated
        TextView cityName = (TextView) listItemView.findViewById(R.id.listItem_city);
        // Set text from ListItem object on TextView
        cityName.setText(getItemListOnPosition.getCityName());
        // Find TextView on XML inflated
        TextView titleName = listItemView.findViewById(R.id.listItem_title);
        // Set text from ListItem object on TextView
        titleName.setText(getItemListOnPosition.getTitleName());
        // Find ImageView on XML
        ImageView photoCachoeira = listItemView.findViewById(R.id.img_list_cachoeira);
        //Set image from ListItem objecto on ImageView
        photoCachoeira.setImageResource(getItemListOnPosition.getPhotoID());
        return listItemView;
    }
}
