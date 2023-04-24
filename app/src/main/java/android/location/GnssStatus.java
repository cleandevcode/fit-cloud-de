package android.location;

import android.os.Parcelable;

/* loaded from: classes.dex */
public final /* synthetic */ class GnssStatus implements Parcelable {

    /* loaded from: classes.dex */
    public /* synthetic */ class Callback {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ float getCn0DbHz(int i10);

    public native /* synthetic */ int getSatelliteCount();

    public native /* synthetic */ boolean usedInFix(int i10);
}
