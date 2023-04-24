package ci;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$deleteSong$2", f = "PlaybackClientHelper.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4859e;

    /* renamed from: f */
    public final /* synthetic */ v f4860f;

    /* renamed from: g */
    public final /* synthetic */ xc.a f4861g;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ v f4862b;

        /* renamed from: c */
        public final /* synthetic */ b f4863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, b bVar) {
            super(1);
            this.f4862b = vVar;
            this.f4863c = bVar;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("deleteSong cancel", new Object[0]);
            this.f4862b.f4838a.h(this.f4863c);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends wc.b {

        /* renamed from: a */
        public final /* synthetic */ v f4864a;

        /* renamed from: b */
        public final /* synthetic */ pm.i<tl.l> f4865b;

        public b(v vVar, pm.j jVar) {
            this.f4864a = vVar;
            this.f4865b = jVar;
        }

        @Override // wc.b
        public final void c(int i10) {
            pm.i<tl.l> iVar;
            Object f10;
            this.f4864a.f4838a.h(this);
            if (i10 == 1) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("SongPush");
                bVar.h("deleteSong success", new Object[0]);
                iVar = this.f4865b;
                f10 = tl.l.f28297a;
            } else {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("SongPush");
                bVar2.h("deleteSong fail", new Object[0]);
                iVar = this.f4865b;
                f10 = mf.a0.f(new l());
            }
            iVar.l(f10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, xc.a aVar, xl.d<? super x> dVar) {
        super(2, dVar);
        this.f4860f = vVar;
        this.f4861g = aVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((x) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new x(this.f4860f, this.f4861g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        h4.l g10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4859e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            v vVar = this.f4860f;
            xc.a aVar2 = this.f4861g;
            this.f4859e = 1;
            pm.j jVar = new pm.j(1, mf.a0.i(this));
            jVar.u();
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("deleteSong start", new Object[0]);
            b bVar2 = new b(vVar, jVar);
            vVar.f4838a.e(bVar2);
            jVar.z(new a(vVar, bVar2));
            wc.c cVar = vVar.f4838a;
            int i11 = aVar2.f30467b;
            byte[] bArr = aVar2.f30470e;
            cVar.getClass();
            if (bArr == null) {
                ge.b.g("song name cannot be empty", kd.c.f18443f);
                g10 = new h4.l(48, 1);
            } else if (bArr.length == 0) {
                ge.b.g("song name length cannot be 0", kd.c.f18443f);
                g10 = new h4.l(48, 1);
            } else {
                int length = bArr.length + 4;
                byte[] bArr2 = new byte[length];
                ByteBuffer wrap = ByteBuffer.wrap(bArr2);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                wrap.putShort(0, (short) i11);
                wrap.putShort(2, (short) bArr.length);
                System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
                byte[] bArr3 = new byte[length + 2];
                bArr3[0] = (byte) 137;
                bArr3[1] = (byte) 6;
                if (length > 0) {
                    System.arraycopy(bArr2, 0, bArr3, 2, length);
                }
                g10 = cVar.g(new ed.b(2, (short) 1673, (short) 1672, bArr3));
            }
            if (g10.f15867b != 0) {
                vVar.f4838a.h(bVar2);
                jVar.l(mf.a0.f(new l()));
            }
            if (jVar.t() == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
