package com.example.lecocq.chloe;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultatFragment extends Fragment  {
    private Spinner spin;
    private EditText editTextResult;
    private String itemSelect;
    private  int ttl;
    private  int i;


    public ResultatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view=inflater.inflate(R.layout.fragment_resultat,container,false);


         spin = view.findViewById(R.id.spinner);
         spin.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(),R.array.item_array,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spin.setAdapter(adapter);


        });




        return view;
    }

    p

}
