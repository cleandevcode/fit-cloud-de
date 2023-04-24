package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.topstep.fitcloudpro.R;
import g7.a;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class ProgressDotView extends FrameLayout {

    /* renamed from: a */
    public final int f12379a;

    /* renamed from: b */
    public final int f12380b;

    /* renamed from: c */
    public final int f12381c;

    /* renamed from: d */
    public final int f12382d;

    /* renamed from: e */
    public final int f12383e;

    /* renamed from: f */
    public final int f12384f;

    /* renamed from: g */
    public final Paint f12385g;

    /* renamed from: h */
    public int f12386h;

    /* renamed from: i */
    public int f12387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        this.f12379a = 5;
        Paint paint = new Paint(5);
        this.f12385g = paint;
        this.f12387i = 1;
        setWillNotDraw(false);
        this.f12380b = a.a(context, 8.0f);
        this.f12381c = a.a(context, 5.0f);
        this.f12382d = u9.a.b(this, R.attr.colorPrimaryVariant);
        int b10 = u9.a.b(this, R.attr.colorError);
        this.f12383e = b10;
        this.f12384f = u9.a.b(this, R.attr.colorPrimary);
        paint.setColor(b10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        float f10 = this.f12380b / 2.0f;
        int i12 = this.f12386h;
        int i13 = 1;
        if (i12 != 1 && i12 != 2) {
            int i14 = this.f12387i;
            int i15 = this.f12379a;
            int i16 = i14 % (i15 + 1);
            if (1 <= i15) {
                int i17 = 1;
                while (true) {
                    this.f12385g.setColor(i17 == i16 ? this.f12384f : this.f12382d);
                    canvas.drawCircle(((i17 - 1) * this.f12380b) + (i11 * i17) + f10, this.f12381c + f10, f10, this.f12385g);
                    if (i17 == i15) {
                        break;
                    }
                    i17++;
                }
            }
            this.f12387i++;
            postInvalidateDelayed(200L);
            return;
        }
        this.f12385g.setColor(i12 == 1 ? this.f12383e : this.f12384f);
        int i18 = this.f12379a;
        if (1 > i18) {
            return;
        }
        while (true) {
            canvas.drawCircle(((i13 - 1) * this.f12380b) + (i10 * i13) + f10, this.f12381c + f10, f10, this.f12385g);
            if (i13 == i18) {
                return;
            }
            i13++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f12380b;
        int i13 = this.f12379a;
        int i14 = this.f12381c;
        setMeasuredDimension(((i13 + 1) * i14) + (i12 * i13), (i14 * 2) + i12);
    }
}
