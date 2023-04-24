package i1;

import android.annotation.NonNull;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class d implements Spannable {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f16209a;

        /* renamed from: b */
        public final TextDirectionHeuristic f16210b;

        /* renamed from: c */
        public final int f16211c;

        /* renamed from: d */
        public final int f16212d;

        public a(PrecomputedText.Params params) {
            this.f16209a = params.getTextPaint();
            this.f16210b = params.getTextDirection();
            this.f16211c = params.getBreakStrategy();
            this.f16212d = params.getHyphenationFrequency();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.text.PrecomputedText$Params$Builder] */
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    @NonNull
                    public native /* synthetic */ Params build();

                    public native /* synthetic */ Builder setBreakStrategy(int i12);

                    public native /* synthetic */ Builder setHyphenationFrequency(int i12);

                    public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
                }.setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f16209a = textPaint;
            this.f16210b = textDirectionHeuristic;
            this.f16211c = i10;
            this.f16212d = i11;
        }

        public final boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f16211c != aVar.f16211c || this.f16212d != aVar.f16212d)) || this.f16209a.getTextSize() != aVar.f16209a.getTextSize() || this.f16209a.getTextScaleX() != aVar.f16209a.getTextScaleX() || this.f16209a.getTextSkewX() != aVar.f16209a.getTextSkewX() || this.f16209a.getLetterSpacing() != aVar.f16209a.getLetterSpacing() || !TextUtils.equals(this.f16209a.getFontFeatureSettings(), aVar.f16209a.getFontFeatureSettings()) || this.f16209a.getFlags() != aVar.f16209a.getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f16209a.getTextLocales().equals(aVar.f16209a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f16209a.getTextLocale().equals(aVar.f16209a.getTextLocale())) {
                return false;
            }
            if (this.f16209a.getTypeface() == null) {
                if (aVar.f16209a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f16209a.getTypeface().equals(aVar.f16209a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.f16210b == aVar.f16210b;
            }
            return false;
        }

        public final int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT >= 24) {
                textLocales = this.f16209a.getTextLocales();
                return j1.b.b(Float.valueOf(this.f16209a.getTextSize()), Float.valueOf(this.f16209a.getTextScaleX()), Float.valueOf(this.f16209a.getTextSkewX()), Float.valueOf(this.f16209a.getLetterSpacing()), Integer.valueOf(this.f16209a.getFlags()), textLocales, this.f16209a.getTypeface(), Boolean.valueOf(this.f16209a.isElegantTextHeight()), this.f16210b, Integer.valueOf(this.f16211c), Integer.valueOf(this.f16212d));
            }
            return j1.b.b(Float.valueOf(this.f16209a.getTextSize()), Float.valueOf(this.f16209a.getTextScaleX()), Float.valueOf(this.f16209a.getTextSkewX()), Float.valueOf(this.f16209a.getLetterSpacing()), Integer.valueOf(this.f16209a.getFlags()), this.f16209a.getTextLocale(), this.f16209a.getTypeface(), Boolean.valueOf(this.f16209a.isElegantTextHeight()), this.f16210b, Integer.valueOf(this.f16211c), Integer.valueOf(this.f16212d));
        }

        public final String toString() {
            StringBuilder a10;
            Object textLocale;
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder a11 = android.support.v4.media.d.a("textSize=");
            a11.append(this.f16209a.getTextSize());
            sb2.append(a11.toString());
            sb2.append(", textScaleX=" + this.f16209a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f16209a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            StringBuilder a12 = android.support.v4.media.d.a(", letterSpacing=");
            a12.append(this.f16209a.getLetterSpacing());
            sb2.append(a12.toString());
            sb2.append(", elegantTextHeight=" + this.f16209a.isElegantTextHeight());
            if (i10 >= 24) {
                a10 = android.support.v4.media.d.a(", textLocale=");
                textLocale = this.f16209a.getTextLocales();
            } else {
                a10 = android.support.v4.media.d.a(", textLocale=");
                textLocale = this.f16209a.getTextLocale();
            }
            a10.append(textLocale);
            sb2.append(a10.toString());
            sb2.append(", typeface=" + this.f16209a.getTypeface());
            if (i10 >= 26) {
                StringBuilder a13 = android.support.v4.media.d.a(", variationSettings=");
                fontVariationSettings = this.f16209a.getFontVariationSettings();
                a13.append(fontVariationSettings);
                sb2.append(a13.toString());
            }
            StringBuilder a14 = android.support.v4.media.d.a(", textDir=");
            a14.append(this.f16210b);
            sb2.append(a14.toString());
            sb2.append(", breakStrategy=" + this.f16211c);
            sb2.append(", hyphenationFrequency=" + this.f16212d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        int i12 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i10 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i13 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
