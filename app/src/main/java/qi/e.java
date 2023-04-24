package qi;

import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import mf.a0;
import rm.t;

@zl.e(c = "com.topstep.fitcloud.pro.utils.ExtensionsKt$flowBluetoothAdapterState$1", f = "Extensions.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.p<t<? super Boolean>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f24847e;

    /* renamed from: f */
    public /* synthetic */ Object f24848f;

    /* renamed from: g */
    public final /* synthetic */ Context f24849g;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<tl.l> {

        /* renamed from: b */
        public final /* synthetic */ Context f24850b;

        /* renamed from: c */
        public final /* synthetic */ b f24851c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, b bVar) {
            super(0);
            this.f24850b = context;
            this.f24851c = bVar;
        }

        @Override // fm.a
        public final tl.l m() {
            this.f24850b.unregisterReceiver(this.f24851c);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ t<Boolean> f24852a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(t<? super Boolean> tVar) {
            this.f24852a = tVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            gm.l.f(context, "context");
            gm.l.f(intent, "intent");
            this.f24852a.p(Boolean.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f24849g = context;
    }

    @Override // fm.p
    public final Object A(t<? super Boolean> tVar, xl.d<? super tl.l> dVar) {
        return ((e) p(tVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        e eVar = new e(this.f24849g, dVar);
        eVar.f24848f = obj;
        return eVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24847e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            t tVar = (t) this.f24848f;
            Object systemService = this.f24849g.getSystemService("bluetooth");
            gm.l.d(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            tVar.p(Boolean.valueOf(((BluetoothManager) systemService).getAdapter().isEnabled()));
            b bVar = new b(tVar);
            this.f24849g.registerReceiver(bVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            a aVar2 = new a(this.f24849g, bVar);
            this.f24847e = 1;
            if (rm.r.a(tVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
