package o5;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o5.d0;

/* loaded from: classes.dex */
public final class l0 extends FilterOutputStream implements m0 {

    /* renamed from: h */
    public static final /* synthetic */ int f22787h = 0;

    /* renamed from: a */
    public final d0 f22788a;

    /* renamed from: b */
    public final Map<y, o0> f22789b;

    /* renamed from: c */
    public final long f22790c;

    /* renamed from: d */
    public final long f22791d;

    /* renamed from: e */
    public long f22792e;

    /* renamed from: f */
    public long f22793f;

    /* renamed from: g */
    public o0 f22794g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(FilterOutputStream filterOutputStream, d0 d0Var, HashMap hashMap, long j10) {
        super(filterOutputStream);
        gm.l.f(hashMap, "progressMap");
        this.f22788a = d0Var;
        this.f22789b = hashMap;
        this.f22790c = j10;
        v vVar = v.f22837a;
        d6.n0.g();
        this.f22791d = v.f22844h.get();
    }

    @Override // o5.m0
    public final void a(y yVar) {
        this.f22794g = yVar != null ? this.f22789b.get(yVar) : null;
    }

    public final void b(long j10) {
        o0 o0Var = this.f22794g;
        if (o0Var != null) {
            long j11 = o0Var.f22801d + j10;
            o0Var.f22801d = j11;
            if (j11 >= o0Var.f22802e + o0Var.f22800c || j11 >= o0Var.f22803f) {
                o0Var.a();
            }
        }
        long j12 = this.f22792e + j10;
        this.f22792e = j12;
        if (j12 >= this.f22793f + this.f22791d || j12 >= this.f22790c) {
            h();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        for (o0 o0Var : this.f22789b.values()) {
            o0Var.a();
        }
        h();
    }

    public final void h() {
        Boolean valueOf;
        if (this.f22792e > this.f22793f) {
            Iterator it = this.f22788a.f22693d.iterator();
            while (it.hasNext()) {
                d0.a aVar = (d0.a) it.next();
                if (aVar instanceof d0.b) {
                    Handler handler = this.f22788a.f22690a;
                    if (handler == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(handler.post(new s.o(aVar, this, 7)));
                    }
                    if (valueOf == null) {
                        ((d0.b) aVar).b();
                    }
                }
            }
            this.f22793f = this.f22792e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        b(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        gm.l.f(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        b(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        gm.l.f(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        b(i11);
    }
}
