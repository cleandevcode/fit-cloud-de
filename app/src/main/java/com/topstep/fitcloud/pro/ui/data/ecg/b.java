package com.topstep.fitcloud.pro.ui.data.ecg;

import android.content.Context;
import android.os.Bundle;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.EcgReport;
import com.topstep.fitcloudpro.R;
import fm.p;
import i2.b0;
import i2.m;
import ih.v;
import java.util.List;
import mf.a0;
import mm.h;
import pm.e0;
import rh.c;
import rh.h0;
import tl.l;
import xl.d;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment$onViewCreated$5$1", f = "EcgDetailFragment.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<e0, d<? super l>, Object> {

    /* renamed from: e */
    public int f10740e;

    /* renamed from: f */
    public final /* synthetic */ EcgDetailFragment f10741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EcgDetailFragment ecgDetailFragment, d<? super b> dVar) {
        super(2, dVar);
        this.f10741f = ecgDetailFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, d<? super l> dVar) {
        return ((b) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final d<l> p(Object obj, d<?> dVar) {
        return new b(this.f10741f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        String str;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f10740e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            EcgDetailFragment ecgDetailFragment = this.f10741f;
            h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
            EcgViewModel i12 = ecgDetailFragment.i1();
            this.f10740e = 1;
            obj = i12.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        EcgRecord a10 = ((h0) obj).f25695a.a();
        if (a10 != null) {
            EcgDetailFragment ecgDetailFragment2 = this.f10741f;
            m f10 = tb.a.f(ecgDetailFragment2);
            h<Object>[] hVarArr2 = EcgDetailFragment.f10615y0;
            String str2 = ((c) ecgDetailFragment2.f10618v0.getValue()).f25671a;
            EcgReport.b bVar = EcgReport.Companion;
            List<EcgReport> reports = a10.getReports();
            Context V0 = ecgDetailFragment2.V0();
            bVar.getClass();
            EcgReport a11 = EcgReport.b.a(EcgReport.b.b(V0), reports);
            if (a11 != null) {
                str = a11.getUrl();
            } else {
                str = null;
            }
            gm.l.f(str2, "ecgId");
            b0 a12 = v.d().a();
            try {
                Bundle bundle = new Bundle();
                bundle.putString("ecgId", str2);
                bundle.putString("reportUrl", str);
                bundle.putLong("friendId", 0L);
                f10.l(R.id.toDetailReport, bundle, a12);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return l.f28297a;
    }
}
