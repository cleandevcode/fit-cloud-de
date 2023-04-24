package q8;

import android.os.IBinder;
import android.os.Parcel;
import p8.b;

/* loaded from: classes.dex */
public final class f extends w8.a {
    public f(IBinder iBinder) {
        super("com.google.android.gms.dynamite.IDynamiteLoader", iBinder);
    }

    public final p8.b A0(p8.c cVar, String str, boolean z10, long j10) {
        Parcel a02 = a0();
        w8.c.c(a02, cVar);
        a02.writeString(str);
        a02.writeInt(z10 ? 1 : 0);
        a02.writeLong(j10);
        Parcel k10 = k(a02, 7);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }

    public final p8.b f0(p8.c cVar, String str, int i10) {
        Parcel a02 = a0();
        w8.c.c(a02, cVar);
        a02.writeString(str);
        a02.writeInt(i10);
        Parcel k10 = k(a02, 2);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }

    public final p8.b y0(p8.c cVar, String str, int i10, p8.c cVar2) {
        Parcel a02 = a0();
        w8.c.c(a02, cVar);
        a02.writeString(str);
        a02.writeInt(i10);
        w8.c.c(a02, cVar2);
        Parcel k10 = k(a02, 8);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }

    public final p8.b z0(p8.c cVar, String str, int i10) {
        Parcel a02 = a0();
        w8.c.c(a02, cVar);
        a02.writeString(str);
        a02.writeInt(i10);
        Parcel k10 = k(a02, 4);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }
}
