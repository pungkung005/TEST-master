package com.example.test1.ui.home;
//package homeProgam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.test1.R;
import com.example.test1.ui.home.homeProgam.ATHLETICS_MARATHON_FINAL_MEN_S;
import com.example.test1.ui.home.homeProgam.CEREMONY_OPENING_CEREMONY_ALL;
import com.example.test1.ui.home.homeProgam.DIVING_10M_PLATFORM_SEMIFINAL_MEN_S;
import com.example.test1.ui.home.homeProgam.DIVING_SPRINGBOARD_SEMIFINAL_INDIVIDUALS;
import com.example.test1.ui.home.homeProgam.DIVING_SYNCHRONIZED_3M_SPRINGBOARD_FINAL_INDIVIDUALS;
import com.example.test1.ui.home.homeProgam.SWIMMING_FREESTYLE_MEDLY_FINAL_INDIVIDUALS;
import com.example.test1.ui.home.homeProgam.SWIMMING_PRELIMINARY_INDIVIDUALS;
import com.example.test1.ui.home.homeProgam.WEIGHTLIFTING_109_KG_GROUP_A_AND_VICTORY_CEREMONY_MEN_s;
import com.example.test1.ui.home.homeProgam.WEIGHTLIFTING_109_KG_GROUP_B_MEN_S;
import com.example.test1.ui.home.homeProgam.WEIGHTLIFTING_40_KG_GROUP_B_WOMEN_S;
import com.example.test1.ui.home.homeProgam.WEIGHTLIFTING_76_KG_GROUP_B_WOMEN_S;

public class HomeFragment extends Fragment implements View.OnClickListener{

    private HomeViewModel homeViewModel;
    private Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        //if (savedInstanceState == null){
        //    CEREMONY_OPENING_CEREMONY_ALL mainFragment = new CEREMONY_OPENING_CEREMONY_ALL();
        //    getSupportFragmentManager()
        //            .beginTransaction()
        //            .add(R.id.linContent , CEREMONY_OPENING_CEREMONY_ALL)
        //            .comit();
        //}
        //View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        //View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        Button b1 = (Button) root.findViewById(R.id.button04);
        Button b2 = (Button) root.findViewById(R.id.button5);
        Button b3 = (Button) root.findViewById(R.id.button6);
        Button b4 = (Button) root.findViewById(R.id.button7);
        Button b5 = (Button) root.findViewById(R.id.button8);
        Button b6 = (Button) root.findViewById(R.id.button9);
        Button b7 = (Button) root.findViewById(R.id.button10);
        Button b8 = (Button) root.findViewById(R.id.button11);
        Button b9 = (Button) root.findViewById(R.id.button12);
        Button b10 = (Button) root.findViewById(R.id.button13);
        Button b11 = (Button) root.findViewById(R.id.button14);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);

        return root ;
    }
    //@Override
    //public View onCreateView(LayoutInflater inflater, ViewGroup container,
    //                         Bundle savedInstanceState) {
//
    //    View rootView = inflater.inflate(R.layout.fragment_home, container, false);
//
    //    Button b1 = (Button) rootView.findViewById(R.id.button04);
//
    //    b1.setOnClickListener(this);



    //    return rootView;
    //}
    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.button04:
                fragment = new CEREMONY_OPENING_CEREMONY_ALL();
                replaceFragment(fragment);
                break;
            case R.id.button6:
                fragment = new SWIMMING_PRELIMINARY_INDIVIDUALS();
                replaceFragment(fragment);
                break;
            case R.id.button7:
                fragment = new SWIMMING_FREESTYLE_MEDLY_FINAL_INDIVIDUALS();
                replaceFragment(fragment);
                break;
            case R.id.button5:
                fragment = new ATHLETICS_MARATHON_FINAL_MEN_S();
                replaceFragment(fragment);
                break;
            case R.id.button8:
                fragment = new DIVING_SPRINGBOARD_SEMIFINAL_INDIVIDUALS();
                replaceFragment(fragment);
                break;
            case R.id.button9:
                fragment = new DIVING_10M_PLATFORM_SEMIFINAL_MEN_S();
                replaceFragment(fragment);
                break;
            case R.id.button10:
                fragment = new DIVING_SYNCHRONIZED_3M_SPRINGBOARD_FINAL_INDIVIDUALS();
                replaceFragment(fragment);
                break;
            case R.id.button11:
                fragment = new WEIGHTLIFTING_40_KG_GROUP_B_WOMEN_S();
                replaceFragment(fragment);
                break;
            case R.id.button12:
                fragment = new WEIGHTLIFTING_76_KG_GROUP_B_WOMEN_S();
                replaceFragment(fragment);
                break;
            case R.id.button13:
                fragment = new WEIGHTLIFTING_109_KG_GROUP_B_MEN_S();
                replaceFragment(fragment);
                break;
            case R.id.button14:
                fragment = new WEIGHTLIFTING_109_KG_GROUP_A_AND_VICTORY_CEREMONY_MEN_s();
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

