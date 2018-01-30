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

        ArrayList<ListItens> campingList = new ArrayList<ListItens>( );

        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Alecrim do Campo", "São Jorge", "6234551118", "pousadaalecrimdocampo.com.br"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Baguá", "São Jorge", "6234551046", "pousadabagua.com.br"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Bambu Brasil", "São Jorge", "6234551004", "bambubrasil.com"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Casa das Flores", "São Jorge", "6234551055", "pousadacasadasflores.com.br"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Cristal da Terra", "São Jorge", "6234551052", "pousadacristaldaterra.com.br"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Flor do Cerrado", "São Jorge", "6234551059", "pousadaflordocerrado.com.br"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Mundo da Lua", "São Jorge", "6234551099", "pousadamundodhalua.com.br"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Por do Sol", "São Jorge", "6234551108", "pordosol.tur.br"));
        campingList.add(new ListItens(R.drawable.chapada_photo, "Camping Trilha Violeta", "São Jorge", "6234551088", "trilhavioleta.com.br"));


        ListAdapter campingAdapter = new ListAdapter(getActivity( ), campingList);
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
