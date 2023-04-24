package h8;

import h8.b;

/* loaded from: classes.dex */
public final class x implements b.a {

    /* renamed from: a */
    public final /* synthetic */ d f16037a;

    public x(d dVar) {
        this.f16037a = dVar;
    }

    @Override // h8.b.a
    public final void a(boolean z10) {
        v8.j jVar = this.f16037a.f15938n;
        jVar.sendMessage(jVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
