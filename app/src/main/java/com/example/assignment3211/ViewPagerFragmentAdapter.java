package com.example.assignment3211;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerFragmentAdapter extends FragmentStateAdapter {
    private String[] titles=new String[]{"Student","Course","Summary","Notes"};
    public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
            return new StudentFragment();
            case 1:
                return new CourseFragment();
            case 2:
                return new SummaryFragment();
            case 3:
                return new NotesFragment();

        }
        return new StudentFragment();

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
