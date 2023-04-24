package ck;

import android.util.Log;
import pn.e;

/* loaded from: classes2.dex */
public final class b implements pn.a {

    /* renamed from: a */
    public final /* synthetic */ pk.a f4922a;

    public b(pk.a aVar) {
        this.f4922a = aVar;
    }

    @Override // pn.a
    public final void a(e eVar) {
        Log.i("AiotMqtt", "publish succeed!");
        pk.a aVar = this.f4922a;
        if (aVar != null) {
            aVar.a(eVar);
        }
    }

    @Override // pn.a
    public final void b(e eVar, Exception exc) {
        Log.i("AiotMqtt", "publish failed!");
        pk.a aVar = this.f4922a;
        if (aVar != null) {
            aVar.b(eVar, exc);
        }
    }
}
