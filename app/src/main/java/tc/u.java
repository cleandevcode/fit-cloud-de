package tc;

import android.bluetooth.BluetoothAdapter;
import fl.a1;
import fl.u0;
import java.util.concurrent.TimeUnit;
import kc.m0;
import kc.o0;

/* loaded from: classes.dex */
public final class u extends tk.i<o0.a> {

    /* renamed from: a */
    public final l0 f28014a;

    /* renamed from: b */
    public final tk.i<m0.b> f28015b;

    /* renamed from: c */
    public final tk.i<Boolean> f28016c;

    /* renamed from: d */
    public final d0 f28017d;

    /* renamed from: e */
    public final tk.o f28018e;

    /* loaded from: classes.dex */
    public class a implements wk.e<Boolean, tk.i<o0.a>> {
        public a() {
            u.this = r1;
        }

        @Override // wk.e
        public final tk.i<o0.a> apply(Boolean bool) {
            boolean z10;
            m0.b bVar;
            Boolean bool2 = bool;
            u uVar = u.this;
            l0 l0Var = uVar.f28014a;
            tk.i<m0.b> iVar = uVar.f28015b;
            tk.i<Boolean> iVar2 = uVar.f28016c;
            BluetoothAdapter bluetoothAdapter = l0Var.f28001a;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bVar = m0.b.f18353c;
            } else {
                bVar = m0.b.f18354d;
            }
            tk.l B = iVar.x(bVar).B(new t(iVar2));
            B.getClass();
            fl.k kVar = new fl.k(B);
            if (bool2.booleanValue()) {
                return new u0(kVar);
            }
            return kVar;
        }
    }

    public u(l0 l0Var, tk.i<m0.b> iVar, tk.i<Boolean> iVar2, d0 d0Var, tk.o oVar) {
        this.f28014a = l0Var;
        this.f28015b = iVar;
        this.f28016c = iVar2;
        this.f28017d = d0Var;
        this.f28018e = oVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super o0.a> nVar) {
        boolean z10;
        if (this.f28014a.f28001a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            nVar.a(new uk.f(yk.a.f31787b));
            nVar.onComplete();
            return;
        }
        d0 d0Var = this.f28017d;
        new el.e(new gl.p(new fl.f(new a1(tk.i.r(0L, 1L, TimeUnit.SECONDS, this.f28018e), new r(d0Var))), new q()), new a()).d(nVar);
    }
}
