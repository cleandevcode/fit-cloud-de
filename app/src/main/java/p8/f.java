package p8;

import android.os.RemoteException;
import d9.k;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a */
    public final /* synthetic */ a f23964a;

    public f(b9.h hVar) {
        this.f23964a = hVar;
    }

    @Override // p8.h
    public final int a() {
        return 4;
    }

    @Override // p8.h
    public final void b() {
        b9.g gVar = this.f23964a.f23955a;
        gVar.getClass();
        try {
            gVar.f4046b.onStart();
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }
}
