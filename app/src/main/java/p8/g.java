package p8;

import android.os.RemoteException;
import d9.k;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a */
    public final /* synthetic */ a f23965a;

    public g(b9.h hVar) {
        this.f23965a = hVar;
    }

    @Override // p8.h
    public final int a() {
        return 5;
    }

    @Override // p8.h
    public final void b() {
        b9.g gVar = this.f23965a.f23955a;
        gVar.getClass();
        try {
            gVar.f4046b.onResume();
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }
}
