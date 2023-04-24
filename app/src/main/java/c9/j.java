package c9;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j extends y8.a implements e {
    public j(IBinder iBinder) {
        super("com.google.android.gms.maps.internal.IUiSettingsDelegate", iBinder);
    }

    @Override // c9.e
    public final void r() {
        Parcel a02 = a0();
        int i10 = y8.j.f31225a;
        a02.writeInt(0);
        f0(a02, 4);
    }

    @Override // c9.e
    public final void w0() {
        Parcel a02 = a0();
        int i10 = y8.j.f31225a;
        a02.writeInt(0);
        f0(a02, 1);
    }
}
