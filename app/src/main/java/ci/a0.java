package ci;

import android.os.Bundle;
import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$requestDeviceInfo$2", f = "PlaybackClientHelper.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends zl.i implements fm.p<pm.e0, xl.d<? super m>, Object> {

    /* renamed from: e */
    public int f4711e;

    /* renamed from: f */
    public final /* synthetic */ v f4712f;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ v f4713b;

        /* renamed from: c */
        public final /* synthetic */ b f4714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, b bVar) {
            super(1);
            this.f4713b = vVar;
            this.f4714c = bVar;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestDeviceInfo cancel", new Object[0]);
            this.f4713b.f4838a.h(this.f4714c);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends wc.b {

        /* renamed from: a */
        public final /* synthetic */ v f4715a;

        /* renamed from: b */
        public final /* synthetic */ pm.i<m> f4716b;

        public b(v vVar, pm.j jVar) {
            this.f4715a = vVar;
            this.f4716b = jVar;
        }

        @Override // wc.b
        public final void f(Bundle bundle) {
            m mVar = new m(bundle.getInt("com.realsil.android.extra.SEND_PACKET_SIZE"), bundle.getInt("com.realsil.android.extra.BUFFER_CHECK_SIZE"), bundle.getInt("com.realsil.android.extra.PROTOCOL_VERSION"), bundle.getInt("com.realsil.android.extra.RWS_STATUS"), bundle.getInt("com.realsil.android.extra.SUPPORT_FORMATS"));
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestDeviceInfo success: %s", mVar.toString());
            this.f4715a.f4838a.h(this);
            this.f4716b.l(mVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v vVar, xl.d<? super a0> dVar) {
        super(2, dVar);
        this.f4712f = vVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super m> dVar) {
        return ((a0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a0(this.f4712f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4711e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            v vVar = this.f4712f;
            this.f4711e = 1;
            pm.j jVar = new pm.j(1, mf.a0.i(this));
            jVar.u();
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestDeviceInfo start", new Object[0]);
            b bVar2 = new b(vVar, jVar);
            vVar.f4838a.e(bVar2);
            jVar.z(new a(vVar, bVar2));
            wc.c cVar = vVar.f4838a;
            cVar.getClass();
            byte[] bArr = {(byte) 128, (byte) 6};
            ed.b bVar3 = new ed.b(2, (short) 1664, (short) 1664, bArr);
            String b10 = he.a.b(ed.g.b(28, bArr));
            ge.b.k("send queryDeviceInfo..: " + b10);
            if (cVar.g(bVar3).f15867b != 0) {
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
