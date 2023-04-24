package d7;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.r;
import d7.a;
import f.q;
import fm.p;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import pm.z1;
import tl.l;
import zl.i;

@Metadata
/* loaded from: classes.dex */
public final class d extends q {
    public int B0;
    public int C0;
    public String D0;
    public boolean E0;
    public d7.a F0 = a.c.f12828b;
    public long G0;
    public z1 H0;
    public a I0;
    public long J0;
    public d7.c K0;

    /* loaded from: classes.dex */
    public interface a {
        void g(int i10);
    }

    @zl.e(c = "com.github.kilnn.tool.dialog.prompt.PromptDialogFragment$startAutoCancel$1", f = "PromptDialogFragment.kt", l = {180}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f12852e;

        /* renamed from: g */
        public final /* synthetic */ d7.c f12854g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d7.c cVar, xl.d<? super b> dVar) {
            super(2, dVar);
            d.this = r1;
            this.f12854g = cVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f12854g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12852e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                long currentTimeMillis = d.this.G0 - System.currentTimeMillis();
                if (currentTimeMillis > 0) {
                    this.f12852e = 1;
                    if (a0.g(currentTimeMillis, this) == aVar) {
                        return aVar;
                    }
                }
            }
            this.f12854g.cancel();
            d dVar = d.this;
            int i11 = dVar.B0;
            if (i11 > 0) {
                a aVar2 = dVar.I0;
                if (aVar2 != null) {
                    aVar2.g(i11);
                }
                d.this.B0 = 0;
            }
            return l.f28297a;
        }
    }

    @zl.e(c = "com.github.kilnn.tool.dialog.prompt.PromptDialogFragment$startAutoCancel$2", f = "PromptDialogFragment.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f12855e;

        /* renamed from: f */
        public final /* synthetic */ long f12856f;

        /* renamed from: g */
        public final /* synthetic */ d7.c f12857g;

        /* renamed from: h */
        public final /* synthetic */ d f12858h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, d7.c cVar, d dVar, xl.d<? super c> dVar2) {
            super(2, dVar2);
            this.f12856f = j10;
            this.f12857g = cVar;
            this.f12858h = dVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((c) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new c(this.f12856f, this.f12857g, this.f12858h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12855e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                long j10 = this.f12856f;
                if (j10 > 0) {
                    this.f12855e = 1;
                    if (a0.g(j10, this) == aVar) {
                        return aVar;
                    }
                }
            }
            this.f12857g.cancel();
            d dVar = this.f12858h;
            int i11 = dVar.B0;
            if (i11 > 0) {
                a aVar2 = dVar.I0;
                if (aVar2 != null) {
                    aVar2.g(i11);
                }
                this.f12858h.B0 = 0;
            }
            return l.f28297a;
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void A0(Context context) {
        gm.l.f(context, "context");
        super.A0(context);
        r rVar = this.f2537v;
        if (rVar == null) {
            if (context instanceof a) {
                this.I0 = (a) context;
            }
        } else if (rVar instanceof a) {
            this.I0 = (a) rVar;
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.K0 = null;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void F0() {
        super.F0();
        this.I0 = null;
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        this.E = true;
        if (this.F0 instanceof a.b) {
            z1 z1Var = this.H0;
            if (z1Var != null) {
                z1Var.h(null);
            }
            this.G0 = (System.currentTimeMillis() - this.J0) + this.G0;
        }
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        j1();
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        long j10;
        super.L0(bundle);
        bundle.putInt("promptId", this.B0);
        bundle.putInt("promptType", this.C0);
        bundle.putString("promptText", this.D0);
        bundle.putBoolean("promptIntercept", this.E0);
        a.b bVar = d7.a.f12825a;
        d7.a aVar = this.F0;
        gm.l.f(aVar, "autoCancel");
        if (aVar instanceof a.b) {
            j10 = ((a.b) aVar).f12827b;
        } else if (gm.l.a(aVar, a.c.f12828b)) {
            j10 = 0;
        } else if (aVar instanceof a.C0218a) {
            j10 = -((a.C0218a) aVar).f12826b;
        } else {
            throw new qa.p();
        }
        bundle.putLong("autoCancel", j10);
        bundle.putLong("autoCancelTime", this.G0);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        d7.a c0218a;
        this.K0 = new d7.c(V0(), this.f2471q0);
        if (bundle != null) {
            this.B0 = bundle.getInt("promptId");
            this.C0 = bundle.getInt("promptType");
            this.D0 = bundle.getString("promptText");
            this.E0 = bundle.getBoolean("promptIntercept");
            a.b bVar = d7.a.f12825a;
            long j10 = bundle.getLong("autoCancel");
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                c0218a = new a.b(j10);
            } else if (i10 == 0) {
                c0218a = a.c.f12828b;
            } else {
                c0218a = new a.C0218a(-j10);
            }
            this.F0 = c0218a;
            this.G0 = bundle.getLong("autoCancelTime");
        }
        d7.c cVar = this.K0;
        if (cVar != null) {
            int i11 = this.C0;
            String str = this.D0;
            boolean z10 = this.E0;
            boolean z11 = this.f2472r0;
            cVar.f12845t = i11;
            cVar.f12846u = str;
            cVar.f12847v = z10;
            cVar.setCancelable(z11);
            cVar.f12848w = false;
            if (cVar.isShowing()) {
                cVar.j();
                cVar.l();
            }
        }
        d7.c cVar2 = this.K0;
        if (cVar2 != null) {
            return cVar2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.github.kilnn.tool.dialog.prompt.PromptDialog");
    }

    public final void i1(int i10, String str, boolean z10, boolean z11, d7.a aVar, int i11) {
        int i12;
        a aVar2;
        d7.c cVar = this.K0;
        boolean z12 = true;
        if (((cVar == null || !cVar.isShowing()) ? false : false) && (i12 = this.B0) > 0 && (aVar2 = this.I0) != null) {
            aVar2.g(i12);
        }
        this.B0 = i11;
        this.C0 = i10;
        this.D0 = str;
        this.E0 = z10;
        f1(z11);
        this.F0 = aVar;
        this.G0 = 0L;
        z1 z1Var = this.H0;
        if (z1Var != null) {
            z1Var.h(null);
        }
        d7.c cVar2 = this.K0;
        if (cVar2 != null) {
            int i13 = this.C0;
            String str2 = this.D0;
            boolean z13 = this.E0;
            boolean z14 = this.f2472r0;
            cVar2.f12845t = i13;
            cVar2.f12846u = str2;
            cVar2.f12847v = z13;
            cVar2.setCancelable(z14);
            cVar2.f12848w = false;
            if (cVar2.isShowing()) {
                cVar2.j();
                cVar2.l();
            }
        }
        j1();
    }

    public final void j1() {
        boolean z10;
        d7.c cVar;
        z1 e10;
        if (this.f2508a >= 7) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (cVar = this.K0) == null) {
            return;
        }
        d7.a aVar = this.F0;
        if (aVar instanceof a.C0218a) {
            if (this.G0 == 0) {
                this.G0 = System.currentTimeMillis() + ((a.C0218a) aVar).f12826b;
            }
            e10 = rm.l.g(this).e(new b(cVar, null));
        } else if (aVar instanceof a.b) {
            long j10 = ((a.b) aVar).f12827b - this.G0;
            this.J0 = System.currentTimeMillis();
            e10 = rm.l.g(this).e(new c(j10, cVar, this, null));
        } else {
            return;
        }
        this.H0 = e10;
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a aVar;
        gm.l.f(dialogInterface, "dialog");
        int i10 = this.B0;
        if (i10 <= 0 || (aVar = this.I0) == null) {
            return;
        }
        aVar.g(i10);
    }
}
