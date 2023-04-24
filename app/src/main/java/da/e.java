package da;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.a0;
import com.google.android.material.R;
import z0.f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final ColorStateList f12925a;

    /* renamed from: b */
    public final String f12926b;

    /* renamed from: c */
    public final int f12927c;

    /* renamed from: d */
    public final int f12928d;

    /* renamed from: e */
    public final float f12929e;

    /* renamed from: f */
    public final float f12930f;

    /* renamed from: g */
    public final float f12931g;

    /* renamed from: h */
    public final boolean f12932h;

    /* renamed from: i */
    public final float f12933i;

    /* renamed from: j */
    public ColorStateList f12934j;

    /* renamed from: k */
    public float f12935k;

    /* renamed from: l */
    public final int f12936l;

    /* renamed from: m */
    public boolean f12937m = false;

    /* renamed from: n */
    public Typeface f12938n;

    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a */
        public final /* synthetic */ a0 f12939a;

        public a(a0 a0Var) {
            e.this = r1;
            this.f12939a = a0Var;
        }

        @Override // z0.f.e
        public final void c(int i10) {
            e.this.f12937m = true;
            this.f12939a.v(i10);
        }

        @Override // z0.f.e
        public final void d(Typeface typeface) {
            e eVar = e.this;
            eVar.f12938n = Typeface.create(typeface, eVar.f12927c);
            e eVar2 = e.this;
            eVar2.f12937m = true;
            this.f12939a.w(eVar2.f12938n, false);
        }
    }

    public e(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.TextAppearance);
        this.f12935k = obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
        this.f12934j = d.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
        d.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        d.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.f12927c = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.f12928d = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int i11 = R.styleable.TextAppearance_fontFamily;
        i11 = obtainStyledAttributes.hasValue(i11) ? i11 : R.styleable.TextAppearance_android_fontFamily;
        this.f12936l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f12926b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.f12925a = d.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.f12929e = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f12930f = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f12931g = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, R.styleable.MaterialTextAppearance);
        int i12 = R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.f12932h = obtainStyledAttributes2.hasValue(i12);
        this.f12933i = obtainStyledAttributes2.getFloat(i12, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f12938n == null && (str = this.f12926b) != null) {
            this.f12938n = Typeface.create(str, this.f12927c);
        }
        if (this.f12938n == null) {
            int i10 = this.f12928d;
            this.f12938n = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f12938n = Typeface.create(this.f12938n, this.f12927c);
        }
    }

    public final Typeface b(Context context) {
        if (this.f12937m) {
            return this.f12938n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = z0.f.a(context, this.f12936l);
                this.f12938n = a10;
                if (a10 != null) {
                    this.f12938n = Typeface.create(a10, this.f12927c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                StringBuilder a11 = android.support.v4.media.d.a("Error loading font ");
                a11.append(this.f12926b);
                Log.d("TextAppearance", a11.toString(), e10);
            }
        }
        a();
        this.f12937m = true;
        return this.f12938n;
    }

    public final void c(Context context, a0 a0Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f12936l;
        if (i10 == 0) {
            this.f12937m = true;
        }
        if (this.f12937m) {
            a0Var.w(this.f12938n, true);
            return;
        }
        try {
            a aVar = new a(a0Var);
            ThreadLocal<TypedValue> threadLocal = z0.f.f31856a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                z0.f.b(context, i10, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f12937m = true;
            a0Var.v(1);
        } catch (Exception e10) {
            StringBuilder a10 = android.support.v4.media.d.a("Error loading font ");
            a10.append(this.f12926b);
            Log.d("TextAppearance", a10.toString(), e10);
            this.f12937m = true;
            a0Var.v(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f12936l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = z0.f.f31856a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = z0.f.b(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: da.e.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, a0 a0Var) {
        f(context, textPaint, a0Var);
        ColorStateList colorStateList = this.f12934j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f12931g;
        float f11 = this.f12929e;
        float f12 = this.f12930f;
        ColorStateList colorStateList2 = this.f12925a;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, a0 a0Var) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f12938n);
        c(context, new f(this, context, textPaint, a0Var));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface a10 = g.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f12927c & (~typeface.getStyle());
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f12935k);
        if (this.f12932h) {
            textPaint.setLetterSpacing(this.f12933i);
        }
    }
}
