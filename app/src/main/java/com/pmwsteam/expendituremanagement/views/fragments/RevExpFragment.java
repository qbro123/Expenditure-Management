package com.pmwsteam.expendituremanagement.views.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pmwsteam.expendituremanagement.R;


public class RevExpFragment extends Fragment {

    public RevExpFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_rev_exp, container, false);
    }
}
