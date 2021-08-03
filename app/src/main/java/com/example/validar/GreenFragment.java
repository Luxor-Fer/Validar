package com.example.validar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import javax.security.auth.callback.Callback;


/**
 * A simple {@link Fragment} subclass.
 */
public class GreenFragment extends Fragment {

    private TextView tv1;
    private ListView lv1;

    private String nomVal [] = {"Validacion 1", "Validacion 2", "Validacion 3", "Validacion 4"};
    private String conVal [] = {"texto val 1", "Texto val 2", "texto val 3", "texto val 4"};

    public GreenFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        tv1 = (TextView) getActivity().findViewById(R.id.tvTit);
        lv1 = (ListView) getActivity().findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),R.layout.list_item_validaciones, nomVal);
        lv1.setAdapter(adapter);
/*
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La validacion "+ lv1.getItemAtPosition(position) + "es : "+ conVal[position]);
            }
        });

*/
        return inflater.inflate(R.layout.fragment_green, container, false);
    }
}
