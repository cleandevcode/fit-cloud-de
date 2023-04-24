package com.topstep.fitcloud.pro.ui;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import xl.d;
import yg.m;
import zl.c;
import zl.e;

@Metadata
/* loaded from: classes2.dex */
public final class LaunchNavigationViewMode extends ih.a {

    /* renamed from: f */
    public m f10235f;

    @e(c = "com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode", f = "LaunchActivity.kt", l = {55}, m = "getLaunchNavigation")
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: d */
        public LaunchNavigationViewMode f10236d;

        /* renamed from: e */
        public /* synthetic */ Object f10237e;

        /* renamed from: g */
        public int f10239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(dVar);
            LaunchNavigationViewMode.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f10237e = obj;
            this.f10239g |= Integer.MIN_VALUE;
            return LaunchNavigationViewMode.this.f(this);
        }
    }

    public LaunchNavigationViewMode(Context context) {
        super((Application) context);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(xl.d<? super ih.u> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode.a
            if (r0 == 0) goto L13
            r0 = r6
            com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode$a r0 = (com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode.a) r0
            int r1 = r0.f10239g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10239g = r1
            goto L18
        L13:
            com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode$a r0 = new com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10237e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f10239g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode r0 = r0.f10236d
            mf.a0.k(r6)     // Catch: java.lang.Throwable -> L2a
            goto L47
        L2a:
            r6 = move-exception
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            mf.a0.k(r6)
            yg.m r6 = r5.f10235f     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L54
            r0.f10236d = r5     // Catch: java.lang.Throwable -> L52
            r0.f10239g = r3     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r6.l(r0)     // Catch: java.lang.Throwable -> L52
            if (r6 != r1) goto L46
            return r1
        L46:
            r0 = r5
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2a
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L2a
            goto L64
        L52:
            r6 = move-exception
            goto L5a
        L54:
            java.lang.String r6 = "publicStorage"
            gm.l.l(r6)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L52
        L5a:
            r0 = r5
        L5b:
            do.a$b r1 = p000do.a.f13275a
            r1.q(r6)
            tl.g$a r6 = mf.a0.f(r6)
        L64:
            java.lang.Throwable r1 = tl.g.a(r6)
            boolean r2 = r1 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L86
            boolean r1 = r6 instanceof tl.g.a
            if (r1 == 0) goto L71
            goto L72
        L71:
            r4 = r6
        L72:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L7b
            boolean r6 = r4.booleanValue()
            goto L7c
        L7b:
            r6 = 0
        L7c:
            if (r6 == 0) goto L83
            ih.u r6 = r0.e()
            return r6
        L83:
            ih.u$b r6 = ih.u.b.f16877a
            return r6
        L86:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.LaunchNavigationViewMode.f(xl.d):java.lang.Object");
    }
}
