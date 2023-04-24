package mf;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import ln.p;

/* loaded from: classes.dex */
public abstract class y implements Closeable {

    /* renamed from: a */
    public int f20627a;

    /* renamed from: b */
    public int[] f20628b = new int[32];

    /* renamed from: c */
    public String[] f20629c = new String[32];

    /* renamed from: d */
    public int[] f20630d = new int[32];

    /* renamed from: e */
    public boolean f20631e;

    /* renamed from: f */
    public boolean f20632f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String[] f20633a;

        /* renamed from: b */
        public final ln.p f20634b;

        public a(String[] strArr, ln.p pVar) {
            this.f20633a = strArr;
            this.f20634b = pVar;
        }

        public static a a(String... strArr) {
            try {
                ln.h[] hVarArr = new ln.h[strArr.length];
                ln.e eVar = new ln.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c0.W(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.I();
                }
                ln.p.f20119c.getClass();
                return new a((String[]) strArr.clone(), p.a.b(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public abstract long C();

    public abstract void D();

    public abstract String E();

    public abstract int F();

    public abstract void I();

    public final void J(int i10) {
        int i11 = this.f20627a;
        int[] iArr = this.f20628b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f20628b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f20629c;
                this.f20629c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f20630d;
                this.f20630d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("Nesting too deep at ");
                a10.append(k());
                throw new v(a10.toString());
            }
        }
        int[] iArr3 = this.f20628b;
        int i12 = this.f20627a;
        this.f20627a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int L(a aVar);

    public abstract int P(a aVar);

    public abstract void R();

    public abstract void W();

    public final void X(String str) {
        StringBuilder a10 = p.a.a(str, " at path ");
        a10.append(k());
        throw new w(a10.toString());
    }

    public abstract void a();

    public abstract void b();

    public abstract void h();

    public abstract void j();

    public final String k() {
        return a0.h(this.f20627a, this.f20628b, this.f20629c, this.f20630d);
    }

    public abstract boolean q();

    public abstract boolean s();

    public abstract double v();

    public abstract int y();
}
