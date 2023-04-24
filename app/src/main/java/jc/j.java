package jc;

import android.os.Build;
import android.os.Environment;

/* loaded from: classes.dex */
public final class j extends gm.m implements fm.a<tl.l> {

    /* renamed from: b */
    public final /* synthetic */ u f17587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar) {
        super(0);
        this.f17587b = uVar;
    }

    @Override // fm.a
    public final tl.l m() {
        c cVar;
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                cVar = this.f17587b.f17604n0;
                if (cVar == null) {
                    gm.l.l("task");
                    throw null;
                }
            } else {
                x xVar = this.f17587b.f17603m0;
                if (xVar != null) {
                    s5.b bVar = xVar.f17636o;
                    if (bVar != null) {
                        if (xVar != null) {
                            gm.l.c(bVar);
                            c cVar2 = this.f17587b.f17604n0;
                            if (cVar2 != null) {
                                bVar.a(cVar2.c(), h7.a.p("android.permission.MANAGE_EXTERNAL_STORAGE"));
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
            cVar = this.f17587b.f17604n0;
            if (cVar == null) {
                gm.l.l("task");
                throw null;
            }
        }
        cVar.b();
        return tl.l.f28297a;
    }
}
