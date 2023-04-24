package fa;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i */
    public static final int[] f14207i = new int[3];

    /* renamed from: j */
    public static final float[] f14208j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f14209k = new int[4];

    /* renamed from: l */
    public static final float[] f14210l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b */
    public final Paint f14212b;

    /* renamed from: c */
    public final Paint f14213c;

    /* renamed from: d */
    public int f14214d;

    /* renamed from: e */
    public int f14215e;

    /* renamed from: f */
    public int f14216f;

    /* renamed from: g */
    public final Path f14217g = new Path();

    /* renamed from: h */
    public Paint f14218h = new Paint();

    /* renamed from: a */
    public final Paint f14211a = new Paint();

    public a() {
        a(-16777216);
        this.f14218h.setColor(0);
        Paint paint = new Paint(4);
        this.f14212b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f14213c = new Paint(paint);
    }

    public final void a(int i10) {
        this.f14214d = a1.a.d(i10, 68);
        this.f14215e = a1.a.d(i10, 20);
        this.f14216f = a1.a.d(i10, 0);
        this.f14211a.setColor(this.f14214d);
    }
}
