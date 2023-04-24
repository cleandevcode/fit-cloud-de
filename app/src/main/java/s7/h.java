package s7;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import t7.k;

/* loaded from: classes.dex */
public class h extends RelativeLayout implements d {

    /* renamed from: a */
    public a8.c f26687a;

    /* renamed from: b */
    public a8.c f26688b;

    /* renamed from: c */
    public WeakReference<r7.b> f26689c;

    public h(Context context, int i10) {
        super(context);
        this.f26687a = new a8.c();
        this.f26688b = new a8.c();
        setupLayoutResource(i10);
    }

    private void setupLayoutResource(int i10) {
        View inflate = LayoutInflater.from(getContext()).inflate(i10, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    @Override // s7.d
    public final void a(Canvas canvas, float f10, float f11) {
        float height;
        a8.c offset = getOffset();
        a8.c cVar = this.f26688b;
        cVar.f370b = offset.f370b;
        cVar.f371c = offset.f371c;
        r7.b chartView = getChartView();
        float width = getWidth();
        float height2 = getHeight();
        a8.c cVar2 = this.f26688b;
        float f12 = cVar2.f370b;
        if (f10 + f12 < 0.0f) {
            cVar2.f370b = -f10;
        } else if (chartView != null && f10 + width + f12 > chartView.getWidth()) {
            this.f26688b.f370b = (chartView.getWidth() - f10) - width;
        }
        a8.c cVar3 = this.f26688b;
        float f13 = cVar3.f371c;
        if (f11 + f13 < 0.0f) {
            height = -f11;
        } else {
            if (chartView != null && f11 + height2 + f13 > chartView.getHeight()) {
                cVar3 = this.f26688b;
                height = (chartView.getHeight() - f11) - height2;
            }
            a8.c cVar4 = this.f26688b;
            int save = canvas.save();
            canvas.translate(f10 + cVar4.f370b, f11 + cVar4.f371c);
            draw(canvas);
            canvas.restoreToCount(save);
        }
        cVar3.f371c = height;
        a8.c cVar42 = this.f26688b;
        int save2 = canvas.save();
        canvas.translate(f10 + cVar42.f370b, f11 + cVar42.f371c);
        draw(canvas);
        canvas.restoreToCount(save2);
    }

    public void b(k kVar, v7.c cVar) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public r7.b getChartView() {
        WeakReference<r7.b> weakReference = this.f26689c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public a8.c getOffset() {
        return this.f26687a;
    }

    public void setChartView(r7.b bVar) {
        this.f26689c = new WeakReference<>(bVar);
    }

    public void setOffset(a8.c cVar) {
        this.f26687a = cVar;
        if (cVar == null) {
            this.f26687a = new a8.c();
        }
    }
}
