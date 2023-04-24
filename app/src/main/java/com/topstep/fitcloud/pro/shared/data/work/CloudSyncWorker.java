package com.topstep.fitcloud.pro.shared.data.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import gm.l;
import kotlin.Metadata;
import xl.d;
import zl.c;
import zl.e;

@Metadata
/* loaded from: classes2.dex */
public final class CloudSyncWorker extends CoroutineWorker {

    /* renamed from: i */
    public final ch.a f10119i;

    @e(c = "com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker", f = "CloudSyncWorker.kt", l = {28}, m = "doWork")
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: d */
        public /* synthetic */ Object f10120d;

        /* renamed from: f */
        public int f10122f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(dVar);
            CloudSyncWorker.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f10120d = obj;
            this.f10122f |= Integer.MIN_VALUE;
            return CloudSyncWorker.this.h(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudSyncWorker(Context context, WorkerParameters workerParameters, ch.a aVar) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        l.f(aVar, "cloudSyncRepository");
        this.f10119i = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0035  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(xl.d<? super androidx.work.ListenableWorker.a> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker.a
            if (r0 == 0) goto L13
            r0 = r10
            com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker$a r0 = (com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker.a) r0
            int r1 = r0.f10122f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10122f = r1
            goto L18
        L13:
            com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker$a r0 = new com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f10120d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f10122f
            java.lang.String r3 = "CloudSyncWorker"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            mf.a0.k(r10)     // Catch: java.lang.Exception -> L29 ig.b -> L2b
            goto L7b
        L29:
            r10 = move-exception
            goto L81
        L2b:
            r10 = move-exception
            goto L8f
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            mf.a0.k(r10)
            androidx.work.WorkerParameters r10 = r9.f3619b
            androidx.work.b r10 = r10.f3628b
            r5 = 0
            java.util.HashMap r10 = r10.f3648a
            java.lang.String r2 = "userId"
            java.lang.Object r10 = r10.get(r2)
            boolean r2 = r10 instanceof java.lang.Long
            if (r2 == 0) goto L50
            java.lang.Long r10 = (java.lang.Long) r10
            long r5 = r10.longValue()
        L50:
            boolean r10 = hh.b.g(r5)
            if (r10 == 0) goto L9d
            boolean r10 = hh.b.f(r5)
            if (r10 != 0) goto L9d
            do.a$b r10 = p000do.a.f13275a
            r10.t(r3)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r8 = 0
            r2[r8] = r7
            java.lang.String r7 = "userId:%d"
            r10.h(r7, r2)
            ch.a r10 = r9.f10119i     // Catch: java.lang.Exception -> L29 ig.b -> L2b
            r0.f10122f = r4     // Catch: java.lang.Exception -> L29 ig.b -> L2b
            java.lang.Object r10 = r10.i(r5, r8, r0)     // Catch: java.lang.Exception -> L29 ig.b -> L2b
            if (r10 != r1) goto L7b
            return r1
        L7b:
            androidx.work.ListenableWorker$a$c r10 = new androidx.work.ListenableWorker$a$c     // Catch: java.lang.Exception -> L29 ig.b -> L2b
            r10.<init>()     // Catch: java.lang.Exception -> L29 ig.b -> L2b
            goto L9c
        L81:
            do.a$b r0 = p000do.a.f13275a
            r0.t(r3)
            r0.q(r10)
            androidx.work.ListenableWorker$a$a r10 = new androidx.work.ListenableWorker$a$a
            r10.<init>()
            goto L9c
        L8f:
            do.a$b r0 = p000do.a.f13275a
            r0.t(r3)
            r0.q(r10)
            androidx.work.ListenableWorker$a$c r10 = new androidx.work.ListenableWorker$a$c
            r10.<init>()
        L9c:
            return r10
        L9d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "错误的userId"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker.h(xl.d):java.lang.Object");
    }
}
