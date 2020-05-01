package com.example.test1.ui.home.BUS;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.test1.R;
import com.example.test1.ui.home.SELECTBUS.SB3;
import com.example.test1.ui.home.homeProgam.ATHLETICS_MARATHON_FINAL_MEN_S;
import com.example.test1.ui.home.homeProgam.CEREMONY_OPENING_CEREMONY_ALL;
import com.example.test1.ui.home.homeProgam.DIVING_10M_PLATFORM_SEMIFINAL_MEN_S;
import com.example.test1.ui.home.homeProgam.DIVING_SPRINGBOARD_SEMIFINAL_INDIVIDUALS;
import com.example.test1.ui.home.homeProgam.DIVING_SYNCHRONIZED_3M_SPRINGBOARD_FINAL_INDIVIDUALS;
import com.example.test1.ui.home.homeProgam.SWIMMING_FREESTYLE_MEDLY_FINAL_INDIVIDUALS;
import com.example.test1.ui.home.homeProgam.SWIMMING_PRELIMINARY_INDIVIDUALS;

public class BUS3 extends Fragment implements View.OnClickListener {
@Nullable
@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bus3, container, false);
        Button b1 = (Button) view.findViewById(R.id.buttonB11);
        //Button b2 = (Button) view.findViewById(R.id.buttonB12);
        //Button b3 = (Button) view.findViewById(R.id.buttonB13);
        //Button b4 = (Button) view.findViewById(R.id.buttonB14);
        //Button b5 = (Button) view.findViewById(R.id.buttonB15);
        //Button b6 = (Button) view.findViewById(R.id.buttonB16);
        b1.setOnClickListener(this);
        //b2.setOnClickListener(this);
        //b3.setOnClickListener(this);
        //b4.setOnClickListener(this);
        //b5.setOnClickListener(this);
        //b6.setOnClickListener(this);
        Button bb = (Button) view.findViewById(R.id.buttonBack);
        bb.setOnClickListener(this);


        return view;
        }
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.buttonB11:
                fragment = new SB3();
                replaceFragment(fragment);
                break;
            case R.id.buttonB12:
                fragment = new SWIMMING_PRELIMINARY_INDIVIDUALS();
                replaceFragment(fragment);
                break;
            case R.id.buttonB13:
                fragment = new SWIMMING_FREESTYLE_MEDLY_FINAL_INDIVIDUALS();
                replaceFragment(fragment);
                break;
            case R.id.buttonB14:
                fragment = new ATHLETICS_MARATHON_FINAL_MEN_S();
                replaceFragment(fragment);
                break;
            case R.id.buttonB15:
                fragment = new DIVING_SPRINGBOARD_SEMIFINAL_INDIVIDUALS();
                replaceFragment(fragment);
                break;
            case R.id.buttonB16:
                fragment = new DIVING_10M_PLATFORM_SEMIFINAL_MEN_S();
                replaceFragment(fragment);
                break;
            case R.id.buttonBack:
                fragment = new SWIMMING_PRELIMINARY_INDIVIDUALS();
                replaceFragment(fragment);
                break;


        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
