package zj;

import bi.r;
import java.util.GregorianCalendar;
import oj.p;

/* loaded from: classes2.dex */
public final class g extends k {

    /* renamed from: c */
    public final /* synthetic */ int f32490c;

    /* renamed from: d */
    public final GregorianCalendar f32491d;

    /* renamed from: e */
    public final int f32492e;

    public g(int i10) {
        this.f32490c = i10;
        if (i10 != 1) {
            this.f32491d = new GregorianCalendar();
            this.f32492e = 5;
            return;
        }
        this.f32491d = new GregorianCalendar();
        this.f32492e = 8;
    }

    @Override // zj.k
    public final int a() {
        switch (this.f32490c) {
            case 0:
                return this.f32492e;
            default:
                return this.f32492e;
        }
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        short k10;
        int i10;
        switch (this.f32490c) {
            case 0:
                long e10 = xj.a.e(bArr, 0, this.f32491d);
                if (e10 <= this.f32505a && (i10 = bArr[4] & 255) > 0) {
                    this.f32506b.add(new oj.f(i10, e10));
                    return;
                }
                return;
            default:
                long e11 = xj.a.e(bArr, 0, this.f32491d);
                if (e11 <= this.f32505a && (k10 = r.k(bArr, 6)) > 0) {
                    this.f32506b.add(new p(e11, k10 / 100.0f, r.k(bArr, 4) / 100.0f));
                    return;
                }
                return;
        }
    }
}
