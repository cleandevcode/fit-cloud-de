package z0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import z0.f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f31856a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<d, SparseArray<c>> f31857b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f31858c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            int color;
            color = resources.getColor(i10, theme);
            return color;
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            ColorStateList colorStateList;
            colorStateList = resources.getColorStateList(i10, theme);
            return colorStateList;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final ColorStateList f31859a;

        /* renamed from: b */
        public final Configuration f31860b;

        /* renamed from: c */
        public final int f31861c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f31859a = colorStateList;
            this.f31860b = configuration;
            this.f31861c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final Resources f31862a;

        /* renamed from: b */
        public final Resources.Theme f31863b;

        public d(Resources resources, Resources.Theme theme) {
            this.f31862a = resources;
            this.f31863b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f31862a.equals(dVar.f31862a) && j1.b.a(this.f31863b, dVar.f31863b);
        }

        public final int hashCode() {
            return j1.b.b(this.f31862a, this.f31863b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public final void a(final int i10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: z0.i
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.c(i10);
                }
            });
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new t.n(this, typeface, 7));
        }

        public abstract void c(int i10);

        public abstract void d(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0024, code lost:
        if (r20 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00bb, code lost:
        if (r20 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00bd, code lost:
        r20.a(-3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, z0.f.e r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f.b(android.content.Context, int, android.util.TypedValue, int, z0.f$e, boolean, boolean):android.graphics.Typeface");
    }
}
