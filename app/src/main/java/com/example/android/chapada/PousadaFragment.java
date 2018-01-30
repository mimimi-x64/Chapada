package com.example.android.chapada;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PousadaFragment extends Fragment {


    public PousadaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view_fragment, container, false);

        getActivity( ).setTitle("Pousada");

        final ArrayList<ListItens> pousadaList = new ArrayList<ListItens>( );
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Águas de Março", 34551080));

        ListAdapter pousadaAdapter = new ListAdapter(getActivity( ), pousadaList);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(pousadaAdapter);

        return rootView;
    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);

    }
}
