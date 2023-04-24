package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import b1.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final CompoundButton f1374a;

    /* renamed from: b */
    public ColorStateList f1375b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1376c = null;

    /* renamed from: d */
    public boolean f1377d = false;

    /* renamed from: e */
    public boolean f1378e = false;

    /* renamed from: f */
    public boolean f1379f;

    public j(CompoundButton compoundButton) {
        this.f1374a = compoundButton;
    }

    public final void a() {
        Drawable a10 = o1.c.a(this.f1374a);
        if (a10 != null) {
            if (this.f1377d || this.f1378e) {
                Drawable mutate = b1.a.g(a10).mutate();
                if (this.f1377d) {
                    a.b.h(mutate, this.f1375b);
                }
                if (this.f1378e) {
                    a.b.i(mutate, this.f1376c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1374a.getDrawableState());
                }
                this.f1374a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x003b A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:35:0x0019, B:37:0x0022, B:39:0x0028, B:44:0x003b, B:46:0x0043, B:48:0x0049, B:49:0x0056, B:51:0x005e, B:52:0x0067, B:54:0x006f), top: B:60:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:35:0x0019, B:37:0x0022, B:39:0x0028, B:44:0x003b, B:46:0x0043, B:48:0x0049, B:49:0x0056, B:51:0x005e, B:52:0x0067, B:54:0x006f), top: B:60:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:35:0x0019, B:37:0x0022, B:39:0x0028, B:44:0x003b, B:46:0x0043, B:48:0x0049, B:49:0x0056, B:51:0x005e, B:52:0x0067, B:54:0x006f), top: B:60:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.widget.CompoundButton r0 = r7.f1374a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CompoundButton
            androidx.appcompat.widget.l2 r0 = androidx.appcompat.widget.l2.m(r0, r8, r3, r9)
            android.widget.CompoundButton r1 = r7.f1374a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1415b
            r4 = r8
            r6 = r9
            k1.o0.o(r1, r2, r3, r4, r5, r6)
            int r8 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L82
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L82
            r1 = 0
            if (r9 == 0) goto L38
            int r8 = r0.i(r8, r1)     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto L38
            android.widget.CompoundButton r9 = r7.f1374a     // Catch: android.content.res.Resources.NotFoundException -> L37 java.lang.Throwable -> L82
            android.content.Context r2 = r9.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L37 java.lang.Throwable -> L82
            android.graphics.drawable.Drawable r8 = g.a.b(r2, r8)     // Catch: android.content.res.Resources.NotFoundException -> L37 java.lang.Throwable -> L82
            r9.setButtonDrawable(r8)     // Catch: android.content.res.Resources.NotFoundException -> L37 java.lang.Throwable -> L82
            r8 = 1
            goto L39
        L37:
        L38:
            r8 = 0
        L39:
            if (r8 != 0) goto L56
            int r8 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L82
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L56
            int r8 = r0.i(r8, r1)     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto L56
            android.widget.CompoundButton r9 = r7.f1374a     // Catch: java.lang.Throwable -> L82
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L82
            android.graphics.drawable.Drawable r8 = g.a.b(r1, r8)     // Catch: java.lang.Throwable -> L82
            r9.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L82
        L56:
            int r8 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L82
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L67
            android.widget.CompoundButton r9 = r7.f1374a     // Catch: java.lang.Throwable -> L82
            android.content.res.ColorStateList r8 = r0.b(r8)     // Catch: java.lang.Throwable -> L82
            o1.c.a.c(r9, r8)     // Catch: java.lang.Throwable -> L82
        L67:
            int r8 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L82
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L7e
            android.widget.CompoundButton r9 = r7.f1374a     // Catch: java.lang.Throwable -> L82
            r1 = -1
            int r8 = r0.h(r8, r1)     // Catch: java.lang.Throwable -> L82
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.k1.d(r8, r1)     // Catch: java.lang.Throwable -> L82
            o1.c.a.d(r9, r8)     // Catch: java.lang.Throwable -> L82
        L7e:
            r0.n()
            return
        L82:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.b(android.util.AttributeSet, int):void");
    }
}
