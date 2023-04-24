package com.topstep.fitcloud.pro.ui.device.settings;

import kotlin.Metadata;
import nh.e;
import og.l1;
import og.m1;
import og.t;
import tl.l;
import xl.d;
import zl.c;

@Metadata
/* loaded from: classes2.dex */
public final class QrCodeSettingsViewModel extends e<l> {

    /* renamed from: h */
    public final long f11275h;

    /* renamed from: i */
    public final l1 f11276i;

    /* renamed from: j */
    public final t f11277j;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel", f = "QrCodeSettingsFragment.kt", l = {276}, m = "saveQrCodeContent")
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: d */
        public /* synthetic */ Object f11278d;

        /* renamed from: f */
        public int f11280f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(dVar);
            QrCodeSettingsViewModel.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f11278d = obj;
            this.f11280f |= Integer.MIN_VALUE;
            return QrCodeSettingsViewModel.this.j(0, null, this);
        }
    }

    public QrCodeSettingsViewModel(long j10, m1 m1Var, t tVar) {
        gm.l.f(tVar, "deviceManager");
        this.f11275h = j10;
        this.f11276i = m1Var;
        this.f11277j = tVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|12|(1:14)(1:16)))|26|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0042, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0043, code lost:
        p000do.a.f13275a.q(r7);
        r8 = mf.a0.f(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable i(int r7, xl.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof bi.x0
            if (r0 == 0) goto L13
            r0 = r8
            bi.x0 r0 = (bi.x0) r0
            int r1 = r0.f4382f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4382f = r1
            goto L18
        L13:
            bi.x0 r0 = new bi.x0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4380d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f4382f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r8)     // Catch: java.lang.Throwable -> L42
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r8)
            og.l1 r8 = r6.f11276i     // Catch: java.lang.Throwable -> L42
            long r4 = r6.f11275h     // Catch: java.lang.Throwable -> L42
            r0.f4382f = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r8 = r8.a(r4, r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r8 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L42
            goto L4c
        L42:
            r7 = move-exception
            do.a$b r8 = p000do.a.f13275a
            r8.q(r7)
            tl.g$a r8 = mf.a0.f(r7)
        L4c:
            boolean r7 = r8 instanceof tl.g.a
            if (r7 == 0) goto L51
            r8 = 0
        L51:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel.i(int, xl.d):java.io.Serializable");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0046, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0047, code lost:
        p000do.a.f13275a.q(r8);
        mf.a0.f(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(int r8, java.lang.String r9, xl.d<? super tl.l> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel.a
            if (r0 == 0) goto L13
            r0 = r10
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel$a r0 = (com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel.a) r0
            int r1 = r0.f11280f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11280f = r1
            goto L18
        L13:
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel$a r0 = new com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel$a
            r0.<init>(r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f11278d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f11280f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L46
            goto L43
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            mf.a0.k(r10)
            og.l1 r1 = r7.f11276i     // Catch: java.lang.Throwable -> L46
            long r3 = r7.f11275h     // Catch: java.lang.Throwable -> L46
            r6.f11280f = r2     // Catch: java.lang.Throwable -> L46
            r2 = r3
            r4 = r8
            r5 = r9
            java.lang.Object r8 = r1.b(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r8 != r0) goto L43
            return r0
        L43:
            tl.l r8 = tl.l.f28297a     // Catch: java.lang.Throwable -> L46
            goto L4f
        L46:
            r8 = move-exception
            do.a$b r9 = p000do.a.f13275a
            r9.q(r8)
            mf.a0.f(r8)
        L4f:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel.j(int, java.lang.String, xl.d):java.lang.Object");
    }
}
