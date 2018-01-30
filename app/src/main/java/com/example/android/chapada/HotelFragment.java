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
        View rootView = inflater.inflate(R.layout.list_view_fragment, container, false);

        ArrayList<ListItens> hotelList = new ArrayList<ListItens>( );

        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Alecrim do Campo", "São Jorge", "6234551118", "pousadaalecrimdocampo.com.br"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Baguá", "São Jorge", "6234551046", "pousadabagua.com.br"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Bambu Brasil", "São Jorge", "6234551004", "bambubrasil.com"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Casa das Flores", "São Jorge", "6234551055", "pousadacasadasflores.com.br"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Cristal da Terra", "São Jorge", "6234551052", "pousadacristaldaterra.com.br"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Flor do Cerrado", "São Jorge", "6234551059", "pousadaflordocerrado.com.br"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Mundo da Lua", "São Jorge", "6234551099", "pousadamundodhalua.com.br"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Por do Sol", "São Jorge", "6234551108", "pordosol.tur.br"));
        hotelList.add(new ListItens(R.drawable.chapada_photo, "Hotel Trilha Violeta", "São Jorge", "6234551088", "trilhavioleta.com.br"));


        ListAdapter hotelAdapter = new ListAdapter(getActivity( ), hotelList);
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
