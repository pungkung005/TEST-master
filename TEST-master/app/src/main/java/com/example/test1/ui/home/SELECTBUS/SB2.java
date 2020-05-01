package com.example.test1.ui.home.SELECTBUS;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.test1.R;
import com.example.test1.ui.home.BUS.BUS1;
import com.example.test1.ui.home.BUS.BUS2;

public class SB2 extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.slb2 ,container,false);

        Button bb = (Button) view.findViewById(R.id.buttonBack);
        //Button bb2 = (Button) view.findViewById(R.id.buttongo);
        bb.setOnClickListener(this);

        return view ;
    }
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.buttonBack:
                fragment = new BUS2();
                replaceFragment(fragment);
                break;
            //case R.id.buttongo:
            //   fragment = new ();
            //    replaceFragment(fragment);
            //    break;

        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
