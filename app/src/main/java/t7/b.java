package t7;

import android.graphics.Color;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends e<c> implements x7.a {

    /* renamed from: u */
    public int f27797u;

    /* renamed from: v */
    public int f27798v;

    /* renamed from: w */
    public int f27799w;

    /* renamed from: x */
    public int f27800x;

    /* renamed from: y */
    public String[] f27801y;

    public b(ArrayList arrayList) {
        super("DataSet", arrayList);
        this.f27797u = 1;
        this.f27798v = Color.rgb(215, 215, 215);
        this.f27799w = -16777216;
        this.f27800x = 120;
        this.f27801y = new String[]{"Stack"};
        this.f27806t = Color.rgb(0, 0, 0);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            float[] fArr = ((c) arrayList.get(i10)).f27802d;
            if (fArr != null && fArr.length > this.f27797u) {
                this.f27797u = fArr.length;
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            float[] fArr2 = ((c) arrayList.get(i11)).f27802d;
        }
    }

    @Override // x7.a
    public final int E() {
        return this.f27798v;
    }

    @Override // x7.a
    public final int K() {
        return this.f27797u;
    }

    @Override // x7.a
    public final int N() {
        return this.f27800x;
    }

    @Override // x7.a
    public final boolean Q() {
        return this.f27797u > 1;
    }

    @Override // x7.a
    public final String[] S() {
        return this.f27801y;
    }

    @Override // x7.a
    public final int f() {
        return this.f27799w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001e, code lost:
        if (r0 > r2.f27833p) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0032, code lost:
        if (r0 > r2.f27833p) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0034, code lost:
        r2.f27833p = r0;
     */
    @Override // t7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0(t7.k r3) {
        /*
            r2 = this;
            t7.c r3 = (t7.c) r3
            if (r3 == 0) goto L39
            float r0 = r3.f27821a
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L39
            float[] r0 = r3.f27802d
            if (r0 != 0) goto L21
            float r0 = r3.f27821a
            float r1 = r2.f27834q
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L1a
            r2.f27834q = r0
        L1a:
            float r1 = r2.f27833p
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L36
            goto L34
        L21:
            float r0 = r3.f27804f
            float r0 = -r0
            float r1 = r2.f27834q
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2c
            r2.f27834q = r0
        L2c:
            float r0 = r3.f27805g
            float r1 = r2.f27833p
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L36
        L34:
            r2.f27833p = r0
        L36:
            r2.k0(r3)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.b.j0(t7.k):void");
    }

    @Override // x7.a
    public final void m() {
    }
}
