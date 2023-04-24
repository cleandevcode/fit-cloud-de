package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import g7.a;

/* loaded from: classes2.dex */
public class UpgradeProgressLayout extends RelativeLayout {

    /* renamed from: a */
    public int f12474a;

    /* renamed from: b */
    public int f12475b;

    /* renamed from: c */
    public int f12476c;

    /* renamed from: d */
    public Paint f12477d;

    /* renamed from: e */
    public RectF f12478e;

    /* renamed from: f */
    public int f12479f;

    /* renamed from: g */
    public ImageView f12480g;

    /* renamed from: h */
    public TextView f12481h;

    public UpgradeProgressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12479f = 0;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_upgrade_progress, this);
        this.f12480g = (ImageView) findViewById(R.id.img_progress);
        this.f12481h = (TextView) findViewById(R.id.tv_status);
        setWillNotDraw(false);
        this.f12474a = a.a(getContext(), 8.0f);
        this.f12475b = u9.a.b(this, R.attr.colorPrimary);
        this.f12476c = -16711936;
        Paint paint = new Paint(5);
        this.f12477d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f12477d.setStyle(Paint.Style.STROKE);
        this.f12477d.setStrokeWidth(this.f12474a);
        RectF rectF = new RectF();
        this.f12478e = rectF;
        float f10 = this.f12474a / 2.0f;
        rectF.left = f10;
        rectF.top = f10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12477d.setColor(this.f12475b);
        canvas.drawArc(this.f12478e, -90.0f, 360.0f, false, this.f12477d);
        this.f12477d.setColor(this.f12476c);
        canvas.drawArc(this.f12478e, -90.0f, (this.f12479f / 100.0f) * 360.0f, false, this.f12477d);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f12478e.right = getMeasuredWidth() - (this.f12474a / 2.0f);
        this.f12478e.bottom = getMeasuredHeight() - (this.f12474a / 2.0f);
    }

    public void setStateProgress(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f12479f = i10;
        this.f12481h.setText(getContext().getString(R.string.percent_param, Integer.valueOf(i10)));
        if (this.f12480g.getAnimation() == null) {
            this.f12480g.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.upgrade_icon_flip));
        }
        invalidate();
    }

    public void setStateStop(boolean z10) {
        TextView textView;
        int i10;
        this.f12480g.clearAnimation();
        if (z10) {
            textView = this.f12481h;
            i10 = R.string.tip_success;
        } else {
            textView = this.f12481h;
            i10 = R.string.tip_failed;
        }
        textView.setText(i10);
    }
}
