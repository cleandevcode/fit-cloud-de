package com.topstep.fitcloud.pro.ui.sport;

import androidx.lifecycle.l0;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import gm.l;
import kg.g;
import kg.k;
import kotlin.Metadata;
import lg.j0;
import mi.q;
import mi.r;
import sm.f;
import sm.f1;
import uf.c;
import uf.d;
import v6.b;

@Metadata
/* loaded from: classes2.dex */
public final class SportDetailViewModel extends b<ei.a<SportRecord>> {

    /* renamed from: j */
    public final j0 f12131j;

    /* renamed from: k */
    public String f12132k;

    /* renamed from: l */
    public final f<d> f12133l;

    /* renamed from: m */
    public final boolean f12134m;

    /* renamed from: n */
    public final f1<c> f12135n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailViewModel(l0 l0Var, long j10, k kVar, g gVar, j0 j0Var) {
        super(new ei.a(null, 1, null), l0Var);
        l.f(l0Var, "savedStateHandle");
        l.f(kVar, "userInfoRepository");
        l.f(gVar, "unitConfigRepository");
        l.f(j0Var, "sportRepository");
        this.f12131j = j0Var;
        this.f12132k = (String) l0Var.f2739a.get("sport_type");
        this.f12133l = kVar.y(j10);
        this.f12134m = ((uf.b) gVar.a().getValue()).a();
        this.f12135n = kVar.a();
        b.f(this, new q(this, this.f12132k, null), null, r.f21861b, 3);
    }
}
