package com.topstep.fitcloud.pro.ui;

import gm.l;
import kg.k;
import kotlin.Metadata;
import nh.e;
import og.r1;
import og.t;
import qi.h;
import sm.s0;
import tg.c;
import tg.i;
import yg.m;

@Metadata
/* loaded from: classes2.dex */
public final class MineViewModel extends e<String> {

    /* renamed from: h */
    public final long f10287h;

    /* renamed from: i */
    public final t f10288i;

    /* renamed from: j */
    public final dk.a<r1> f10289j;

    /* renamed from: k */
    public final m f10290k;

    /* renamed from: l */
    public final xg.a f10291l;

    /* renamed from: m */
    public final c f10292m;

    /* renamed from: n */
    public final s0 f10293n;

    /* renamed from: o */
    public final s0 f10294o;

    public MineViewModel(long j10, k kVar, t tVar, dk.a aVar, m mVar, xg.c cVar, i iVar) {
        l.f(kVar, "userInfoRepository");
        l.f(tVar, "deviceManager");
        l.f(aVar, "wechatSportRepository");
        l.f(mVar, "publicStorage");
        this.f10287h = j10;
        this.f10288i = tVar;
        this.f10289j = aVar;
        this.f10290k = mVar;
        this.f10291l = cVar;
        this.f10292m = iVar;
        this.f10293n = h.n(kVar.y(j10), rm.l.h(this));
        this.f10294o = h.n(tVar.D().a(), rm.l.h(this));
    }
}
