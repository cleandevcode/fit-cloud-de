package qc;

import fl.a1;
import java.nio.ByteBuffer;
import kc.v0;

/* loaded from: classes.dex */
public final class h implements wk.e<tk.i<?>, tk.l<?>> {

    /* renamed from: a */
    public final /* synthetic */ tc.k0 f24712a;

    /* renamed from: b */
    public final /* synthetic */ ByteBuffer f24713b;

    /* renamed from: c */
    public final /* synthetic */ v0.c f24714c;

    public h(v0.c cVar, tc.k0 k0Var, ByteBuffer byteBuffer) {
        this.f24712a = k0Var;
        this.f24713b = byteBuffer;
        this.f24714c = cVar;
    }

    @Override // wk.e
    public final tk.l<?> apply(tk.i<?> iVar) {
        tk.i<?> iVar2 = iVar;
        g gVar = new g(this.f24712a);
        iVar2.getClass();
        return new a1(new a1(iVar2, gVar).u(new f(this.f24713b)).c(this.f24714c), new e());
    }
}
