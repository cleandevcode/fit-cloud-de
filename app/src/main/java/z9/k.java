package z9;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: m */
    public static final int f32136m;

    /* renamed from: n */
    public static boolean f32137n;

    /* renamed from: o */
    public static Constructor<StaticLayout> f32138o;

    /* renamed from: p */
    public static TextDirectionHeuristic f32139p;

    /* renamed from: a */
    public CharSequence f32140a;

    /* renamed from: b */
    public final TextPaint f32141b;

    /* renamed from: c */
    public final int f32142c;

    /* renamed from: d */
    public int f32143d;

    /* renamed from: k */
    public boolean f32150k;

    /* renamed from: e */
    public Layout.Alignment f32144e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f32145f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f32146g = 0.0f;

    /* renamed from: h */
    public float f32147h = 1.0f;

    /* renamed from: i */
    public int f32148i = f32136m;

    /* renamed from: j */
    public boolean f32149j = true;

    /* renamed from: l */
    public TextUtils.TruncateAt f32151l = null;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.Exception r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z9.k.a.<init>(java.lang.Exception):void");
        }
    }

    static {
        f32136m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public k(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f32140a = charSequence;
        this.f32141b = textPaint;
        this.f32142c = i10;
        this.f32143d = charSequence.length();
    }

    public final StaticLayout a() {
        boolean z10;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2;
        if (this.f32140a == null) {
            this.f32140a = "";
        }
        int max = Math.max(0, this.f32142c);
        CharSequence charSequence = this.f32140a;
        if (this.f32145f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f32141b, max, this.f32151l);
        }
        int min = Math.min(charSequence.length(), this.f32143d);
        this.f32143d = min;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (this.f32150k && this.f32145f == 1) {
                this.f32144e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence, 0, min, this.f32141b, max);
            obtain.setAlignment(this.f32144e);
            obtain.setIncludePad(this.f32149j);
            if (this.f32150k) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f32151l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f32145f);
            float f10 = this.f32146g;
            if (f10 != 0.0f || this.f32147h != 1.0f) {
                obtain.setLineSpacing(f10, this.f32147h);
            }
            if (this.f32145f > 1) {
                obtain.setHyphenationFrequency(this.f32148i);
            }
            return obtain.build();
        }
        if (!f32137n) {
            try {
                if (this.f32150k && i10 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f32139p = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f32138o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f32137n = true;
            } catch (Exception e10) {
                throw new a(e10);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f32138o;
            constructor.getClass();
            TextDirectionHeuristic textDirectionHeuristic3 = f32139p;
            textDirectionHeuristic3.getClass();
            return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f32143d), this.f32141b, Integer.valueOf(max), this.f32144e, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f32149j), null, Integer.valueOf(max), Integer.valueOf(this.f32145f));
        } catch (Exception e11) {
            throw new a(e11);
        }
    }
}
