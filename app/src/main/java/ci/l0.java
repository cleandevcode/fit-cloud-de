package ci;

import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$deleteSong$1", f = "SongPushViewModel.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4785e;

    /* renamed from: f */
    public final /* synthetic */ SongPushViewModel f4786f;

    /* renamed from: g */
    public final /* synthetic */ int f4787g;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$deleteSong$1$1", f = "SongPushViewModel.kt", l = {171}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f4788e;

        /* renamed from: f */
        public final /* synthetic */ SongPushViewModel f4789f;

        /* renamed from: g */
        public final /* synthetic */ xc.a f4790g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SongPushViewModel songPushViewModel, xc.a aVar, xl.d<? super a> dVar) {
            super(1, dVar);
            this.f4789f = songPushViewModel;
            this.f4790g = aVar;
        }

        @Override // fm.l
        public final Object k(xl.d<? super tl.l> dVar) {
            return new a(this.f4789f, this.f4790g, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            Object obj2 = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f4788e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                v vVar = this.f4789f.f11386n;
                xc.a aVar = this.f4790g;
                this.f4788e = 1;
                vVar.getClass();
                Object g10 = jh.v.g(30000L, new x(vVar, aVar, null), this);
                if (g10 != obj2) {
                    g10 = tl.l.f28297a;
                }
                if (g10 == obj2) {
                    return obj2;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.p<k0, u6.a<? extends tl.l>, k0> {

        /* renamed from: b */
        public static final b f4791b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final k0 A(k0 k0Var, u6.a<? extends tl.l> aVar) {
            k0 k0Var2 = k0Var;
            u6.a<? extends tl.l> aVar2 = aVar;
            gm.l.f(k0Var2, "$this$execute");
            gm.l.f(aVar2, "it");
            return k0.copy$default(k0Var2, null, aVar2, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(SongPushViewModel songPushViewModel, int i10, xl.d<? super l0> dVar) {
        super(2, dVar);
        this.f4786f = songPushViewModel;
        this.f4787g = i10;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((l0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new l0(this.f4786f, this.f4787g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        List<xc.a> list;
        xc.a aVar;
        yl.a aVar2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4785e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            SongPushViewModel songPushViewModel = this.f4786f;
            this.f4785e = 1;
            obj = songPushViewModel.e(this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        j0 a10 = ((k0) obj).f4783a.a();
        if (a10 != null && (list = a10.f4782c) != null && (aVar = (xc.a) ul.q.J(this.f4787g, list)) != null) {
            SongPushViewModel songPushViewModel2 = this.f4786f;
            v6.b.f(songPushViewModel2, new a(songPushViewModel2, aVar, null), null, b.f4791b, 3);
            return tl.l.f28297a;
        }
        return tl.l.f28297a;
    }
}
