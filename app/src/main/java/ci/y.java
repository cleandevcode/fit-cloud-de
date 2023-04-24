package ci;

import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$exitTransfer$2", f = "PlaybackClientHelper.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4867e;

    /* renamed from: f */
    public final /* synthetic */ v f4868f;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ v f4869b;

        /* renamed from: c */
        public final /* synthetic */ b f4870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, b bVar) {
            super(1);
            this.f4869b = vVar;
            this.f4870c = bVar;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("exitTransfer cancel", new Object[0]);
            this.f4869b.f4838a.h(this.f4870c);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends wc.b {

        /* renamed from: a */
        public final /* synthetic */ v f4871a;

        /* renamed from: b */
        public final /* synthetic */ pm.i<tl.l> f4872b;

        public b(v vVar, pm.j jVar) {
            this.f4871a = vVar;
            this.f4872b = jVar;
        }

        @Override // wc.b
        public final void e(boolean z10) {
            pm.i<tl.l> iVar;
            Object f10;
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("exitTransfer result:" + z10, new Object[0]);
            this.f4871a.f4838a.h(this);
            if (z10) {
                iVar = this.f4872b;
                f10 = tl.l.f28297a;
            } else {
                iVar = this.f4872b;
                f10 = mf.a0.f(new x0(3));
            }
            iVar.l(f10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar, xl.d<? super y> dVar) {
        super(2, dVar);
        this.f4868f = vVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((y) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new y(this.f4868f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4867e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            v vVar = this.f4868f;
            this.f4867e = 1;
            pm.j jVar = new pm.j(1, mf.a0.i(this));
            jVar.u();
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("exitTransfer start", new Object[0]);
            b bVar2 = new b(vVar, jVar);
            vVar.f4838a.e(bVar2);
            jVar.z(new a(vVar, bVar2));
            wc.c cVar = vVar.f4838a;
            cVar.getClass();
            if (cVar.g(new ed.b(2, (short) 1672, (short) 1671, new byte[]{(byte) 136, (byte) 6})).f15867b != 0) {
                vVar.f4838a.h(bVar2);
                jVar.l(mf.a0.f(new x0(3)));
            }
            if (jVar.t() == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
