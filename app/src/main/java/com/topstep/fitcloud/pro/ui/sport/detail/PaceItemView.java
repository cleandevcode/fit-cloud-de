package com.topstep.fitcloud.pro.ui.sport.detail;

import a.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.topstep.fitcloud.pro.ui.sport.detail.a;

/* loaded from: classes2.dex */
public class PaceItemView extends View {

    /* renamed from: a */
    public a.c f12217a;

    /* renamed from: b */
    public String f12218b;

    /* renamed from: c */
    public double f12219c;

    /* renamed from: d */
    public int f12220d;

    /* renamed from: e */
    public Paint f12221e;

    /* renamed from: f */
    public Rect f12222f;

    /* renamed from: g */
    public RectF f12223g;

    /* renamed from: h */
    public RectF f12224h;

    /* renamed from: i */
    public float f12225i;

    /* renamed from: j */
    public boolean f12226j;

    public PaceItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12218b = "";
        this.f12220d = -16711936;
        Paint paint = new Paint(5);
        this.f12221e = paint;
        paint.setTextSize(36.0f);
        this.f12223g = new RectF();
        this.f12224h = new RectF();
        this.f12222f = new Rect();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a.c cVar;
        double d10;
        double d11;
        super.onDraw(canvas);
        this.f12223g.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f12225i = getHeight() / 3.0f;
        if (this.f12217a != null) {
            this.f12221e.getTextBounds("<00", 0, 3, this.f12222f);
            float width = (this.f12225i * 2.0f) + this.f12222f.width();
            Paint paint = this.f12221e;
            String str = this.f12218b;
            paint.getTextBounds(str, 0, str.length(), this.f12222f);
            float width2 = width + this.f12222f.width();
            float width3 = (getWidth() - 0.0f) - width2;
            if (this.f12217a.f12235a == 0) {
                d11 = width3;
                d10 = 0.5d;
            } else {
                d10 = width3;
                d11 = cVar.f12238d / this.f12219c;
            }
            this.f12224h.set(0.0f, 0.0f, ((float) (d11 * d10)) + width2, getHeight());
        }
        invalidate();
        if (this.f12217a == null) {
            return;
        }
        this.f12221e.setColor(-12303292);
        canvas.drawRoundRect(this.f12223g, getHeight() / 2.0f, getHeight() / 2.0f, this.f12221e);
        this.f12221e.setColor(this.f12220d);
        canvas.drawRoundRect(this.f12224h, getHeight() / 2.0f, getHeight() / 2.0f, this.f12221e);
        this.f12221e.setColor(-1);
        this.f12221e.getTextBounds("<00", 0, 3, this.f12222f);
        String valueOf = String.valueOf(this.f12217a.f12235a);
        if (this.f12226j && this.f12217a.f12237c < 1.0f) {
            valueOf = b.b("<", valueOf);
        }
        canvas.drawText(valueOf, this.f12225i, (this.f12222f.height() / 2.0f) + (getHeight() / 2.0f), this.f12221e);
        Paint paint2 = this.f12221e;
        String str2 = this.f12218b;
        paint2.getTextBounds(str2, 0, str2.length(), this.f12222f);
        canvas.drawText(this.f12218b, (this.f12224h.width() - this.f12225i) - this.f12222f.width(), (this.f12222f.height() / 2.0f) + (getHeight() / 2.0f), this.f12221e);
    }

    public void setIsLastItem(boolean z10) {
        this.f12226j = z10;
    }

    public void setPaceColor(int i10) {
        this.f12220d = i10;
    }
}
