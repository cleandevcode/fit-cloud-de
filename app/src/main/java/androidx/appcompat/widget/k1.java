package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a */
    public static final int[] f1396a = {16842912};

    /* renamed from: b */
    public static final int[] f1397b = new int[0];

    /* renamed from: c */
    public static final Rect f1398c = new Rect();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final boolean f1399a;

        /* renamed from: b */
        public static final Method f1400b;

        /* renamed from: c */
        public static final Field f1401c;

        /* renamed from: d */
        public static final Field f1402d;

        /* renamed from: e */
        public static final Field f1403e;

        /* renamed from: f */
        public static final Field f1404f;

        /* JADX WARN: Removed duplicated region for block: B:66:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0064  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3e java.lang.NoSuchMethodException -> L41
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.ClassNotFoundException -> L35 java.lang.NoSuchMethodException -> L38
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2d
                r8 = 1
                goto L55
            L2d:
                goto L53
            L2f:
                r7 = r2
                goto L53
            L32:
                r6 = r2
                goto L52
            L35:
                r6 = r2
                goto L52
            L38:
                r6 = r2
                goto L52
            L3b:
                r5 = r2
                goto L47
            L3e:
                r5 = r2
                goto L4c
            L41:
                r5 = r2
                goto L51
            L44:
                r4 = r2
                r5 = r4
            L47:
                r6 = r5
                goto L52
            L49:
                r4 = r2
                r5 = r4
            L4c:
                r6 = r5
                goto L52
            L4e:
                r4 = r2
                r5 = r4
            L51:
                r6 = r5
            L52:
                r7 = r6
            L53:
                r3 = r2
                r8 = 0
            L55:
                if (r8 == 0) goto L64
                androidx.appcompat.widget.k1.a.f1400b = r4
                androidx.appcompat.widget.k1.a.f1401c = r5
                androidx.appcompat.widget.k1.a.f1402d = r6
                androidx.appcompat.widget.k1.a.f1403e = r7
                androidx.appcompat.widget.k1.a.f1404f = r3
                androidx.appcompat.widget.k1.a.f1399a = r0
                goto L70
            L64:
                androidx.appcompat.widget.k1.a.f1400b = r2
                androidx.appcompat.widget.k1.a.f1401c = r2
                androidx.appcompat.widget.k1.a.f1402d = r2
                androidx.appcompat.widget.k1.a.f1403e = r2
                androidx.appcompat.widget.k1.a.f1404f = r2
                androidx.appcompat.widget.k1.a.f1399a = r1
            L70:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k1.a.<clinit>():void");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Insets a(Drawable drawable) {
            Insets opticalInsets;
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (!(i10 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) && (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            return;
        }
        b(drawable);
    }

    public static void b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1396a);
        } else {
            drawable.setState(f1397b);
        }
        drawable.setState(state);
    }

    public static Rect c(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets a10 = b.a(drawable);
            return new Rect(a10.left, a10.top, a10.right, a10.bottom);
        }
        if (drawable instanceof b1.k) {
            drawable = ((b1.k) drawable).b();
        }
        if (i10 < 29) {
            if (a.f1399a) {
                try {
                    Object invoke = a.f1400b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(a.f1401c.getInt(invoke), a.f1402d.getInt(invoke), a.f1403e.getInt(invoke), a.f1404f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z10 = a.f1399a;
        }
        return f1398c;
    }

    public static PorterDuff.Mode d(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
