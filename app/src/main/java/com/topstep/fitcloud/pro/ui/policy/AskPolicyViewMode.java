package com.topstep.fitcloud.pro.ui.policy;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import xl.d;
import yg.m;
import zl.c;
import zl.e;

@Metadata
/* loaded from: classes2.dex */
public final class AskPolicyViewMode extends ih.a {

    /* renamed from: f */
    public m f11720f;

    @e(c = "com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode", f = "AskPolicyFragment.kt", l = {95}, m = "agreePolicy")
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: d */
        public AskPolicyViewMode f11721d;

        /* renamed from: e */
        public /* synthetic */ Object f11722e;

        /* renamed from: g */
        public int f11724g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(dVar);
            AskPolicyViewMode.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f11722e = obj;
            this.f11724g |= Integer.MIN_VALUE;
            return AskPolicyViewMode.this.f(this);
        }
    }

    public AskPolicyViewMode(Context context) {
        super((Application) context);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(xl.d<? super ih.u> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode.a
            if (r0 == 0) goto L13
            r0 = r5
            com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode$a r0 = (com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode.a) r0
            int r1 = r0.f11724g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11724g = r1
            goto L18
        L13:
            com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode$a r0 = new com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11722e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f11724g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode r0 = r0.f11721d
            mf.a0.k(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            mf.a0.k(r5)
            yg.m r5 = r4.f11720f
            if (r5 == 0) goto L49
            r0.f11721d = r4
            r0.f11724g = r3
            java.lang.Object r5 = r5.p(r3, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            ih.u r5 = r0.e()
            return r5
        L49:
            java.lang.String r5 = "publicStorage"
            gm.l.l(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.policy.AskPolicyViewMode.f(xl.d):java.lang.Object");
    }
}
