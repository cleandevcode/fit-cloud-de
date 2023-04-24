package jc;

import android.os.Build;

/* loaded from: classes.dex */
public final class i extends gm.m implements fm.a<tl.l> {

    /* renamed from: b */
    public final /* synthetic */ u f17586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar) {
        super(0);
        this.f17586b = uVar;
    }

    @Override // fm.a
    public final tl.l m() {
        c cVar;
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT >= 26) {
            canRequestPackageInstalls = this.f17586b.T0().getPackageManager().canRequestPackageInstalls();
            if (canRequestPackageInstalls) {
                cVar = this.f17586b.f17604n0;
                if (cVar == null) {
                    gm.l.l("task");
                    throw null;
                }
            } else {
                x xVar = this.f17586b.f17603m0;
                if (xVar != null) {
                    s5.b bVar = xVar.f17636o;
                    if (bVar != null) {
                        if (xVar != null) {
                            gm.l.c(bVar);
                            c cVar2 = this.f17586b.f17604n0;
                            if (cVar2 != null) {
                                bVar.a(cVar2.c(), h7.a.p("android.permission.REQUEST_INSTALL_PACKAGES"));
                            } else {
                                gm.l.l("task");
                                throw null;
                            }
                        } else {
                            gm.l.l("pb");
                            throw null;
                        }
                    }
                    return tl.l.f28297a;
                }
                gm.l.l("pb");
                throw null;
            }
        } else {
            cVar = this.f17586b.f17604n0;
            if (cVar == null) {
                gm.l.l("task");
                throw null;
            }
        }
        cVar.b();
        return tl.l.f28297a;
    }
}
