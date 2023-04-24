package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v extends BaseAdapter {

    /* renamed from: f */
    public static final int f6519f = d0.d(null).getMaximum(4);

    /* renamed from: a */
    public final u f6520a;

    /* renamed from: b */
    public final d<?> f6521b;

    /* renamed from: c */
    public Collection<Long> f6522c;

    /* renamed from: d */
    public c f6523d;

    /* renamed from: e */
    public final a f6524e;

    public v(u uVar, d<?> dVar, a aVar) {
        this.f6520a = uVar;
        this.f6521b = dVar;
        this.f6524e = aVar;
        this.f6522c = dVar.v();
    }

    public final int b() {
        return this.f6520a.e();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final Long getItem(int i10) {
        if (i10 >= this.f6520a.e() && i10 <= d()) {
            u uVar = this.f6520a;
            Calendar b10 = d0.b(uVar.f6512a);
            b10.set(5, (i10 - uVar.e()) + 1);
            return Long.valueOf(b10.getTimeInMillis());
        }
        return null;
    }

    public final int d() {
        return (this.f6520a.e() + this.f6520a.f6516e) - 1;
    }

    public final void e(TextView textView, long j10) {
        b bVar;
        if (textView == null) {
            return;
        }
        boolean z10 = false;
        if (this.f6524e.f6438c.c(j10)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f6521b.v().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (d0.a(j10) == d0.a(it.next().longValue())) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                bVar = this.f6523d.f6455b;
            } else {
                int i10 = (d0.c().getTimeInMillis() > j10 ? 1 : (d0.c().getTimeInMillis() == j10 ? 0 : -1));
                c cVar = this.f6523d;
                if (i10 == 0) {
                    bVar = cVar.f6456c;
                } else {
                    bVar = cVar.f6454a;
                }
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f6523d.f6460g;
        }
        bVar.b(textView);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (u.d(j10).equals(this.f6520a)) {
            Calendar b10 = d0.b(this.f6520a.f6512a);
            b10.setTimeInMillis(j10);
            int i10 = b10.get(5);
            e((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter2().b() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return b() + this.f6520a.f6516e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f6520a.f6515d;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            com.google.android.material.datepicker.c r1 = r8.f6523d
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r8.f6523d = r1
        Lf:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L26
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r10 = r8.b()
            int r10 = r9 - r10
            if (r10 < 0) goto L9b
            com.google.android.material.datepicker.u r11 = r8.f6520a
            int r2 = r11.f6516e
            if (r10 < r2) goto L35
            goto L9b
        L35:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.u r11 = r8.f6520a
            java.util.Calendar r11 = r11.f6512a
            java.util.Calendar r11 = com.google.android.material.datepicker.d0.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.u r4 = r8.f6520a
            int r4 = r4.f6514c
            java.util.Calendar r5 = com.google.android.material.datepicker.d0.c()
            r5.set(r3, r2)
            java.util.Calendar r5 = com.google.android.material.datepicker.d0.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            if (r4 != r6) goto L8d
            java.lang.String r10 = com.google.android.material.datepicker.e.a(r10)
            goto L91
        L8d:
            java.lang.String r10 = com.google.android.material.datepicker.e.b(r10)
        L91:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto La3
        L9b:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        La3:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto Laa
            goto Lb1
        Laa:
            long r9 = r9.longValue()
            r8.e(r0, r9)
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.v.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
