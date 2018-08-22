package edu.stanford.cs193a.ceb_test_app_01;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ContactUsFragment extends Fragment {
    View contactUs;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        contactUs = inflater.inflate(R.layout.contactus_layout, container, false);
        return contactUs;
    }
}