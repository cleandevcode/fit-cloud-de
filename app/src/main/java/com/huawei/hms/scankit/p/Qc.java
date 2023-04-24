package com.huawei.hms.scankit.p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public class Qc {

    /* renamed from: a */
    private long f7667a = 0;

    /* renamed from: b */
    private long f7668b = 0;

    /* renamed from: c */
    private int f7669c;

    /* renamed from: d */
    private int f7670d;

    /* renamed from: e */
    private int f7671e;

    /* renamed from: f */
    private float f7672f;

    /* renamed from: g */
    private Rect f7673g;

    /* renamed from: h */
    private Rc f7674h;

    public Qc(Rc rc2, Rect rect, int i10, float f10, int[] iArr) {
        this.f7669c = 0;
        this.f7670d = 0;
        this.f7674h = rc2;
        this.f7673g = rect;
        this.f7671e = i10;
        if (iArr != null && iArr.length >= 2) {
            this.f7669c = iArr[0];
            this.f7670d = iArr[1];
        }
        this.f7672f = f10;
        c();
    }

    private void a() {
        Rc rc2 = this.f7674h;
        if (rc2 != null) {
            rc2.a();
        }
    }

    private void a(Canvas canvas, Rect rect, List<Pc> list) {
        for (Pc pc2 : list) {
            Paint paint = new Paint();
            if (pc2.b() == 0) {
                pc2.b(b());
            }
            paint.setColor(pc2.b());
            boolean z10 = pc2.d() > ((float) Math.max(rect.top, rect.bottom)) || pc2.d() < ((float) Math.min(rect.top, rect.bottom));
            float f10 = 0.0f;
            if (rect.height() != 0 && rect.width() != 0 && !z10) {
                f10 = (rect.bottom - pc2.d()) / rect.height();
            }
            int abs = (int) (Math.abs(f10) * pc2.a());
            if (abs > 0) {
                paint.setAlpha(abs);
                canvas.drawCircle(pc2.c(), pc2.d(), pc2.f() * this.f7672f, paint);
            }
        }
    }

    private int b() {
        float a10 = Yc.a(1.0f);
        int red = Color.red(this.f7669c);
        int blue = Color.blue(this.f7669c);
        int green = Color.green(this.f7669c);
        return Color.rgb((int) (((Color.red(this.f7670d) - red) * a10) + 0.5f + red), (int) (((Color.green(this.f7670d) - green) * a10) + 0.5f + green), (int) (((Color.blue(this.f7670d) - blue) * a10) + 0.5f + blue));
    }

    private void c() {
        Rect rect;
        a();
        this.f7668b = 0L;
        this.f7667a = System.currentTimeMillis();
        Rc rc2 = this.f7674h;
        if (rc2 == null || (rect = this.f7673g) == null) {
            return;
        }
        rc2.a(rect, this.f7671e);
    }

    public void a(Canvas canvas, Rect rect) {
        if (this.f7674h == null || canvas == null || rect == null) {
            return;
        }
        long currentTimeMillis = this.f7668b + (System.currentTimeMillis() - this.f7667a);
        this.f7668b = currentTimeMillis;
        this.f7674h.a(currentTimeMillis);
        List<Pc> b10 = this.f7674h.b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        a(canvas, rect, b10);
        this.f7667a = System.currentTimeMillis();
    }
}
