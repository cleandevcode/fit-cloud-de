package t0;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final ArrayList<s0.d> f27461a = new ArrayList<>();

    /* renamed from: b */
    public a f27462b = new a();

    /* renamed from: c */
    public s0.e f27463c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f27464a;

        /* renamed from: b */
        public int f27465b;

        /* renamed from: c */
        public int f27466c;

        /* renamed from: d */
        public int f27467d;

        /* renamed from: e */
        public int f27468e;

        /* renamed from: f */
        public int f27469f;

        /* renamed from: g */
        public int f27470g;

        /* renamed from: h */
        public boolean f27471h;

        /* renamed from: i */
        public boolean f27472i;

        /* renamed from: j */
        public int f27473j;
    }

    /* renamed from: t0.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0491b {
    }

    public b(s0.e eVar) {
        this.f27463c = eVar;
    }

    public final boolean a(int i10, s0.d dVar, InterfaceC0491b interfaceC0491b) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        a aVar = this.f27462b;
        int[] iArr = dVar.V;
        aVar.f27464a = iArr[0];
        boolean z14 = true;
        aVar.f27465b = iArr[1];
        aVar.f27466c = dVar.r();
        this.f27462b.f27467d = dVar.l();
        a aVar2 = this.f27462b;
        aVar2.f27472i = false;
        aVar2.f27473j = i10;
        if (aVar2.f27464a == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar2.f27465b == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && dVar.Z > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && dVar.Z > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && dVar.f26350u[0] == 4) {
            aVar2.f27464a = 1;
        }
        if (z13 && dVar.f26350u[1] == 4) {
            aVar2.f27465b = 1;
        }
        ((ConstraintLayout.b) interfaceC0491b).b(dVar, aVar2);
        dVar.O(this.f27462b.f27468e);
        dVar.L(this.f27462b.f27469f);
        a aVar3 = this.f27462b;
        dVar.F = aVar3.f27471h;
        int i11 = aVar3.f27470g;
        dVar.f26319d0 = i11;
        if (i11 <= 0) {
            z14 = false;
        }
        dVar.F = z14;
        aVar3.f27473j = 0;
        return aVar3.f27472i;
    }

    public final void b(s0.e eVar, int i10, int i11, int i12) {
        int i13 = eVar.f26321e0;
        int i14 = eVar.f26323f0;
        eVar.f26321e0 = 0;
        eVar.f26323f0 = 0;
        eVar.O(i11);
        eVar.L(i12);
        if (i13 < 0) {
            i13 = 0;
        }
        eVar.f26321e0 = i13;
        if (i14 < 0) {
            i14 = 0;
        }
        eVar.f26323f0 = i14;
        s0.e eVar2 = this.f27463c;
        eVar2.f26358v0 = i10;
        eVar2.R();
    }

    public final void c(s0.e eVar) {
        this.f27461a.clear();
        int size = eVar.f26400s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0.d dVar = eVar.f26400s0.get(i10);
            int[] iArr = dVar.V;
            if (iArr[0] == 3 || iArr[1] == 3) {
                this.f27461a.add(dVar);
            }
        }
        eVar.f26357u0.f27477b = true;
    }
}
