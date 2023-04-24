package androidx.appcompat.widget;

import p0.c;

/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1439a;

    /* renamed from: b */
    public final /* synthetic */ Object f1440b;

    public /* synthetic */ m2(int i10, Object obj) {
        this.f1439a = i10;
        this.f1440b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1439a) {
            case 0:
                ((Toolbar) this.f1440b).l();
                return;
            case 1:
                s.g2.f25959n.remove((a0.m0) this.f1440b);
                return;
            case 2:
                s.o2.u((s.o2) this.f1440b);
                return;
            case 3:
                ((c.a) this.f1440b).a(null);
                return;
            case 4:
                ((androidx.camera.core.o) this.f1440b).a();
                return;
            case 5:
                ((androidx.camera.core.s) this.f1440b).f1790e.cancel(true);
                return;
            default:
                fm.a aVar = (fm.a) this.f1440b;
                int i10 = jc.u.f17601x0;
                gm.l.f(aVar, "$callback");
                aVar.m();
                return;
        }
    }
}
