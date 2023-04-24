package p8;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import c9.k;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a */
    public final /* synthetic */ Bundle f23960a;

    /* renamed from: b */
    public final /* synthetic */ a f23961b;

    public d(b9.h hVar, Bundle bundle) {
        this.f23961b = hVar;
        this.f23960a = bundle;
    }

    @Override // p8.h
    public final int a() {
        return 1;
    }

    @Override // p8.h
    public final void b() {
        b9.g gVar = this.f23961b.f23955a;
        Bundle bundle = this.f23960a;
        gVar.getClass();
        try {
            Bundle bundle2 = new Bundle();
            k.b(bundle, bundle2);
            gVar.f4046b.onCreate(bundle2);
            k.b(bundle2, bundle);
            gVar.f4047c = (View) c.f0(gVar.f4046b.getView());
            gVar.f4045a.removeAllViews();
            gVar.f4045a.addView(gVar.f4047c);
        } catch (RemoteException e10) {
            throw new d9.k(e10);
        }
    }
}
