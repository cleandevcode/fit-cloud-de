package k1;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import k1.d;
import k1.o0;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: b */
    public static final n2 f18129b;

    /* renamed from: a */
    public final k f18130a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static Field f18131a;

        /* renamed from: b */
        public static Field f18132b;

        /* renamed from: c */
        public static Field f18133c;

        /* renamed from: d */
        public static boolean f18134d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f18131a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f18132b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f18133c = declaredField3;
                declaredField3.setAccessible(true);
                f18134d = true;
            } catch (ReflectiveOperationException e10) {
                StringBuilder a10 = android.support.v4.media.d.a("Failed to get visible insets from AttachInfo ");
                a10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", a10.toString(), e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e */
        public static Field f18135e = null;

        /* renamed from: f */
        public static boolean f18136f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f18137g = null;

        /* renamed from: h */
        public static boolean f18138h = false;

        /* renamed from: c */
        public WindowInsets f18139c;

        /* renamed from: d */
        public a1.c f18140d;

        public b() {
            this.f18139c = i();
        }

        public b(n2 n2Var) {
            super(n2Var);
            this.f18139c = n2Var.h();
        }

        private static WindowInsets i() {
            if (!f18136f) {
                try {
                    f18135e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f18136f = true;
            }
            Field field = f18135e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f18138h) {
                try {
                    f18137g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f18138h = true;
            }
            Constructor<WindowInsets> constructor = f18137g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // k1.n2.e
        public n2 b() {
            a();
            n2 i10 = n2.i(this.f18139c, null);
            i10.f18130a.o(this.f18143b);
            i10.f18130a.q(this.f18140d);
            return i10;
        }

        @Override // k1.n2.e
        public void e(a1.c cVar) {
            this.f18140d = cVar;
        }

        @Override // k1.n2.e
        public void g(a1.c cVar) {
            WindowInsets windowInsets = this.f18139c;
            if (windowInsets != null) {
                this.f18139c = windowInsets.replaceSystemWindowInsets(cVar.f214a, cVar.f215b, cVar.f216c, cVar.f217d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: c */
        public final WindowInsets$Builder f18141c;

        public c() {
            this.f18141c = new WindowInsets$Builder();
        }

        public c(n2 n2Var) {
            super(n2Var);
            WindowInsets h10 = n2Var.h();
            this.f18141c = h10 != null ? new WindowInsets$Builder(h10) : new WindowInsets$Builder();
        }

        @Override // k1.n2.e
        public n2 b() {
            a();
            n2 i10 = n2.i(this.f18141c.build(), null);
            i10.f18130a.o(this.f18143b);
            return i10;
        }

        @Override // k1.n2.e
        public void d(a1.c cVar) {
            this.f18141c.setMandatorySystemGestureInsets(cVar.d());
        }

        @Override // k1.n2.e
        public void e(a1.c cVar) {
            this.f18141c.setStableInsets(cVar.d());
        }

        @Override // k1.n2.e
        public void f(a1.c cVar) {
            this.f18141c.setSystemGestureInsets(cVar.d());
        }

        @Override // k1.n2.e
        public void g(a1.c cVar) {
            this.f18141c.setSystemWindowInsets(cVar.d());
        }

        @Override // k1.n2.e
        public void h(a1.c cVar) {
            this.f18141c.setTappableElementInsets(cVar.d());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(n2 n2Var) {
            super(n2Var);
        }

        @Override // k1.n2.e
        public void c(int i10, a1.c cVar) {
            this.f18141c.setInsets(m.a(i10), cVar.d());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final n2 f18142a;

        /* renamed from: b */
        public a1.c[] f18143b;

        public e() {
            this(new n2());
        }

        public e(n2 n2Var) {
            this.f18142a = n2Var;
        }

        public final void a() {
            a1.c[] cVarArr = this.f18143b;
            if (cVarArr != null) {
                a1.c cVar = cVarArr[l.a(1)];
                a1.c cVar2 = this.f18143b[l.a(2)];
                if (cVar2 == null) {
                    cVar2 = this.f18142a.a(2);
                }
                if (cVar == null) {
                    cVar = this.f18142a.a(1);
                }
                g(a1.c.a(cVar, cVar2));
                a1.c cVar3 = this.f18143b[l.a(16)];
                if (cVar3 != null) {
                    f(cVar3);
                }
                a1.c cVar4 = this.f18143b[l.a(32)];
                if (cVar4 != null) {
                    d(cVar4);
                }
                a1.c cVar5 = this.f18143b[l.a(64)];
                if (cVar5 != null) {
                    h(cVar5);
                }
            }
        }

        public n2 b() {
            throw null;
        }

        public void c(int i10, a1.c cVar) {
            if (this.f18143b == null) {
                this.f18143b = new a1.c[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f18143b[l.a(i11)] = cVar;
                }
            }
        }

        public void d(a1.c cVar) {
        }

        public void e(a1.c cVar) {
            throw null;
        }

        public void f(a1.c cVar) {
        }

        public void g(a1.c cVar) {
            throw null;
        }

        public void h(a1.c cVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h */
        public static boolean f18144h = false;

        /* renamed from: i */
        public static Method f18145i;

        /* renamed from: j */
        public static Class<?> f18146j;

        /* renamed from: k */
        public static Field f18147k;

        /* renamed from: l */
        public static Field f18148l;

        /* renamed from: c */
        public final WindowInsets f18149c;

        /* renamed from: d */
        public a1.c[] f18150d;

        /* renamed from: e */
        public a1.c f18151e;

        /* renamed from: f */
        public n2 f18152f;

        /* renamed from: g */
        public a1.c f18153g;

        public f(n2 n2Var, WindowInsets windowInsets) {
            super(n2Var);
            this.f18151e = null;
            this.f18149c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private a1.c r(int i10, boolean z10) {
            a1.c cVar = a1.c.f213e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    cVar = a1.c.a(cVar, s(i11, z10));
                }
            }
            return cVar;
        }

        private a1.c t() {
            n2 n2Var = this.f18152f;
            if (n2Var != null) {
                return n2Var.f18130a.h();
            }
            return a1.c.f213e;
        }

        private a1.c u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f18144h) {
                    v();
                }
                Method method = f18145i;
                if (method != null && f18146j != null && f18147k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f18147k.get(f18148l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return a1.c.b(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e10) {
                        StringBuilder a10 = android.support.v4.media.d.a("Failed to get visible insets. (Reflection error). ");
                        a10.append(e10.getMessage());
                        Log.e("WindowInsetsCompat", a10.toString(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                f18145i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f18146j = cls;
                f18147k = cls.getDeclaredField("mVisibleInsets");
                f18148l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f18147k.setAccessible(true);
                f18148l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder a10 = android.support.v4.media.d.a("Failed to get visible insets. (Reflection error). ");
                a10.append(e10.getMessage());
                Log.e("WindowInsetsCompat", a10.toString(), e10);
            }
            f18144h = true;
        }

        @Override // k1.n2.k
        public void d(View view) {
            a1.c u10 = u(view);
            if (u10 == null) {
                u10 = a1.c.f213e;
            }
            w(u10);
        }

        @Override // k1.n2.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f18153g, ((f) obj).f18153g);
            }
            return false;
        }

        @Override // k1.n2.k
        public a1.c f(int i10) {
            return r(i10, false);
        }

        @Override // k1.n2.k
        public final a1.c j() {
            if (this.f18151e == null) {
                this.f18151e = a1.c.b(this.f18149c.getSystemWindowInsetLeft(), this.f18149c.getSystemWindowInsetTop(), this.f18149c.getSystemWindowInsetRight(), this.f18149c.getSystemWindowInsetBottom());
            }
            return this.f18151e;
        }

        @Override // k1.n2.k
        public n2 l(int i10, int i11, int i12, int i13) {
            e bVar;
            n2 i14 = n2.i(this.f18149c, null);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                bVar = new d(i14);
            } else if (i15 >= 29) {
                bVar = new c(i14);
            } else {
                bVar = new b(i14);
            }
            bVar.g(n2.f(j(), i10, i11, i12, i13));
            bVar.e(n2.f(h(), i10, i11, i12, i13));
            return bVar.b();
        }

        @Override // k1.n2.k
        public boolean n() {
            return this.f18149c.isRound();
        }

        @Override // k1.n2.k
        public void o(a1.c[] cVarArr) {
            this.f18150d = cVarArr;
        }

        @Override // k1.n2.k
        public void p(n2 n2Var) {
            this.f18152f = n2Var;
        }

        public a1.c s(int i10, boolean z10) {
            int i11;
            k1.d e10;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (i10 != 1) {
                a1.c cVar = null;
                if (i10 != 2) {
                    if (i10 != 8) {
                        if (i10 != 16) {
                            if (i10 != 32) {
                                if (i10 != 64) {
                                    if (i10 != 128) {
                                        return a1.c.f213e;
                                    }
                                    n2 n2Var = this.f18152f;
                                    if (n2Var != null) {
                                        e10 = n2Var.f18130a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = d.a.d(e10.f18108a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = d.a.f(e10.f18108a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = d.a.e(e10.f18108a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = d.a.c(e10.f18108a);
                                        }
                                        return a1.c.b(i12, i13, i14, i15);
                                    }
                                    return a1.c.f213e;
                                }
                                return k();
                            }
                            return g();
                        }
                        return i();
                    }
                    a1.c[] cVarArr = this.f18150d;
                    if (cVarArr != null) {
                        cVar = cVarArr[l.a(8)];
                    }
                    if (cVar != null) {
                        return cVar;
                    }
                    a1.c j10 = j();
                    a1.c t10 = t();
                    int i17 = j10.f217d;
                    if (i17 > t10.f217d) {
                        return a1.c.b(0, 0, 0, i17);
                    }
                    a1.c cVar2 = this.f18153g;
                    if (cVar2 != null && !cVar2.equals(a1.c.f213e) && (i11 = this.f18153g.f217d) > t10.f217d) {
                        return a1.c.b(0, 0, 0, i11);
                    }
                    return a1.c.f213e;
                } else if (z10) {
                    a1.c t11 = t();
                    a1.c h10 = h();
                    return a1.c.b(Math.max(t11.f214a, h10.f214a), 0, Math.max(t11.f216c, h10.f216c), Math.max(t11.f217d, h10.f217d));
                } else {
                    a1.c j11 = j();
                    n2 n2Var2 = this.f18152f;
                    if (n2Var2 != null) {
                        cVar = n2Var2.f18130a.h();
                    }
                    int i18 = j11.f217d;
                    if (cVar != null) {
                        i18 = Math.min(i18, cVar.f217d);
                    }
                    return a1.c.b(j11.f214a, 0, j11.f216c, i18);
                }
            } else if (z10) {
                return a1.c.b(0, Math.max(t().f215b, j().f215b), 0, 0);
            } else {
                return a1.c.b(0, j().f215b, 0, 0);
            }
        }

        public void w(a1.c cVar) {
            this.f18153g = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m */
        public a1.c f18154m;

        public g(n2 n2Var, WindowInsets windowInsets) {
            super(n2Var, windowInsets);
            this.f18154m = null;
        }

        @Override // k1.n2.k
        public n2 b() {
            return n2.i(this.f18149c.consumeStableInsets(), null);
        }

        @Override // k1.n2.k
        public n2 c() {
            return n2.i(this.f18149c.consumeSystemWindowInsets(), null);
        }

        @Override // k1.n2.k
        public final a1.c h() {
            if (this.f18154m == null) {
                this.f18154m = a1.c.b(this.f18149c.getStableInsetLeft(), this.f18149c.getStableInsetTop(), this.f18149c.getStableInsetRight(), this.f18149c.getStableInsetBottom());
            }
            return this.f18154m;
        }

        @Override // k1.n2.k
        public boolean m() {
            return this.f18149c.isConsumed();
        }

        @Override // k1.n2.k
        public void q(a1.c cVar) {
            this.f18154m = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(n2 n2Var, WindowInsets windowInsets) {
            super(n2Var, windowInsets);
        }

        @Override // k1.n2.k
        public n2 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f18149c.consumeDisplayCutout();
            return n2.i(consumeDisplayCutout, null);
        }

        @Override // k1.n2.k
        public k1.d e() {
            DisplayCutout displayCutout;
            displayCutout = this.f18149c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new k1.d(displayCutout);
        }

        @Override // k1.n2.f, k1.n2.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Objects.equals(this.f18149c, hVar.f18149c) && Objects.equals(this.f18153g, hVar.f18153g);
            }
            return false;
        }

        @Override // k1.n2.k
        public int hashCode() {
            return this.f18149c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: n */
        public a1.c f18155n;

        /* renamed from: o */
        public a1.c f18156o;

        /* renamed from: p */
        public a1.c f18157p;

        public i(n2 n2Var, WindowInsets windowInsets) {
            super(n2Var, windowInsets);
            this.f18155n = null;
            this.f18156o = null;
            this.f18157p = null;
        }

        @Override // k1.n2.k
        public a1.c g() {
            Insets mandatorySystemGestureInsets;
            if (this.f18156o == null) {
                mandatorySystemGestureInsets = this.f18149c.getMandatorySystemGestureInsets();
                this.f18156o = a1.c.c(mandatorySystemGestureInsets);
            }
            return this.f18156o;
        }

        @Override // k1.n2.k
        public a1.c i() {
            Insets systemGestureInsets;
            if (this.f18155n == null) {
                systemGestureInsets = this.f18149c.getSystemGestureInsets();
                this.f18155n = a1.c.c(systemGestureInsets);
            }
            return this.f18155n;
        }

        @Override // k1.n2.k
        public a1.c k() {
            Insets tappableElementInsets;
            if (this.f18157p == null) {
                tappableElementInsets = this.f18149c.getTappableElementInsets();
                this.f18157p = a1.c.c(tappableElementInsets);
            }
            return this.f18157p;
        }

        @Override // k1.n2.f, k1.n2.k
        public n2 l(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f18149c.inset(i10, i11, i12, i13);
            return n2.i(inset, null);
        }

        @Override // k1.n2.g, k1.n2.k
        public void q(a1.c cVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: q */
        public static final n2 f18158q = n2.i(WindowInsets.CONSUMED, null);

        public j(n2 n2Var, WindowInsets windowInsets) {
            super(n2Var, windowInsets);
        }

        @Override // k1.n2.f, k1.n2.k
        public final void d(View view) {
        }

        @Override // k1.n2.f, k1.n2.k
        public a1.c f(int i10) {
            Insets insets;
            insets = this.f18149c.getInsets(m.a(i10));
            return a1.c.c(insets);
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b */
        public static final n2 f18159b;

        /* renamed from: a */
        public final n2 f18160a;

        static {
            e bVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                bVar = new d();
            } else if (i10 >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            f18159b = bVar.b().f18130a.a().f18130a.b().f18130a.c();
        }

        public k(n2 n2Var) {
            this.f18160a = n2Var;
        }

        public n2 a() {
            return this.f18160a;
        }

        public n2 b() {
            return this.f18160a;
        }

        public n2 c() {
            return this.f18160a;
        }

        public void d(View view) {
        }

        public k1.d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() == kVar.n() && m() == kVar.m() && j1.b.a(j(), kVar.j()) && j1.b.a(h(), kVar.h()) && j1.b.a(e(), kVar.e())) {
                return true;
            }
            return false;
        }

        public a1.c f(int i10) {
            return a1.c.f213e;
        }

        public a1.c g() {
            return j();
        }

        public a1.c h() {
            return a1.c.f213e;
        }

        public int hashCode() {
            return j1.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public a1.c i() {
            return j();
        }

        public a1.c j() {
            return a1.c.f213e;
        }

        public a1.c k() {
            return j();
        }

        public n2 l(int i10, int i11, int i12, int i13) {
            return f18159b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(a1.c[] cVarArr) {
        }

        public void p(n2 n2Var) {
        }

        public void q(a1.c cVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 1;
                }
                if (i10 == 4) {
                    return 2;
                }
                if (i10 != 8) {
                    if (i10 == 16) {
                        return 4;
                    }
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                if (i10 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("type needs to be >= FIRST and <= LAST, type=", i10));
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        public static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets$Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets$Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets$Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets$Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets$Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets$Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets$Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        f18129b = Build.VERSION.SDK_INT >= 30 ? j.f18158q : k.f18159b;
    }

    public n2() {
        this.f18130a = new k(this);
    }

    public n2(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f18130a = i10 >= 30 ? new j(this, windowInsets) : i10 >= 29 ? new i(this, windowInsets) : i10 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public static a1.c f(a1.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.f214a - i10);
        int max2 = Math.max(0, cVar.f215b - i11);
        int max3 = Math.max(0, cVar.f216c - i12);
        int max4 = Math.max(0, cVar.f217d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? cVar : a1.c.b(max, max2, max3, max4);
    }

    public static n2 i(WindowInsets windowInsets, View view) {
        n2 j10;
        windowInsets.getClass();
        n2 n2Var = new n2(windowInsets);
        if (view != null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.b(view)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    j10 = o0.j.a(view);
                } else {
                    j10 = o0.i.j(view);
                }
                n2Var.f18130a.p(j10);
                n2Var.f18130a.d(view.getRootView());
            }
        }
        return n2Var;
    }

    public final a1.c a(int i10) {
        return this.f18130a.f(i10);
    }

    @Deprecated
    public final int b() {
        return this.f18130a.j().f217d;
    }

    @Deprecated
    public final int c() {
        return this.f18130a.j().f214a;
    }

    @Deprecated
    public final int d() {
        return this.f18130a.j().f216c;
    }

    @Deprecated
    public final int e() {
        return this.f18130a.j().f215b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n2) {
            return j1.b.a(this.f18130a, ((n2) obj).f18130a);
        }
        return false;
    }

    @Deprecated
    public final n2 g(int i10, int i11, int i12, int i13) {
        e bVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            bVar = new d(this);
        } else if (i14 >= 29) {
            bVar = new c(this);
        } else {
            bVar = new b(this);
        }
        bVar.g(a1.c.b(i10, i11, i12, i13));
        return bVar.b();
    }

    public final WindowInsets h() {
        k kVar = this.f18130a;
        if (kVar instanceof f) {
            return ((f) kVar).f18149c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f18130a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
