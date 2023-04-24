package t0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f */
    public static int f27503f;

    /* renamed from: b */
    public int f27505b;

    /* renamed from: c */
    public int f27506c;

    /* renamed from: a */
    public ArrayList<s0.d> f27504a = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<a> f27507d = null;

    /* renamed from: e */
    public int f27508e = -1;

    /* loaded from: classes.dex */
    public class a {
        public a(s0.d dVar, q0.c cVar) {
            new WeakReference(dVar);
            s0.c cVar2 = dVar.K;
            cVar.getClass();
            q0.c.o(cVar2);
            q0.c.o(dVar.L);
            q0.c.o(dVar.M);
            q0.c.o(dVar.N);
            q0.c.o(dVar.O);
        }
    }

    public p(int i10) {
        int i11 = f27503f;
        f27503f = i11 + 1;
        this.f27505b = i11;
        this.f27506c = i10;
    }

    public final boolean a(s0.d dVar) {
        if (this.f27504a.contains(dVar)) {
            return false;
        }
        this.f27504a.add(dVar);
        return true;
    }

    public final void b(ArrayList<p> arrayList) {
        int size = this.f27504a.size();
        if (this.f27508e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p pVar = arrayList.get(i10);
                if (this.f27508e == pVar.f27505b) {
                    d(this.f27506c, pVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(q0.c cVar, int i10) {
        int o10;
        s0.c cVar2;
        if (this.f27504a.size() == 0) {
            return 0;
        }
        ArrayList<s0.d> arrayList = this.f27504a;
        s0.e eVar = (s0.e) arrayList.get(0).W;
        cVar.u();
        eVar.c(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).c(cVar, false);
        }
        if (i10 == 0 && eVar.B0 > 0) {
            hh.d.a(eVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.C0 > 0) {
            hh.d.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f27507d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f27507d.add(new a(arrayList.get(i12), cVar));
        }
        if (i10 == 0) {
            o10 = q0.c.o(eVar.K);
            cVar2 = eVar.M;
        } else {
            o10 = q0.c.o(eVar.L);
            cVar2 = eVar.N;
        }
        int o11 = q0.c.o(cVar2);
        cVar.u();
        return o11 - o10;
    }

    public final void d(int i10, p pVar) {
        Iterator<s0.d> it = this.f27504a.iterator();
        while (it.hasNext()) {
            s0.d next = it.next();
            pVar.a(next);
            if (i10 == 0) {
                next.f26345q0 = pVar.f27505b;
            } else {
                next.f26347r0 = pVar.f27505b;
            }
        }
        this.f27508e = pVar.f27505b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f27506c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String b10 = a0.q.b(sb2, this.f27505b, "] <");
        Iterator<s0.d> it = this.f27504a.iterator();
        while (it.hasNext()) {
            StringBuilder a10 = p.a.a(b10, " ");
            a10.append(it.next().f26333k0);
            b10 = a10.toString();
        }
        return a.b.b(b10, " >");
    }
}
