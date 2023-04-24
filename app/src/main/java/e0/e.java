package e0;

import a0.b0;
import a0.h2;
import a0.i2;
import a0.l0;
import a0.n1;
import a0.t;
import a0.w;
import a0.y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.h;
import androidx.camera.core.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import s.h1;
import s.r;
import y.m1;
import y.n;
import y.u0;

/* loaded from: classes.dex */
public final class e implements y.g {

    /* renamed from: a */
    public b0 f13290a;

    /* renamed from: b */
    public final y f13291b;

    /* renamed from: c */
    public final i2 f13292c;

    /* renamed from: d */
    public final b f13293d;

    /* renamed from: f */
    public m1 f13295f;

    /* renamed from: e */
    public final ArrayList f13294e = new ArrayList();

    /* renamed from: g */
    public List<y.j> f13296g = Collections.emptyList();

    /* renamed from: h */
    public t f13297h = w.f203a;

    /* renamed from: i */
    public final Object f13298i = new Object();

    /* renamed from: j */
    public boolean f13299j = true;

    /* renamed from: k */
    public l0 f13300k = null;

    /* renamed from: l */
    public List<androidx.camera.core.t> f13301l = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final ArrayList f13302a = new ArrayList();

        public b(LinkedHashSet<b0> linkedHashSet) {
            Iterator<b0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f13302a.add(it.next().l().f25939a);
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f13302a.equals(((b) obj).f13302a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13302a.hashCode() * 53;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public h2<?> f13303a;

        /* renamed from: b */
        public h2<?> f13304b;

        public c(h2<?> h2Var, h2<?> h2Var2) {
            this.f13303a = h2Var;
            this.f13304b = h2Var2;
        }
    }

    public e(LinkedHashSet<b0> linkedHashSet, y yVar, i2 i2Var) {
        this.f13290a = linkedHashSet.iterator().next();
        this.f13293d = new b(new LinkedHashSet(linkedHashSet));
        this.f13291b = yVar;
        this.f13292c = i2Var;
    }

    public static ArrayList f(ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (it.hasNext()) {
            androidx.camera.core.t tVar = (androidx.camera.core.t) it.next();
            if (tVar instanceof androidx.camera.core.m) {
                z13 = true;
            } else if (tVar instanceof androidx.camera.core.h) {
                z12 = true;
            }
        }
        if (z12 && !z13) {
            z10 = true;
        } else {
            z10 = false;
        }
        Iterator it2 = arrayList.iterator();
        boolean z14 = false;
        boolean z15 = false;
        while (it2.hasNext()) {
            androidx.camera.core.t tVar2 = (androidx.camera.core.t) it2.next();
            if (tVar2 instanceof androidx.camera.core.m) {
                z14 = true;
            } else if (tVar2 instanceof androidx.camera.core.h) {
                z15 = true;
            }
        }
        if (z14 && !z15) {
            z11 = true;
        }
        Iterator it3 = arrayList2.iterator();
        androidx.camera.core.t tVar3 = null;
        androidx.camera.core.t tVar4 = null;
        while (it3.hasNext()) {
            androidx.camera.core.t tVar5 = (androidx.camera.core.t) it3.next();
            if (tVar5 instanceof androidx.camera.core.m) {
                tVar3 = tVar5;
            } else if (tVar5 instanceof androidx.camera.core.h) {
                tVar4 = tVar5;
            }
        }
        if (z10 && tVar3 == null) {
            m.b bVar = new m.b();
            bVar.f1744a.E(i.f13306u, "Preview-Extra");
            androidx.camera.core.m e10 = bVar.e();
            e10.B(new a.b());
            arrayList3.add(e10);
        } else if (!z10 && tVar3 != null) {
            arrayList3.remove(tVar3);
        }
        if (z11 && tVar4 == null) {
            h.g gVar = new h.g();
            gVar.f1678a.E(i.f13306u, "ImageCapture-Extra");
            arrayList3.add(gVar.e());
        } else if (!z11 && tVar4 != null) {
            arrayList3.remove(tVar4);
        }
        return arrayList3;
    }

    public static Matrix m(Rect rect, Size size) {
        h1.e("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static void t(List list, List list2) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y.j jVar = (y.j) it.next();
            jVar.getClass();
            hashMap.put(0, jVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.t tVar = (androidx.camera.core.t) it2.next();
            if (tVar instanceof androidx.camera.core.m) {
                androidx.camera.core.m mVar = (androidx.camera.core.m) tVar;
                if (((y.j) hashMap.get(1)) == null) {
                    mVar.getClass();
                } else {
                    throw null;
                }
            }
        }
    }

    @Override // y.g
    public final n b() {
        return this.f13290a.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(List list) {
        synchronized (this.f13298i) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                androidx.camera.core.t tVar = (androidx.camera.core.t) it.next();
                if (this.f13294e.contains(tVar)) {
                    u0.a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(tVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f13294e);
            List<androidx.camera.core.t> emptyList = Collections.emptyList();
            ArrayList arrayList3 = Collections.emptyList();
            if (r()) {
                arrayList2.removeAll(this.f13301l);
                arrayList2.addAll(arrayList);
                emptyList = f(arrayList2, new ArrayList(this.f13301l));
                ArrayList arrayList4 = new ArrayList(emptyList);
                arrayList4.removeAll(this.f13301l);
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(this.f13301l);
                arrayList5.removeAll(emptyList);
                arrayList3 = arrayList5;
            }
            w.a aVar = (w.a) this.f13297h;
            aVar.getClass();
            i2 i2Var = (i2) ((n1) aVar.b()).e(t.f177a, i2.f108a);
            i2 i2Var2 = this.f13292c;
            HashMap hashMap = new HashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                androidx.camera.core.t tVar2 = (androidx.camera.core.t) it2.next();
                hashMap.put(tVar2, new c(tVar2.d(false, i2Var), tVar2.d(true, i2Var2)));
            }
            try {
                ArrayList arrayList6 = new ArrayList(this.f13294e);
                arrayList6.removeAll(arrayList3);
                HashMap n10 = n(this.f13290a.l(), arrayList, arrayList6, hashMap);
                u(n10, list);
                t(this.f13296g, list);
                this.f13301l = emptyList;
                o(arrayList3);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    androidx.camera.core.t tVar3 = (androidx.camera.core.t) it3.next();
                    c cVar = (c) hashMap.get(tVar3);
                    tVar3.m(this.f13290a, cVar.f13303a, cVar.f13304b);
                    Size size = (Size) n10.get(tVar3);
                    size.getClass();
                    tVar3.f1806g = tVar3.t(size);
                }
                this.f13294e.addAll(arrayList);
                if (this.f13299j) {
                    this.f13290a.k(arrayList);
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((androidx.camera.core.t) it4.next()).l();
                }
            } catch (IllegalArgumentException e10) {
                throw new a(e10.getMessage());
            }
        }
    }

    public final void d() {
        synchronized (this.f13298i) {
            if (!this.f13299j) {
                this.f13290a.k(this.f13294e);
                synchronized (this.f13298i) {
                    if (this.f13300k != null) {
                        this.f13290a.g().e(this.f13300k);
                    }
                }
                Iterator it = this.f13294e.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.t) it.next()).l();
                }
                this.f13299j = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:444:0x02dc, code lost:
        if (r5.f25987i != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x02e1, code lost:
        if (r5.f25987i != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0332, code lost:
        if (r5.f25987i != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0334, code lost:
        r0 = b0.a.f3926c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0337, code lost:
        r0 = b0.a.f3927d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x033c, code lost:
        if (r5.f25987i != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x033e, code lost:
        r0 = b0.a.f3924a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0342, code lost:
        r0 = b0.a.f3925b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x040f, code lost:
        if (b0.a.a(java.lang.Math.max(0, r8 - 16), r12, r15) == false) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x043a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap n(a0.a0 r23, java.util.ArrayList r24, java.util.ArrayList r25, java.util.HashMap r26) {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.e.n(a0.a0, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):java.util.HashMap");
    }

    public final void o(List<androidx.camera.core.t> list) {
        synchronized (this.f13298i) {
            if (!list.isEmpty()) {
                this.f13290a.j(list);
                for (androidx.camera.core.t tVar : list) {
                    if (this.f13294e.contains(tVar)) {
                        tVar.p(this.f13290a);
                    } else {
                        u0.b("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + tVar);
                    }
                }
                this.f13294e.removeAll(list);
            }
        }
    }

    public final void p() {
        synchronized (this.f13298i) {
            if (this.f13299j) {
                this.f13290a.j(new ArrayList(this.f13294e));
                synchronized (this.f13298i) {
                    r g10 = this.f13290a.g();
                    this.f13300k = g10.i();
                    g10.f();
                }
                this.f13299j = false;
            }
        }
    }

    public final List<androidx.camera.core.t> q() {
        ArrayList arrayList;
        synchronized (this.f13298i) {
            arrayList = new ArrayList(this.f13294e);
        }
        return arrayList;
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.f13298i) {
            w.a aVar = (w.a) this.f13297h;
            aVar.getClass();
            z10 = ((Integer) ((n1) aVar.b()).e(t.f178b, 0)).intValue() == 1;
        }
        return z10;
    }

    public final void s(ArrayList arrayList) {
        synchronized (this.f13298i) {
            o(new ArrayList(arrayList));
            if (r()) {
                this.f13301l.removeAll(arrayList);
                try {
                    c(Collections.emptyList());
                } catch (a unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    public final void u(HashMap hashMap, List list) {
        boolean z10;
        synchronized (this.f13298i) {
            if (this.f13295f != null) {
                Integer c10 = this.f13290a.l().c();
                boolean z11 = true;
                if (c10 == null) {
                    u0.h("CameraUseCaseAdapter", "The lens facing is null, probably an external.");
                    z10 = true;
                } else {
                    if (c10.intValue() != 0) {
                        z11 = false;
                    }
                    z10 = z11;
                }
                Rect j10 = this.f13290a.g().j();
                Rational rational = this.f13295f.f30743b;
                int e10 = this.f13290a.l().e(this.f13295f.f30744c);
                m1 m1Var = this.f13295f;
                HashMap a10 = l.a(j10, z10, rational, e10, m1Var.f30742a, m1Var.f30745d, hashMap);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.t tVar = (androidx.camera.core.t) it.next();
                    Rect rect = (Rect) a10.get(tVar);
                    rect.getClass();
                    tVar.w(rect);
                    tVar.u(m(this.f13290a.g().j(), (Size) hashMap.get(tVar)));
                }
            }
        }
    }
}
