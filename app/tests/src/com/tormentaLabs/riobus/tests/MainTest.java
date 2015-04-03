package com.tormentaLabs.riobus.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.tormentaLabs.riobus.Main;
import com.tormentaLabs.riobus.R;

/**
 * Created by pedro on 20/07/2014.
 */
public class MainTest extends ActivityInstrumentationTestCase2 {

    private Main act;
    GoogleMap mapa;

    public MainTest() {
        super(Main.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        act = (Main) getActivity();
        mapa = act.mapa;
    }

    public void testPreconditions() {
        assertNotNull("Main is null", act);
        assertNotNull("Mapa is null", mapa);
    }


}
