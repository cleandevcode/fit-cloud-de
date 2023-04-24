package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k1.o0;
import z0.f;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a */
    public final TextView f1566a;

    /* renamed from: b */
    public j2 f1567b;

    /* renamed from: c */
    public j2 f1568c;

    /* renamed from: d */
    public j2 f1569d;

    /* renamed from: e */
    public j2 f1570e;

    /* renamed from: f */
    public j2 f1571f;

    /* renamed from: g */
    public j2 f1572g;

    /* renamed from: h */
    public j2 f1573h;

    /* renamed from: i */
    public final e1 f1574i;

    /* renamed from: j */
    public int f1575j = 0;

    /* renamed from: k */
    public int f1576k = -1;

    /* renamed from: l */
    public Typeface f1577l;

    /* renamed from: m */
    public boolean f1578m;

    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a */
        public final /* synthetic */ int f1579a;

        /* renamed from: b */
        public final /* synthetic */ int f1580b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f1581c;

        public a(int i10, int i11, WeakReference weakReference) {
            v0.this = r1;
            this.f1579a = i10;
            this.f1580b = i11;
            this.f1581c = weakReference;
        }

        @Override // z0.f.e
        public final void c(int i10) {
        }

        @Override // z0.f.e
        public final void d(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1579a) != -1) {
                if ((this.f1580b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = f.a(typeface, i10, z10);
            }
            v0 v0Var = v0.this;
            WeakReference weakReference = this.f1581c;
            if (v0Var.f1578m) {
                v0Var.f1577l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
                    if (o0.g.b(textView)) {
                        textView.post(new w0(textView, typeface, v0Var.f1575j));
                    } else {
                        textView.setTypeface(typeface, v0Var.f1575j);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            Typeface create;
            create = Typeface.create(typeface, i10, z10);
            return create;
        }
    }

    public v0(TextView textView) {
        this.f1566a = textView;
        this.f1574i = new e1(textView);
    }

    public static j2 c(Context context, k kVar, int i10) {
        ColorStateList i11;
        synchronized (kVar) {
            i11 = kVar.f1386a.i(context, i10);
        }
        if (i11 != null) {
            j2 j2Var = new j2();
            j2Var.f1383d = true;
            j2Var.f1380a = i11;
            return j2Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        CharSequence subSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 >= 0 && i11 <= length) {
                int i16 = editorInfo.inputType & 4095;
                if (i16 != 129 && i16 != 225 && i16 != 18) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (length <= 2048) {
                        n1.b.c(editorInfo, text, i10, i11);
                        return;
                    }
                    int i17 = i11 - i10;
                    if (i17 > 1024) {
                        i12 = 0;
                    } else {
                        i12 = i17;
                    }
                    int i18 = 2048 - i12;
                    int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (i18 * 0.8d)));
                    int min2 = Math.min(i10, i18 - min);
                    int i19 = i10 - min2;
                    if (Character.isLowSurrogate(text.charAt(i19))) {
                        i19++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                        min--;
                    }
                    int i20 = min2 + i12 + min;
                    if (i12 != i17) {
                        subSequence = TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11));
                    } else {
                        subSequence = text.subSequence(i19, i20 + i19);
                    }
                    int i21 = min2 + 0;
                    n1.b.c(editorInfo, subSequence, i21, i12 + i21);
                    return;
                }
            }
            n1.b.c(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, j2 j2Var) {
        if (drawable == null || j2Var == null) {
            return;
        }
        k.e(drawable, j2Var, this.f1566a.getDrawableState());
    }

    public final void b() {
        if (this.f1567b != null || this.f1568c != null || this.f1569d != null || this.f1570e != null) {
            Drawable[] compoundDrawables = this.f1566a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1567b);
            a(compoundDrawables[1], this.f1568c);
            a(compoundDrawables[2], this.f1569d);
            a(compoundDrawables[3], this.f1570e);
        }
        if (this.f1571f == null && this.f1572g == null) {
            return;
        }
        Drawable[] a10 = b.a(this.f1566a);
        a(a10[0], this.f1571f);
        a(a10[2], this.f1572g);
    }

    public final ColorStateList d() {
        j2 j2Var = this.f1573h;
        if (j2Var != null) {
            return j2Var.f1380a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        j2 j2Var = this.f1573h;
        if (j2Var != null) {
            return j2Var.f1381b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:297:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:532:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i10) {
        String j10;
        ColorStateList b10;
        ColorStateList b11;
        ColorStateList b12;
        l2 l2Var = new l2(context, context.obtainStyledAttributes(i10, R.styleable.TextAppearance));
        int i11 = R.styleable.TextAppearance_textAllCaps;
        if (l2Var.l(i11)) {
            this.f1566a.setAllCaps(l2Var.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = R.styleable.TextAppearance_android_textColor;
            if (l2Var.l(i13) && (b12 = l2Var.b(i13)) != null) {
                this.f1566a.setTextColor(b12);
            }
            int i14 = R.styleable.TextAppearance_android_textColorLink;
            if (l2Var.l(i14) && (b11 = l2Var.b(i14)) != null) {
                this.f1566a.setLinkTextColor(b11);
            }
            int i15 = R.styleable.TextAppearance_android_textColorHint;
            if (l2Var.l(i15) && (b10 = l2Var.b(i15)) != null) {
                this.f1566a.setHintTextColor(b10);
            }
        }
        int i16 = R.styleable.TextAppearance_android_textSize;
        if (l2Var.l(i16) && l2Var.d(i16, -1) == 0) {
            this.f1566a.setTextSize(0, 0.0f);
        }
        n(context, l2Var);
        if (i12 >= 26) {
            int i17 = R.styleable.TextAppearance_fontVariationSettings;
            if (l2Var.l(i17) && (j10 = l2Var.j(i17)) != null) {
                e.d(this.f1566a, j10);
            }
        }
        l2Var.n();
        Typeface typeface = this.f1577l;
        if (typeface != null) {
            this.f1566a.setTypeface(typeface, this.f1575j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        e1 e1Var = this.f1574i;
        if (e1Var.i()) {
            DisplayMetrics displayMetrics = e1Var.f1325j.getResources().getDisplayMetrics();
            e1Var.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (e1Var.g()) {
                e1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        e1 e1Var = this.f1574i;
        if (e1Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e1Var.f1325j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                e1Var.f1321f = e1.b(iArr2);
                if (!e1Var.h()) {
                    StringBuilder a10 = android.support.v4.media.d.a("None of the preset sizes is valid: ");
                    a10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a10.toString());
                }
            } else {
                e1Var.f1322g = false;
            }
            if (e1Var.g()) {
                e1Var.a();
            }
        }
    }

    public final void k(int i10) {
        e1 e1Var = this.f1574i;
        if (e1Var.i()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = e1Var.f1325j.getResources().getDisplayMetrics();
                    e1Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (e1Var.g()) {
                        e1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(u0.a("Unknown auto-size text type: ", i10));
            }
            e1Var.f1316a = 0;
            e1Var.f1319d = -1.0f;
            e1Var.f1320e = -1.0f;
            e1Var.f1318c = -1.0f;
            e1Var.f1321f = new int[0];
            e1Var.f1317b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f1573h == null) {
            this.f1573h = new j2();
        }
        j2 j2Var = this.f1573h;
        j2Var.f1380a = colorStateList;
        j2Var.f1383d = colorStateList != null;
        this.f1567b = j2Var;
        this.f1568c = j2Var;
        this.f1569d = j2Var;
        this.f1570e = j2Var;
        this.f1571f = j2Var;
        this.f1572g = j2Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f1573h == null) {
            this.f1573h = new j2();
        }
        j2 j2Var = this.f1573h;
        j2Var.f1381b = mode;
        j2Var.f1382c = mode != null;
        this.f1567b = j2Var;
        this.f1568c = j2Var;
        this.f1569d = j2Var;
        this.f1570e = j2Var;
        this.f1571f = j2Var;
        this.f1572g = j2Var;
    }

    public final void n(Context context, l2 l2Var) {
        String j10;
        Typeface create;
        Typeface typeface;
        this.f1575j = l2Var.h(R.styleable.TextAppearance_android_textStyle, this.f1575j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int h10 = l2Var.h(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.f1576k = h10;
            if (h10 != -1) {
                this.f1575j = (this.f1575j & 2) | 0;
            }
        }
        int i11 = R.styleable.TextAppearance_android_fontFamily;
        if (!l2Var.l(i11) && !l2Var.l(R.styleable.TextAppearance_fontFamily)) {
            int i12 = R.styleable.TextAppearance_android_typeface;
            if (l2Var.l(i12)) {
                this.f1578m = false;
                int h11 = l2Var.h(i12, 1);
                if (h11 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (h11 == 2) {
                    typeface = Typeface.SERIF;
                } else if (h11 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1577l = typeface;
                return;
            }
            return;
        }
        this.f1577l = null;
        int i13 = R.styleable.TextAppearance_fontFamily;
        if (l2Var.l(i13)) {
            i11 = i13;
        }
        int i14 = this.f1576k;
        int i15 = this.f1575j;
        if (!context.isRestricted()) {
            try {
                Typeface g10 = l2Var.g(i11, this.f1575j, new a(i14, i15, new WeakReference(this.f1566a)));
                if (g10 != null) {
                    if (i10 >= 28 && this.f1576k != -1) {
                        g10 = f.a(Typeface.create(g10, 0), this.f1576k, (this.f1575j & 2) != 0);
                    }
                    this.f1577l = g10;
                }
                this.f1578m = this.f1577l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1577l != null || (j10 = l2Var.j(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1576k == -1) {
            create = Typeface.create(j10, this.f1575j);
        } else {
            create = f.a(Typeface.create(j10, 0), this.f1576k, (this.f1575j & 2) != 0);
        }
        this.f1577l = create;
    }
}
