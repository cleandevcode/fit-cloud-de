package androidx.emoji2.text;

import androidx.emoji2.text.f;

/* loaded from: classes.dex */
public final class e extends f.h {

    /* renamed from: a */
    public final /* synthetic */ f.a f2234a;

    public e(f.a aVar) {
        this.f2234a = aVar;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th2) {
        this.f2234a.f2247a.d(th2);
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(n nVar) {
        f.a aVar = this.f2234a;
        aVar.f2246c = nVar;
        aVar.f2245b = new j(aVar.f2246c, new f.i(), aVar.f2247a.f2244h);
        aVar.f2247a.e();
    }
}
