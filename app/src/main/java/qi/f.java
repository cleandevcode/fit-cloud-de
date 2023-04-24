package qi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import mf.a0;
import rm.t;

@zl.e(c = "com.topstep.fitcloud.pro.utils.ExtensionsKt$flowLocationServiceState$1", f = "Extensions.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends zl.i implements fm.p<t<? super Boolean>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f24853e;

    /* renamed from: f */
    public /* synthetic */ Object f24854f;

    /* renamed from: g */
    public final /* synthetic */ Context f24855g;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<tl.l> {

        /* renamed from: b */
        public final /* synthetic */ Context f24856b;

        /* renamed from: c */
        public final /* synthetic */ b f24857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, b bVar) {
            super(0);
            this.f24856b = context;
            this.f24857c = bVar;
        }

        @Override // fm.a
        public final tl.l m() {
            this.f24856b.unregisterReceiver(this.f24857c);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ t<Boolean> f24858a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(t<? super Boolean> tVar) {
            this.f24858a = tVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            gm.l.f(context, "context");
            gm.l.f(intent, "intent");
            t<Boolean> tVar = this.f24858a;
            Object systemService = context.getSystemService("location");
            if (systemService != null) {
                tVar.p(Boolean.valueOf(d1.g.a((LocationManager) systemService)));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, xl.d<? super f> dVar) {
        super(2, dVar);
        this.f24855g = context;
    }

    @Override // fm.p
    public final Object A(t<? super Boolean> tVar, xl.d<? super tl.l> dVar) {
        return ((f) p(tVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        f fVar = new f(this.f24855g, dVar);
        fVar.f24854f = obj;
        return fVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24853e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            t tVar = (t) this.f24854f;
            Context context = this.f24855g;
            gm.l.f(context, "context");
            Object systemService = context.getSystemService("location");
            if (systemService != null) {
                tVar.p(Boolean.valueOf(d1.g.a((LocationManager) systemService)));
                b bVar = new b(tVar);
                this.f24855g.registerReceiver(bVar, new IntentFilter("android.location.MODE_CHANGED"));
                a aVar2 = new a(this.f24855g, bVar);
                this.f24853e = 1;
                if (rm.r.a(tVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
            }
        }
        return tl.l.f28297a;
    }
}
