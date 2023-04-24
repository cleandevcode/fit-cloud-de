package lg;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import l2.l2;
import m2.m;
import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportHistoryPagingSource$load$2", f = "SportHistoryPagingSource.kt", l = {37, 39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f0 extends zl.i implements fm.p<pm.e0, xl.d<? super l2.b<Integer, SportRecord>>, Object> {

    /* renamed from: e */
    public int f19752e;

    /* renamed from: f */
    public final /* synthetic */ h0 f19753f;

    /* renamed from: g */
    public final /* synthetic */ l2.a<Integer> f19754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, l2.a<Integer> aVar, xl.d<? super f0> dVar) {
        super(2, dVar);
        this.f19753f = h0Var;
        this.f19754g = aVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super l2.b<Integer, SportRecord>> dVar) {
        return ((f0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new f0(this.f19753f, this.f19754g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19752e;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            h0 h0Var = this.f19753f;
            o2.b bVar = h0Var.f19773e;
            AppDatabase appDatabase = h0Var.f19771c;
            bVar.getClass();
            gm.l.f(appDatabase, "db");
            if (bVar.f22603c.compareAndSet(false, true)) {
                m2.m mVar = appDatabase.f20265e;
                mVar.getClass();
                mVar.a(new m.e(mVar, bVar));
            }
            int i11 = this.f19753f.f19772d.get();
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("SportRepository");
            bVar2.b("source load key:%s loadSize:%d tempCount:%d", this.f19754g.a(), new Integer(this.f19754g.f19074a), new Integer(i11));
            if (i11 == -1) {
                h0 h0Var2 = this.f19753f;
                l2.a<Integer> aVar2 = this.f19754g;
                this.f19752e = 1;
                obj = m2.w.b(h0Var2.f19771c, new e0(h0Var2, aVar2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                h0 h0Var3 = this.f19753f;
                l2.a<Integer> aVar3 = this.f19754g;
                this.f19752e = 2;
                obj = h0.d(h0Var3, aVar3, i11, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        }
        return (l2.b) obj;
    }
}
