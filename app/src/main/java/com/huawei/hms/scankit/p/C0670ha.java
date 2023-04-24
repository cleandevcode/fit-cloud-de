package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.ha */
/* loaded from: classes.dex */
final class C0670ha {

    /* renamed from: a */
    private final C0736y f7911a;

    /* renamed from: b */
    private final com.huawei.hms.scankit.aiscan.common.z f7912b;

    /* renamed from: c */
    private final com.huawei.hms.scankit.aiscan.common.z f7913c;

    /* renamed from: d */
    private final com.huawei.hms.scankit.aiscan.common.z f7914d;

    /* renamed from: e */
    private final com.huawei.hms.scankit.aiscan.common.z f7915e;

    /* renamed from: f */
    private final int f7916f;

    /* renamed from: g */
    private final int f7917g;

    /* renamed from: h */
    private final int f7918h;

    /* renamed from: i */
    private final int f7919i;

    public C0670ha(C0670ha c0670ha) {
        this.f7911a = c0670ha.f7911a;
        this.f7912b = c0670ha.g();
        this.f7913c = c0670ha.a();
        this.f7914d = c0670ha.h();
        this.f7915e = c0670ha.b();
        this.f7916f = c0670ha.e();
        this.f7917g = c0670ha.c();
        this.f7918h = c0670ha.f();
        this.f7919i = c0670ha.d();
    }

    public C0670ha(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, com.huawei.hms.scankit.aiscan.common.z zVar4) {
        boolean z10 = false;
        boolean z11 = zVar == null || zVar2 == null;
        z10 = (zVar3 == null || zVar4 == null) ? true : true;
        if (z11 && z10) {
            throw C0628a.a();
        }
        if (z11) {
            zVar = new com.huawei.hms.scankit.aiscan.common.z(0.0f, zVar3.c());
            zVar2 = new com.huawei.hms.scankit.aiscan.common.z(0.0f, zVar4.c());
        } else if (z10) {
            zVar3 = new com.huawei.hms.scankit.aiscan.common.z(c0736y.d() - 1, zVar.c());
            zVar4 = new com.huawei.hms.scankit.aiscan.common.z(c0736y.d() - 1, zVar2.c());
        }
        this.f7911a = c0736y;
        this.f7912b = zVar;
        this.f7913c = zVar2;
        this.f7914d = zVar3;
        this.f7915e = zVar4;
        this.f7916f = (int) Math.min(zVar.b(), zVar2.b());
        this.f7917g = (int) Math.max(zVar3.b(), zVar4.b());
        this.f7918h = (int) Math.min(zVar.c(), zVar3.c());
        this.f7919i = (int) Math.max(zVar2.c(), zVar4.c());
    }

    public static C0670ha a(C0670ha c0670ha, C0670ha c0670ha2) {
        return c0670ha == null ? c0670ha2 : c0670ha2 == null ? c0670ha : new C0670ha(c0670ha.f7911a, c0670ha.f7912b, c0670ha.f7913c, c0670ha2.f7914d, c0670ha2.f7915e);
    }

    public com.huawei.hms.scankit.aiscan.common.z a() {
        return this.f7913c;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.huawei.hms.scankit.p.C0670ha a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            com.huawei.hms.scankit.aiscan.common.z r0 = r12.f7912b
            com.huawei.hms.scankit.aiscan.common.z r1 = r12.f7913c
            com.huawei.hms.scankit.aiscan.common.z r2 = r12.f7914d
            com.huawei.hms.scankit.aiscan.common.z r3 = r12.f7915e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.c()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.huawei.hms.scankit.aiscan.common.z r13 = new com.huawei.hms.scankit.aiscan.common.z
            float r4 = r4.b()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            com.huawei.hms.scankit.aiscan.common.z r13 = r12.f7913c
            goto L34
        L32:
            com.huawei.hms.scankit.aiscan.common.z r13 = r12.f7915e
        L34:
            float r0 = r13.c()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.huawei.hms.scankit.p.y r14 = r12.f7911a
            int r14 = r14.b()
            if (r0 < r14) goto L4a
            com.huawei.hms.scankit.p.y r14 = r12.f7911a
            int r14 = r14.b()
            int r0 = r14 + (-1)
        L4a:
            com.huawei.hms.scankit.aiscan.common.z r14 = new com.huawei.hms.scankit.aiscan.common.z
            float r13 = r13.b()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            com.huawei.hms.scankit.p.ha r13 = new com.huawei.hms.scankit.p.ha
            com.huawei.hms.scankit.p.y r7 = r12.f7911a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0670ha.a(int, int, boolean):com.huawei.hms.scankit.p.ha");
    }

    public com.huawei.hms.scankit.aiscan.common.z b() {
        return this.f7915e;
    }

    public int c() {
        return this.f7917g;
    }

    public int d() {
        return this.f7919i;
    }

    public int e() {
        return this.f7916f;
    }

    public int f() {
        return this.f7918h;
    }

    public com.huawei.hms.scankit.aiscan.common.z g() {
        return this.f7912b;
    }

    public com.huawei.hms.scankit.aiscan.common.z h() {
        return this.f7914d;
    }
}
