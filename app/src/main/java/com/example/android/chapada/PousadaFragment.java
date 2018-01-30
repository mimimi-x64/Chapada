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

        ArrayList<ListItens> pousadaList = new ArrayList<ListItens>( );
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Alecrim do Campo", "São Jorge", "6234551118", "pousadaalecrimdocampo.com.br"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Baguá", "São Jorge", "6234551046", "pousadabagua.com.br"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Bambu Brasil", "São Jorge", "6234551004", "bambubrasil.com"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Casa das Flores", "São Jorge", "6234551055", "pousadacasadasflores.com.br"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Cristal da Terra", "São Jorge", "6234551052", "pousadacristaldaterra.com.br"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Flor do Cerrado", "São Jorge", "6234551059", "pousadaflordocerrado.com.br"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Mundo da Lua", "São Jorge", "6234551099", "pousadamundodhalua.com.br"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Por do Sol", "São Jorge", "6234551108", "pordosol.tur.br"));
        pousadaList.add(new ListItens(R.drawable.chapada_photo, "Pousada Trilha Violeta", "São Jorge", "6234551088", "trilhavioleta.com.br"));

        ListAdapter pousadaAdapter = new ListAdapter(getActivity( ), pousadaList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(pousadaAdapter);

        return rootView;
    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);

    }
}
