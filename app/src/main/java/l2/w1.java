package l2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.b1;
import l2.j3;

/* loaded from: classes.dex */
public final class w1<T> implements y0<T> {

    /* renamed from: e */
    public static final w1<Object> f19337e = new w1<>(b1.b.f18732g);

    /* renamed from: a */
    public final ArrayList f19338a;

    /* renamed from: b */
    public int f19339b;

    /* renamed from: c */
    public int f19340c;

    /* renamed from: d */
    public int f19341d;

    public w1(b1.b<T> bVar) {
        gm.l.f(bVar, "insertEvent");
        this.f19338a = ul.q.Z(bVar.f18734b);
        Iterator<T> it = bVar.f18734b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((g3) it.next()).f18901b.size();
        }
        this.f19339b = i10;
        this.f19340c = bVar.f18735c;
        this.f19341d = bVar.f18736d;
    }

    public final j3.a a(int i10) {
        List<Integer> list;
        int i11 = i10 - this.f19340c;
        boolean z10 = false;
        int i12 = 0;
        while (i11 >= ((g3) this.f19338a.get(i12)).f18901b.size() && i12 < h7.a.k(this.f19338a)) {
            i11 -= ((g3) this.f19338a.get(i12)).f18901b.size();
            i12++;
        }
        g3 g3Var = (g3) this.f19338a.get(i12);
        int i13 = i10 - this.f19340c;
        int b10 = ((b() - i10) - this.f19341d) - 1;
        int i14 = i();
        int j10 = j();
        int i15 = g3Var.f18902c;
        if (g3Var.f18903d != null && new lm.j(0, list.size() - 1).k(i11)) {
            z10 = true;
        }
        if (z10) {
            i11 = g3Var.f18903d.get(i11).intValue();
        }
        return new j3.a(i15, i11, i13, b10, i14, j10);
    }

    @Override // l2.y0
    public final int b() {
        return this.f19340c + this.f19339b + this.f19341d;
    }

    @Override // l2.y0
    public final int c() {
        return this.f19339b;
    }

    @Override // l2.y0
    public final int d() {
        return this.f19340c;
    }

    @Override // l2.y0
    public final int e() {
        return this.f19341d;
    }

    @Override // l2.y0
    public final T f(int i10) {
        int size = this.f19338a.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = ((g3) this.f19338a.get(i11)).f18901b.size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return ((g3) this.f19338a.get(i11)).f18901b.get(i10);
    }

    public final int g(lm.j jVar) {
        boolean z10;
        Iterator it = this.f19338a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            int[] iArr = g3Var.f18900a;
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (jVar.k(iArr[i11])) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                i10 += g3Var.f18901b.size();
                it.remove();
            }
        }
        return i10;
    }

    public final T h(int i10) {
        if (i10 >= 0 && i10 < b()) {
            int i11 = i10 - this.f19340c;
            if (i11 >= 0 && i11 < this.f19339b) {
                return f(i11);
            }
            return null;
        }
        StringBuilder a10 = androidx.appcompat.widget.e2.a("Index: ", i10, ", Size: ");
        a10.append(b());
        throw new IndexOutOfBoundsException(a10.toString());
    }

    public final int i() {
        boolean z10;
        Integer valueOf;
        int[] iArr = ((g3) ul.q.H(this.f19338a)).f18900a;
        gm.l.f(iArr, "<this>");
        if (iArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            valueOf = null;
        } else {
            int i10 = iArr[0];
            lm.i it = new lm.j(1, iArr.length - 1).iterator();
            while (it.f20076c) {
                int i11 = iArr[it.nextInt()];
                if (i10 > i11) {
                    i10 = i11;
                }
            }
            valueOf = Integer.valueOf(i10);
        }
        gm.l.c(valueOf);
        return valueOf.intValue();
    }

    public final int j() {
        boolean z10;
        Integer valueOf;
        int[] iArr = ((g3) ul.q.N(this.f19338a)).f18900a;
        gm.l.f(iArr, "<this>");
        if (iArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            valueOf = null;
        } else {
            int i10 = iArr[0];
            lm.i it = new lm.j(1, iArr.length - 1).iterator();
            while (it.f20076c) {
                int i11 = iArr[it.nextInt()];
                if (i10 < i11) {
                    i10 = i11;
                }
            }
            valueOf = Integer.valueOf(i10);
        }
        gm.l.c(valueOf);
        return valueOf.intValue();
    }

    public final String toString() {
        int i10 = this.f19339b;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(f(i11));
        }
        String M = ul.q.M(arrayList, null, null, null, null, 63);
        StringBuilder a10 = android.support.v4.media.d.a("[(");
        a10.append(this.f19340c);
        a10.append(" placeholders), ");
        a10.append(M);
        a10.append(", (");
        return a0.q.b(a10, this.f19341d, " placeholders)]");
    }
}
