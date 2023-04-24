package qc;

import fl.g;
import java.nio.ByteBuffer;
import java.util.UUID;
import qc.l;

/* loaded from: classes.dex */
public final class c implements tk.k<tc.e<UUID>> {

    /* renamed from: a */
    public final /* synthetic */ tk.i f24696a;

    /* renamed from: b */
    public final /* synthetic */ ByteBuffer f24697b;

    /* renamed from: c */
    public final /* synthetic */ int f24698c;

    /* renamed from: d */
    public final /* synthetic */ l.a f24699d;

    /* renamed from: e */
    public final /* synthetic */ l f24700e;

    public c(l lVar, tk.i iVar, ByteBuffer byteBuffer, int i10, a aVar) {
        this.f24700e = lVar;
        this.f24696a = iVar;
        this.f24697b = byteBuffer;
        this.f24698c = i10;
        this.f24699d = aVar;
    }

    @Override // tk.k
    public final void a(g.a aVar) {
        tk.i iVar = this.f24696a;
        tc.x xVar = new tc.x(aVar);
        iVar.d(xVar);
        xk.b.g(aVar, xVar);
        try {
            l lVar = this.f24700e;
            ByteBuffer byteBuffer = this.f24697b;
            int i10 = this.f24698c;
            lVar.getClass();
            int min = Math.min(byteBuffer.remaining(), i10);
            byte[] bArr = lVar.f24741j;
            if (bArr == null || bArr.length != min) {
                lVar.f24741j = new byte[min];
            }
            byteBuffer.get(lVar.f24741j);
            this.f24700e.d(lVar.f24741j, this.f24699d);
        } catch (Throwable th2) {
            if (!aVar.f(th2)) {
                ol.a.a(th2);
            }
        }
    }
}
