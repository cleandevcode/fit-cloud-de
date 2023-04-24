package j4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a */
    public ArrayList f17336a = null;

    /* renamed from: b */
    public ArrayList f17337b = null;

    /* renamed from: c */
    public ArrayList f17338c = null;

    /* renamed from: d */
    public ArrayList f17339d = null;

    /* renamed from: e */
    public ArrayList f17340e = null;

    /* renamed from: f */
    public ArrayList f17341f = null;

    /* renamed from: g */
    public ArrayList f17342g = null;

    /* renamed from: h */
    public ArrayList f17343h = null;

    public final void b(b1 b1Var) {
        if (b1Var == null) {
            return;
        }
        if (b1Var instanceof w0) {
            if (this.f17341f == null) {
                this.f17341f = new ArrayList();
            }
            this.f17341f.add((w0) b1Var);
        }
        if (b1Var instanceof r0) {
            if (this.f17340e == null) {
                this.f17340e = new ArrayList();
            }
            this.f17340e.add((r0) b1Var);
        }
        if (b1Var instanceof h1) {
            if (this.f17339d == null) {
                this.f17339d = new ArrayList();
            }
            this.f17339d.add((h1) b1Var);
        }
        if (b1Var instanceof v) {
            if (this.f17343h == null) {
                this.f17343h = new ArrayList();
            }
            this.f17343h.add((v) b1Var);
        }
        if (b1Var instanceof v0) {
            if (this.f17338c == null) {
                this.f17338c = new ArrayList();
            }
            this.f17338c.add((v0) b1Var);
        }
        if (b1Var instanceof k) {
            if (this.f17336a == null) {
                this.f17336a = new ArrayList();
            }
            this.f17336a.add((k) b1Var);
        }
        if (b1Var instanceof c) {
            if (this.f17337b == null) {
                this.f17337b = new ArrayList();
            }
            this.f17337b.add((c) b1Var);
        }
        if (b1Var instanceof l0) {
            if (this.f17342g == null) {
                this.f17342g = new ArrayList();
            }
            this.f17342g.add((l0) b1Var);
        }
    }

    public final boolean d(i0 i0Var, Object obj, String str, Object obj2) {
        ArrayList arrayList = i0Var.f17338c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((v0) it.next()).c()) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f17338c;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((v0) it2.next()).c()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean f(i0 i0Var, Object obj, String str) {
        ArrayList arrayList = i0Var.f17341f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((w0) it.next()).d()) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f17341f;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((w0) it2.next()).d()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final String g(i0 i0Var, Object obj, String str, Object obj2) {
        ArrayList arrayList = i0Var.f17340e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                str = ((r0) it.next()).a();
            }
        }
        ArrayList arrayList2 = this.f17340e;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                str = ((r0) it2.next()).a();
            }
        }
        return str;
    }

    public final Object h(i0 i0Var, j jVar, Object obj, String str, Object obj2, int i10) {
        boolean z10;
        if (obj2 != null) {
            int i11 = i0Var.f17406j.f17355c;
            e1 e1Var = e1.WriteNonStringValueAsString;
            if ((!e1.c(i11, i10, e1Var) && (jVar == null || (((n4.c) jVar.f17417d).f21955i & e1Var.f17396a) == 0)) || (!((z10 = obj2 instanceof Number)) && !(obj2 instanceof Boolean))) {
                if (jVar != null && ((n4.c) jVar.f17417d).f21961o) {
                    obj2 = e4.a.n((String) obj2, h4.k.f15845u, e4.a.f13344f);
                }
            } else {
                String str2 = null;
                if (z10 && jVar != null) {
                    str2 = (String) jVar.f17415b;
                }
                if (str2 != null) {
                    obj2 = new DecimalFormat(str2).format(obj2);
                } else {
                    obj2 = obj2.toString();
                }
            }
        }
        ArrayList arrayList = i0Var.f17339d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                obj2 = ((h1) it.next()).b();
            }
        }
        ArrayList arrayList2 = this.f17339d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                obj2 = ((h1) it2.next()).b();
            }
        }
        ArrayList arrayList3 = i0Var.f17343h;
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                obj2 = ((v) it3.next()).a();
            }
        }
        ArrayList arrayList4 = this.f17343h;
        if (arrayList4 != null) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                obj2 = ((v) it4.next()).a();
            }
        }
        return obj2;
    }
}
