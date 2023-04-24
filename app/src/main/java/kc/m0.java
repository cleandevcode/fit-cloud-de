package kc;

import android.content.Context;
import android.content.IntentFilter;
import fl.g;

/* loaded from: classes.dex */
public final class m0 extends tk.i<b> {

    /* renamed from: a */
    public final fl.n0 f18351a;

    /* loaded from: classes.dex */
    public class a implements tk.k<b> {

        /* renamed from: a */
        public final /* synthetic */ Context f18352a;

        public a(Context context) {
            this.f18352a = context;
        }

        @Override // tk.k
        public final void a(g.a aVar) {
            k0 k0Var = new k0(aVar);
            this.f18352a.registerReceiver(k0Var, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            aVar.e(new l0(this, k0Var));
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        public static final b f18353c = new b("STATE_ON", true);

        /* renamed from: d */
        public static final b f18354d = new b("STATE_OFF", false);

        /* renamed from: e */
        public static final b f18355e = new b("STATE_TURNING_ON", false);

        /* renamed from: f */
        public static final b f18356f = new b("STATE_TURNING_OFF", false);

        /* renamed from: a */
        public final boolean f18357a;

        /* renamed from: b */
        public final String f18358b;

        public b(String str, boolean z10) {
            this.f18357a = z10;
            this.f18358b = str;
        }

        public final String toString() {
            return this.f18358b;
        }
    }

    public m0(Context context) {
        fl.g gVar = new fl.g(new a(context));
        il.o oVar = pl.a.f24282d;
        this.f18351a = new fl.n0(new fl.l0(gVar.A(oVar).F(oVar)));
    }

    @Override // tk.i
    public final void z(tk.n<? super b> nVar) {
        this.f18351a.d(nVar);
    }
}
