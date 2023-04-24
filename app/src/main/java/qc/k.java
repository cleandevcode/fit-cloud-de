package qc;

import java.nio.ByteBuffer;
import kc.v0;
import qc.l;
import yk.a;

/* loaded from: classes.dex */
public final class k implements wk.e<tk.i<Throwable>, tk.l<?>> {

    /* renamed from: a */
    public final /* synthetic */ v0.d f24726a;

    /* renamed from: b */
    public final /* synthetic */ l.a f24727b;

    /* renamed from: c */
    public final /* synthetic */ int f24728c;

    /* renamed from: d */
    public final /* synthetic */ ByteBuffer f24729d;

    public k(int i10, v0.d dVar, a aVar, ByteBuffer byteBuffer) {
        this.f24726a = dVar;
        this.f24727b = aVar;
        this.f24728c = i10;
        this.f24729d = byteBuffer;
    }

    @Override // wk.e
    public final tk.l<?> apply(tk.i<Throwable> iVar) {
        tk.i<R> o10 = iVar.o(new i(this));
        j jVar = new j(this);
        a.d dVar = yk.a.f31789d;
        a.c cVar = yk.a.f31788c;
        return o10.k(jVar, dVar, cVar, cVar).c(this.f24726a);
    }
}
