package com.firstbuild.androidapp.opal;

import java.util.ArrayList;

public class OpalDiagnosticsCharacteristicsReporter {
    // todo - Constructor should create the timer, the array list (should probably be dynamically populated),
    // other junk
    private ArrayList<byte[]> diagnosticCharacteristics;

    public OpalDiagnosticsCharacteristicsReporter(int numberOfExpectedDiagnosticsCharacteristics)
    {
        diagnosticCharacteristics = new ArrayList(numberOfExpectedDiagnosticsCharacteristics);
    }

    public void AddDiagnosticsCharacteristic(String uuid, byte[] data)
    {

    }

    // todo - on first diagnostic, start a timeout timer for all the characteristics
    //      If all the characteristics are received, stop the timer
}
