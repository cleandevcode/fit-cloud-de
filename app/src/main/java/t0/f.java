package t0;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t0.b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public s0.e f27476a;

    /* renamed from: d */
    public s0.e f27479d;

    /* renamed from: f */
    public b.InterfaceC0491b f27481f;

    /* renamed from: g */
    public b.a f27482g;

    /* renamed from: h */
    public ArrayList<n> f27483h;

    /* renamed from: b */
    public boolean f27477b = true;

    /* renamed from: c */
    public boolean f27478c = true;

    /* renamed from: e */
    public ArrayList<q> f27480e = new ArrayList<>();

    public f(s0.e eVar) {
        new ArrayList();
        this.f27481f = null;
        this.f27482g = new b.a();
        this.f27483h = new ArrayList<>();
        this.f27476a = eVar;
        this.f27479d = eVar;
    }

    public final void a(g gVar, int i10, int i11, ArrayList arrayList, n nVar) {
        q qVar = gVar.f27487d;
        if (qVar.f27511c == null) {
            s0.e eVar = this.f27476a;
            if (qVar != eVar.f26318d && qVar != eVar.f26320e) {
                if (nVar == null) {
                    nVar = new n(qVar);
                    arrayList.add(nVar);
                }
                qVar.f27511c = nVar;
                nVar.f27500b.add(qVar);
                Iterator it = qVar.f27516h.f27494k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof g) {
                        a((g) dVar, i10, 0, arrayList, nVar);
                    }
                }
                Iterator it2 = qVar.f27517i.f27494k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof g) {
                        a((g) dVar2, i10, 1, arrayList, nVar);
                    }
                }
                if (i10 == 1 && (qVar instanceof o)) {
                    Iterator it3 = ((o) qVar).f27501k.f27494k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof g) {
                            a((g) dVar3, i10, 2, arrayList, nVar);
                        }
                    }
                }
                Iterator it4 = qVar.f27516h.f27495l.iterator();
                while (it4.hasNext()) {
                    a((g) it4.next(), i10, 0, arrayList, nVar);
                }
                Iterator it5 = qVar.f27517i.f27495l.iterator();
                while (it5.hasNext()) {
                    a((g) it5.next(), i10, 1, arrayList, nVar);
                }
                if (i10 == 1 && (qVar instanceof o)) {
                    Iterator it6 = ((o) qVar).f27501k.f27495l.iterator();
                    while (it6.hasNext()) {
                        a((g) it6.next(), i10, 2, arrayList, nVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x005f, code lost:
        if (r2.f26349t == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(s0.e r18) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.f.b(s0.e):void");
    }

    public final void c() {
        q kVar;
        ArrayList<q> arrayList = this.f27480e;
        arrayList.clear();
        this.f27479d.f26318d.f();
        this.f27479d.f26320e.f();
        arrayList.add(this.f27479d.f26318d);
        arrayList.add(this.f27479d.f26320e);
        Iterator<s0.d> it = this.f27479d.f26400s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s0.d next = it.next();
            if (next instanceof s0.g) {
                kVar = new k(next);
            } else {
                if (next.y()) {
                    if (next.f26314b == null) {
                        next.f26314b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f26314b);
                } else {
                    arrayList.add(next.f26318d);
                }
                if (next.z()) {
                    if (next.f26316c == null) {
                        next.f26316c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f26316c);
                } else {
                    arrayList.add(next.f26320e);
                }
                if (next instanceof s0.i) {
                    kVar = new l(next);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<q> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<q> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            q next2 = it3.next();
            if (next2.f27510b != this.f27479d) {
                next2.d();
            }
        }
        this.f27483h.clear();
        e(this.f27476a.f26318d, 0, this.f27483h);
        e(this.f27476a.f26320e, 1, this.f27483h);
        this.f27477b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0064 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(s0.e r18, int r19) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.f.d(s0.e, int):int");
    }

    public final void e(q qVar, int i10, ArrayList<n> arrayList) {
        Iterator it = qVar.f27516h.f27494k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof g) {
                a((g) dVar, i10, 0, arrayList, null);
            } else if (dVar instanceof q) {
                a(((q) dVar).f27516h, i10, 0, arrayList, null);
            }
        }
        Iterator it2 = qVar.f27517i.f27494k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof g) {
                a((g) dVar2, i10, 1, arrayList, null);
            } else if (dVar2 instanceof q) {
                a(((q) dVar2).f27517i, i10, 1, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((o) qVar).f27501k.f27494k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof g) {
                    a((g) dVar3, i10, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(s0.d dVar, int i10, int i11, int i12, int i13) {
        boolean z10;
        b.a aVar = this.f27482g;
        aVar.f27464a = i10;
        aVar.f27465b = i12;
        aVar.f27466c = i11;
        aVar.f27467d = i13;
        ((ConstraintLayout.b) this.f27481f).b(dVar, aVar);
        dVar.O(this.f27482g.f27468e);
        dVar.L(this.f27482g.f27469f);
        b.a aVar2 = this.f27482g;
        dVar.F = aVar2.f27471h;
        int i14 = aVar2.f27470g;
        dVar.f26319d0 = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.F = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x006b, code lost:
        if (r10 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0085, code lost:
        if (r8 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0087, code lost:
        r2.f27496m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008a, code lost:
        r2.d(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r12 = this;
            s0.e r0 = r12.f27476a
            java.util.ArrayList<s0.d> r0 = r0.f26400s0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()
            s0.d r1 = (s0.d) r1
            boolean r2 = r1.f26312a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.V
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f26348s
            int r4 = r1.f26349t
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = 1
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = 1
        L38:
            t0.m r4 = r1.f26318d
            t0.h r4 = r4.f27513e
            boolean r5 = r4.f27493j
            t0.o r6 = r1.f26320e
            t0.h r6 = r6.f27513e
            boolean r7 = r6.f27493j
            if (r5 == 0) goto L54
            if (r7 == 0) goto L54
            int r5 = r4.f27490g
            int r7 = r6.f27490g
            r6 = 1
            r2 = r12
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L8d
        L54:
            if (r5 == 0) goto L6e
            if (r3 == 0) goto L6e
            int r5 = r4.f27490g
            int r7 = r6.f27490g
            r4 = 1
            r6 = 2
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            t0.o r2 = r1.f26320e
            t0.h r2 = r2.f27513e
            int r3 = r1.l()
            if (r10 != r11) goto L8a
            goto L87
        L6e:
            if (r7 == 0) goto L8f
            if (r2 == 0) goto L8f
            int r5 = r4.f27490g
            int r7 = r6.f27490g
            r4 = 2
            r6 = 1
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            t0.m r2 = r1.f26318d
            t0.h r2 = r2.f27513e
            int r3 = r1.r()
            if (r8 != r11) goto L8a
        L87:
            r2.f27496m = r3
            goto L8f
        L8a:
            r2.d(r3)
        L8d:
            r1.f26312a = r9
        L8f:
            boolean r2 = r1.f26312a
            if (r2 == 0) goto L8
            t0.o r2 = r1.f26320e
            t0.a r2 = r2.f27502l
            if (r2 == 0) goto L8
            int r1 = r1.f26319d0
            r2.d(r1)
            goto L8
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.f.g():void");
    }
}
