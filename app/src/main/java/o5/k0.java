package o5;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k0 extends OutputStream implements m0 {

    /* renamed from: a */
    public final Handler f22782a;

    /* renamed from: b */
    public final HashMap f22783b = new HashMap();

    /* renamed from: c */
    public y f22784c;

    /* renamed from: d */
    public o0 f22785d;

    /* renamed from: e */
    public int f22786e;

    public k0(Handler handler) {
        this.f22782a = handler;
    }

    @Override // o5.m0
    public final void a(y yVar) {
        this.f22784c = yVar;
        this.f22785d = yVar != null ? (o0) this.f22783b.get(yVar) : null;
    }

    public final void b(long j10) {
        y yVar = this.f22784c;
        if (yVar == null) {
            return;
        }
        if (this.f22785d == null) {
            o0 o0Var = new o0(this.f22782a, yVar);
            this.f22785d = o0Var;
            this.f22783b.put(yVar, o0Var);
        }
        o0 o0Var2 = this.f22785d;
        if (o0Var2 != null) {
            o0Var2.f22803f += j10;
        }
        this.f22786e += (int) j10;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        b(1L);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        gm.l.f(bArr, "buffer");
        b(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        gm.l.f(bArr, "buffer");
        b(i11);
    }
}
