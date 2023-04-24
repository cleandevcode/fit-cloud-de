package androidx.lifecycle;

import pm.p1;

/* loaded from: classes.dex */
public final class d0 extends pm.b0 {

    /* renamed from: c */
    public final e f2703c = new e();

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        boolean z10;
        gm.l.f(fVar, "context");
        gm.l.f(runnable, "block");
        e eVar = this.f2703c;
        eVar.getClass();
        wm.c cVar = pm.o0.f24381a;
        p1 q02 = um.q.f28935a.q0();
        if (!q02.p0(fVar)) {
            if (!eVar.f2705b && eVar.f2704a) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (eVar.f2707d.offer(runnable)) {
                    eVar.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        q02.l0(fVar, new t.n(eVar, runnable, 8));
    }

    @Override // pm.b0
    public final boolean p0(xl.f fVar) {
        boolean z10;
        gm.l.f(fVar, "context");
        wm.c cVar = pm.o0.f24381a;
        if (um.q.f28935a.q0().p0(fVar)) {
            return true;
        }
        e eVar = this.f2703c;
        if (!eVar.f2705b && eVar.f2704a) {
            z10 = false;
        } else {
            z10 = true;
        }
        return !z10;
    }
}
