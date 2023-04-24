package o1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import i1.d;
import java.lang.reflect.Method;
import java.util.Locale;
import s.h1;

/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(TextView textView) {
            int breakStrategy;
            breakStrategy = textView.getBreakStrategy();
            return breakStrategy;
        }

        public static ColorStateList b(TextView textView) {
            ColorStateList compoundDrawableTintList;
            compoundDrawableTintList = textView.getCompoundDrawableTintList();
            return compoundDrawableTintList;
        }

        public static PorterDuff.Mode c(TextView textView) {
            PorterDuff.Mode compoundDrawableTintMode;
            compoundDrawableTintMode = textView.getCompoundDrawableTintMode();
            return compoundDrawableTintMode;
        }

        public static int d(TextView textView) {
            int hyphenationFrequency;
            hyphenationFrequency = textView.getHyphenationFrequency();
            return hyphenationFrequency;
        }

        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        public static PrecomputedText.Params b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        public static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f22595a;

        /* renamed from: b */
        public final TextView f22596b;

        /* renamed from: c */
        public Class<?> f22597c;

        /* renamed from: d */
        public Method f22598d;

        /* renamed from: e */
        public boolean f22599e;

        /* renamed from: f */
        public boolean f22600f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f22595a = callback;
            this.f22596b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f22595a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f22595a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f22595a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Code restructure failed: missing block: B:115:0x00c9, code lost:
            if (r9 == 0) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:145:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o1.p.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0061, code lost:
        if (r9 != 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0072, code lost:
        if (r4 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i1.d.a a(android.widget.TextView r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            i1.d$a r0 = new i1.d$a
            android.text.PrecomputedText$Params r9 = o1.p.e.b(r9)
            r0.<init>(r9)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r9.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 23
            r6 = 1
            if (r3 < r5) goto L24
            r3 = 1
            r7 = 1
            goto L26
        L24:
            r3 = 0
            r7 = 0
        L26:
            android.text.TextDirectionHeuristic r8 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 < r5) goto L32
            int r3 = o1.p.c.a(r9)
            int r7 = o1.p.c.d(r9)
        L32:
            android.text.method.TransformationMethod r5 = r9.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L3d
        L3a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LTR
            goto L82
        L3d:
            if (r0 < r1) goto L64
            int r0 = r9.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L64
            java.util.Locale r9 = o1.p.b.d(r9)
            android.icu.text.DecimalFormatSymbols r9 = o1.p.d.a(r9)
            java.lang.String[] r9 = o1.p.e.a(r9)
            r9 = r9[r4]
            int r9 = r9.codePointAt(r4)
            byte r9 = java.lang.Character.getDirectionality(r9)
            if (r9 == r6) goto L7a
            r0 = 2
            if (r9 != r0) goto L3a
            goto L7a
        L64:
            int r0 = o1.p.b.b(r9)
            if (r0 != r6) goto L6b
            r4 = 1
        L6b:
            int r9 = o1.p.b.c(r9)
            switch(r9) {
                case 2: goto L7d;
                case 3: goto L3a;
                case 4: goto L7a;
                case 5: goto L77;
                case 6: goto L80;
                case 7: goto L74;
                default: goto L72;
            }
        L72:
            if (r4 == 0) goto L80
        L74:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L82
        L77:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LOCALE
            goto L82
        L7a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.RTL
            goto L82
        L7d:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L82
        L80:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L82:
            i1.d$a r0 = new i1.d$a
            r0.<init>(r2, r9, r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.p.a(android.widget.TextView):i1.d$a");
    }

    public static void b(TextView textView, int i10) {
        h1.h(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i10) {
        h1.h(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void d(TextView textView, i1.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            dVar.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        d.a a10 = a(textView);
        dVar.getClass();
        if (!a10.a(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(dVar);
    }

    public static void e(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static ActionMode.Callback f(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).f22595a;
    }

    public static ActionMode.Callback g(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
