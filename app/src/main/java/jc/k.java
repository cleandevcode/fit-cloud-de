package jc;

import android.os.Build;

/* loaded from: classes.dex */
public final class k extends gm.m implements fm.a<tl.l> {

    /* renamed from: b */
    public final /* synthetic */ u f17588b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar) {
        super(0);
        this.f17588b = uVar;
    }

    @Override // fm.a
    public final tl.l m() {
        c cVar;
        if (Build.VERSION.SDK_INT >= 26) {
            if (new x0.c0(this.f17588b.V0()).a()) {
                cVar = this.f17588b.f17604n0;
                if (cVar == null) {
                    gm.l.l("task");
                    throw null;
                }
            } else {
                u uVar = this.f17588b;
                x xVar = uVar.f17603m0;
                if (xVar != null) {
                    s5.b bVar = xVar.f17636o;
                    if (bVar != null) {
                        c cVar2 = uVar.f17604n0;
                        if (cVar2 != null) {
                            bVar.a(cVar2.c(), h7.a.p("android.permission.POST_NOTIFICATIONS"));
                        } else {
                            gm.l.l("task");
                            throw null;
                        }
                    }
                    return tl.l.f28297a;
                }
                gm.l.l("pb");
                throw null;
            }
        } else {
            cVar = this.f17588b.f17604n0;
            if (cVar == null) {
                gm.l.l("task");
                throw null;
            }
        }
        cVar.b();
        return tl.l.f28297a;
    }
}
