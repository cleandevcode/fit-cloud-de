package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: l */
    public static final RectF f1314l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f1315m = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f1316a = 0;

    /* renamed from: b */
    public boolean f1317b = false;

    /* renamed from: c */
    public float f1318c = -1.0f;

    /* renamed from: d */
    public float f1319d = -1.0f;

    /* renamed from: e */
    public float f1320e = -1.0f;

    /* renamed from: f */
    public int[] f1321f = new int[0];

    /* renamed from: g */
    public boolean f1322g = false;

    /* renamed from: h */
    public TextPaint f1323h;

    /* renamed from: i */
    public final TextView f1324i;

    /* renamed from: j */
    public final Context f1325j;

    /* renamed from: k */
    public final f f1326k;

    /* loaded from: classes.dex */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout$Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.appcompat.widget.e1.f
        public void a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
            staticLayout$Builder.setTextDirection((TextDirectionHeuristic) e1.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.appcompat.widget.e1.d, androidx.appcompat.widget.e1.f
        public void a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            staticLayout$Builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.e1.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public void a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) e1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public e1(TextView textView) {
        this.f1324i = textView;
        this.f1325j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f1326k = i10 >= 29 ? new e() : i10 >= 23 ? new d() : new f();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            Method method = f1315m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1315m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t10) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    public final void a() {
        boolean z10;
        int measuredWidth;
        if (i() && this.f1316a != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (this.f1317b) {
            if (this.f1324i.getMeasuredHeight() > 0 && this.f1324i.getMeasuredWidth() > 0) {
                if (this.f1326k.b(this.f1324i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f1324i.getMeasuredWidth() - this.f1324i.getTotalPaddingLeft()) - this.f1324i.getTotalPaddingRight();
                }
                int height = (this.f1324i.getHeight() - this.f1324i.getCompoundPaddingBottom()) - this.f1324i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f1314l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f1324i.getTextSize()) {
                            f(c10, 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1317b = true;
    }

    public final int c(RectF rectF) {
        int i10;
        StaticLayout a10;
        boolean z10;
        CharSequence transformation;
        int length = this.f1321f.length;
        if (length != 0) {
            int i11 = length - 1;
            int i12 = 1;
            int i13 = 0;
            while (i12 <= i11) {
                int i14 = (i12 + i11) / 2;
                int i15 = this.f1321f[i14];
                CharSequence text = this.f1324i.getText();
                TransformationMethod transformationMethod = this.f1324i.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1324i)) != null) {
                    text = transformation;
                }
                int i16 = Build.VERSION.SDK_INT;
                int b10 = a.b(this.f1324i);
                TextPaint textPaint = this.f1323h;
                if (textPaint == null) {
                    this.f1323h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f1323h.set(this.f1324i.getPaint());
                this.f1323h.setTextSize(i15);
                Layout.Alignment alignment = (Layout.Alignment) e(this.f1324i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i16 >= 23) {
                    i10 = b10;
                    a10 = c.a(text, alignment, round, b10, this.f1324i, this.f1323h, this.f1326k);
                } else {
                    i10 = b10;
                    a10 = a.a(text, alignment, round, this.f1324i, this.f1323h);
                }
                if ((i10 != -1 && (a10.getLineCount() > i10 || a10.getLineEnd(a10.getLineCount() - 1) != text.length())) || a10.getHeight() > rectF.bottom) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    int i17 = i14 + 1;
                    i13 = i12;
                    i12 = i17;
                } else {
                    i13 = i14 - 1;
                    i11 = i13;
                }
            }
            return this.f1321f[i13];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(float f10, int i10) {
        Context context = this.f1325j;
        float applyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f1324i.getPaint().getTextSize()) {
            this.f1324i.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(this.f1324i);
            if (this.f1324i.getLayout() != null) {
                this.f1317b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(this.f1324i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (a10) {
                    this.f1324i.forceLayout();
                } else {
                    this.f1324i.requestLayout();
                }
                this.f1324i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f1316a == 1) {
            if (!this.f1322g || this.f1321f.length == 0) {
                int floor = ((int) Math.floor((this.f1320e - this.f1319d) / this.f1318c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f1318c) + this.f1319d);
                }
                this.f1321f = b(iArr);
            }
            this.f1317b = true;
        } else {
            this.f1317b = false;
        }
        return this.f1317b;
    }

    public final boolean h() {
        int[] iArr = this.f1321f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1322g = z10;
        if (z10) {
            this.f1316a = 1;
            this.f1319d = iArr[0];
            this.f1320e = iArr[length - 1];
            this.f1318c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f1324i instanceof l);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        } else {
            this.f1316a = 1;
            this.f1319d = f10;
            this.f1320e = f11;
            this.f1318c = f12;
            this.f1322g = false;
        }
    }
}
