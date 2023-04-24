package x8;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import h8.h;

/* loaded from: classes.dex */
public final class j extends a9.c {

    /* renamed from: a */
    public final /* synthetic */ g9.h f30421a;

    /* renamed from: b */
    public final /* synthetic */ u f30422b;

    public j(u uVar, g9.h hVar) {
        this.f30422b = uVar;
        this.f30421a = hVar;
    }

    @Override // a9.c
    public final void a(LocationResult locationResult) {
        Location location;
        g9.h hVar = this.f30421a;
        int size = locationResult.f6129a.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) locationResult.f6129a.get(size - 1);
        }
        g9.t tVar = hVar.f15034a;
        synchronized (tVar.f15057a) {
            if (!tVar.f15059c) {
                tVar.f15059c = true;
                tVar.f15061e = location;
                tVar.f15058b.b(tVar);
            }
        }
        try {
            u uVar = this.f30422b;
            i8.p.e("Listener type must not be empty", "GetCurrentLocation");
            uVar.C(new h.a(this, "GetCurrentLocation"), false, new g9.h());
        } catch (RemoteException unused) {
        }
    }
}
