package com.topstep.fitcloud.pro.ui.data.ecg;

import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import fm.p;
import mf.a0;
import mm.h;
import pm.e0;
import rh.h0;
import tl.l;
import xl.d;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment$onViewCreated$4$1", f = "EcgDetailFragment.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<e0, d<? super l>, Object> {

    /* renamed from: e */
    public int f10738e;

    /* renamed from: f */
    public final /* synthetic */ EcgDetailFragment f10739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EcgDetailFragment ecgDetailFragment, d<? super a> dVar) {
        super(2, dVar);
        this.f10739f = ecgDetailFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, d<? super l> dVar) {
        return ((a) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final d<l> p(Object obj, d<?> dVar) {
        return new a(this.f10739f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f10738e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            EcgDetailFragment ecgDetailFragment = this.f10739f;
            h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
            EcgViewModel i12 = ecgDetailFragment.i1();
            this.f10738e = 1;
            obj = i12.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        EcgRecord a10 = ((h0) obj).f25695a.a();
        if (a10 != null) {
            EcgDetailFragment ecgDetailFragment2 = this.f10739f;
            int i11 = EcgHealthReportActivity.F;
            EcgHealthReportActivity.a.a(ecgDetailFragment2.V0(), a10, null);
        }
        return l.f28297a;
    }
}
