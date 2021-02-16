package com.example.practica_1_compi_1;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.w3c.dom.ls.LSOutput;


public class SeccionesPagina extends FragmentPagerAdapter {
    private static final String ARG_SECTION_NUMBER = "section_number";
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SeccionesPagina(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        System.out.println("\nPosicion: "+position);

        if(position == 0){
            System.out.println("\nFrag 0");
            IngresoComando fragmento = new IngresoComando();
            return fragmento;
        } else {
            System.out.println("\nFrag 1");
            Visualizador fragmento = new Visualizador();
            return fragmento;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}
