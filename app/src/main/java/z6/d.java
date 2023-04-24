package z6;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final int f31995a;

    /* renamed from: b */
    public final int f31996b;

    /* renamed from: c */
    public final int f31997c;

    /* renamed from: d */
    public final Paint f31998d;

    /* renamed from: e */
    public final float f31999e;

    public d(int i10, int i11, int i12, int i13) {
        this.f31995a = i10;
        this.f31996b = i12;
        this.f31997c = i13;
        Paint paint = new Paint(5);
        this.f31998d = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(i11);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f31999e = (-fontMetrics.ascent) - fontMetrics.descent;
    }
}
