package y;

import a0.d2;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class f extends s0 {

    /* renamed from: a */
    public final d2 f30695a;

    /* renamed from: b */
    public final long f30696b;

    /* renamed from: c */
    public final int f30697c;

    /* renamed from: d */
    public final Matrix f30698d;

    public f(d2 d2Var, long j10, int i10, Matrix matrix) {
        if (d2Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f30695a = d2Var;
        this.f30696b = j10;
        this.f30697c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f30698d = matrix;
    }

    @Override // y.s0, y.o0
    public final d2 b() {
        return this.f30695a;
    }

    @Override // y.s0, y.o0
    public final int c() {
        return this.f30697c;
    }

    @Override // y.s0, y.o0
    public final long d() {
        return this.f30696b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            return this.f30695a.equals(s0Var.b()) && this.f30696b == s0Var.d() && this.f30697c == s0Var.c() && this.f30698d.equals(s0Var.f());
        }
        return false;
    }

    @Override // y.s0
    public final Matrix f() {
        return this.f30698d;
    }

    public final int hashCode() {
        long j10 = this.f30696b;
        return ((((((this.f30695a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f30697c) * 1000003) ^ this.f30698d.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ImmutableImageInfo{tagBundle=");
        a10.append(this.f30695a);
        a10.append(", timestamp=");
        a10.append(this.f30696b);
        a10.append(", rotationDegrees=");
        a10.append(this.f30697c);
        a10.append(", sensorToBufferTransformMatrix=");
        a10.append(this.f30698d);
        a10.append("}");
        return a10.toString();
    }
}
