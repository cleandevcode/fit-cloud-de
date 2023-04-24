package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class i extends RecyclerView.l {

    /* renamed from: a */
    public final Calendar f6489a = d0.d(null);

    /* renamed from: b */
    public final Calendar f6490b = d0.d(null);

    /* renamed from: c */
    public final /* synthetic */ h f6491c;

    public i(h hVar) {
        this.f6491c = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int width;
        if ((recyclerView.getAdapter() instanceof f0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            f0 f0Var = (f0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (j1.c<Long, Long> cVar : this.f6491c.f6477n0.n()) {
                Long l10 = cVar.f17257a;
                if (l10 != null && cVar.f17258b != null) {
                    this.f6489a.setTimeInMillis(l10.longValue());
                    this.f6490b.setTimeInMillis(cVar.f17258b.longValue());
                    int i11 = this.f6489a.get(1) - f0Var.f6469d.f6478o0.f6436a.f6514c;
                    int i12 = this.f6490b.get(1) - f0Var.f6469d.f6478o0.f6436a.f6514c;
                    View s10 = gridLayoutManager.s(i11);
                    View s11 = gridLayoutManager.s(i12);
                    int i13 = gridLayoutManager.F;
                    int i14 = i11 / i13;
                    int i15 = i12 / i13;
                    for (int i16 = i14; i16 <= i15; i16++) {
                        View s12 = gridLayoutManager.s(gridLayoutManager.F * i16);
                        if (s12 != null) {
                            int top = s12.getTop() + this.f6491c.f6481r0.f6457d.f6448a.top;
                            int bottom = s12.getBottom() - this.f6491c.f6481r0.f6457d.f6448a.bottom;
                            if (i16 == i14) {
                                i10 = (s10.getWidth() / 2) + s10.getLeft();
                            } else {
                                i10 = 0;
                            }
                            if (i16 == i15) {
                                width = (s11.getWidth() / 2) + s11.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(i10, top, width, bottom, this.f6491c.f6481r0.f6461h);
                        }
                    }
                }
            }
        }
    }
}
