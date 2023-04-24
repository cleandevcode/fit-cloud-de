package com.topstep.fitcloud.pro.ui.device.dial.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.bumptech.glide.n;
import com.topstep.fitcloud.pro.model.dial.DialComponent;
import gm.l;
import j5.h;
import java.util.List;
import kotlin.Metadata;
import sj.e;
import ul.q;

@Metadata
/* loaded from: classes2.dex */
public final class DialComponentView extends View {

    /* renamed from: a */
    public int f10972a;

    /* renamed from: b */
    public int f10973b;

    /* renamed from: c */
    public e f10974c;

    /* renamed from: d */
    public List<DialComponent> f10975d;

    /* renamed from: e */
    public Bitmap f10976e;

    /* renamed from: f */
    public Bitmap[] f10977f;

    /* renamed from: g */
    public final SparseArray<h<?>> f10978g;

    /* renamed from: h */
    public final Paint f10979h;

    /* renamed from: i */
    public final PorterDuffXfermode f10980i;

    /* renamed from: j */
    public final RectF f10981j;

    /* renamed from: k */
    public final Matrix f10982k;

    /* loaded from: classes2.dex */
    public static final class a extends j5.c<Bitmap> {

        /* renamed from: e */
        public final /* synthetic */ int f10984e;

        public a(int i10) {
            DialComponentView.this = r1;
            this.f10984e = i10;
        }

        @Override // j5.h
        public final void c(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            DialComponentView dialComponentView = DialComponentView.this;
            Bitmap[] bitmapArr = dialComponentView.f10977f;
            if (bitmapArr != null) {
                bitmapArr[this.f10984e] = bitmap;
            }
            dialComponentView.invalidate();
        }

        @Override // j5.h
        public final void h(Drawable drawable) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f10974c = new e(0, 240, 240, 0);
        this.f10978g = new SparseArray<>();
        Paint paint = new Paint(7);
        paint.setColor(-1184275);
        this.f10979h = paint;
        this.f10980i = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f10981j = new RectF();
        this.f10982k = new Matrix();
    }

    private final int getStyleBaseOnWidth() {
        return this.f10974c.f27096b * 2;
    }

    public final void a(int i10) {
        DialComponent dialComponent;
        String styleCurrentUrl;
        h<?> hVar = this.f10978g.get(i10);
        if (hVar != null) {
            com.bumptech.glide.b.e(getContext()).j(hVar);
        }
        List<DialComponent> list = this.f10975d;
        if (list != null && (dialComponent = (DialComponent) q.J(i10, list)) != null && (styleCurrentUrl = dialComponent.getStyleCurrentUrl()) != null) {
            n<Bitmap> C = com.bumptech.glide.b.e(getContext()).i().C(styleCurrentUrl);
            a aVar = new a(i10);
            C.B(aVar, C);
            this.f10978g.put(i10, aVar);
        }
    }

    public final List<DialComponent> getComponents() {
        return this.f10975d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate((getWidth() - this.f10972a) / 2.0f, (getHeight() - this.f10973b) / 2.0f);
        int saveLayer = canvas.saveLayer(this.f10981j, this.f10979h);
        e eVar = this.f10974c;
        boolean z10 = true;
        if (eVar.f27095a != 1) {
            z10 = false;
        }
        if (z10) {
            canvas.drawCircle(this.f10981j.centerX(), this.f10981j.centerY(), this.f10981j.width() / 2.0f, this.f10979h);
        } else {
            RectF rectF = this.f10981j;
            float f10 = eVar.f27098d;
            canvas.drawRoundRect(rectF, f10, f10, this.f10979h);
        }
        Bitmap bitmap2 = this.f10976e;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f10979h.setXfermode(this.f10980i);
            float width = this.f10981j.width();
            float height = this.f10981j.height();
            Matrix matrix = this.f10982k;
            matrix.reset();
            float f11 = width / 2.0f;
            float f12 = height / 2.0f;
            matrix.setTranslate(f11 - (bitmap2.getWidth() / 2.0f), f12 - (bitmap2.getHeight() / 2.0f));
            float width2 = width / bitmap2.getWidth();
            float height2 = height / bitmap2.getHeight();
            if (width2 < height2) {
                width2 = height2;
            }
            matrix.postScale(width2, width2, f11, f12);
            canvas.drawBitmap(bitmap2, this.f10982k, this.f10979h);
            this.f10979h.setXfermode(null);
        }
        canvas.restoreToCount(saveLayer);
        List<DialComponent> list = this.f10975d;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Bitmap[] bitmapArr = this.f10977f;
                if (bitmapArr != null && i10 >= 0 && i10 <= bitmapArr.length - 1) {
                    bitmap = bitmapArr[i10];
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    int styleBaseOnWidth = getStyleBaseOnWidth();
                    float width3 = this.f10981j.width();
                    int positionX = list.get(i10).getPositionX();
                    int positionY = list.get(i10).getPositionY();
                    Matrix matrix2 = this.f10982k;
                    matrix2.reset();
                    float f13 = width3 / styleBaseOnWidth;
                    matrix2.setScale(f13, f13);
                    float f14 = width3 / this.f10974c.f27096b;
                    matrix2.postTranslate(positionX * f14, positionY * f14);
                    canvas.drawBitmap(bitmap, this.f10982k, this.f10979h);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        this.f10972a = defaultSize;
        e eVar = this.f10974c;
        this.f10973b = (int) ((eVar.f27097c / eVar.f27096b) * defaultSize);
        int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i11);
        if (this.f10973b > defaultSize2) {
            this.f10973b = defaultSize2;
            e eVar2 = this.f10974c;
            this.f10972a = (int) ((eVar2.f27096b / eVar2.f27097c) * defaultSize2);
        }
        this.f10981j.set(0.0f, 0.0f, this.f10972a, this.f10973b);
        setMeasuredDimension(this.f10972a, this.f10973b);
    }
}
