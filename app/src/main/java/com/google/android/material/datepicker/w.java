package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f6525a;

    /* renamed from: b */
    public final /* synthetic */ x f6526b;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6526b = xVar;
        this.f6525a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        boolean z10;
        v adapter2 = this.f6525a.getAdapter2();
        if (i10 >= adapter2.b() && i10 <= adapter2.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h.e eVar = this.f6526b.f6529f;
            h.d dVar = (h.d) eVar;
            if (h.this.f6478o0.f6438c.c(this.f6525a.getAdapter2().getItem(i10).longValue())) {
                h.this.f6477n0.l();
                Iterator it = h.this.f6533l0.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).a(h.this.f6477n0.w());
                }
                h.this.f6483t0.getAdapter().h();
                RecyclerView recyclerView = h.this.f6482s0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().h();
                }
            }
        }
    }
}
