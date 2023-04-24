package c7;

import java.util.ArrayList;
import java.util.Iterator;
import mf.a0;
import pm.e0;

@zl.e(c = "com.github.kilnn.sport.utils.PermissionsMonitor$startCheck$1", f = "PermissionsMonitor.kt", l = {78, 82}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4560e;

    /* renamed from: f */
    public /* synthetic */ Object f4561f;

    /* renamed from: g */
    public final /* synthetic */ h f4562g;

    @zl.e(c = "com.github.kilnn.sport.utils.PermissionsMonitor$startCheck$1$1", f = "PermissionsMonitor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ h f4563e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f4563e = hVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f4563e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ArrayList<i> arrayList = this.f4563e.f4567d;
            if (arrayList != null) {
                Iterator<i> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            ArrayList<i> arrayList2 = this.f4563e.f4567d;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            h hVar = this.f4563e;
            hVar.f4567d = null;
            hVar.f4568e = null;
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f4562g = hVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((g) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        g gVar = new g(this.f4562g, dVar);
        gVar.f4561f = obj;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x007d, code lost:
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0050 -> B:49:0x0053). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r12) {
        /*
            r11 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r11.f4560e
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.String r5 = "PermissionsMonitor"
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            mf.a0.k(r12)
            goto La8
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            java.lang.Object r1 = r11.f4561f
            pm.e0 r1 = (pm.e0) r1
            mf.a0.k(r12)
            r12 = r11
            goto L53
        L25:
            mf.a0.k(r12)
            java.lang.Object r12 = r11.f4561f
            pm.e0 r12 = (pm.e0) r12
            do.a$b r1 = p000do.a.f13275a
            r1.t(r5)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = "startCheck"
            r1.b(r7, r6)
            r1 = r12
            r12 = r11
        L3a:
            do.a$b r6 = p000do.a.f13275a
            r6.t(r5)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r8 = "checking..."
            r6.b(r8, r7)
            r6 = 3000(0xbb8, double:1.482E-320)
            r12.f4561f = r1
            r12.f4560e = r3
            java.lang.Object r6 = mf.a0.g(r6, r12)
            if (r6 != r0) goto L53
            return r0
        L53:
            c7.h r6 = r12.f4562g
            android.content.Context r7 = r6.f4564a
            java.lang.String[] r6 = r6.f4565b
            int r8 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r8)
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.String r8 = "context"
            gm.l.f(r7, r8)
            java.lang.String r8 = "permissions"
            gm.l.f(r6, r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 >= r9) goto L71
            goto L82
        L71:
            int r8 = r6.length
            r9 = 0
        L73:
            if (r9 >= r8) goto L82
            r10 = r6[r9]
            int r10 = y0.a.a(r7, r10)
            if (r10 == 0) goto L7f
            r6 = 0
            goto L83
        L7f:
            int r9 = r9 + 1
            goto L73
        L82:
            r6 = 1
        L83:
            boolean r7 = bi.r.D(r1)
            if (r7 == 0) goto L8b
            if (r6 == 0) goto L3a
        L8b:
            if (r6 == 0) goto La8
            wm.c r1 = pm.o0.f24381a
            pm.p1 r1 = um.q.f28935a
            pm.p1 r1 = r1.q0()
            c7.g$a r3 = new c7.g$a
            c7.h r6 = r12.f4562g
            r7 = 0
            r3.<init>(r6, r7)
            r12.f4561f = r7
            r12.f4560e = r2
            java.lang.Object r12 = bi.z0.s(r12, r1, r3)
            if (r12 != r0) goto La8
            return r0
        La8:
            do.a$b r12 = p000do.a.f13275a
            r12.t(r5)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "finishCheck"
            r12.b(r1, r0)
            tl.l r12 = tl.l.f28297a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.g.t(java.lang.Object):java.lang.Object");
    }
}
