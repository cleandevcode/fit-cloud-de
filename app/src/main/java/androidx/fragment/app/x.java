package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.j0;
import androidx.lifecycle.k;
import java.io.PrintWriter;
import q2.a;
import x0.b;

/* loaded from: classes.dex */
public class x extends ComponentActivity implements b.c, b.d {

    /* renamed from: q */
    public boolean f2612q;

    /* renamed from: r */
    public boolean f2613r;

    /* renamed from: o */
    public final b0 f2610o = new b0(new a());

    /* renamed from: p */
    public final androidx.lifecycle.v f2611p = new androidx.lifecycle.v(this);

    /* renamed from: s */
    public boolean f2614s = true;

    /* loaded from: classes.dex */
    public class a extends d0<x> implements y0.d, y0.e, x0.d0, x0.e0, androidx.lifecycle.y0, androidx.activity.l, androidx.activity.result.h, q2.c, n0, k1.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            x.this = r1;
        }

        @Override // k1.i
        public final void A(j0.c cVar) {
            x.this.A(cVar);
        }

        @Override // q2.c
        public final q2.a C() {
            return x.this.f702e.f24512b;
        }

        @Override // y0.d
        public final void D(j1.a<Configuration> aVar) {
            x.this.D(aVar);
        }

        @Override // androidx.fragment.app.d0
        public final void H(PrintWriter printWriter, String[] strArr) {
            x.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.d0
        public final x I() {
            return x.this;
        }

        @Override // androidx.fragment.app.d0
        public final LayoutInflater J() {
            return x.this.getLayoutInflater().cloneInContext(x.this);
        }

        @Override // androidx.fragment.app.d0
        public final boolean K(String str) {
            x xVar = x.this;
            int i10 = x0.b.f30088b;
            if ((f1.a.b() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) && Build.VERSION.SDK_INT >= 23) {
                return b.C0548b.c(xVar, str);
            }
            return false;
        }

        @Override // androidx.fragment.app.d0
        public final void L() {
            x.this.invalidateOptionsMenu();
        }

        @Override // androidx.lifecycle.u
        public final androidx.lifecycle.v a0() {
            return x.this.f2611p;
        }

        @Override // androidx.activity.l
        public final OnBackPressedDispatcher b() {
            return x.this.f705h;
        }

        @Override // x0.e0
        public final void c(v vVar) {
            x.this.c(vVar);
        }

        @Override // x0.d0
        public final void d(z.b bVar) {
            x.this.d(bVar);
        }

        @Override // androidx.fragment.app.n0
        public final void f(j0 j0Var, r rVar) {
            x.this.getClass();
        }

        @Override // x0.e0
        public final void g(v vVar) {
            x.this.g(vVar);
        }

        @Override // y0.e
        public final void j(h0 h0Var) {
            x.this.j(h0Var);
        }

        @Override // x0.d0
        public final void l(z.b bVar) {
            x.this.l(bVar);
        }

        @Override // y0.d
        public final void m(g0 g0Var) {
            x.this.m(g0Var);
        }

        @Override // androidx.activity.result.h
        public final androidx.activity.result.g o() {
            return x.this.f706i;
        }

        @Override // y0.e
        public final void q(h0 h0Var) {
            x.this.q(h0Var);
        }

        @Override // k1.i
        public final void t(j0.c cVar) {
            x.this.t(cVar);
        }

        @Override // androidx.fragment.app.a0
        public final View u(int i10) {
            return x.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.a0
        public final boolean x() {
            Window window = x.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.y0
        public final androidx.lifecycle.x0 z() {
            return x.this.z();
        }
    }

    public x() {
        this.f702e.f24512b.c("android:support:lifecycle", new a.b() { // from class: androidx.fragment.app.u
            @Override // q2.a.b
            public final Bundle a() {
                x xVar = x.this;
                do {
                } while (x.K(xVar.J()));
                xVar.f2611p.f(k.b.ON_STOP);
                return new Bundle();
            }
        });
        D(new z.b(1, this));
        this.f709l.add(new v(0, this));
        H(new d.b() { // from class: androidx.fragment.app.w
            @Override // d.b
            public final void a() {
                d0<?> d0Var = x.this.f2610o.f2329a;
                d0Var.f2342d.c(d0Var, d0Var, null);
            }
        });
    }

    public static boolean K(j0 j0Var) {
        k.c cVar = k.c.CREATED;
        k.c cVar2 = k.c.STARTED;
        boolean z10 = false;
        for (r rVar : j0Var.f2395c.f()) {
            if (rVar != null) {
                if (rVar.j0() != null) {
                    z10 |= K(rVar.h0());
                }
                a1 a1Var = rVar.f2511c0;
                if (a1Var != null) {
                    a1Var.d();
                    if (a1Var.f2313d.f2790c.a(cVar2)) {
                        rVar.f2511c0.f2313d.h(cVar);
                        z10 = true;
                    }
                }
                if (rVar.Z.f2790c.a(cVar2)) {
                    rVar.Z.h(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final k0 J() {
        return this.f2610o.f2329a.f2342d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0056, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x005d, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0069, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x006b, code lost:
        r0 = true;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            r5 = this;
            super.dump(r6, r7, r8, r9)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L6c
            int r2 = r9.length
            if (r2 <= 0) goto L6c
            r2 = r9[r0]
            r2.getClass()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -645125871: goto L44;
                case 100470631: goto L39;
                case 472614934: goto L2e;
                case 1159329357: goto L23;
                case 1455016274: goto L18;
                default: goto L17;
            }
        L17:
            goto L4e
        L18:
            java.lang.String r4 = "--autofill"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L21
            goto L4e
        L21:
            r3 = 4
            goto L4e
        L23:
            java.lang.String r4 = "--contentcapture"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L2c
            goto L4e
        L2c:
            r3 = 3
            goto L4e
        L2e:
            java.lang.String r4 = "--list-dumpables"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L37
            goto L4e
        L37:
            r3 = 2
            goto L4e
        L39:
            java.lang.String r4 = "--dump-dumpable"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L42
            goto L4e
        L42:
            r3 = 1
            goto L4e
        L44:
            java.lang.String r4 = "--translation"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            switch(r3) {
                case 0: goto L65;
                case 1: goto L60;
                case 2: goto L60;
                case 3: goto L59;
                case 4: goto L52;
                default: goto L51;
            }
        L51:
            goto L6c
        L52:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L6c
            goto L6b
        L59:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L6c
            goto L6b
        L60:
            boolean r0 = f1.a.b()
            goto L6c
        L65:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L6c
        L6b:
            r0 = 1
        L6c:
            r0 = r0 ^ r1
            if (r0 != 0) goto L70
            return
        L70:
            r8.print(r6)
            java.lang.String r0 = "Local FragmentActivity "
            r8.print(r0)
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " State:"
            r8.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.print(r0)
            java.lang.String r1 = "mCreated="
            r8.print(r1)
            boolean r1 = r5.f2612q
            r8.print(r1)
            java.lang.String r1 = " mResumed="
            r8.print(r1)
            boolean r1 = r5.f2613r
            r8.print(r1)
            java.lang.String r1 = " mStopped="
            r8.print(r1)
            boolean r1 = r5.f2614s
            r8.print(r1)
            android.app.Application r1 = r5.getApplication()
            if (r1 == 0) goto Lc7
            e2.b r1 = e2.a.a(r5)
            r1.b(r0, r8)
        Lc7:
            androidx.fragment.app.b0 r0 = r5.f2610o
            androidx.fragment.app.d0<?> r0 = r0.f2329a
            androidx.fragment.app.k0 r0 = r0.f2342d
            r0.v(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f2610o.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2611p.f(k.b.ON_CREATE);
        k0 k0Var = this.f2610o.f2329a.f2342d;
        k0Var.F = false;
        k0Var.G = false;
        k0Var.M.f2465i = false;
        k0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f2610o.f2329a.f2342d.f2398f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2610o.f2329a.f2342d.l();
        this.f2611p.f(k.b.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f2610o.f2329a.f2342d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2613r = false;
        this.f2610o.f2329a.f2342d.u(5);
        this.f2611p.f(k.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2611p.f(k.b.ON_RESUME);
        k0 k0Var = this.f2610o.f2329a.f2342d;
        k0Var.F = false;
        k0Var.G = false;
        k0Var.M.f2465i = false;
        k0Var.u(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f2610o.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f2610o.a();
        super.onResume();
        this.f2613r = true;
        this.f2610o.f2329a.f2342d.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f2610o.a();
        super.onStart();
        this.f2614s = false;
        if (!this.f2612q) {
            this.f2612q = true;
            k0 k0Var = this.f2610o.f2329a.f2342d;
            k0Var.F = false;
            k0Var.G = false;
            k0Var.M.f2465i = false;
            k0Var.u(4);
        }
        this.f2610o.f2329a.f2342d.y(true);
        this.f2611p.f(k.b.ON_START);
        k0 k0Var2 = this.f2610o.f2329a.f2342d;
        k0Var2.F = false;
        k0Var2.G = false;
        k0Var2.M.f2465i = false;
        k0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2610o.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2614s = true;
        do {
        } while (K(J()));
        k0 k0Var = this.f2610o.f2329a.f2342d;
        k0Var.G = true;
        k0Var.M.f2465i = true;
        k0Var.u(4);
        this.f2611p.f(k.b.ON_STOP);
    }

    @Override // x0.b.d
    @Deprecated
    public final void y() {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f2610o.f2329a.f2342d.f2398f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
