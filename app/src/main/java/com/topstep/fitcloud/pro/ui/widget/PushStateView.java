package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.d1;
import com.topstep.fitcloudpro.R;
import gm.l;
import kotlin.Metadata;
import u9.a;

@Metadata
/* loaded from: classes2.dex */
public final class PushStateView extends d1 {

    /* renamed from: g */
    public int f12388g;

    /* renamed from: h */
    public final Paint f12389h;

    /* renamed from: i */
    public final RectF f12390i;

    /* renamed from: j */
    public final int f12391j;

    /* renamed from: k */
    public final int f12392k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
        l.f(context, "context");
        this.f12388g = 100;
        this.f12389h = new Paint();
        this.f12390i = new RectF();
        this.f12391j = a.b(this, R.attr.colorPrimary);
        int b10 = a.b(this, R.attr.colorOnSurface);
        this.f12392k = Color.argb(30, Color.red(b10), Color.green(b10), Color.blue(b10));
    }

    public final int getProgress() {
        return this.f12388g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        this.f12390i.set(0.0f, 0.0f, getWidth(), getHeight());
        if (isEnabled()) {
            this.f12389h.setColor(this.f12391j);
            if (this.f12388g > 0) {
                this.f12389h.setAlpha(153);
                canvas.drawRect(this.f12390i, this.f12389h);
                this.f12390i.set(0.0f, 0.0f, (this.f12388g / 100.0f) * getWidth(), getHeight());
            }
            this.f12389h.setAlpha(255);
        } else {
            this.f12389h.setColor(this.f12392k);
        }
        canvas.drawRect(this.f12390i, this.f12389h);
        super.onDraw(canvas);
    }

    public final void setProgress(int i10) {
        this.f12388g = i10;
    }
}
