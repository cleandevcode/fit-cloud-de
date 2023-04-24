package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class k extends RecyclerView.r {

    /* renamed from: a */
    public final /* synthetic */ x f6493a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f6494b;

    /* renamed from: c */
    public final /* synthetic */ h f6495c;

    public k(h hVar, x xVar, MaterialButton materialButton) {
        this.f6495c = hVar;
        this.f6493a = xVar;
        this.f6494b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i10, RecyclerView recyclerView) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f6494b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int P0;
        LinearLayoutManager d12 = this.f6495c.d1();
        if (i10 < 0) {
            P0 = d12.O0();
        } else {
            P0 = d12.P0();
        }
        h hVar = this.f6495c;
        Calendar b10 = d0.b(this.f6493a.f6527d.f6436a.f6512a);
        b10.add(2, P0);
        hVar.f6479p0 = new u(b10);
        MaterialButton materialButton = this.f6494b;
        Calendar b11 = d0.b(this.f6493a.f6527d.f6436a.f6512a);
        b11.add(2, P0);
        b11.set(5, 1);
        Calendar b12 = d0.b(b11);
        b12.get(2);
        b12.get(1);
        b12.getMaximum(7);
        b12.getActualMaximum(5);
        b12.getTimeInMillis();
        materialButton.setText(DateUtils.formatDateTime(null, b12.getTimeInMillis(), 8228));
    }
}
