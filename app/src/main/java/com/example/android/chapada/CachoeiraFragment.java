package com.example.android.chapada;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CachoeiraFragment extends Fragment {


    public CachoeiraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view_fragment, container, false);
        //Initialize Item List
        ArrayList<ListItens> waterfallList = new ArrayList<ListItens>( );
        //Add sample content
        waterfallList.add(new ListItens(R.mipmap.ic_launcher, "Title Name", "City Name"));
        waterfallList.add(new ListItens(R.mipmap.ic_launcher, "Title Name", "City Name"));
        waterfallList.add(new ListItens(R.mipmap.ic_launcher, "Title Name", "City Name"));
        waterfallList.add(new ListItens(R.mipmap.ic_launcher, "Title Name", "City Name"));
        waterfallList.add(new ListItens(R.mipmap.ic_launcher, "Title Name", "City Name"));
        //Initialize Adapter
        ListAdapter hotelAdapter = new ListAdapter(getActivity( ), waterfallList);
        // Find ListView and set Adapter inside
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(hotelAdapter);
        return rootView;
    }

}
