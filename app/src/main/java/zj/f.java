package zj;

import bi.r;
import oj.p;

/* loaded from: classes2.dex */
public final class f extends k {

    /* renamed from: c */
    public final /* synthetic */ int f32488c;

    /* renamed from: d */
    public final int f32489d;

    public f(int i10) {
        this.f32488c = i10;
        if (i10 != 1) {
            this.f32489d = 1;
        } else {
            this.f32489d = 4;
        }
    }

    @Override // zj.k
    public final int a() {
        switch (this.f32488c) {
            case 0:
                return this.f32489d;
            default:
                return this.f32489d;
        }
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        short k10;
        int i10;
        switch (this.f32488c) {
            case 0:
                if (j10 <= this.f32505a && (i10 = bArr[0] & 255) > 0) {
                    this.f32506b.add(new oj.f(i10, j10));
                    return;
                }
                return;
            default:
                if (j10 <= this.f32505a && (k10 = r.k(bArr, 2)) > 0) {
                    this.f32506b.add(new p(j10, k10 / 100.0f, r.k(bArr, 0) / 100.0f));
                    return;
                }
                return;
        }
    }
}
