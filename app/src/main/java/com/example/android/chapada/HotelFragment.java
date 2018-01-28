package com.example.android.chapada;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);

        ArrayList<ListItens> hotelItens= new ArrayList<ListItens>();

        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        hotelItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));

        ListAdapter hotelAdapter = new ListAdapter(getActivity(), hotelItens);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(hotelAdapter);

        return rootView;
    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Hotel");
    }


}
