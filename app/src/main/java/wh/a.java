package wh;

import android.net.Uri;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import fm.p;
import java.util.concurrent.CancellationException;
import mf.a0;
import nh.c;
import pm.e0;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel$startDfu$1", f = "DfuViewModel.kt", l = {50, 51, 54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f29828e;

    /* renamed from: f */
    public final /* synthetic */ DfuViewModel f29829f;

    /* renamed from: g */
    public final /* synthetic */ int f29830g;

    /* renamed from: h */
    public final /* synthetic */ Uri f29831h;

    /* renamed from: i */
    public final /* synthetic */ byte f29832i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DfuViewModel dfuViewModel, int i10, Uri uri, byte b10, xl.d dVar) {
        super(2, dVar);
        this.f29829f = dfuViewModel;
        this.f29830g = i10;
        this.f29831h = uri;
        this.f29832i = b10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((a) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new a(this.f29829f, this.f29830g, this.f29831h, this.f29832i, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29828e;
        try {
        } catch (Exception e10) {
            if (!(e10 instanceof CancellationException)) {
                rm.a aVar2 = this.f29829f.f10911f;
                c.a aVar3 = new c.a(e10);
                this.f29828e = 3;
                if (aVar2.d(aVar3, this) == aVar) {
                    return aVar;
                }
            }
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                }
                return l.f28297a;
            }
            a0.k(obj);
        } else {
            a0.k(obj);
            tk.a b10 = ij.c.b((ij.c) this.f29829f.f10910e.getValue(), this.f29830g, this.f29831h, this.f29832i);
            this.f29828e = 1;
            if (a.f.b(b10, this) == aVar) {
                return aVar;
            }
        }
        rm.a aVar4 = this.f29829f.f10911f;
        c.b bVar = new c.b(l.f28297a);
        this.f29828e = 2;
        if (aVar4.d(bVar, this) == aVar) {
            return aVar;
        }
        return l.f28297a;
    }
}
