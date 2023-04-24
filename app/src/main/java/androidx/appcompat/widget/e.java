package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import k1.o0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final View f1308a;

    /* renamed from: d */
    public j2 f1311d;

    /* renamed from: e */
    public j2 f1312e;

    /* renamed from: f */
    public j2 f1313f;

    /* renamed from: c */
    public int f1310c = -1;

    /* renamed from: b */
    public final k f1309b = k.a();

    public e(View view) {
        this.f1308a = view;
    }

    public final void a() {
        boolean z10;
        Drawable background = this.f1308a.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z11 = true;
            if (i10 <= 21 ? i10 == 21 : this.f1311d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f1313f == null) {
                    this.f1313f = new j2();
                }
                j2 j2Var = this.f1313f;
                j2Var.f1380a = null;
                j2Var.f1383d = false;
                j2Var.f1381b = null;
                j2Var.f1382c = false;
                View view = this.f1308a;
                WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
                ColorStateList g10 = o0.i.g(view);
                if (g10 != null) {
                    j2Var.f1383d = true;
                    j2Var.f1380a = g10;
                }
                PorterDuff.Mode h10 = o0.i.h(this.f1308a);
                if (h10 != null) {
                    j2Var.f1382c = true;
                    j2Var.f1381b = h10;
                }
                if (!j2Var.f1383d && !j2Var.f1382c) {
                    z11 = false;
                } else {
                    k.e(background, j2Var, this.f1308a.getDrawableState());
                }
                if (z11) {
                    return;
                }
            }
            j2 j2Var2 = this.f1312e;
            if (j2Var2 != null) {
                k.e(background, j2Var2, this.f1308a.getDrawableState());
                return;
            }
            j2 j2Var3 = this.f1311d;
            if (j2Var3 != null) {
                k.e(background, j2Var3, this.f1308a.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        j2 j2Var = this.f1312e;
        if (j2Var != null) {
            return j2Var.f1380a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        j2 j2Var = this.f1312e;
        if (j2Var != null) {
            return j2Var.f1381b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x008e A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:44:0x0019, B:46:0x0022, B:47:0x0032, B:49:0x0039, B:51:0x003c, B:55:0x0043, B:57:0x004b, B:58:0x0054, B:60:0x005c, B:62:0x0070, B:64:0x007a, B:71:0x0088, B:73:0x008e, B:74:0x0095, B:48:0x0033), top: B:80:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.view.View r0 = r7.f1308a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.ViewBackgroundHelper
            androidx.appcompat.widget.l2 r0 = androidx.appcompat.widget.l2.m(r0, r8, r3, r9)
            android.view.View r1 = r7.f1308a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1415b
            r4 = r8
            r6 = r9
            k1.o0.o(r1, r2, r3, r4, r5, r6)
            int r8 = androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L9c
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L9c
            r1 = -1
            if (r9 == 0) goto L43
            int r8 = r0.i(r8, r1)     // Catch: java.lang.Throwable -> L9c
            r7.f1310c = r8     // Catch: java.lang.Throwable -> L9c
            androidx.appcompat.widget.k r8 = r7.f1309b     // Catch: java.lang.Throwable -> L9c
            android.view.View r9 = r7.f1308a     // Catch: java.lang.Throwable -> L9c
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Throwable -> L9c
            int r2 = r7.f1310c     // Catch: java.lang.Throwable -> L9c
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L9c
            androidx.appcompat.widget.z1 r3 = r8.f1386a     // Catch: java.lang.Throwable -> L40
            android.content.res.ColorStateList r9 = r3.i(r9, r2)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto L43
            r7.g(r9)     // Catch: java.lang.Throwable -> L9c
            goto L43
        L40:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9c
            throw r9     // Catch: java.lang.Throwable -> L9c
        L43:
            int r8 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L9c
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto L54
            android.view.View r9 = r7.f1308a     // Catch: java.lang.Throwable -> L9c
            android.content.res.ColorStateList r8 = r0.b(r8)     // Catch: java.lang.Throwable -> L9c
            k1.o0.r(r9, r8)     // Catch: java.lang.Throwable -> L9c
        L54:
            int r8 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L9c
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto L98
            android.view.View r9 = r7.f1308a     // Catch: java.lang.Throwable -> L9c
            int r8 = r0.h(r8, r1)     // Catch: java.lang.Throwable -> L9c
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.k1.d(r8, r1)     // Catch: java.lang.Throwable -> L9c
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9c
            k1.o0.i.r(r9, r8)     // Catch: java.lang.Throwable -> L9c
            r8 = 21
            if (r1 != r8) goto L98
            android.graphics.drawable.Drawable r8 = r9.getBackground()     // Catch: java.lang.Throwable -> L9c
            android.content.res.ColorStateList r1 = k1.o0.i.g(r9)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L83
            android.graphics.PorterDuff$Mode r1 = k1.o0.i.h(r9)     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L81
            goto L83
        L81:
            r1 = 0
            goto L84
        L83:
            r1 = 1
        L84:
            if (r8 == 0) goto L98
            if (r1 == 0) goto L98
            boolean r1 = r8.isStateful()     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L95
            int[] r1 = r9.getDrawableState()     // Catch: java.lang.Throwable -> L9c
            r8.setState(r1)     // Catch: java.lang.Throwable -> L9c
        L95:
            k1.o0.d.q(r9, r8)     // Catch: java.lang.Throwable -> L9c
        L98:
            r0.n()
            return
        L9c:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f1310c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f1310c = i10;
        k kVar = this.f1309b;
        if (kVar != null) {
            Context context = this.f1308a.getContext();
            synchronized (kVar) {
                colorStateList = kVar.f1386a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1311d == null) {
                this.f1311d = new j2();
            }
            j2 j2Var = this.f1311d;
            j2Var.f1380a = colorStateList;
            j2Var.f1383d = true;
        } else {
            this.f1311d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1312e == null) {
            this.f1312e = new j2();
        }
        j2 j2Var = this.f1312e;
        j2Var.f1380a = colorStateList;
        j2Var.f1383d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1312e == null) {
            this.f1312e = new j2();
        }
        j2 j2Var = this.f1312e;
        j2Var.f1381b = mode;
        j2Var.f1382c = true;
        a();
    }
}
