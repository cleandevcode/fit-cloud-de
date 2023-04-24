package com.topstep.fitcloud.pro.ui.settings.assist;

import fm.p;
import mf.a0;
import mm.h;
import pm.e0;
import tl.l;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment$onViewCreated$2$2$1", f = "WeatherFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ WeatherFragment f12003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WeatherFragment weatherFragment, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f12003e = weatherFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((c) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f12003e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        WeatherFragment weatherFragment = this.f12003e;
        h<Object>[] hVarArr = WeatherFragment.f11988y0;
        weatherFragment.k1().btnRefresh.setEnabled(true);
        return l.f28297a;
    }
}
