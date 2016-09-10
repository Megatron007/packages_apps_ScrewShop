package com.mrapocalypse.screwdshop.frags;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.Utils;

import com.android.internal.logging.MetricsProto.MetricsEvent;

/**
 * Created by cedwards on 6/3/2016.
 */
public class SoundsFrag extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.sounds_frag);
    }


    public boolean onPreferenceChange(Preference preference, Object objValue) {
        final String key = preference.getKey();
        return true;
    }



    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.SCREWD;
    }



}
