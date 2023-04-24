package of;

import android.util.Log;
import com.topstep.fitcloud.pro.MyApplication;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import o0.g;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.MyApplication$initMainProcess$1", f = "MyApplication.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23211e;

    /* renamed from: f */
    public final /* synthetic */ MyApplication f23212f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public static final a<T> f23213a = new a<>();

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            int i10;
            cg.a aVar = (cg.a) obj;
            int i11 = f.i.f13880a;
            gm.l.f(aVar, "theme");
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            i10 = 3;
                        } else {
                            throw new qa.p();
                        }
                    } else {
                        i10 = -1;
                    }
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 1;
            }
            p000do.a.f13275a.h("defaultMode:%d mode:%d", new Integer(i11), new Integer(i10));
            if (i11 != i10) {
                if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
                    Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
                } else if (f.i.f13880a != i10) {
                    f.i.f13880a = i10;
                    synchronized (f.i.f13882c) {
                        Iterator<WeakReference<f.i>> it = f.i.f13881b.iterator();
                        while (true) {
                            g.a aVar2 = (g.a) it;
                            if (!aVar2.hasNext()) {
                                break;
                            }
                            f.i iVar = (f.i) ((WeakReference) aVar2.next()).get();
                            if (iVar != null) {
                                iVar.d();
                            }
                        }
                    }
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(MyApplication myApplication, xl.d<? super q> dVar) {
        super(2, dVar);
        this.f23212f = myApplication;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((q) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new q(this.f23212f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23211e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<yg.m> aVar2 = this.f23212f.f9541h;
            if (aVar2 != null) {
                yg.f C = aVar2.get().C();
                sm.g<? super cg.a> gVar = a.f23213a;
                this.f23211e = 1;
                if (C.a(gVar, this) == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("publicStorage");
                throw null;
            }
        }
        return tl.l.f28297a;
    }
}
