package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.WeakHashMap;
import k1.i2;
import k1.n0;
import k1.o0;

/* loaded from: classes.dex */
public final class x extends RecyclerView.e<a> {

    /* renamed from: d */
    public final com.google.android.material.datepicker.a f6527d;

    /* renamed from: e */
    public final d<?> f6528e;

    /* renamed from: f */
    public final h.e f6529f;

    /* renamed from: g */
    public final int f6530g;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final TextView f6531u;

        /* renamed from: v */
        public final MaterialCalendarGridView f6532v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f6531u = textView;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            new n0(androidx.core.R.id.tag_accessibility_heading).e(textView, Boolean.TRUE);
            this.f6532v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public x(ContextThemeWrapper contextThemeWrapper, d dVar, com.google.android.material.datepicker.a aVar, h.d dVar2) {
        int i10;
        u uVar = aVar.f6436a;
        u uVar2 = aVar.f6437b;
        u uVar3 = aVar.f6439d;
        if (uVar.f6512a.compareTo(uVar3.f6512a) <= 0) {
            if (uVar3.f6512a.compareTo(uVar2.f6512a) <= 0) {
                int i11 = v.f6519f;
                int i12 = h.f6475w0;
                Resources resources = contextThemeWrapper.getResources();
                int i13 = R.dimen.mtrl_calendar_day_height;
                int dimensionPixelSize = resources.getDimensionPixelSize(i13) * i11;
                if (p.k1(contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(i13);
                } else {
                    i10 = 0;
                }
                this.f6530g = dimensionPixelSize + i10;
                this.f6527d = aVar;
                this.f6528e = dVar;
                this.f6529f = dVar2;
                v(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f6527d.f6441f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long f(int i10) {
        Calendar b10 = d0.b(this.f6527d.f6436a.f6512a);
        b10.add(2, i10);
        return new u(b10).f6512a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        a aVar2 = aVar;
        Calendar b10 = d0.b(this.f6527d.f6436a.f6512a);
        b10.add(2, i10);
        u uVar = new u(b10);
        aVar2.f6531u.setText(uVar.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f6532v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && uVar.equals(materialCalendarGridView.getAdapter2().f6520a)) {
            materialCalendarGridView.invalidate();
            v adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l10 : adapter2.f6522c) {
                adapter2.f(materialCalendarGridView, l10.longValue());
            }
            d<?> dVar = adapter2.f6521b;
            if (dVar != null) {
                for (Long l11 : dVar.v()) {
                    adapter2.f(materialCalendarGridView, l11.longValue());
                }
                adapter2.f6522c = adapter2.f6521b.v();
            }
        } else {
            v vVar = new v(uVar, this.f6528e, this.f6527d);
            materialCalendarGridView.setNumColumns(uVar.f6515d);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (p.k1(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f6530g));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}
