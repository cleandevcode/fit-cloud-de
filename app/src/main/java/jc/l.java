package jc;

import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class l extends gm.m implements fm.a<tl.l> {

    /* renamed from: b */
    public final /* synthetic */ u f17589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar) {
        super(0);
        this.f17589b = uVar;
    }

    @Override // fm.a
    public final tl.l m() {
        c cVar;
        boolean canWrite;
        if (Build.VERSION.SDK_INT >= 23) {
            canWrite = Settings.System.canWrite(this.f17589b.V0());
            if (canWrite) {
                cVar = this.f17589b.f17604n0;
                if (cVar == null) {
                    gm.l.l("task");
                    throw null;
                }
            } else {
                x xVar = this.f17589b.f17603m0;
                if (xVar != null) {
                    s5.b bVar = xVar.f17636o;
                    if (bVar != null) {
                        if (xVar != null) {
                            gm.l.c(bVar);
                            c cVar2 = this.f17589b.f17604n0;
                            if (cVar2 != null) {
                                bVar.a(cVar2.c(), h7.a.p("android.permission.WRITE_SETTINGS"));
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
            cVar = this.f17589b.f17604n0;
            if (cVar == null) {
                gm.l.l("task");
                throw null;
            }
        }
        cVar.b();
        return tl.l.f28297a;
    }
}
