package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import k1.e2;
import k1.i2;
import k1.o0;
import o0.g;

/* loaded from: classes.dex */
public final class m extends f1 {

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: c */
        public boolean f2451c;

        /* renamed from: d */
        public boolean f2452d;

        /* renamed from: e */
        public y f2453e;

        public a(f1.b bVar, f1.d dVar, boolean z10) {
            super(bVar, dVar);
            this.f2452d = false;
            this.f2451c = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:129:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0061 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x00ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.fragment.app.y c(android.content.Context r10) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.a.c(android.content.Context):androidx.fragment.app.y");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final f1.b f2454a;

        /* renamed from: b */
        public final f1.d f2455b;

        public b(f1.b bVar, f1.d dVar) {
            this.f2454a = bVar;
            this.f2455b = dVar;
        }

        public final void a() {
            f1.b bVar = this.f2454a;
            if (bVar.f2371e.remove(this.f2455b) && bVar.f2371e.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            int c10 = i1.c(this.f2454a.f2369c.H);
            int i10 = this.f2454a.f2367a;
            if (c10 != i10 && (c10 == 2 || i10 == 2)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: c */
        public final Object f2456c;

        /* renamed from: d */
        public final boolean f2457d;

        /* renamed from: e */
        public final Object f2458e;

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0016, code lost:
            if (r4 == androidx.fragment.app.r.f2507k0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x003a, code lost:
            if (r4 == androidx.fragment.app.r.f2507k0) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(androidx.fragment.app.f1.b r3, f1.d r4, boolean r5, boolean r6) {
            /*
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.f2367a
                r0 = 2
                r1 = 0
                if (r4 != r0) goto L2d
                if (r5 == 0) goto L19
                androidx.fragment.app.r r4 = r3.f2369c
                androidx.fragment.app.r$c r4 = r4.Q
                if (r4 != 0) goto L12
                goto L1e
            L12:
                java.lang.Object r4 = r4.f2553j
                java.lang.Object r0 = androidx.fragment.app.r.f2507k0
                if (r4 != r0) goto L1f
                goto L1e
            L19:
                androidx.fragment.app.r r4 = r3.f2369c
                r4.getClass()
            L1e:
                r4 = r1
            L1f:
                r2.f2456c = r4
                if (r5 == 0) goto L28
                androidx.fragment.app.r r4 = r3.f2369c
                androidx.fragment.app.r$c r4 = r4.Q
                goto L45
            L28:
                androidx.fragment.app.r r4 = r3.f2369c
                androidx.fragment.app.r$c r4 = r4.Q
                goto L45
            L2d:
                if (r5 == 0) goto L3d
                androidx.fragment.app.r r4 = r3.f2369c
                androidx.fragment.app.r$c r4 = r4.Q
                if (r4 != 0) goto L36
                goto L42
            L36:
                java.lang.Object r4 = r4.f2552i
                java.lang.Object r0 = androidx.fragment.app.r.f2507k0
                if (r4 != r0) goto L43
                goto L42
            L3d:
                androidx.fragment.app.r r4 = r3.f2369c
                r4.getClass()
            L42:
                r4 = r1
            L43:
                r2.f2456c = r4
            L45:
                r4 = 1
                r2.f2457d = r4
                if (r6 == 0) goto L61
                if (r5 == 0) goto L5c
                androidx.fragment.app.r r3 = r3.f2369c
                androidx.fragment.app.r$c r3 = r3.Q
                if (r3 != 0) goto L53
                goto L61
            L53:
                java.lang.Object r3 = r3.f2554k
                java.lang.Object r4 = androidx.fragment.app.r.f2507k0
                if (r3 != r4) goto L5a
                goto L61
            L5a:
                r1 = r3
                goto L61
            L5c:
                androidx.fragment.app.r r3 = r3.f2369c
                r3.getClass()
            L61:
                r2.f2458e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.c.<init>(androidx.fragment.app.f1$b, f1.d, boolean, boolean):void");
        }

        public final z0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            v0 v0Var = t0.f2593a;
            if (v0Var != null && (obj instanceof Transition)) {
                return v0Var;
            }
            z0 z0Var = t0.f2594b;
            if (z0Var != null && z0Var.e(obj)) {
                return z0Var;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Transition ");
            sb2.append(obj);
            sb2.append(" for fragment ");
            throw new IllegalArgumentException(n.a(sb2, this.f2454a.f2369c, " is not a valid framework Transition or AndroidX Transition"));
        }
    }

    public m(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (e2.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    i(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(o0.b bVar, View view) {
        WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
        String k10 = o0.i.k(view);
        if (k10 != null) {
            bVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(o0.b bVar, Collection collection) {
        Iterator it = ((g.b) bVar.entrySet()).iterator();
        while (it.hasNext()) {
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            if (!collection.contains(o0.i.k((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:554:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x08a9 A[LOOP:7: B:678:0x08a3->B:680:0x08a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:767:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 2276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.b(java.util.ArrayList, boolean):void");
    }
}
