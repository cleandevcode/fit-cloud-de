package com.topstep.fitcloud.pro.ui.friend;

import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import fm.p;
import i2.b0;
import ih.v;
import java.util.Date;
import mf.a0;
import mm.h;
import pm.e0;
import tl.l;
import vf.m;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendDataFragment$blockClick$1$5", f = "FriendDataFragment.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f11695e;

    /* renamed from: f */
    public final /* synthetic */ FriendDataFragment f11696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FriendDataFragment friendDataFragment, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f11696f = friendDataFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((e) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f11696f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        m mVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f11695e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            FriendDataFragment friendDataFragment = this.f11696f;
            h<Object>[] hVarArr = FriendDataFragment.f11482z0;
            FriendDataViewModel j12 = friendDataFragment.j1();
            this.f11695e = 1;
            obj = j12.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        yf.a a10 = ((ei.p) obj).f13776b.a();
        if (a10 != null && (mVar = a10.f31461h) != null) {
            FriendDataFragment friendDataFragment2 = this.f11696f;
            i2.m f10 = tb.a.f(friendDataFragment2);
            h<Object>[] hVarArr2 = FriendDataFragment.f11482z0;
            long userId = friendDataFragment2.h1().f13742a.getUserId();
            Date date = mVar.f29295a;
            gm.l.f(date, "date");
            String a11 = dg.a.a(date);
            b0 a12 = v.d().a();
            try {
                Bundle bundle = new Bundle();
                bundle.putLong("friendId", userId);
                bundle.putString("defaultDate", a11);
                f10.l(R.id.toPressureDetail, bundle, a12);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return l.f28297a;
    }
}
