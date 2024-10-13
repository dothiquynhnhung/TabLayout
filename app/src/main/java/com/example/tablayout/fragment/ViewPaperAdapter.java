package com.example.tablayout.fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPaperAdapter extends FragmentStatePagerAdapter {
    public ViewPaperAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new homeFragment();
            case 1:
                return new orderFragment();
            case 2:
                return new accountFragment();
            default:
                return new homeFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
