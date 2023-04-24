package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.p;
import java.util.Calendar;
import java.util.GregorianCalendar;
import k1.o0;

/* loaded from: classes.dex */
public final class h<S> extends z<S> {

    /* renamed from: w0 */
    public static final /* synthetic */ int f6475w0 = 0;

    /* renamed from: m0 */
    public int f6476m0;

    /* renamed from: n0 */
    public com.google.android.material.datepicker.d<S> f6477n0;

    /* renamed from: o0 */
    public com.google.android.material.datepicker.a f6478o0;

    /* renamed from: p0 */
    public u f6479p0;

    /* renamed from: q0 */
    public int f6480q0;

    /* renamed from: r0 */
    public com.google.android.material.datepicker.c f6481r0;

    /* renamed from: s0 */
    public RecyclerView f6482s0;

    /* renamed from: t0 */
    public RecyclerView f6483t0;

    /* renamed from: u0 */
    public View f6484u0;

    /* renamed from: v0 */
    public View f6485v0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f6486a;

        public a(int i10) {
            h.this = r1;
            this.f6486a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.f6483t0.f0(this.f6486a);
        }
    }

    /* loaded from: classes.dex */
    public class b extends k1.a {
        @Override // k1.a
        public final void d(View view, l1.j jVar) {
            this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
            jVar.f18670a.setCollectionInfo(null);
        }
    }

    /* loaded from: classes.dex */
    public class c extends b0 {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11) {
            super(i10);
            h.this = r1;
            this.E = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void E0(RecyclerView.y yVar, int[] iArr) {
            if (this.E == 0) {
                iArr[0] = h.this.f6483t0.getWidth();
                iArr[1] = h.this.f6483t0.getWidth();
                return;
            }
            iArr[0] = h.this.f6483t0.getHeight();
            iArr[1] = h.this.f6483t0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class d implements e {
        public d() {
            h.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        if (bundle == null) {
            bundle = this.f2516f;
        }
        this.f6476m0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6477n0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6478o0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6479p0 = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.r
    public final View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(i0(), this.f6476m0);
        this.f6481r0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u uVar = this.f6478o0.f6436a;
        if (p.k1(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = V0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = v.f6519f;
        int i13 = dimensionPixelOffset + dimensionPixelSize;
        inflate.setMinimumHeight(i13 + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        o0.p(gridView, new b());
        gridView.setAdapter((ListAdapter) new g());
        gridView.setNumColumns(uVar.f6515d);
        gridView.setEnabled(false);
        this.f6483t0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        i0();
        this.f6483t0.setLayoutManager(new c(i11, i11));
        this.f6483t0.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f6477n0, this.f6478o0, new d());
        this.f6483t0.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        int i14 = R.id.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i14);
        this.f6482s0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f6482s0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f6482s0.setAdapter(new f0(this));
            this.f6482s0.g(new i(this));
        }
        int i15 = R.id.month_navigation_fragment_toggle;
        if (inflate.findViewById(i15) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i15);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            o0.p(materialButton, new j(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f6484u0 = inflate.findViewById(i14);
            this.f6485v0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            g1(1);
            materialButton.setText(this.f6479p0.f());
            this.f6483t0.h(new k(this, xVar, materialButton));
            materialButton.setOnClickListener(new l(this));
            materialButton3.setOnClickListener(new m(this, xVar));
            materialButton2.setOnClickListener(new n(this, xVar));
        }
        if (!p.k1(contextThemeWrapper)) {
            new androidx.recyclerview.widget.f0().a(this.f6483t0);
        }
        RecyclerView recyclerView2 = this.f6483t0;
        u uVar2 = this.f6479p0;
        u uVar3 = xVar.f6527d.f6436a;
        if (uVar3.f6512a instanceof GregorianCalendar) {
            recyclerView2.d0((uVar2.f6513b - uVar3.f6513b) + ((uVar2.f6514c - uVar3.f6514c) * 12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6476m0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f6477n0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6478o0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6479p0);
    }

    @Override // com.google.android.material.datepicker.z
    public final boolean c1(p.c cVar) {
        return super.c1(cVar);
    }

    public final LinearLayoutManager d1() {
        return (LinearLayoutManager) this.f6483t0.getLayoutManager();
    }

    public final void e1(int i10) {
        this.f6483t0.post(new a(i10));
    }

    public final void f1(u uVar) {
        boolean z10;
        RecyclerView recyclerView;
        int i10;
        u uVar2 = ((x) this.f6483t0.getAdapter()).f6527d.f6436a;
        Calendar calendar = uVar2.f6512a;
        if (calendar instanceof GregorianCalendar) {
            int i11 = uVar.f6514c;
            int i12 = uVar2.f6514c;
            int i13 = uVar.f6513b;
            int i14 = uVar2.f6513b;
            int i15 = (i13 - i14) + ((i11 - i12) * 12);
            u uVar3 = this.f6479p0;
            if (calendar instanceof GregorianCalendar) {
                int i16 = i15 - ((uVar3.f6513b - i14) + ((uVar3.f6514c - i12) * 12));
                boolean z11 = false;
                if (Math.abs(i16) > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i16 > 0) {
                    z11 = true;
                }
                this.f6479p0 = uVar;
                if (z10 && z11) {
                    recyclerView = this.f6483t0;
                    i10 = i15 - 3;
                } else {
                    if (z10) {
                        recyclerView = this.f6483t0;
                        i10 = i15 + 3;
                    }
                    e1(i15);
                    return;
                }
                recyclerView.d0(i10);
                e1(i15);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void g1(int i10) {
        this.f6480q0 = i10;
        if (i10 == 2) {
            this.f6482s0.getLayoutManager().r0(this.f6479p0.f6514c - ((f0) this.f6482s0.getAdapter()).f6469d.f6478o0.f6436a.f6514c);
            this.f6484u0.setVisibility(0);
            this.f6485v0.setVisibility(8);
        } else if (i10 == 1) {
            this.f6484u0.setVisibility(8);
            this.f6485v0.setVisibility(0);
            f1(this.f6479p0);
        }
    }
}
