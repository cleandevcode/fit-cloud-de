package mf;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class e0 implements Closeable, Flushable {

    /* renamed from: e */
    public boolean f20532e;

    /* renamed from: f */
    public boolean f20533f;

    /* renamed from: g */
    public boolean f20534g;

    /* renamed from: a */
    public int f20528a = 0;

    /* renamed from: b */
    public int[] f20529b = new int[32];

    /* renamed from: c */
    public String[] f20530c = new String[32];

    /* renamed from: d */
    public int[] f20531d = new int[32];

    /* renamed from: h */
    public int f20535h = -1;

    public final void C(int i10) {
        int[] iArr = this.f20529b;
        int i11 = this.f20528a;
        this.f20528a = i11 + 1;
        iArr[i11] = i10;
    }

    public abstract e0 D(double d10);

    public abstract e0 E(long j10);

    public abstract e0 F(Number number);

    public abstract e0 I(String str);

    public abstract e0 J(boolean z10);

    public abstract e0 a();

    public abstract e0 b();

    public final void h() {
        int i10 = this.f20528a;
        int[] iArr = this.f20529b;
        if (i10 != iArr.length) {
            return;
        }
        if (i10 != 256) {
            this.f20529b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f20530c;
            this.f20530c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f20531d;
            this.f20531d = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (this instanceof d0) {
                d0 d0Var = (d0) this;
                Object[] objArr = d0Var.f20521i;
                d0Var.f20521i = Arrays.copyOf(objArr, objArr.length * 2);
                return;
            }
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Nesting too deep at ");
        a10.append(q());
        a10.append(": circular reference?");
        throw new v(a10.toString());
    }

    public abstract e0 j();

    public abstract e0 k();

    public final String q() {
        return a0.h(this.f20528a, this.f20529b, this.f20530c, this.f20531d);
    }

    public abstract e0 s(String str);

    public abstract e0 v();

    public final int y() {
        int i10 = this.f20528a;
        if (i10 != 0) {
            return this.f20529b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
