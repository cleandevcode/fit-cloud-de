package com.topstep.fitcloud.pro.ui.sport;

import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import bi.r;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import gm.l;
import kotlin.Metadata;
import lg.r0;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import sm.b1;
import sm.t0;

@Metadata
/* loaded from: classes2.dex */
public final class SportingViewMode extends s0 {

    /* renamed from: d */
    public final int f12192d;

    /* renamed from: e */
    public final t0 f12193e;

    public SportingViewMode(l0 l0Var, r0 r0Var) {
        int i10;
        int i11;
        l.f(l0Var, "savedStateHandle");
        SportingActivity.a aVar = SportingActivity.X;
        Integer num = (Integer) l0Var.f2739a.get("sport_type");
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        aVar.getClass();
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = 19;
            } else {
                i11 = 7;
            }
        } else {
            i11 = 15;
        }
        if (i11 > 0) {
            r1 = i11 - (i11 > 0 ? (i11 - 1) % 4 : 0);
        }
        this.f12192d = r1;
        this.f12193e = r.M(r0Var.d(r1), rm.l.h(this), b1.a.a(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT), null);
    }
}
