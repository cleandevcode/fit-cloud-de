package c9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p8.b;

/* loaded from: classes.dex */
public final class p extends y8.a implements c {
    public p(IBinder iBinder) {
        super("com.google.android.gms.maps.internal.IMapViewDelegate", iBinder);
    }

    @Override // c9.c
    public final p8.b getView() {
        Parcel k10 = k(a0(), 8);
        p8.b a02 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a02;
    }

    @Override // c9.c
    public final void m0(b9.f fVar) {
        Parcel a02 = a0();
        y8.j.c(a02, fVar);
        f0(a02, 9);
    }

    @Override // c9.c
    public final void onCreate(Bundle bundle) {
        Parcel a02 = a0();
        y8.j.b(a02, bundle);
        f0(a02, 2);
    }

    @Override // c9.c
    public final void onDestroy() {
        f0(a0(), 5);
    }

    @Override // c9.c
    public final void onLowMemory() {
        f0(a0(), 6);
    }

    @Override // c9.c
    public final void onPause() {
        f0(a0(), 4);
    }

    @Override // c9.c
    public final void onResume() {
        f0(a0(), 3);
    }

    @Override // c9.c
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel a02 = a0();
        y8.j.b(a02, bundle);
        Parcel k10 = k(a02, 7);
        if (k10.readInt() != 0) {
            bundle.readFromParcel(k10);
        }
        k10.recycle();
    }

    @Override // c9.c
    public final void onStart() {
        f0(a0(), 12);
    }

    @Override // c9.c
    public final void onStop() {
        f0(a0(), 13);
    }
}
