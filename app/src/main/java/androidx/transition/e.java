package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.z0;
import androidx.transition.i;
import java.util.ArrayList;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends z0 {

    /* loaded from: classes.dex */
    public class a implements i.d {

        /* renamed from: a */
        public final /* synthetic */ View f3403a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f3404b;

        public a(View view, ArrayList arrayList) {
            this.f3403a = view;
            this.f3404b = arrayList;
        }

        @Override // androidx.transition.i.d
        public final void a() {
        }

        @Override // androidx.transition.i.d
        public final void b(i iVar) {
            iVar.z(this);
            iVar.a(this);
        }

        @Override // androidx.transition.i.d
        public final void c() {
        }

        @Override // androidx.transition.i.d
        public final void d(i iVar) {
            iVar.z(this);
            this.f3403a.setVisibility(8);
            int size = this.f3404b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f3404b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.i.d
        public final void e() {
        }
    }

    /* loaded from: classes.dex */
    public class b extends i.c {
    }

    @Override // androidx.fragment.app.z0
    public final void a(View view, Object obj) {
        ((i) obj).b(view);
    }

    @Override // androidx.fragment.app.z0
    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z10;
        i iVar;
        i iVar2 = (i) obj;
        if (iVar2 == null) {
            return;
        }
        int i10 = 0;
        if (iVar2 instanceof l) {
            l lVar = (l) iVar2;
            int size = lVar.f3448x.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < lVar.f3448x.size()) {
                    iVar = lVar.f3448x.get(i10);
                } else {
                    iVar = null;
                }
                b(iVar, arrayList);
                i10++;
            }
            return;
        }
        if (z0.h(iVar2.f3420e) && z0.h(null) && z0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && z0.h(iVar2.f3421f)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                iVar2.b(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.z0
    public final void c(ViewGroup viewGroup, Object obj) {
        k.a(viewGroup, (i) obj);
    }

    @Override // androidx.fragment.app.z0
    public final boolean e(Object obj) {
        return obj instanceof i;
    }

    @Override // androidx.fragment.app.z0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.z0
    public final Object i(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            l lVar = new l();
            lVar.L(iVar);
            lVar.L(iVar2);
            lVar.O(1);
            iVar = lVar;
        } else if (iVar == null) {
            iVar = iVar2 != null ? iVar2 : null;
        }
        if (iVar3 != null) {
            l lVar2 = new l();
            if (iVar != null) {
                lVar2.L(iVar);
            }
            lVar2.L(iVar3);
            return lVar2;
        }
        return iVar;
    }

    @Override // androidx.fragment.app.z0
    public final Object j(Object obj, Object obj2) {
        l lVar = new l();
        if (obj != null) {
            lVar.L((i) obj);
        }
        lVar.L((i) obj2);
        return lVar;
    }

    @Override // androidx.fragment.app.z0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.z0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((i) obj).a(new f(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.z0
    public final void m(View view, Object obj) {
        if (view != null) {
            z0.g(view, new Rect());
            ((i) obj).E(new d());
        }
    }

    @Override // androidx.fragment.app.z0
    public final void n(Object obj, Rect rect) {
        ((i) obj).E(new b());
    }

    @Override // androidx.fragment.app.z0
    public final void o(Object obj, f1.d dVar, androidx.fragment.app.l lVar) {
        i iVar = (i) obj;
        dVar.b(new x2.b(iVar));
        iVar.a(new g(lVar));
    }

    @Override // androidx.fragment.app.z0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        ArrayList<View> arrayList2 = lVar.f3421f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z0.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(lVar, arrayList);
    }

    @Override // androidx.fragment.app.z0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l lVar = (l) obj;
        if (lVar != null) {
            lVar.f3421f.clear();
            lVar.f3421f.addAll(arrayList2);
            s(lVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.z0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        l lVar = new l();
        lVar.L((i) obj);
        return lVar;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z10;
        int size;
        i iVar;
        i iVar2 = (i) obj;
        int i10 = 0;
        if (iVar2 instanceof l) {
            l lVar = (l) iVar2;
            int size2 = lVar.f3448x.size();
            while (i10 < size2) {
                if (i10 >= 0 && i10 < lVar.f3448x.size()) {
                    iVar = lVar.f3448x.get(i10);
                } else {
                    iVar = null;
                }
                s(iVar, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (z0.h(iVar2.f3420e) && z0.h(null) && z0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ArrayList<View> arrayList3 = iVar2.f3421f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    iVar2.b(arrayList2.get(i10));
                    i10++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        iVar2.A(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
