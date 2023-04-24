package com.topstep.fitcloud.pro.ui.device.bind;

import al.j;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import bi.r;
import bi.z0;
import fl.k0;
import fl.n;
import fm.p;
import fm.q;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import mf.a0;
import of.o;
import ph.k;
import ph.m;
import pm.e0;
import pm.g1;
import pm.o0;
import pm.z1;
import rh.b0;
import rh.y;
import sm.f;
import sm.n0;
import sm.u0;
import tl.l;
import tm.o;
import uh.d0;
import uh.f0;
import uh.g0;
import yk.a;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class ScannerHelper implements g {

    /* renamed from: a */
    public final Context f10854a;

    /* renamed from: b */
    public final BluetoothManager f10855b;

    /* renamed from: c */
    public final hj.b f10856c;

    /* renamed from: d */
    public z1 f10857d;

    /* renamed from: e */
    public j f10858e;

    /* renamed from: f */
    public boolean f10859f;

    /* renamed from: g */
    public int f10860g;

    /* renamed from: h */
    public a f10861h;

    /* renamed from: i */
    public final f<Boolean> f10862i;

    /* renamed from: j */
    public final n0 f10863j;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b(dj.a aVar);

        void c();

        void d();

        void e();

        void f();

        void g(boolean z10);
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper$flowPermissionsState$1", f = "ScannerHelper.kt", l = {48, 51, 54, 55}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<sm.g<? super Boolean>, xl.d<? super l>, Object> {

        /* renamed from: e */
        public boolean f10864e;

        /* renamed from: f */
        public int f10865f;

        /* renamed from: g */
        public /* synthetic */ Object f10866g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            ScannerHelper.this = r1;
        }

        @Override // fm.p
        public final Object A(sm.g<? super Boolean> gVar, xl.d<? super l> dVar) {
            return ((b) p(gVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f10866g = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x00a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00b2 A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r9) {
            /*
                r8 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r8.f10865f
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L32
                if (r1 == r4) goto L29
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                mf.a0.k(r9)
                goto Lb3
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f10866g
                sm.g r1 = (sm.g) r1
                mf.a0.k(r9)
                r9 = r8
                goto La5
            L29:
                java.lang.Object r1 = r8.f10866g
                sm.g r1 = (sm.g) r1
                mf.a0.k(r9)
                r9 = r8
                goto L63
            L32:
                boolean r1 = r8.f10864e
                java.lang.Object r6 = r8.f10866g
                sm.g r6 = (sm.g) r6
                mf.a0.k(r9)
                goto L5f
            L3c:
                mf.a0.k(r9)
                java.lang.Object r9 = r8.f10866g
                r6 = r9
                sm.g r6 = (sm.g) r6
                si.f r9 = si.f.f27071a
                com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper r1 = com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.this
                android.content.Context r1 = r1.f10854a
                boolean r1 = r9.b(r1)
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
                r8.f10866g = r6
                r8.f10864e = r1
                r8.f10865f = r5
                java.lang.Object r9 = r6.n(r9, r8)
                if (r9 != r0) goto L5f
                return r0
            L5f:
                if (r1 != 0) goto Lb3
                r9 = r8
                r1 = r6
            L63:
                xl.f r6 = r9.f32509b
                gm.l.c(r6)
                int r7 = pm.g1.K
                pm.g1$b r7 = pm.g1.b.f24341a
                xl.f$b r6 = r6.b(r7)
                pm.g1 r6 = (pm.g1) r6
                if (r6 == 0) goto L7c
                boolean r6 = r6.a()
                if (r6 != r5) goto L7c
                r6 = 1
                goto L7d
            L7c:
                r6 = 0
            L7d:
                if (r6 == 0) goto L98
                si.f r6 = si.f.f27071a
                com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper r7 = com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.this
                android.content.Context r7 = r7.f10854a
                boolean r6 = r6.b(r7)
                if (r6 != 0) goto L98
                r6 = 1000(0x3e8, double:4.94E-321)
                r9.f10866g = r1
                r9.f10865f = r4
                java.lang.Object r6 = mf.a0.g(r6, r9)
                if (r6 != r0) goto L63
                return r0
            L98:
                r4 = 500(0x1f4, double:2.47E-321)
                r9.f10866g = r1
                r9.f10865f = r3
                java.lang.Object r3 = mf.a0.g(r4, r9)
                if (r3 != r0) goto La5
                return r0
            La5:
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                r4 = 0
                r9.f10866g = r4
                r9.f10865f = r2
                java.lang.Object r9 = r1.n(r3, r9)
                if (r9 != r0) goto Lb3
                return r0
            Lb3:
                tl.l r9 = tl.l.f28297a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper.b.t(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper$flowState$1", f = "ScannerHelper.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements q<Boolean, Boolean, xl.d<? super Integer>, Object> {

        /* renamed from: e */
        public /* synthetic */ boolean f10868e;

        /* renamed from: f */
        public /* synthetic */ boolean f10869f;

        public c(xl.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // fm.q
        public final Object j(Boolean bool, Boolean bool2, xl.d<? super Integer> dVar) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            c cVar = new c(dVar);
            cVar.f10868e = booleanValue;
            cVar.f10869f = booleanValue2;
            return cVar.t(l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            return new Integer(!this.f10869f ? 0 : !this.f10868e ? 1 : 2);
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper$onCreate$1", f = "ScannerHelper.kt", l = {83}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f10870e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ ScannerHelper f10872a;

            public a(ScannerHelper scannerHelper) {
                this.f10872a = scannerHelper;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                this.f10872a.a(((Number) obj).intValue(), true);
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            ScannerHelper.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((d) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10870e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                ScannerHelper scannerHelper = ScannerHelper.this;
                n0 n0Var = scannerHelper.f10863j;
                a aVar2 = new a(scannerHelper);
                this.f10870e = 1;
                if (n0Var.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return l.f28297a;
        }
    }

    public ScannerHelper(Context context, BluetoothManager bluetoothManager) {
        boolean z10;
        gm.l.f(bluetoothManager, "bluetoothManager");
        this.f10854a = context;
        this.f10855b = bluetoothManager;
        this.f10856c = o.a(context);
        f<Boolean> u0Var = new u0<>(new b(null));
        wm.c cVar = o0.f24381a;
        if (cVar.b(g1.b.f24341a) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!gm.l.a(cVar, xl.g.f30632a)) {
                if (u0Var instanceof tm.o) {
                    u0Var = o.a.a((tm.o) u0Var, cVar, 0, null, 6);
                } else {
                    u0Var = new tm.i(u0Var, cVar, 0, null, 12);
                }
            }
            this.f10862i = u0Var;
            this.f10863j = new n0(r.t(r.l(new qi.e(context, null))), u0Var, new c(null));
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar).toString());
    }

    public final boolean a(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        if (i10 == 0) {
            a aVar = this.f10861h;
            if (aVar != null) {
                aVar.a();
            }
        } else {
            a aVar2 = this.f10861h;
            if (aVar2 != null) {
                if (i10 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                aVar2.g(z12);
            }
            if (i10 == 2 && (!z10 || !this.f10859f)) {
                this.f10859f = true;
                j jVar = this.f10858e;
                if (jVar != null && !jVar.d()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    tk.i a10 = ((dj.b) this.f10856c.f16119c.getValue()).a(TimeUnit.SECONDS);
                    b0 b0Var = new b0(1, new uh.e0(this));
                    a.c cVar = yk.a.f31788c;
                    a10.getClass();
                    k0 w10 = new n(a10, b0Var, cVar).w(sk.c.a());
                    d0 d0Var = new d0(0, this);
                    this.f10858e = w10.l(d0Var).j(d0Var).y(new k(3, new f0(this)), new y(1, new g0(this)), new m(1, this));
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        int i10;
        if (!si.f.f27071a.b(this.f10854a)) {
            i10 = 0;
        } else if (!this.f10855b.getAdapter().isEnabled()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        return a(i10, false);
    }

    @Override // androidx.lifecycle.g
    public final void c(u uVar) {
        v a02 = uVar.a0();
        gm.l.e(a02, "owner.lifecycle");
        this.f10857d = z0.g(tb.a.g(a02), null, 0, new d(null), 3);
    }

    @Override // androidx.lifecycle.g
    public final void onDestroy(u uVar) {
        z1 z1Var = this.f10857d;
        if (z1Var != null) {
            z1Var.h(null);
        }
    }

    @Override // androidx.lifecycle.g
    public final /* synthetic */ void onPause(u uVar) {
    }

    @Override // androidx.lifecycle.g
    public final /* synthetic */ void onResume(u uVar) {
    }

    @Override // androidx.lifecycle.g
    public final /* synthetic */ void onStart(u uVar) {
    }

    @Override // androidx.lifecycle.g
    public final void onStop(u uVar) {
        j jVar = this.f10858e;
        if (jVar != null) {
            xk.b.a(jVar);
        }
    }
}
