package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.i;

/* loaded from: classes.dex */
public abstract class o extends i {

    /* renamed from: y */
    public static final String[] f3461y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x */
    public int f3462x = 3;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a */
        public final View f3463a;

        /* renamed from: b */
        public final int f3464b;

        /* renamed from: c */
        public final ViewGroup f3465c;

        /* renamed from: e */
        public boolean f3467e;

        /* renamed from: f */
        public boolean f3468f = false;

        /* renamed from: d */
        public final boolean f3466d = true;

        public a(View view, int i10) {
            this.f3463a = view;
            this.f3464b = i10;
            this.f3465c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // androidx.transition.i.d
        public final void a() {
            f(false);
        }

        @Override // androidx.transition.i.d
        public final void b(i iVar) {
        }

        @Override // androidx.transition.i.d
        public final void c() {
        }

        @Override // androidx.transition.i.d
        public final void d(i iVar) {
            if (!this.f3468f) {
                x2.l.f30185a.b(this.f3463a, this.f3464b);
                ViewGroup viewGroup = this.f3465c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            iVar.z(this);
        }

        @Override // androidx.transition.i.d
        public final void e() {
            f(true);
        }

        public final void f(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f3466d || this.f3467e == z10 || (viewGroup = this.f3465c) == null) {
                return;
            }
            this.f3467e = z10;
            x2.k.a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3468f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f3468f) {
                x2.l.f30185a.b(this.f3463a, this.f3464b);
                ViewGroup viewGroup = this.f3465c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f3468f) {
                return;
            }
            x2.l.f30185a.b(this.f3463a, this.f3464b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f3468f) {
                return;
            }
            x2.l.f30185a.b(this.f3463a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public boolean f3469a;

        /* renamed from: b */
        public boolean f3470b;

        /* renamed from: c */
        public int f3471c;

        /* renamed from: d */
        public int f3472d;

        /* renamed from: e */
        public ViewGroup f3473e;

        /* renamed from: f */
        public ViewGroup f3474f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0075, code lost:
        if (r8 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007f, code lost:
        if (r0.f3473e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008f, code lost:
        if (r0.f3471c == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.transition.o.b M(x2.g r7, x2.g r8) {
        /*
            androidx.transition.o$b r0 = new androidx.transition.o$b
            r0.<init>()
            r1 = 0
            r0.f3469a = r1
            r0.f3470b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L33
            java.util.HashMap r6 = r7.f30175a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.HashMap r6 = r7.f30175a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f3471c = r6
            java.util.HashMap r6 = r7.f30175a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3473e = r6
            goto L37
        L33:
            r0.f3471c = r4
            r0.f3473e = r3
        L37:
            if (r8 == 0) goto L5a
            java.util.HashMap r6 = r8.f30175a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.HashMap r3 = r8.f30175a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f3472d = r3
            java.util.HashMap r3 = r8.f30175a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3474f = r2
            goto L5e
        L5a:
            r0.f3472d = r4
            r0.f3474f = r3
        L5e:
            r2 = 1
            if (r7 == 0) goto L82
            if (r8 == 0) goto L82
            int r7 = r0.f3471c
            int r8 = r0.f3472d
            if (r7 != r8) goto L70
            android.view.ViewGroup r3 = r0.f3473e
            android.view.ViewGroup r4 = r0.f3474f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r7 == r8) goto L78
            if (r7 != 0) goto L75
            goto L91
        L75:
            if (r8 != 0) goto L95
            goto L88
        L78:
            android.view.ViewGroup r7 = r0.f3474f
            if (r7 != 0) goto L7d
            goto L91
        L7d:
            android.view.ViewGroup r7 = r0.f3473e
            if (r7 != 0) goto L95
            goto L88
        L82:
            if (r7 != 0) goto L8b
            int r7 = r0.f3472d
            if (r7 != 0) goto L8b
        L88:
            r0.f3470b = r2
            goto L93
        L8b:
            if (r8 != 0) goto L95
            int r7 = r0.f3471c
            if (r7 != 0) goto L95
        L91:
            r0.f3470b = r1
        L93:
            r0.f3469a = r2
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o.M(x2.g, x2.g):androidx.transition.o$b");
    }

    public final void L(x2.g gVar) {
        gVar.f30175a.put("android:visibility:visibility", Integer.valueOf(gVar.f30176b.getVisibility()));
        gVar.f30175a.put("android:visibility:parent", gVar.f30176b.getParent());
        int[] iArr = new int[2];
        gVar.f30176b.getLocationOnScreen(iArr);
        gVar.f30175a.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.i
    public final void d(x2.g gVar) {
        L(gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0043, code lost:
        if (M(p(r1, false), u(r1, false)).f3469a != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01fe  */
    @Override // androidx.transition.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator m(android.view.ViewGroup r24, x2.g r25, x2.g r26) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o.m(android.view.ViewGroup, x2.g, x2.g):android.animation.Animator");
    }

    @Override // androidx.transition.i
    public final String[] t() {
        return f3461y;
    }

    @Override // androidx.transition.i
    public final boolean v(x2.g gVar, x2.g gVar2) {
        if (gVar == null && gVar2 == null) {
            return false;
        }
        if (gVar == null || gVar2 == null || gVar2.f30175a.containsKey("android:visibility:visibility") == gVar.f30175a.containsKey("android:visibility:visibility")) {
            b M = M(gVar, gVar2);
            if (M.f3469a) {
                return M.f3471c == 0 || M.f3472d == 0;
            }
            return false;
        }
        return false;
    }
}
