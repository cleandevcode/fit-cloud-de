package com.topstep.fitcloud.pro.ui.friend;

import android.content.Context;
import android.os.Bundle;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.EcgReport;
import com.topstep.fitcloudpro.R;
import ei.u;
import fm.p;
import i2.b0;
import i2.m;
import ih.v;
import java.util.List;
import mf.a0;
import mm.h;
import pm.e0;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment$onViewCreated$5$1", f = "FriendEcgFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f11699e;

    /* renamed from: f */
    public final /* synthetic */ FriendEcgFragment f11700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FriendEcgFragment friendEcgFragment, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f11700f = friendEcgFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((g) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new g(this.f11700f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        String str;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f11699e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            FriendEcgFragment friendEcgFragment = this.f11700f;
            h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            FriendEcgViewModel i12 = friendEcgFragment.i1();
            this.f11699e = 1;
            obj = i12.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        EcgRecord a10 = ((u) obj).f13790b.a();
        if (a10 != null) {
            FriendEcgFragment friendEcgFragment2 = this.f11700f;
            m f10 = tb.a.f(friendEcgFragment2);
            String uuid = a10.getEcgId().toString();
            gm.l.e(uuid, "it.ecgId.toString()");
            EcgReport.b bVar = EcgReport.Companion;
            List<EcgReport> reports = a10.getReports();
            Context V0 = friendEcgFragment2.V0();
            bVar.getClass();
            EcgReport a11 = EcgReport.b.a(EcgReport.b.b(V0), reports);
            if (a11 != null) {
                str = a11.getUrl();
            } else {
                str = null;
            }
            long userId = friendEcgFragment2.i1().f11544k.f13779a.getUserId();
            b0 a12 = v.d().a();
            try {
                Bundle bundle = new Bundle();
                bundle.putString("ecgId", uuid);
                bundle.putString("reportUrl", str);
                bundle.putLong("friendId", userId);
                f10.l(R.id.toDetailReport, bundle, a12);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return l.f28297a;
    }
}
