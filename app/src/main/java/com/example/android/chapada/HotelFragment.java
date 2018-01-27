package com.example.android.chapada;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


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
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Hotel");
    }


}
