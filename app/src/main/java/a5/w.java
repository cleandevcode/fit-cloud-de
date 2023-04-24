package a5;

import a5.t;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class w implements r4.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final n f338a;

    public w(n nVar) {
        this.f338a = nVar;
    }

    @Override // r4.j
    public final t4.x<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, r4.h hVar) {
        n nVar = this.f338a;
        return nVar.a(new t.c(parcelFileDescriptor, nVar.f309d, nVar.f308c), i10, i11, hVar, n.f304k);
    }

    @Override // r4.j
    public final boolean b(ParcelFileDescriptor parcelFileDescriptor, r4.h hVar) {
        boolean z10;
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        this.f338a.getClass();
        if (!(!"robolectric".equals(Build.FINGERPRINT))) {
            return false;
        }
        return true;
    }
}
