package com.huawei.hms.scankit.p;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class Tc implements Sc {

    /* renamed from: a */
    private final int f7724a;

    /* renamed from: b */
    private final int f7725b;

    /* renamed from: c */
    private final long f7726c;

    /* renamed from: d */
    private final long f7727d;

    /* renamed from: e */
    private final float f7728e;

    /* renamed from: f */
    private final Interpolator f7729f;

    public Tc(int i10, int i11, long j10, long j11, Interpolator interpolator) {
        this.f7724a = i10;
        this.f7725b = i11;
        this.f7726c = j10;
        this.f7727d = j11;
        this.f7728e = (float) (j11 - j10);
        this.f7729f = interpolator;
    }

    private int a(Pc pc2) {
        int i10 = this.f7725b;
        return i10 == -1 ? pc2.e() : i10;
    }

    private int b(Pc pc2) {
        int i10 = this.f7724a;
        return i10 == -1 ? pc2.a() : i10;
    }

    private int c(Pc pc2) {
        return a(pc2) - b(pc2);
    }

    @Override // com.huawei.hms.scankit.p.Sc
    public void a(Pc pc2, long j10) {
        if (j10 < this.f7726c || j10 > this.f7727d || Float.compare(this.f7728e, 0.0f) == 0) {
            return;
        }
        pc2.a((int) ((c(pc2) * this.f7729f.getInterpolation(((float) (j10 - this.f7726c)) / this.f7728e)) + b(pc2)));
    }
}
