package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import r1.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    public r1.c f6247a;

    /* renamed from: b */
    public b f6248b;

    /* renamed from: c */
    public boolean f6249c;

    /* renamed from: d */
    public int f6250d = 2;

    /* renamed from: e */
    public float f6251e = 0.5f;

    /* renamed from: f */
    public float f6252f = 0.0f;

    /* renamed from: g */
    public float f6253g = 0.5f;

    /* renamed from: h */
    public final a f6254h = new a();

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0457c {

        /* renamed from: a */
        public int f6255a;

        /* renamed from: b */
        public int f6256b = -1;

        public a() {
            SwipeDismissBehavior.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0012, code lost:
            if (r0 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0017, code lost:
            if (r0 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0019, code lost:
            r0 = r3.f6255a;
            r4 = r4.getWidth() + r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0021, code lost:
            r0 = r3.f6255a - r4.getWidth();
            r4 = r3.f6255a;
         */
        @Override // r1.c.AbstractC0457c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int a(android.view.View r4, int r5) {
            /*
                r3 = this;
                java.util.WeakHashMap<android.view.View, k1.i2> r0 = k1.o0.f18161a
                int r0 = k1.o0.e.d(r4)
                r1 = 1
                if (r0 != r1) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.f6250d
                if (r2 != 0) goto L15
                if (r0 == 0) goto L19
                goto L21
            L15:
                if (r2 != r1) goto L2b
                if (r0 == 0) goto L21
            L19:
                int r0 = r3.f6255a
                int r4 = r4.getWidth()
                int r4 = r4 + r0
                goto L39
            L21:
                int r0 = r3.f6255a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f6255a
                goto L39
            L2b:
                int r0 = r3.f6255a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f6255a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L39:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int):int");
        }

        @Override // r1.c.AbstractC0457c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // r1.c.AbstractC0457c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // r1.c.AbstractC0457c
        public final void e(View view, int i10) {
            this.f6256b = i10;
            this.f6255a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // r1.c.AbstractC0457c
        public final void f(int i10) {
            b bVar = SwipeDismissBehavior.this.f6248b;
            if (bVar != null) {
                e eVar = (e) bVar;
                if (i10 != 0) {
                    if (i10 == 1 || i10 == 2) {
                        g b10 = g.b();
                        BaseTransientBottomBar.c cVar = eVar.f6671a.f6645m;
                        synchronized (b10.f6674a) {
                            if (b10.c(cVar)) {
                                g.c cVar2 = b10.f6676c;
                                if (!cVar2.f6681c) {
                                    cVar2.f6681c = true;
                                    b10.f6675b.removeCallbacksAndMessages(cVar2);
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                g b11 = g.b();
                BaseTransientBottomBar.c cVar3 = eVar.f6671a.f6645m;
                synchronized (b11.f6674a) {
                    if (b11.c(cVar3)) {
                        g.c cVar4 = b11.f6676c;
                        if (cVar4.f6681c) {
                            cVar4.f6681c = false;
                            b11.d(cVar4);
                        }
                    }
                }
            }
        }

        @Override // r1.c.AbstractC0457c
        public final void g(View view, int i10, int i11) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f6252f) + this.f6255a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f6253g) + this.f6255a;
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f10 - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x0053, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f6255a) >= java.lang.Math.round(r8.getWidth() * com.google.android.material.behavior.SwipeDismissBehavior.this.f6251e)) goto L37;
         */
        @Override // r1.c.AbstractC0457c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f6256b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 1
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r3 == 0) goto L39
                java.util.WeakHashMap<android.view.View, k1.i2> r4 = k1.o0.f18161a
                int r4 = k1.o0.e.d(r8)
                if (r4 != r1) goto L18
                r4 = 1
                goto L19
            L18:
                r4 = 0
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f6250d
                r6 = 2
                if (r5 != r6) goto L21
                goto L55
            L21:
                if (r5 != 0) goto L2d
                if (r4 == 0) goto L2a
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L57
                goto L55
            L2a:
                if (r3 <= 0) goto L57
                goto L55
            L2d:
                if (r5 != r1) goto L57
                if (r4 == 0) goto L34
                if (r3 <= 0) goto L57
                goto L55
            L34:
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L57
                goto L55
            L39:
                int r9 = r8.getLeft()
                int r2 = r7.f6255a
                int r9 = r9 - r2
                int r2 = r8.getWidth()
                float r2 = (float) r2
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f6251e
                float r2 = r2 * r3
                int r2 = java.lang.Math.round(r2)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r2) goto L57
            L55:
                r9 = 1
                goto L58
            L57:
                r9 = 0
            L58:
                if (r9 == 0) goto L66
                int r9 = r8.getLeft()
                int r0 = r7.f6255a
                if (r9 >= r0) goto L64
                int r0 = r0 - r10
                goto L6a
            L64:
                int r0 = r0 + r10
                goto L6a
            L66:
                int r9 = r7.f6255a
                r0 = r9
                r1 = 0
            L6a:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r1.c r9 = r9.f6247a
                int r10 = r8.getTop()
                boolean r9 = r9.q(r0, r10)
                if (r9 == 0) goto L85
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                java.util.WeakHashMap<android.view.View, k1.i2> r10 = k1.o0.f18161a
                k1.o0.d.m(r8, r9)
                goto L92
            L85:
                if (r1 == 0) goto L92
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f6248b
                if (r9 == 0) goto L92
                com.google.android.material.snackbar.e r9 = (com.google.android.material.snackbar.e) r9
                r9.a(r8)
            L92:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // r1.c.AbstractC0457c
        public final boolean i(View view, int i10) {
            int i11 = this.f6256b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        public final View f6258a;

        /* renamed from: b */
        public final boolean f6259b;

        public c(View view, boolean z10) {
            SwipeDismissBehavior.this = r1;
            this.f6258a = view;
            this.f6259b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            r1.c cVar = SwipeDismissBehavior.this.f6247a;
            if (cVar != null && cVar.g()) {
                View view = this.f6258a;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.m(view, this);
            } else if (this.f6259b && (bVar = SwipeDismissBehavior.this.f6248b) != null) {
                ((e) bVar).a(this.f6258a);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f6249c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f6249c = false;
            }
        } else {
            z10 = coordinatorLayout.q(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6249c = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.f6247a == null) {
            this.f6247a = new r1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f6254h);
        }
        return this.f6247a.r(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.d.c(v10) == 0) {
            o0.d.s(v10, 1);
            o0.m(v10, 1048576);
            o0.h(v10, 0);
            if (s(v10)) {
                o0.n(v10, j.a.f18678j, new com.google.android.material.behavior.a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        r1.c cVar = this.f6247a;
        if (cVar != null) {
            cVar.k(motionEvent);
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
