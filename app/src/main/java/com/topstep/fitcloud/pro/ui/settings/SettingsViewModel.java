package com.topstep.fitcloud.pro.ui.settings;

import androidx.lifecycle.l0;
import bi.r;
import gm.l;
import ii.p0;
import kg.k;
import kotlin.Metadata;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import sm.b1;
import sm.s0;
import sm.t0;
import yg.m;

@Metadata
/* loaded from: classes2.dex */
public final class SettingsViewModel extends v6.b<p0> {

    /* renamed from: j */
    public final long f11913j;

    /* renamed from: k */
    public final jg.a f11914k;

    /* renamed from: l */
    public final ch.a f11915l;

    /* renamed from: m */
    public final xg.a f11916m;

    /* renamed from: n */
    public final zg.b f11917n;

    /* renamed from: o */
    public final m f11918o;

    /* renamed from: p */
    public final s0 f11919p;

    /* renamed from: q */
    public final s0 f11920q;

    /* renamed from: r */
    public final t0 f11921r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel(l0 l0Var, long j10, k kVar, jg.a aVar, ch.a aVar2, xg.a aVar3, zg.b bVar, m mVar) {
        super(new p0(null, null, null, 7, null), l0Var);
        l.f(l0Var, "savedStateHandle");
        l.f(kVar, "userInfoRepository");
        l.f(aVar, "authManager");
        l.f(aVar2, "cloudSyncRepository");
        l.f(aVar3, "noticeRepository");
        l.f(bVar, "versionRepository");
        l.f(mVar, "publicStorage");
        this.f11913j = j10;
        this.f11914k = aVar;
        this.f11915l = aVar2;
        this.f11916m = aVar3;
        this.f11917n = bVar;
        this.f11918o = mVar;
        this.f11919p = qi.h.n(kVar.m(j10), rm.l.h(this));
        this.f11920q = qi.h.n(aVar2.g(j10), rm.l.h(this));
        this.f11921r = r.M(mVar.C(), rm.l.h(this), b1.a.a(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT), cg.a.FLOW_SYSTEM);
    }
}
