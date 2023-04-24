package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final a f6422a;

    /* renamed from: b */
    public final View f6423b;

    /* renamed from: c */
    public final Paint f6424c;

    /* renamed from: d */
    public c.d f6425d;

    /* renamed from: e */
    public Drawable f6426e;

    /* loaded from: classes.dex */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    public b(a aVar) {
        this.f6422a = aVar;
        View view = (View) aVar;
        this.f6423b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f6424c = paint;
        paint.setColor(0);
    }
}
