package gj;

import fl.g;
import gm.l;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import zm.a0;
import zm.c0;

/* loaded from: classes2.dex */
public final class e implements zm.e {

    /* renamed from: a */
    public final /* synthetic */ tk.j<g<File>> f15369a;

    /* renamed from: b */
    public final /* synthetic */ f f15370b;

    /* renamed from: c */
    public final /* synthetic */ File f15371c;

    public e(g.a aVar, f fVar, File file) {
        this.f15369a = aVar;
        this.f15370b = fVar;
        this.f15371c = file;
    }

    @Override // zm.e
    public final void a(dn.e eVar, a0 a0Var) {
        l.f(eVar, "call");
        c0 c0Var = a0Var.f32535g;
        if (c0Var == null) {
            ((g.a) this.f15369a).f(new a(0, 5, "empty body", null));
            return;
        }
        try {
            InputStream J0 = c0Var.h().J0();
            f fVar = this.f15370b;
            tk.j<g<File>> jVar = this.f15369a;
            File file = this.f15371c;
            long a10 = c0Var.a();
            fVar.getClass();
            c.b(jVar, J0, file, a10);
            tl.l lVar = tl.l.f28297a;
            mf.a0.d(J0, null);
        } catch (Exception e10) {
            ((g.a) this.f15369a).f(new a(0, 3, null, e10));
        }
    }

    @Override // zm.e
    public final void b(dn.e eVar, IOException iOException) {
        l.f(eVar, "call");
        ((g.a) this.f15369a).f(new a(0, 3, null, iOException));
    }
}
