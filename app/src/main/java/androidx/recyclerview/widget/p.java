package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends k0 {

    /* renamed from: s */
    public static TimeInterpolator f3156s;

    /* renamed from: h */
    public ArrayList<RecyclerView.b0> f3157h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.b0> f3158i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<b> f3159j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<a> f3160k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.b0>> f3161l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<b>> f3162m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<a>> f3163n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.b0> f3164o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.b0> f3165p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.b0> f3166q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.b0> f3167r = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public RecyclerView.b0 f3168a;

        /* renamed from: b */
        public RecyclerView.b0 f3169b;

        /* renamed from: c */
        public int f3170c;

        /* renamed from: d */
        public int f3171d;

        /* renamed from: e */
        public int f3172e;

        /* renamed from: f */
        public int f3173f;

        public a(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13) {
            this.f3168a = b0Var;
            this.f3169b = b0Var2;
            this.f3170c = i10;
            this.f3171d = i11;
            this.f3172e = i12;
            this.f3173f = i13;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ChangeInfo{oldHolder=");
            a10.append(this.f3168a);
            a10.append(", newHolder=");
            a10.append(this.f3169b);
            a10.append(", fromX=");
            a10.append(this.f3170c);
            a10.append(", fromY=");
            a10.append(this.f3171d);
            a10.append(", toX=");
            a10.append(this.f3172e);
            a10.append(", toY=");
            return a1.b.a(a10, this.f3173f, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public RecyclerView.b0 f3174a;

        /* renamed from: b */
        public int f3175b;

        /* renamed from: c */
        public int f3176c;

        /* renamed from: d */
        public int f3177d;

        /* renamed from: e */
        public int f3178e;

        public b(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
            this.f3174a = b0Var;
            this.f3175b = i10;
            this.f3176c = i11;
            this.f3177d = i12;
            this.f3178e = i13;
        }
    }

    public static void i(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((RecyclerView.b0) arrayList.get(size)).f2927a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void e(RecyclerView.b0 b0Var) {
        View view = b0Var.f2927a;
        view.animate().cancel();
        int size = this.f3159j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3159j.get(size).f3174a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(b0Var);
                this.f3159j.remove(size);
            }
        }
        k(b0Var, this.f3160k);
        if (this.f3157h.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        if (this.f3158i.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        int size2 = this.f3163n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.f3163n.get(size2);
            k(b0Var, arrayList);
            if (arrayList.isEmpty()) {
                this.f3163n.remove(size2);
            }
        }
        int size3 = this.f3162m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.f3162m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f3174a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3162m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f3161l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.b0> arrayList3 = this.f3161l.get(size5);
                if (arrayList3.remove(b0Var)) {
                    view.setAlpha(1.0f);
                    c(b0Var);
                    if (arrayList3.isEmpty()) {
                        this.f3161l.remove(size5);
                    }
                }
            } else {
                this.f3166q.remove(b0Var);
                this.f3164o.remove(b0Var);
                this.f3167r.remove(b0Var);
                this.f3165p.remove(b0Var);
                j();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void f() {
        int size = this.f3159j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f3159j.get(size);
            View view = bVar.f3174a.f2927a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f3174a);
            this.f3159j.remove(size);
        }
        int size2 = this.f3157h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f3157h.get(size2));
            this.f3157h.remove(size2);
        }
        int size3 = this.f3158i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = this.f3158i.get(size3);
            b0Var.f2927a.setAlpha(1.0f);
            c(b0Var);
            this.f3158i.remove(size3);
        }
        int size4 = this.f3160k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f3160k.get(size4);
            RecyclerView.b0 b0Var2 = aVar.f3168a;
            if (b0Var2 != null) {
                l(aVar, b0Var2);
            }
            RecyclerView.b0 b0Var3 = aVar.f3169b;
            if (b0Var3 != null) {
                l(aVar, b0Var3);
            }
        }
        this.f3160k.clear();
        if (!g()) {
            return;
        }
        int size5 = this.f3162m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.f3162m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f3174a.f2927a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.f3174a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3162m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f3161l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.b0> arrayList2 = this.f3161l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.b0 b0Var4 = arrayList2.get(size8);
                    b0Var4.f2927a.setAlpha(1.0f);
                    c(b0Var4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3161l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f3163n.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList<a> arrayList3 = this.f3163n.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        a aVar2 = arrayList3.get(size10);
                        RecyclerView.b0 b0Var5 = aVar2.f3168a;
                        if (b0Var5 != null) {
                            l(aVar2, b0Var5);
                        }
                        RecyclerView.b0 b0Var6 = aVar2.f3169b;
                        if (b0Var6 != null) {
                            l(aVar2, b0Var6);
                        }
                        if (arrayList3.isEmpty()) {
                            this.f3163n.remove(arrayList3);
                        }
                    }
                }
            } else {
                i(this.f3166q);
                i(this.f3165p);
                i(this.f3164o);
                i(this.f3167r);
                d();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean g() {
        return (this.f3158i.isEmpty() && this.f3160k.isEmpty() && this.f3159j.isEmpty() && this.f3157h.isEmpty() && this.f3165p.isEmpty() && this.f3166q.isEmpty() && this.f3164o.isEmpty() && this.f3167r.isEmpty() && this.f3162m.isEmpty() && this.f3161l.isEmpty() && this.f3163n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.k0
    public final boolean h(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
        View view = b0Var.f2927a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) b0Var.f2927a.getTranslationY());
        m(b0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(b0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3159j.add(new b(b0Var, translationX, translationY, i12, i13));
        return true;
    }

    public final void j() {
        if (g()) {
            return;
        }
        d();
    }

    public final void k(RecyclerView.b0 b0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            a aVar = (a) arrayList.get(size);
            if (l(aVar, b0Var) && aVar.f3168a == null && aVar.f3169b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean l(a aVar, RecyclerView.b0 b0Var) {
        if (aVar.f3169b == b0Var) {
            aVar.f3169b = null;
        } else if (aVar.f3168a != b0Var) {
            return false;
        } else {
            aVar.f3168a = null;
        }
        b0Var.f2927a.setAlpha(1.0f);
        b0Var.f2927a.setTranslationX(0.0f);
        b0Var.f2927a.setTranslationY(0.0f);
        c(b0Var);
        return true;
    }

    public final void m(RecyclerView.b0 b0Var) {
        if (f3156s == null) {
            f3156s = new ValueAnimator().getInterpolator();
        }
        b0Var.f2927a.animate().setInterpolator(f3156s);
        e(b0Var);
    }
}
