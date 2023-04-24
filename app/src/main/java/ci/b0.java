package ci;

import ci.v;
import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$requestStorageSpace$2", f = "PlaybackClientHelper.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends zl.i implements fm.p<pm.e0, xl.d<? super v.a>, Object> {

    /* renamed from: e */
    public int f4723e;

    /* renamed from: f */
    public final /* synthetic */ v f4724f;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ v f4725b;

        /* renamed from: c */
        public final /* synthetic */ b f4726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, b bVar) {
            super(1);
            this.f4725b = vVar;
            this.f4726c = bVar;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestStorageSpace cancel", new Object[0]);
            this.f4725b.f4838a.h(this.f4726c);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends wc.b {

        /* renamed from: a */
        public final /* synthetic */ v f4727a;

        /* renamed from: b */
        public final /* synthetic */ pm.i<v.a> f4728b;

        public b(v vVar, pm.j jVar) {
            this.f4727a = vVar;
            this.f4728b = jVar;
        }

        @Override // wc.b
        public final void j(int i10, int i11, boolean z10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestStorageSpace result:%b total:%d free:%d", Boolean.valueOf(z10), Integer.valueOf(i10), Integer.valueOf(i11));
            this.f4727a.f4838a.h(this);
            if (z10 && i10 != 0) {
                this.f4728b.l(new v.a(i10, i11));
            } else {
                this.f4728b.l(mf.a0.f(new q()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(v vVar, xl.d<? super b0> dVar) {
        super(2, dVar);
        this.f4724f = vVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super v.a> dVar) {
        return ((b0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new b0(this.f4724f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4723e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            v vVar = this.f4724f;
            this.f4723e = 1;
            pm.j jVar = new pm.j(1, mf.a0.i(this));
            jVar.u();
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestStorageSpace start", new Object[0]);
            b bVar2 = new b(vVar, jVar);
            vVar.f4838a.e(bVar2);
            jVar.z(new a(vVar, bVar2));
            wc.c cVar = vVar.f4838a;
            cVar.getClass();
            if (cVar.g(new ed.b(2, (short) 1677, (short) 1676, new byte[]{(byte) 141, (byte) 6})).f15867b != 0) {
                vVar.f4838a.h(bVar2);
                jVar.l(mf.a0.f(new q()));
            }
            obj = jVar.t();
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
