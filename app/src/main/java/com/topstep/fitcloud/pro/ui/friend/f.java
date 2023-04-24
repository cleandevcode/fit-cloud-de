package com.topstep.fitcloud.pro.ui.friend;

import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import ei.u;
import fm.p;
import mf.a0;
import mm.h;
import pm.e0;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment$onViewCreated$4$1", f = "FriendEcgFragment.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f11697e;

    /* renamed from: f */
    public final /* synthetic */ FriendEcgFragment f11698f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FriendEcgFragment friendEcgFragment, xl.d<? super f> dVar) {
        super(2, dVar);
        this.f11698f = friendEcgFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((f) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new f(this.f11698f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f11697e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            FriendEcgFragment friendEcgFragment = this.f11698f;
            h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            FriendEcgViewModel i12 = friendEcgFragment.i1();
            this.f11697e = 1;
            obj = i12.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        EcgRecord a10 = ((u) obj).f13790b.a();
        if (a10 != null) {
            FriendEcgFragment friendEcgFragment2 = this.f11698f;
            int i11 = EcgHealthReportActivity.F;
            EcgHealthReportActivity.a.a(friendEcgFragment2.V0(), a10, friendEcgFragment2.i1().f11544k.f13779a);
        }
        return l.f28297a;
    }
}
