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
        TextView waterfallName = listItemView.findViewById(R.id.listItem_waterfall);
        // Set text from ListItem object on TextView
        if (getItemListOnPosition.checkWaterfall()) {
            waterfallName.setText(getItemListOnPosition.getTitleName( ));
            waterfallName.setVisibility(View.VISIBLE);
        } else {
            waterfallName.setVisibility(View.GONE);
        }

        TextView hostName = listItemView.findViewById(R.id.listItem_hostName);
        if (getItemListOnPosition.checkHost()){
            hostName.setText(getItemListOnPosition.getHostName());
            hostName.setVisibility(View.VISIBLE);
        } else {
            hostName.setVisibility(View.GONE);
        }

        TextView siteName = listItemView.findViewById(R.id.listItem_website);
        if (getItemListOnPosition.checkWebsite()){
            siteName.setText(getItemListOnPosition.getWebSite());
            siteName.setVisibility(View.VISIBLE);
        } else {
            siteName.setVisibility(View.GONE);
        }

        TextView contactNumber = listItemView.findViewById(R.id.listItem_contactNumber);
        if (getItemListOnPosition.checkContactNumber()){
           // contactNumber.setText(String.valueOf(getItemListOnPosition.getContactNumber()));
            contactNumber.setText(getItemListOnPosition.toString());
            contactNumber.setVisibility(View.VISIBLE);
        } else {
            contactNumber.setVisibility(View.GONE);
        }

        // Find ImageView on XML
        ImageView waterfallPhoto = listItemView.findViewById(R.id.img_list_cachoeira);
        //Set image from ListItem object on ImageView if object exists
        if (getItemListOnPosition.checkImageResource( )) {
            waterfallPhoto.setImageResource(getItemListOnPosition.getPhotoID( ));
            waterfallPhoto.setVisibility(View.VISIBLE);
        } else {
            waterfallPhoto.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
