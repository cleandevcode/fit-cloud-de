package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f0 extends RecyclerView.e<a> {

    /* renamed from: d */
    public final h<?> f6469d;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final TextView f6470u;

        public a(TextView textView) {
            super(textView);
            this.f6470u = textView;
        }
    }

    public f0(h<?> hVar) {
        this.f6469d = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f6469d.f6478o0.f6440e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        b bVar;
        a aVar2 = aVar;
        int i11 = this.f6469d.f6478o0.f6436a.f6514c + i10;
        String string = aVar2.f6470u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.f6470u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        aVar2.f6470u.setContentDescription(String.format(string, Integer.valueOf(i11)));
        c cVar = this.f6469d.f6481r0;
        Calendar c10 = d0.c();
        if (c10.get(1) == i11) {
            bVar = cVar.f6459f;
        } else {
            bVar = cVar.f6457d;
        }
        for (Long l10 : this.f6469d.f6477n0.v()) {
            c10.setTimeInMillis(l10.longValue());
            if (c10.get(1) == i11) {
                bVar = cVar.f6458e;
            }
        }
        bVar.b(aVar2.f6470u);
        aVar2.f6470u.setOnClickListener(new e0(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
