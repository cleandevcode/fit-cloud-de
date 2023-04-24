package ci;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$stopTransfer$2", f = "PlaybackClientHelper.kt", l = {335, 337, 337}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public Throwable f4750e;

    /* renamed from: f */
    public int f4751f;

    /* renamed from: g */
    public final /* synthetic */ v f4752g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v vVar, xl.d<? super d0> dVar) {
        super(2, dVar);
        this.f4752g = vVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new d0(this.f4752g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object obj2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4751f;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = this.f4750e;
                        mf.a0.k(obj);
                        throw th2;
                    }
                    mf.a0.k(obj);
                    return tl.l.f28297a;
                }
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                v vVar = this.f4752g;
                this.f4751f = 1;
                vVar.getClass();
                Object g10 = jh.v.g(60000L, new w(vVar, null), this);
                if (g10 != obj2) {
                    g10 = tl.l.f28297a;
                }
                if (g10 == obj2) {
                    return obj2;
                }
            }
            v vVar2 = this.f4752g;
            this.f4751f = 2;
            vVar2.getClass();
            Object g11 = jh.v.g(60000L, new y(vVar2, null), this);
            if (g11 != obj2) {
                g11 = tl.l.f28297a;
            }
            if (g11 == obj2) {
                return obj2;
            }
            return tl.l.f28297a;
        } catch (Throwable th3) {
            v vVar3 = this.f4752g;
            this.f4750e = th3;
            this.f4751f = 3;
            vVar3.getClass();
            Object g12 = jh.v.g(60000L, new y(vVar3, null), this);
            if (g12 != obj2) {
                g12 = tl.l.f28297a;
            }
            if (g12 == obj2) {
                return obj2;
            }
            throw th3;
        }
    }
}
