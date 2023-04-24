package y8;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import p8.b;

/* loaded from: classes.dex */
public final class k extends a implements m {
    public k(IBinder iBinder) {
        super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", iBinder);
    }

    @Override // y8.m
    public final p8.b i(Bitmap bitmap) {
        Parcel a02 = a0();
        j.b(a02, bitmap);
        Parcel k10 = k(a02, 6);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }
}
