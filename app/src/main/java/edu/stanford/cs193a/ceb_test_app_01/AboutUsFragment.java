package edu.stanford.cs193a.ceb_test_app_01;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutUsFragment extends Fragment {
    View aboutUs;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        aboutUs = inflater.inflate(R.layout.aboutus_layout, container, false);
        return aboutUs;
    }
}
