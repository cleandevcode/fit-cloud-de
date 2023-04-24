package t7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s7.j;
import x7.d;

/* loaded from: classes.dex */
public abstract class i<T extends x7.d<? extends k>> {

    /* renamed from: a */
    public float f27823a;

    /* renamed from: b */
    public float f27824b;

    /* renamed from: c */
    public float f27825c;

    /* renamed from: d */
    public float f27826d;

    /* renamed from: e */
    public float f27827e;

    /* renamed from: f */
    public float f27828f;

    /* renamed from: g */
    public float f27829g;

    /* renamed from: h */
    public float f27830h;

    /* renamed from: i */
    public List<T> f27831i;

    public i() {
        this.f27823a = -3.4028235E38f;
        this.f27824b = Float.MAX_VALUE;
        this.f27825c = -3.4028235E38f;
        this.f27826d = Float.MAX_VALUE;
        this.f27827e = -3.4028235E38f;
        this.f27828f = Float.MAX_VALUE;
        this.f27829g = -3.4028235E38f;
        this.f27830h = Float.MAX_VALUE;
        this.f27831i = new ArrayList();
    }

    public i(ArrayList arrayList) {
        this.f27823a = -3.4028235E38f;
        this.f27824b = Float.MAX_VALUE;
        this.f27825c = -3.4028235E38f;
        this.f27826d = Float.MAX_VALUE;
        this.f27827e = -3.4028235E38f;
        this.f27828f = Float.MAX_VALUE;
        this.f27829g = -3.4028235E38f;
        this.f27830h = Float.MAX_VALUE;
        this.f27831i = arrayList;
        a();
    }

    public final void a() {
        T t10;
        T t11;
        j.a aVar = j.a.RIGHT;
        j.a aVar2 = j.a.LEFT;
        List<T> list = this.f27831i;
        if (list == null) {
            return;
        }
        this.f27823a = -3.4028235E38f;
        this.f27824b = Float.MAX_VALUE;
        this.f27825c = -3.4028235E38f;
        this.f27826d = Float.MAX_VALUE;
        for (T t12 : list) {
            b(t12);
        }
        this.f27827e = -3.4028235E38f;
        this.f27828f = Float.MAX_VALUE;
        this.f27829g = -3.4028235E38f;
        this.f27830h = Float.MAX_VALUE;
        Iterator<T> it = this.f27831i.iterator();
        while (true) {
            t10 = null;
            if (it.hasNext()) {
                t11 = it.next();
                if (t11.X() == aVar2) {
                    break;
                }
            } else {
                t11 = null;
                break;
            }
        }
        if (t11 != null) {
            this.f27827e = t11.d();
            this.f27828f = t11.p();
            for (T t13 : this.f27831i) {
                if (t13.X() == aVar2) {
                    if (t13.p() < this.f27828f) {
                        this.f27828f = t13.p();
                    }
                    if (t13.d() > this.f27827e) {
                        this.f27827e = t13.d();
                    }
                }
            }
        }
        Iterator<T> it2 = this.f27831i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (next.X() == aVar) {
                t10 = next;
                break;
            }
        }
        if (t10 != null) {
            this.f27829g = t10.d();
            this.f27830h = t10.p();
            for (T t14 : this.f27831i) {
                if (t14.X() == aVar) {
                    if (t14.p() < this.f27830h) {
                        this.f27830h = t14.p();
                    }
                    if (t14.d() > this.f27829g) {
                        this.f27829g = t14.d();
                    }
                }
            }
        }
    }

    public final void b(T t10) {
        if (this.f27823a < t10.d()) {
            this.f27823a = t10.d();
        }
        if (this.f27824b > t10.p()) {
            this.f27824b = t10.p();
        }
        if (this.f27825c < t10.P()) {
            this.f27825c = t10.P();
        }
        if (this.f27826d > t10.c()) {
            this.f27826d = t10.c();
        }
        if (t10.X() == j.a.LEFT) {
            if (this.f27827e < t10.d()) {
                this.f27827e = t10.d();
            }
            if (this.f27828f > t10.p()) {
                this.f27828f = t10.p();
                return;
            }
            return;
        }
        if (this.f27829g < t10.d()) {
            this.f27829g = t10.d();
        }
        if (this.f27830h > t10.p()) {
            this.f27830h = t10.p();
        }
    }

    public final T c(int i10) {
        List<T> list = this.f27831i;
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return this.f27831i.get(i10);
    }

    public final int d() {
        List<T> list = this.f27831i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int e() {
        int i10 = 0;
        for (T t10 : this.f27831i) {
            i10 += t10.Y();
        }
        return i10;
    }

    public final k f(v7.c cVar) {
        if (cVar.f29161f >= this.f27831i.size()) {
            return null;
        }
        return this.f27831i.get(cVar.f29161f).h(cVar.f29156a, cVar.f29157b);
    }

    public final float g(j.a aVar) {
        if (aVar == j.a.LEFT) {
            float f10 = this.f27827e;
            return f10 == -3.4028235E38f ? this.f27829g : f10;
        }
        float f11 = this.f27829g;
        return f11 == -3.4028235E38f ? this.f27827e : f11;
    }

    public final float h(j.a aVar) {
        if (aVar == j.a.LEFT) {
            float f10 = this.f27828f;
            return f10 == Float.MAX_VALUE ? this.f27830h : f10;
        }
        float f11 = this.f27830h;
        return f11 == Float.MAX_VALUE ? this.f27828f : f11;
    }
}
