package c9;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p8.b;
import s.r0;
import z6.a;

/* loaded from: classes.dex */
public abstract class i extends y8.i {
    public i() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // y8.i
    public final boolean k(int i10, Parcel parcel, Parcel parcel2) {
        Parcelable parcelable;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            p8.b a02 = b.a.a0(parcel.readStrongBinder());
            y8.j.a(parcel);
            a.InterfaceC0609a interfaceC0609a = (a.InterfaceC0609a) ((r0) ((b9.i) this).f4053a).f26165b;
            gm.l.f(interfaceC0609a, "$callback");
            interfaceC0609a.a((Bitmap) p8.c.f0(a02));
        } else {
            Parcelable.Creator creator = Bitmap.CREATOR;
            int i11 = y8.j.f31225a;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            y8.j.a(parcel);
            a.InterfaceC0609a interfaceC0609a2 = (a.InterfaceC0609a) ((r0) ((b9.i) this).f4053a).f26165b;
            gm.l.f(interfaceC0609a2, "$callback");
            interfaceC0609a2.a((Bitmap) parcelable);
        }
        parcel2.writeNoException();
        return true;
    }
}
