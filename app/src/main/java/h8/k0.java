package h8;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import g8.a;

/* loaded from: classes.dex */
public final class k0 implements g9.c {

    /* renamed from: a */
    public final d f15975a;

    /* renamed from: b */
    public final int f15976b;

    /* renamed from: c */
    public final a f15977c;

    /* renamed from: d */
    public final long f15978d;

    /* renamed from: e */
    public final long f15979e;

    public k0(d dVar, int i10, a aVar, long j10, long j11) {
        this.f15975a = dVar;
        this.f15976b = i10;
        this.f15977c = aVar;
        this.f15978d = j10;
        this.f15979e = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0027, code lost:
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0037, code lost:
        if (r2 == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i8.e a(h8.c0 r6, i8.b r7, int r8) {
        /*
            i8.x0 r7 = r7.f16597u
            r0 = 0
            if (r7 != 0) goto L7
            r7 = r0
            goto L9
        L7:
            i8.e r7 = r7.f16729d
        L9:
            if (r7 == 0) goto L41
            boolean r1 = r7.f16631b
            if (r1 == 0) goto L41
            int[] r1 = r7.f16633d
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L2a
            int[] r1 = r7.f16635f
            if (r1 != 0) goto L1a
            goto L3a
        L1a:
            r4 = 0
        L1b:
            int r5 = r1.length
            if (r4 >= r5) goto L26
            r5 = r1[r4]
            if (r5 != r8) goto L23
            goto L27
        L23:
            int r4 = r4 + 1
            goto L1b
        L26:
            r2 = 0
        L27:
            if (r2 == 0) goto L3a
            goto L41
        L2a:
            r4 = 0
        L2b:
            int r5 = r1.length
            if (r4 >= r5) goto L36
            r5 = r1[r4]
            if (r5 != r8) goto L33
            goto L37
        L33:
            int r4 = r4 + 1
            goto L2b
        L36:
            r2 = 0
        L37:
            if (r2 != 0) goto L3a
            goto L41
        L3a:
            int r6 = r6.f15918l
            int r8 = r7.f16634e
            if (r6 >= r8) goto L41
            return r7
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.k0.a(h8.c0, i8.b, int):i8.e");
    }

    @Override // g9.c
    public final void d(g9.t tVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        Exception exc;
        int i13;
        long j10;
        long j11;
        int i14;
        boolean z11;
        if (!this.f15975a.b()) {
            return;
        }
        i8.r rVar = i8.q.a().f16703a;
        if (rVar != null && !rVar.f16705b) {
            return;
        }
        c0 c0Var = (c0) this.f15975a.f15934j.get(this.f15977c);
        if (c0Var != null) {
            a.e eVar = c0Var.f15908b;
            if (eVar instanceof i8.b) {
                i8.b bVar = (i8.b) eVar;
                boolean z12 = true;
                int i15 = 0;
                if (this.f15978d > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i16 = bVar.f16592p;
                if (rVar != null) {
                    z10 &= rVar.f16706c;
                    int i17 = rVar.f16707d;
                    int i18 = rVar.f16708e;
                    i10 = rVar.f16704a;
                    if (bVar.f16597u != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && !bVar.c()) {
                        i8.e a10 = a(c0Var, bVar, this.f15976b);
                        if (a10 == null) {
                            return;
                        }
                        z12 = (!a10.f16632c || this.f15978d <= 0) ? false : false;
                        i18 = a10.f16634e;
                        z10 = z12;
                    }
                    i11 = i17;
                    i12 = i18;
                } else {
                    i10 = 0;
                    i11 = 5000;
                    i12 = 100;
                }
                d dVar = this.f15975a;
                if (tVar.b()) {
                    i13 = 0;
                } else {
                    if (tVar.f15060d) {
                        i15 = 100;
                    } else {
                        synchronized (tVar.f15057a) {
                            exc = tVar.f15062f;
                        }
                        if (exc instanceof g8.b) {
                            Status status = ((g8.b) exc).f15016a;
                            i15 = status.f6057b;
                            f8.a aVar = status.f6060e;
                            if (aVar != null) {
                                i13 = aVar.f14170b;
                            }
                        } else {
                            i15 = 101;
                        }
                    }
                    i13 = -1;
                }
                if (z10) {
                    long j12 = this.f15978d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i14 = (int) (SystemClock.elapsedRealtime() - this.f15979e);
                    j10 = j12;
                    j11 = currentTimeMillis;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i14 = -1;
                }
                i8.m mVar = new i8.m(this.f15976b, i15, i13, j10, j11, null, null, i16, i14);
                long j13 = i11;
                v8.j jVar = dVar.f15938n;
                jVar.sendMessage(jVar.obtainMessage(18, new l0(mVar, i10, j13, i12)));
            }
        }
    }
}
