package jj;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o0 implements d {

    /* renamed from: a */
    public final wi.a f17951a;

    /* renamed from: b */
    public final b f17952b;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<pj.a, Boolean> {

        /* renamed from: b */
        public static final a f17953b = new a();

        public a() {
            super(1);
        }

        @Override // fm.l
        public final Boolean k(pj.a aVar) {
            boolean z10;
            if (aVar.f24277a < 10000) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public o0(wi.k kVar, l lVar) {
        gm.l.f(kVar, "connector");
        gm.l.f(lVar, "configFeature");
        this.f17951a = kVar;
        this.f17952b = lVar;
    }

    public final tk.i<pj.a> a() {
        tk.i<pj.a> n10 = h7.a.t(this.f17951a).n(new i(1, a.f17953b));
        gm.l.e(n10, "connector.observerFcMess… { it.isPublicMessage() }");
        return n10;
    }

    public final bl.h b(final int i10, final String str, final String str2) {
        gl.n nVar = new gl.n(new Callable() { // from class: jj.m0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z10;
                byte[] bytes;
                boolean z11;
                int i11;
                byte[] bArr;
                int i12;
                int i13;
                o0 o0Var = o0.this;
                int i14 = i10;
                String str3 = str;
                String str4 = str2;
                gm.l.f(o0Var, "this$0");
                boolean g10 = ((l) o0Var.f17952b).f17930d.g(267);
                if (str3 != null && str3.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                byte[] bArr2 = null;
                if (z10) {
                    bytes = null;
                } else {
                    bytes = str3.getBytes(om.a.f23623a);
                    gm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                }
                if (str4 != null && str4.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    bArr2 = str4.getBytes(om.a.f23623a);
                    gm.l.e(bArr2, "this as java.lang.String).getBytes(charset)");
                }
                if (g10) {
                    int i15 = 64;
                    if (bytes != null) {
                        i12 = bytes.length;
                    } else {
                        i12 = 0;
                    }
                    if (64 > i12) {
                        i15 = i12;
                    }
                    int i16 = (242 - i15) - 2;
                    if (bArr2 != null) {
                        i13 = bArr2.length;
                    } else {
                        i13 = 0;
                    }
                    if (i16 > i13) {
                        i16 = i13;
                    }
                    int i17 = i15 + 1;
                    bArr = new byte[i17 + 2 + i16];
                    bArr[0] = (byte) i15;
                    if (bytes != null) {
                        System.arraycopy(bytes, 0, bArr, 1, i15);
                    }
                    bArr[i17] = (byte) ((i16 >> 8) & 255);
                    bArr[i15 + 2] = (byte) (i16 & 255);
                    if (bArr2 != null) {
                        System.arraycopy(bArr2, 0, bArr, i15 + 3, i16);
                    }
                } else {
                    int i18 = 221;
                    if (bArr2 != null) {
                        i11 = bArr2.length;
                    } else {
                        i11 = 0;
                    }
                    if (221 > i11) {
                        i18 = i11;
                    }
                    bArr = new byte[i18 + 22];
                    if (bytes != null) {
                        int length = bytes.length;
                        if (20 <= length) {
                            length = 20;
                        }
                        System.arraycopy(bytes, 0, bArr, 0, length);
                        if (length < 20) {
                            while (length < 20) {
                                bArr[length] = 32;
                                length++;
                            }
                        }
                    }
                    bArr[20] = (byte) ((i18 >> 8) & 255);
                    bArr[21] = (byte) (i18 & 255);
                    if (bArr2 != null) {
                        System.arraycopy(bArr2, 0, bArr, 22, i18);
                    }
                }
                return new bj.b((byte) 4, (byte) i14, bArr);
            }
        });
        il.b bVar = pl.a.f24280b;
        Objects.requireNonNull(bVar, "scheduler is null");
        return new gl.m(new gl.s(nVar, bVar), new wi.f(5, new p0(this))).d(new wk.a() { // from class: jj.n0
            @Override // wk.a
            public final void run() {
                int i11 = i10;
                o0 o0Var = this;
                gm.l.f(o0Var, "this$0");
                if (i11 == 1) {
                    wi.a aVar = o0Var.f17951a;
                    pj.a aVar2 = new pj.a(23, null);
                    wi.k kVar = (wi.k) aVar;
                    kVar.getClass();
                    kVar.f29910r.b(aVar2);
                }
            }
        });
    }
}
