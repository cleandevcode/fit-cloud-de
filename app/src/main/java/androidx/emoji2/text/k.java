package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import s.h1;

/* loaded from: classes.dex */
public abstract class k extends ReplacementSpan {

    /* renamed from: b */
    public final i f2273b;

    /* renamed from: a */
    public final Paint.FontMetricsInt f2272a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public float f2274c = 1.0f;

    public k(i iVar) {
        h1.i(iVar, "metadata cannot be null");
        this.f2273b = iVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        paint.getFontMetricsInt(this.f2272a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2272a;
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        x1.a c10 = this.f2273b.c();
        int a10 = c10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = c10.f30165b.getShort(a10 + c10.f30164a);
        } else {
            s10 = 0;
        }
        this.f2274c = abs / s10;
        x1.a c11 = this.f2273b.c();
        int a11 = c11.a(14);
        if (a11 != 0) {
            c11.f30165b.getShort(a11 + c11.f30164a);
        }
        x1.a c12 = this.f2273b.c();
        int a12 = c12.a(12);
        if (a12 != 0) {
            s11 = c12.f30165b.getShort(a12 + c12.f30164a);
        }
        short s12 = (short) (s11 * this.f2274c);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2272a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s12;
    }
}
