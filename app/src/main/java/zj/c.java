package zj;

import java.util.ArrayList;
import yj.b;

/* loaded from: classes2.dex */
public final class c extends k<oj.c> {

    /* renamed from: d */
    public Long f32481d;

    /* renamed from: c */
    public final int f32480c = 2;

    /* renamed from: e */
    public final ArrayList<b.a> f32482e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<Integer> f32483f = new ArrayList<>(10000);

    @Override // zj.k
    public final int a() {
        return this.f32480c;
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        if (j10 > this.f32505a) {
            return;
        }
        int i10 = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        if (i10 <= 0) {
            return;
        }
        if (this.f32481d == null) {
            this.f32481d = Long.valueOf(j10);
        }
        this.f32483f.add(Integer.valueOf(i10));
    }

    @Override // zj.k
    public final void c(b.a aVar) {
        this.f32481d = null;
        this.f32482e.clear();
        this.f32483f.clear();
    }

    @Override // zj.k
    public final void d(b.a aVar) {
        Long l10 = this.f32481d;
        if (l10 != null) {
            long longValue = l10.longValue();
            if (this.f32483f.isEmpty()) {
                return;
            }
            int i10 = 100;
            if (!this.f32482e.isEmpty()) {
                long j10 = this.f32482e.get(0).f31782c;
                if (j10 > 0) {
                    i10 = 1000 / ((int) j10);
                }
            }
            this.f32506b.add(new oj.c(i10, longValue, this.f32483f));
        }
    }
}
