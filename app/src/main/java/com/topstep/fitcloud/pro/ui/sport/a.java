package com.topstep.fitcloud.pro.ui.sport;

import android.os.RemoteException;
import android.widget.TextView;
import b7.b;
import com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding;
import com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import gm.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import s.k;
import x6.f;
import y6.e;
import z6.g;

/* loaded from: classes2.dex */
public final class a extends b.a {

    /* renamed from: c */
    public static final /* synthetic */ int f12194c = 0;

    /* renamed from: b */
    public final /* synthetic */ SportingActivity f12195b;

    public a(SportingActivity sportingActivity) {
        this.f12195b = sportingActivity;
    }

    @Override // b7.b.a, x6.g
    public final void b(final int i10) {
        SportingActivity sportingActivity = this.f12195b;
        SportingActivity.a aVar = SportingActivity.X;
        if (sportingActivity.P() != 2) {
            return;
        }
        final SportingActivity sportingActivity2 = this.f12195b;
        sportingActivity2.runOnUiThread(new Runnable() { // from class: mi.m0
            @Override // java.lang.Runnable
            public final void run() {
                SportingActivity sportingActivity3 = sportingActivity2;
                int i11 = i10;
                gm.l.f(sportingActivity3, "this$0");
                SportingActivity.a aVar2 = SportingActivity.X;
                if (sportingActivity3.P() == 2) {
                    y6.e a10 = sportingActivity3.O().a();
                    if (a10 != null) {
                        SportingActivity.N(sportingActivity3, a10);
                        return;
                    }
                    return;
                }
                LayoutSportingRootBinding layoutSportingRootBinding = sportingActivity3.D;
                if (layoutSportingRootBinding != null) {
                    TextView textView = layoutSportingRootBinding.tvNormalLeftValue;
                    Locale locale = bi.m0.f4330a;
                    if (locale != null) {
                        String format = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                        gm.l.e(format, "format(locale, format, *args)");
                        textView.setText(format);
                        return;
                    }
                    gm.l.l("systemLocale");
                    throw null;
                }
            }
        });
    }

    @Override // b7.b.a, x6.g
    public final void g(int i10) {
        SportingActivity sportingActivity = this.f12195b;
        if (sportingActivity.F == null) {
            return;
        }
        sportingActivity.runOnUiThread(new Runnable(i10, sportingActivity) { // from class: mi.k0

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SportingActivity f21838a;

            {
                this.f21838a = sportingActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gm.l.f(this.f21838a, "this$0");
            }
        });
    }

    @Override // b7.b.a
    public final void k() {
        SportingActivity sportingActivity = this.f12195b;
        SportingActivity.a aVar = SportingActivity.X;
        e a10 = sportingActivity.O().a();
        if (a10 == null) {
            return;
        }
        SportingActivity sportingActivity2 = this.f12195b;
        g gVar = sportingActivity2.F;
        if (gVar != null) {
            Integer num = a10.f31188h;
            if (num != null) {
                num.intValue();
            }
            b O = sportingActivity2.O();
            O.getClass();
            ArrayList arrayList = null;
            try {
                f fVar = O.f4028c;
                if (fVar != null) {
                    arrayList = fVar.l0();
                }
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
            gVar.i(arrayList);
        }
        SportingActivity.N(this.f12195b, a10);
        LayoutSportingRootBinding layoutSportingRootBinding = this.f12195b.D;
        if (layoutSportingRootBinding != null) {
            if (a10.f31182b) {
                layoutSportingRootBinding.pauseView.setVisibility(4);
                layoutSportingRootBinding.resumeView.setVisibility(0);
                layoutSportingRootBinding.stopView.setVisibility(0);
                return;
            }
            layoutSportingRootBinding.pauseView.setVisibility(0);
            layoutSportingRootBinding.resumeView.setVisibility(4);
            layoutSportingRootBinding.stopView.setVisibility(4);
        }
    }

    @Override // b7.b.a, x6.g
    public final void o0(y6.f fVar) {
        e a10;
        l.f(fVar, "latLng");
        SportingActivity sportingActivity = this.f12195b;
        if (sportingActivity.F == null || (a10 = sportingActivity.O().a()) == null) {
            return;
        }
        SportingActivity sportingActivity2 = this.f12195b;
        sportingActivity2.runOnUiThread(new k(sportingActivity2, fVar, a10, 5));
    }

    @Override // b7.b.a, x6.g
    public final void s0(final int i10) {
        final SportingActivity sportingActivity = this.f12195b;
        sportingActivity.runOnUiThread(new Runnable() { // from class: mi.n0
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                SportingActivity sportingActivity2 = sportingActivity;
                gm.l.f(sportingActivity2, "this$0");
                Locale locale = bi.m0.f4330a;
                if (locale != null) {
                    int i12 = i11 % 3600;
                    String a10 = o5.a0.a(new Object[]{Integer.valueOf(i11 / 3600), Integer.valueOf(i12 / 60), Integer.valueOf(i12 % 60)}, 3, locale, "%02d:%02d:%02d", "format(locale, format, *args)");
                    LayoutSportingRootBinding layoutSportingRootBinding = sportingActivity2.D;
                    if (layoutSportingRootBinding != null) {
                        layoutSportingRootBinding.tvNormalDuration.setText(a10);
                    }
                    LayoutSportingMapContainerBinding layoutSportingMapContainerBinding = sportingActivity2.E;
                    if (layoutSportingMapContainerBinding != null) {
                        layoutSportingMapContainerBinding.tvMapDuration.setText(a10);
                    }
                    if (i11 % 5 == 0) {
                        sportingActivity2.S();
                        return;
                    }
                    return;
                }
                gm.l.l("systemLocale");
                throw null;
            }
        });
    }

    @Override // b7.b.a, x6.g
    public final void y(final double d10, final double d11) {
        final SportingActivity sportingActivity = this.f12195b;
        if (sportingActivity.F == null) {
            return;
        }
        sportingActivity.runOnUiThread(new Runnable() { // from class: mi.l0
            @Override // java.lang.Runnable
            public final void run() {
                SportingActivity sportingActivity2 = SportingActivity.this;
                double d12 = d10;
                double d13 = d11;
                gm.l.f(sportingActivity2, "this$0");
                z6.g gVar = sportingActivity2.F;
                if (gVar != null) {
                    gVar.f32007b.c(d12, d13);
                }
            }
        });
    }
}
