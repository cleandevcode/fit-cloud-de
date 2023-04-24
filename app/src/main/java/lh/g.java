package lh;

import android.content.Context;
import android.net.Uri;
import bi.z0;
import com.topstep.fitcloudpro.R;
import d7.a;
import fm.p;
import mf.a0;
import pm.e0;
import pm.o0;
import tl.l;

@zl.e(c = "com.topstep.fitcloud.pro.ui.base.GetPhotoFragment$copyChoosePhoto$1", f = "GetPhotoFragment.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f20008e;

    /* renamed from: f */
    public final /* synthetic */ h f20009f;

    /* renamed from: g */
    public final /* synthetic */ Uri f20010g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Uri uri, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f20009f = hVar;
        this.f20010g = uri;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((g) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new g(this.f20009f, this.f20010g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f20008e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            d7.e e12 = this.f20009f.e1();
            a.c cVar = a.c.f12828b;
            e12.getClass();
            gm.l.f(cVar, "autoCancel");
            d7.d b10 = e12.b();
            b10.i1(4, null, false, false, cVar, 0);
            b10.h1(e12.f12860b, e12.f12861c);
            Context V0 = this.f20009f.V0();
            Uri uri = this.f20010g;
            this.f20008e = 1;
            obj = z0.s(this, o0.f24382b, new rf.a(V0, uri, null));
            if (obj == aVar) {
                return aVar;
            }
        }
        Uri uri2 = (Uri) obj;
        if (uri2 != null) {
            this.f20009f.e1().a();
            this.f20009f.q1(uri2);
        } else {
            d7.e.e(this.f20009f.f1(), this.f20009f.o0(R.string.photo_select_failed));
        }
        return l.f28297a;
    }
}
