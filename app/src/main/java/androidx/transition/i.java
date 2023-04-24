package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import x2.r;
import x2.w;
import x2.x;

/* loaded from: classes.dex */
public abstract class i implements Cloneable {

    /* renamed from: u */
    public static final int[] f3413u = {2, 1, 3, 4};

    /* renamed from: v */
    public static final a f3414v = new a();

    /* renamed from: w */
    public static ThreadLocal<o0.b<Animator, b>> f3415w = new ThreadLocal<>();

    /* renamed from: k */
    public ArrayList<x2.g> f3426k;

    /* renamed from: l */
    public ArrayList<x2.g> f3427l;

    /* renamed from: s */
    public c f3434s;

    /* renamed from: a */
    public String f3416a = getClass().getName();

    /* renamed from: b */
    public long f3417b = -1;

    /* renamed from: c */
    public long f3418c = -1;

    /* renamed from: d */
    public TimeInterpolator f3419d = null;

    /* renamed from: e */
    public ArrayList<Integer> f3420e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<View> f3421f = new ArrayList<>();

    /* renamed from: g */
    public x2.h f3422g = new x2.h();

    /* renamed from: h */
    public x2.h f3423h = new x2.h();

    /* renamed from: i */
    public l f3424i = null;

    /* renamed from: j */
    public int[] f3425j = f3413u;

    /* renamed from: m */
    public ArrayList<Animator> f3428m = new ArrayList<>();

    /* renamed from: n */
    public int f3429n = 0;

    /* renamed from: o */
    public boolean f3430o = false;

    /* renamed from: p */
    public boolean f3431p = false;

    /* renamed from: q */
    public ArrayList<d> f3432q = null;

    /* renamed from: r */
    public ArrayList<Animator> f3433r = new ArrayList<>();

    /* renamed from: t */
    public a0 f3435t = f3414v;

    /* loaded from: classes.dex */
    public class a extends a0 {
        @Override // androidx.fragment.app.a0
        public final Path s(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public View f3436a;

        /* renamed from: b */
        public String f3437b;

        /* renamed from: c */
        public x2.g f3438c;

        /* renamed from: d */
        public x f3439d;

        /* renamed from: e */
        public i f3440e;

        public b(View view, String str, i iVar, w wVar, x2.g gVar) {
            this.f3436a = view;
            this.f3437b = str;
            this.f3438c = gVar;
            this.f3439d = wVar;
            this.f3440e = iVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b(i iVar);

        void c();

        void d(i iVar);

        void e();
    }

    public static void c(x2.h hVar, View view, x2.g gVar) {
        hVar.f30178a.put(view, gVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (hVar.f30179b.indexOfKey(id2) >= 0) {
                hVar.f30179b.put(id2, null);
            } else {
                hVar.f30179b.put(id2, view);
            }
        }
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        String k10 = o0.i.k(view);
        if (k10 != null) {
            if (hVar.f30181d.containsKey(k10)) {
                hVar.f30181d.put(k10, null);
            } else {
                hVar.f30181d.put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                o0.e<View> eVar = hVar.f30180c;
                if (eVar.f22522a) {
                    eVar.d();
                }
                if (hh.d.c(eVar.f22523b, eVar.f22525d, itemIdAtPosition) >= 0) {
                    View view2 = (View) hVar.f30180c.e(itemIdAtPosition, null);
                    if (view2 != null) {
                        o0.d.r(view2, false);
                        hVar.f30180c.g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                o0.d.r(view, true);
                hVar.f30180c.g(itemIdAtPosition, view);
            }
        }
    }

    public static o0.b<Animator, b> r() {
        o0.b<Animator, b> bVar = f3415w.get();
        if (bVar == null) {
            o0.b<Animator, b> bVar2 = new o0.b<>();
            f3415w.set(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static boolean x(x2.g gVar, x2.g gVar2, String str) {
        Object obj = gVar.f30175a.get(str);
        Object obj2 = gVar2.f30175a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(View view) {
        this.f3421f.remove(view);
    }

    public void B(ViewGroup viewGroup) {
        if (this.f3430o) {
            if (!this.f3431p) {
                int size = this.f3428m.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f3428m.get(size).resume();
                }
                ArrayList<d> arrayList = this.f3432q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3432q.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((d) arrayList2.get(i10)).e();
                    }
                }
            }
            this.f3430o = false;
        }
    }

    public void C() {
        J();
        o0.b<Animator, b> r10 = r();
        Iterator<Animator> it = this.f3433r.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r10.containsKey(next)) {
                J();
                if (next != null) {
                    next.addListener(new x2.c(this, r10));
                    long j10 = this.f3418c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f3417b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f3419d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new x2.d(this));
                    next.start();
                }
            }
        }
        this.f3433r.clear();
        o();
    }

    public void D(long j10) {
        this.f3418c = j10;
    }

    public void E(c cVar) {
        this.f3434s = cVar;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f3419d = timeInterpolator;
    }

    public void G(a0 a0Var) {
        if (a0Var == null) {
            a0Var = f3414v;
        }
        this.f3435t = a0Var;
    }

    public void H() {
    }

    public void I(long j10) {
        this.f3417b = j10;
    }

    public final void J() {
        if (this.f3429n == 0) {
            ArrayList<d> arrayList = this.f3432q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3432q.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).b(this);
                }
            }
            this.f3431p = false;
        }
        this.f3429n++;
    }

    public String K(String str) {
        StringBuilder a10 = android.support.v4.media.d.a(str);
        a10.append(getClass().getSimpleName());
        a10.append("@");
        a10.append(Integer.toHexString(hashCode()));
        a10.append(": ");
        String sb2 = a10.toString();
        if (this.f3418c != -1) {
            StringBuilder a11 = p.a.a(sb2, "dur(");
            a11.append(this.f3418c);
            a11.append(") ");
            sb2 = a11.toString();
        }
        if (this.f3417b != -1) {
            StringBuilder a12 = p.a.a(sb2, "dly(");
            a12.append(this.f3417b);
            a12.append(") ");
            sb2 = a12.toString();
        }
        if (this.f3419d != null) {
            StringBuilder a13 = p.a.a(sb2, "interp(");
            a13.append(this.f3419d);
            a13.append(") ");
            sb2 = a13.toString();
        }
        if (this.f3420e.size() > 0 || this.f3421f.size() > 0) {
            String b10 = a.b.b(sb2, "tgts(");
            if (this.f3420e.size() > 0) {
                for (int i10 = 0; i10 < this.f3420e.size(); i10++) {
                    if (i10 > 0) {
                        b10 = a.b.b(b10, ", ");
                    }
                    StringBuilder a14 = android.support.v4.media.d.a(b10);
                    a14.append(this.f3420e.get(i10));
                    b10 = a14.toString();
                }
            }
            if (this.f3421f.size() > 0) {
                for (int i11 = 0; i11 < this.f3421f.size(); i11++) {
                    if (i11 > 0) {
                        b10 = a.b.b(b10, ", ");
                    }
                    StringBuilder a15 = android.support.v4.media.d.a(b10);
                    a15.append(this.f3421f.get(i11));
                    b10 = a15.toString();
                }
            }
            return a.b.b(b10, ")");
        }
        return sb2;
    }

    public void a(d dVar) {
        if (this.f3432q == null) {
            this.f3432q = new ArrayList<>();
        }
        this.f3432q.add(dVar);
    }

    public void b(View view) {
        this.f3421f.add(view);
    }

    public void cancel() {
        int size = this.f3428m.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            this.f3428m.get(size).cancel();
        }
        ArrayList<d> arrayList = this.f3432q;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f3432q.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((d) arrayList2.get(i10)).c();
        }
    }

    public abstract void d(x2.g gVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x2.g gVar = new x2.g(view);
            if (z10) {
                g(gVar);
            } else {
                d(gVar);
            }
            gVar.f30177c.add(this);
            f(gVar);
            c(z10 ? this.f3422g : this.f3423h, view, gVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public void f(x2.g gVar) {
    }

    public abstract void g(x2.g gVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        if (this.f3420e.size() <= 0 && this.f3421f.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < this.f3420e.size(); i10++) {
            View findViewById = viewGroup.findViewById(this.f3420e.get(i10).intValue());
            if (findViewById != null) {
                x2.g gVar = new x2.g(findViewById);
                if (z10) {
                    g(gVar);
                } else {
                    d(gVar);
                }
                gVar.f30177c.add(this);
                f(gVar);
                c(z10 ? this.f3422g : this.f3423h, findViewById, gVar);
            }
        }
        for (int i11 = 0; i11 < this.f3421f.size(); i11++) {
            View view = this.f3421f.get(i11);
            x2.g gVar2 = new x2.g(view);
            if (z10) {
                g(gVar2);
            } else {
                d(gVar2);
            }
            gVar2.f30177c.add(this);
            f(gVar2);
            c(z10 ? this.f3422g : this.f3423h, view, gVar2);
        }
    }

    public final void i(boolean z10) {
        x2.h hVar;
        if (z10) {
            this.f3422g.f30178a.clear();
            this.f3422g.f30179b.clear();
            hVar = this.f3422g;
        } else {
            this.f3423h.f30178a.clear();
            this.f3423h.f30179b.clear();
            hVar = this.f3423h;
        }
        hVar.f30180c.b();
    }

    @Override // 
    /* renamed from: l */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.f3433r = new ArrayList<>();
            iVar.f3422g = new x2.h();
            iVar.f3423h = new x2.h();
            iVar.f3426k = null;
            iVar.f3427l = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, x2.g gVar, x2.g gVar2) {
        return null;
    }

    public void n(ViewGroup viewGroup, x2.h hVar, x2.h hVar2, ArrayList<x2.g> arrayList, ArrayList<x2.g> arrayList2) {
        boolean z10;
        Animator m10;
        View view;
        Animator animator;
        x2.g gVar;
        Animator animator2;
        x2.g gVar2;
        ViewGroup viewGroup2 = viewGroup;
        o0.b<Animator, b> r10 = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            x2.g gVar3 = arrayList.get(i10);
            x2.g gVar4 = arrayList2.get(i10);
            if (gVar3 != null && !gVar3.f30177c.contains(this)) {
                gVar3 = null;
            }
            if (gVar4 != null && !gVar4.f30177c.contains(this)) {
                gVar4 = null;
            }
            if (gVar3 != null || gVar4 != null) {
                if (gVar3 != null && gVar4 != null && !v(gVar3, gVar4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && (m10 = m(viewGroup2, gVar3, gVar4)) != null) {
                    if (gVar4 != null) {
                        View view2 = gVar4.f30176b;
                        String[] t10 = t();
                        if (t10 != null && t10.length > 0) {
                            gVar2 = new x2.g(view2);
                            x2.g orDefault = hVar2.f30178a.getOrDefault(view2, null);
                            if (orDefault != null) {
                                int i11 = 0;
                                while (i11 < t10.length) {
                                    HashMap hashMap = gVar2.f30175a;
                                    Animator animator3 = m10;
                                    String str = t10[i11];
                                    hashMap.put(str, orDefault.f30175a.get(str));
                                    i11++;
                                    m10 = animator3;
                                    t10 = t10;
                                }
                            }
                            Animator animator4 = m10;
                            int size2 = r10.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size2) {
                                    b bVar = r10.get(r10.i(i12));
                                    if (bVar.f3438c != null && bVar.f3436a == view2 && bVar.f3437b.equals(this.f3416a) && bVar.f3438c.equals(gVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i12++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = m10;
                            gVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        gVar = gVar2;
                    } else {
                        view = gVar3.f30176b;
                        animator = m10;
                        gVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f3416a;
                        r rVar = x2.l.f30185a;
                        r10.put(animator, new b(view, str2, this, new w(viewGroup2), gVar));
                        this.f3433r.add(animator);
                    }
                    i10++;
                    viewGroup2 = viewGroup;
                }
            }
            i10++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                Animator animator5 = this.f3433r.get(sparseIntArray.keyAt(i13));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i13) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i10 = this.f3429n - 1;
        this.f3429n = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.f3432q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3432q.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < this.f3422g.f30180c.i(); i12++) {
                View l10 = this.f3422g.f30180c.l(i12);
                if (l10 != null) {
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.d.r(l10, false);
                }
            }
            for (int i13 = 0; i13 < this.f3423h.f30180c.i(); i13++) {
                View l11 = this.f3423h.f30180c.l(i13);
                if (l11 != null) {
                    WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                    o0.d.r(l11, false);
                }
            }
            this.f3431p = true;
        }
    }

    public final x2.g p(View view, boolean z10) {
        l lVar = this.f3424i;
        if (lVar != null) {
            return lVar.p(view, z10);
        }
        ArrayList<x2.g> arrayList = z10 ? this.f3426k : this.f3427l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            x2.g gVar = arrayList.get(i11);
            if (gVar == null) {
                return null;
            }
            if (gVar.f30176b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f3427l : this.f3426k).get(i10);
        }
        return null;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return K("");
    }

    public final x2.g u(View view, boolean z10) {
        x2.h hVar;
        l lVar = this.f3424i;
        if (lVar != null) {
            return lVar.u(view, z10);
        }
        if (z10) {
            hVar = this.f3422g;
        } else {
            hVar = this.f3423h;
        }
        return hVar.f30178a.getOrDefault(view, null);
    }

    public boolean v(x2.g gVar, x2.g gVar2) {
        if (gVar == null || gVar2 == null) {
            return false;
        }
        String[] t10 = t();
        if (t10 == null) {
            for (String str : gVar.f30175a.keySet()) {
                if (x(gVar, gVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : t10) {
            if (!x(gVar, gVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        return (this.f3420e.size() == 0 && this.f3421f.size() == 0) || this.f3420e.contains(Integer.valueOf(view.getId())) || this.f3421f.contains(view);
    }

    public void y(View view) {
        if (!this.f3431p) {
            for (int size = this.f3428m.size() - 1; size >= 0; size--) {
                this.f3428m.get(size).pause();
            }
            ArrayList<d> arrayList = this.f3432q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3432q.clone();
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((d) arrayList2.get(i10)).a();
                }
            }
            this.f3430o = true;
        }
    }

    public void z(d dVar) {
        ArrayList<d> arrayList = this.f3432q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.f3432q.size() == 0) {
            this.f3432q = null;
        }
    }
}
