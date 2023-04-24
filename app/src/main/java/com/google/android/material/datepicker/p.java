package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.j0;
import com.google.android.material.R;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.i2;
import k1.l2;
import k1.o0;
import k1.v2;
import k1.w2;
import k1.x2;
import k1.z2;

/* loaded from: classes.dex */
public final class p<S> extends androidx.fragment.app.o {
    public static final /* synthetic */ int X0 = 0;
    public final LinkedHashSet<s<? super S>> B0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> C0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> D0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> E0 = new LinkedHashSet<>();
    public int F0;
    public d<S> G0;
    public z<S> H0;
    public com.google.android.material.datepicker.a I0;
    public h<S> J0;
    public int K0;
    public CharSequence L0;
    public boolean M0;
    public int N0;
    public int O0;
    public CharSequence P0;
    public int Q0;
    public CharSequence R0;
    public TextView S0;
    public CheckableImageButton T0;
    public ga.f U0;
    public Button V0;
    public boolean W0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            p.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Iterator<s<? super S>> it = p.this.B0.iterator();
            while (it.hasNext()) {
                p.this.i1().w();
                it.next().a();
            }
            p.this.c1(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
            p.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = p.this.C0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            p.this.c1(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class c extends y<S> {
        public c() {
            p.this = r1;
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s10) {
            p pVar = p.this;
            int i10 = p.X0;
            pVar.n1();
            p pVar2 = p.this;
            pVar2.V0.setEnabled(pVar2.i1().u());
        }
    }

    public static int j1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i10 = new u(d0.c()).f6515d;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i10;
        return ((i10 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean k1(Context context) {
        return l1(context, 16843277);
    }

    public static boolean l1(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(da.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        if (bundle == null) {
            bundle = this.f2516f;
        }
        this.F0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.G0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.I0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.K0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.L0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.N0 = bundle.getInt("INPUT_MODE_KEY");
        this.O0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.P0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.Q0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.R0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.r
    public final View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        boolean z10;
        int i11;
        if (this.M0) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.M0) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(j1(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(j1(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.S0 = textView;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.g.f(textView, 1);
        this.T0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.L0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.K0);
        }
        this.T0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.T0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.a.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.T0;
        if (this.N0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        o0.p(this.T0, null);
        CheckableImageButton checkableImageButton3 = this.T0;
        boolean isChecked = checkableImageButton3.isChecked();
        Context context2 = checkableImageButton3.getContext();
        if (isChecked) {
            i11 = R.string.mtrl_picker_toggle_to_calendar_input_mode;
        } else {
            i11 = R.string.mtrl_picker_toggle_to_text_input_mode;
        }
        this.T0.setContentDescription(context2.getString(i11));
        this.T0.setOnClickListener(new r(this));
        this.V0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (i1().u()) {
            this.V0.setEnabled(true);
        } else {
            this.V0.setEnabled(false);
        }
        this.V0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.P0;
        if (charSequence2 != null) {
            this.V0.setText(charSequence2);
        } else {
            int i12 = this.O0;
            if (i12 != 0) {
                this.V0.setText(i12);
            }
        }
        this.V0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.R0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i13 = this.Q0;
            if (i13 != 0) {
                button.setText(i13);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        u d10;
        super.L0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.F0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.G0);
        a.b bVar = new a.b(this.I0);
        u uVar = this.J0.f6479p0;
        if (uVar != null) {
            bVar.f6446c = Long.valueOf(uVar.f6517f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f6447d);
        u d11 = u.d(bVar.f6444a);
        u d12 = u.d(bVar.f6445b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f6446c;
        if (l10 == null) {
            d10 = null;
        } else {
            d10 = u.d(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(d11, d12, cVar, d10));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.K0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.L0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.O0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.P0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.Q0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.R0);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void M0() {
        Integer num;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        ie.b v2Var;
        ie.b bVar;
        super.M0();
        Window window = e1().getWindow();
        if (this.M0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.U0);
            if (!this.W0) {
                View findViewById = X0().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i12 = Build.VERSION.SDK_INT;
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int a10 = u9.a.a(window.getContext(), 16842801, -16777216);
                if (z10) {
                    num = Integer.valueOf(a10);
                }
                Integer valueOf = Integer.valueOf(a10);
                l2.a(window, false);
                Context context = window.getContext();
                if (i12 < 23) {
                    i10 = a1.a.d(u9.a.a(context, 16843857, -16777216), 128);
                } else {
                    i10 = 0;
                }
                Context context2 = window.getContext();
                if (i12 < 27) {
                    i11 = a1.a.d(u9.a.a(context2, 16843858, -16777216), 128);
                } else {
                    i11 = 0;
                }
                window.setStatusBarColor(i10);
                window.setNavigationBarColor(i11);
                boolean c10 = u9.a.c(num.intValue());
                if (!u9.a.c(i10) && (i10 != 0 || !c10)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean c11 = u9.a.c(valueOf.intValue());
                if (u9.a.c(i11) || (i11 == 0 && c11)) {
                    z12 = true;
                }
                View decorView = window.getDecorView();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    bVar = new z2(window);
                } else {
                    if (i13 >= 26) {
                        v2Var = new x2(window, decorView);
                    } else if (i13 >= 23) {
                        v2Var = new w2(window, decorView);
                    } else {
                        v2Var = new v2(window, decorView);
                    }
                    bVar = v2Var;
                }
                bVar.g(z11);
                bVar.f(z12);
                q qVar = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.i.u(findViewById, qVar);
                this.W0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = n0().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.U0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new v9.a(e1(), rect));
        }
        m1();
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void N0() {
        this.H0.f6533l0.clear();
        super.N0();
    }

    @Override // androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Context V0 = V0();
        V0();
        int i10 = this.F0;
        if (i10 == 0) {
            i10 = i1().t();
        }
        Dialog dialog = new Dialog(V0, i10);
        Context context = dialog.getContext();
        this.M0 = k1(context);
        int b10 = da.b.b(context, R.attr.colorSurface, p.class.getCanonicalName());
        ga.f fVar = new ga.f(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.U0 = fVar;
        fVar.i(context);
        this.U0.k(ColorStateList.valueOf(b10));
        ga.f fVar2 = this.U0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        fVar2.j(o0.i.i(decorView));
        return dialog;
    }

    public final d<S> i1() {
        if (this.G0 == null) {
            this.G0 = (d) this.f2516f.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.G0;
    }

    public final void m1() {
        z<S> zVar;
        V0();
        int i10 = this.F0;
        if (i10 == 0) {
            i10 = i1().t();
        }
        d<S> i12 = i1();
        com.google.android.material.datepicker.a aVar = this.I0;
        h<S> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", i12);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f6439d);
        hVar.Z0(bundle);
        this.J0 = hVar;
        if (this.T0.isChecked()) {
            d<S> i13 = i1();
            com.google.android.material.datepicker.a aVar2 = this.I0;
            zVar = new t<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", i13);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            zVar.Z0(bundle2);
        } else {
            zVar = this.J0;
        }
        this.H0 = zVar;
        n1();
        j0 h02 = h0();
        h02.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(h02);
        int i11 = R.id.mtrl_calendar_frame;
        z<S> zVar2 = this.H0;
        if (i11 != 0) {
            aVar3.g(i11, zVar2, null, 2);
            aVar3.f();
            this.H0.c1(new c());
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void n1() {
        d<S> i12 = i1();
        i0();
        String m10 = i12.m();
        this.S0.setContentDescription(String.format(o0(R.string.mtrl_picker_announce_current_selection), m10));
        this.S0.setText(m10);
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.D0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.E0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
