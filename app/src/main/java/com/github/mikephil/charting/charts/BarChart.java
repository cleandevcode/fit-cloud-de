package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import r7.a;
import s7.i;
import s7.j;
import v7.c;
import z7.b;

/* loaded from: classes.dex */
public class BarChart extends a<t7.a> implements w7.a {
    public boolean A0;

    /* renamed from: x0 */
    public boolean f6000x0;

    /* renamed from: y0 */
    public boolean f6001y0;

    /* renamed from: z0 */
    public boolean f6002z0;

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6000x0 = false;
        this.f6001y0 = true;
        this.f6002z0 = false;
        this.A0 = false;
    }

    @Override // w7.a
    public final boolean a() {
        return this.f6002z0;
    }

    @Override // w7.a
    public final boolean b() {
        return this.f6001y0;
    }

    @Override // w7.a
    public final boolean d() {
        return this.f6000x0;
    }

    @Override // w7.a
    public t7.a getBarData() {
        return (t7.a) this.f25422b;
    }

    @Override // r7.b
    public c h(float f10, float f11) {
        if (this.f25422b == 0) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        c a10 = getHighlighter().a(f10, f11);
        if (a10 != null && this.f6000x0) {
            return new c(a10.f29156a, a10.f29157b, a10.f29158c, a10.f29159d, a10.f29161f, -1, a10.f29163h);
        }
        return a10;
    }

    @Override // r7.a, r7.b
    public void k() {
        super.k();
        this.f25436p = new b(this, this.f25439s, this.f25438r);
        setHighlighter(new v7.a(this));
        getXAxis().f26650u = 0.5f;
        getXAxis().f26651v = 0.5f;
    }

    @Override // r7.a
    public final void n() {
        i iVar;
        float f10;
        float f11;
        if (this.A0) {
            iVar = this.f25429i;
            T t10 = this.f25422b;
            f10 = ((t7.a) t10).f27826d - (((t7.a) t10).f27796j / 2.0f);
            f11 = (((t7.a) t10).f27796j / 2.0f) + ((t7.a) t10).f27825c;
        } else {
            iVar = this.f25429i;
            T t11 = this.f25422b;
            f10 = ((t7.a) t11).f27826d;
            f11 = ((t7.a) t11).f27825c;
        }
        iVar.a(f10, f11);
        j jVar = this.f25407j0;
        j.a aVar = j.a.LEFT;
        jVar.a(((t7.a) this.f25422b).h(aVar), ((t7.a) this.f25422b).g(aVar));
        j jVar2 = this.f25408k0;
        j.a aVar2 = j.a.RIGHT;
        jVar2.a(((t7.a) this.f25422b).h(aVar2), ((t7.a) this.f25422b).g(aVar2));
    }

    public void setDrawBarShadow(boolean z10) {
        this.f6002z0 = z10;
    }

    public void setDrawValueAboveBar(boolean z10) {
        this.f6001y0 = z10;
    }

    public void setFitBars(boolean z10) {
        this.A0 = z10;
    }

    public void setHighlightFullBarEnabled(boolean z10) {
        this.f6000x0 = z10;
    }
}
