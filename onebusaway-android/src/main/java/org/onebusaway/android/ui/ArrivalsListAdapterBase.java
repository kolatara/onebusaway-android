package org.onebusaway.android.ui;

import org.onebusaway.android.io.elements.ObaArrivalInfo;
import org.onebusaway.android.util.ArrayAdapter;

import android.content.ContentQueryMap;
import android.content.Context;

import java.util.ArrayList;

/**
 * Base adapter class for the various styles of arrivals lists
 *
 * @author barbeau
 */
public abstract class ArrivalsListAdapterBase<T> extends ArrayAdapter<T> {

    public static final int ARRIVAL_INFO_STYLE_A = 0; // Original OBA style

    public static final int ARRIVAL_INFO_STYLE_B = 1; // Style used by York Region Transit

    protected ContentQueryMap mTripsForStop;

    public ArrivalsListAdapterBase(Context context, int layout) {
        super(context, layout);
    }

    abstract public void setTripsForStop(ContentQueryMap tripsForStop);

    abstract public void setData(ObaArrivalInfo[] arrivals, ArrayList<String> routesFilter);
}
