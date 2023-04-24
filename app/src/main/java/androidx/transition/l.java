package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.u0;
import androidx.fragment.app.a0;
import androidx.transition.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l extends i {

    /* renamed from: z */
    public int f3450z;

    /* renamed from: x */
    public ArrayList<i> f3448x = new ArrayList<>();

    /* renamed from: y */
    public boolean f3449y = true;
    public boolean A = false;
    public int B = 0;

    /* loaded from: classes.dex */
    public class a extends j {

        /* renamed from: a */
        public final /* synthetic */ i f3451a;

        public a(i iVar) {
            this.f3451a = iVar;
        }

        @Override // androidx.transition.i.d
        public final void d(i iVar) {
            this.f3451a.C();
            iVar.z(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j {

        /* renamed from: a */
        public l f3452a;

        public b(l lVar) {
            this.f3452a = lVar;
        }

        @Override // androidx.transition.j, androidx.transition.i.d
        public final void b(i iVar) {
            l lVar = this.f3452a;
            if (lVar.A) {
                return;
            }
            lVar.J();
            this.f3452a.A = true;
        }

        @Override // androidx.transition.i.d
        public final void d(i iVar) {
            l lVar = this.f3452a;
            int i10 = lVar.f3450z - 1;
            lVar.f3450z = i10;
            if (i10 == 0) {
                lVar.A = false;
                lVar.o();
            }
            iVar.z(this);
        }
    }

    @Override // androidx.transition.i
    public final void A(View view) {
        for (int i10 = 0; i10 < this.f3448x.size(); i10++) {
            this.f3448x.get(i10).A(view);
        }
        this.f3421f.remove(view);
    }

    @Override // androidx.transition.i
    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3448x.get(i10).B(viewGroup);
        }
    }

    @Override // androidx.transition.i
    public final void C() {
        if (this.f3448x.isEmpty()) {
            J();
            o();
            return;
        }
        b bVar = new b(this);
        Iterator<i> it = this.f3448x.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f3450z = this.f3448x.size();
        if (!this.f3449y) {
            for (int i10 = 1; i10 < this.f3448x.size(); i10++) {
                this.f3448x.get(i10 - 1).a(new a(this.f3448x.get(i10)));
            }
            i iVar = this.f3448x.get(0);
            if (iVar != null) {
                iVar.C();
                return;
            }
            return;
        }
        Iterator<i> it2 = this.f3448x.iterator();
        while (it2.hasNext()) {
            it2.next().C();
        }
    }

    @Override // androidx.transition.i
    public final void E(i.c cVar) {
        this.f3434s = cVar;
        this.B |= 8;
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3448x.get(i10).E(cVar);
        }
    }

    @Override // androidx.transition.i
    public final void G(a0 a0Var) {
        super.G(a0Var);
        this.B |= 4;
        if (this.f3448x != null) {
            for (int i10 = 0; i10 < this.f3448x.size(); i10++) {
                this.f3448x.get(i10).G(a0Var);
            }
        }
    }

    @Override // androidx.transition.i
    public final void H() {
        this.B |= 2;
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3448x.get(i10).H();
        }
    }

    @Override // androidx.transition.i
    public final void I(long j10) {
        this.f3417b = j10;
    }

    @Override // androidx.transition.i
    public final String K(String str) {
        String K = super.K(str);
        for (int i10 = 0; i10 < this.f3448x.size(); i10++) {
            StringBuilder a10 = p.a.a(K, "\n");
            a10.append(this.f3448x.get(i10).K(str + "  "));
            K = a10.toString();
        }
        return K;
    }

    public final void L(i iVar) {
        this.f3448x.add(iVar);
        iVar.f3424i = this;
        long j10 = this.f3418c;
        if (j10 >= 0) {
            iVar.D(j10);
        }
        if ((this.B & 1) != 0) {
            iVar.F(this.f3419d);
        }
        if ((this.B & 2) != 0) {
            iVar.H();
        }
        if ((this.B & 4) != 0) {
            iVar.G(this.f3435t);
        }
        if ((this.B & 8) != 0) {
            iVar.E(this.f3434s);
        }
    }

    @Override // androidx.transition.i
    /* renamed from: M */
    public final void D(long j10) {
        ArrayList<i> arrayList;
        this.f3418c = j10;
        if (j10 >= 0 && (arrayList = this.f3448x) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3448x.get(i10).D(j10);
            }
        }
    }

    @Override // androidx.transition.i
    /* renamed from: N */
    public final void F(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList<i> arrayList = this.f3448x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3448x.get(i10).F(timeInterpolator);
            }
        }
        this.f3419d = timeInterpolator;
    }

    public final void O(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f3449y = false;
                return;
            }
            throw new AndroidRuntimeException(u0.a("Invalid parameter for TransitionSet ordering: ", i10));
        }
        this.f3449y = true;
    }

    @Override // androidx.transition.i
    public final void a(i.d dVar) {
        super.a(dVar);
    }

    @Override // androidx.transition.i
    public final void b(View view) {
        for (int i10 = 0; i10 < this.f3448x.size(); i10++) {
            this.f3448x.get(i10).b(view);
        }
        this.f3421f.add(view);
    }

    @Override // androidx.transition.i
    public final void cancel() {
        super.cancel();
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3448x.get(i10).cancel();
        }
    }

    @Override // androidx.transition.i
    public final void d(x2.g gVar) {
        if (w(gVar.f30176b)) {
            Iterator<i> it = this.f3448x.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.w(gVar.f30176b)) {
                    next.d(gVar);
                    gVar.f30177c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.i
    public final void f(x2.g gVar) {
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3448x.get(i10).f(gVar);
        }
    }

    @Override // androidx.transition.i
    public final void g(x2.g gVar) {
        if (w(gVar.f30176b)) {
            Iterator<i> it = this.f3448x.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.w(gVar.f30176b)) {
                    next.g(gVar);
                    gVar.f30177c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.i
    /* renamed from: l */
    public final i clone() {
        l lVar = (l) super.clone();
        lVar.f3448x = new ArrayList<>();
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            i clone = this.f3448x.get(i10).clone();
            lVar.f3448x.add(clone);
            clone.f3424i = lVar;
        }
        return lVar;
    }

    @Override // androidx.transition.i
    public final void n(ViewGroup viewGroup, x2.h hVar, x2.h hVar2, ArrayList<x2.g> arrayList, ArrayList<x2.g> arrayList2) {
        long j10 = this.f3417b;
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.f3448x.get(i10);
            if (j10 > 0 && (this.f3449y || i10 == 0)) {
                long j11 = iVar.f3417b;
                if (j11 > 0) {
                    iVar.I(j11 + j10);
                } else {
                    iVar.I(j10);
                }
            }
            iVar.n(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.i
    public final void y(View view) {
        super.y(view);
        int size = this.f3448x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3448x.get(i10).y(view);
        }
    }

    @Override // androidx.transition.i
    public final void z(i.d dVar) {
        super.z(dVar);
    }
}
