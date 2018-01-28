package com.example.android.chapada;


import android.os.Bundle;
import android.support.annotation.Nullable;
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
public class CampingFragment extends Fragment {


    public CampingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        View rootView;
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.list_view_fragment, container, false);

        ArrayList<ListItens> campingItens = new ArrayList<ListItens>();

        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));
        campingItens.add(new ListItens("Hotel Marriet", "São Jorge", "marriet.com", 6260965));

        ListAdapter campingAdapter = new ListAdapter(getActivity(), campingItens);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(campingAdapter);

        return rootView;
    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Camping");
    }

}
