package ci;

import bi.z0;
import com.topstep.fitcloud.pro.ui.device.song.push.SongSelectViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongSelectViewModel$refresh$1", f = "AudioSelectFragment.kt", l = {301}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t0 extends zl.i implements fm.l<xl.d<? super f>, Object> {

    /* renamed from: e */
    public int f4829e;

    /* renamed from: f */
    public final /* synthetic */ SongSelectViewModel f4830f;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongSelectViewModel$refresh$1$1", f = "AudioSelectFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super f>, Object> {

        /* renamed from: e */
        public final /* synthetic */ SongSelectViewModel f4831e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SongSelectViewModel songSelectViewModel, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f4831e = songSelectViewModel;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super f> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f4831e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:220:0x017d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0178 A[SYNTHETIC] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 502
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ci.t0.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(SongSelectViewModel songSelectViewModel, xl.d<? super t0> dVar) {
        super(1, dVar);
        this.f4830f = songSelectViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super f> dVar) {
        return new t0(this.f4830f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4829e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            wm.b bVar = pm.o0.f24382b;
            a aVar2 = new a(this.f4830f, null);
            this.f4829e = 1;
            obj = z0.s(this, bVar, aVar2);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
