package s;

import a0.h0;
import r.a;

/* loaded from: classes.dex */
public final class a2 extends h0 {

    /* renamed from: c */
    public static final a2 f25913c = new a2(new w.h());

    /* renamed from: b */
    public final w.h f25914b;

    public a2(w.h hVar) {
        this.f25914b = hVar;
    }

    @Override // s.h0, a0.h0.b
    public final void a(a0.w0 w0Var, h0.a aVar) {
        super.a(w0Var, aVar);
        if (w0Var instanceof a0.w0) {
            a.C0454a c0454a = new a.C0454a();
            a0.d dVar = a0.w0.f205z;
            if (a0.s1.a(w0Var, dVar)) {
                w.h hVar = this.f25914b;
                int intValue = ((Integer) ((a0.n1) w0Var.b()).c(dVar)).intValue();
                hVar.getClass();
                w.h.a(intValue, c0454a);
            }
            aVar.c(new r.a(a0.n1.A(c0454a.f25144a)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
