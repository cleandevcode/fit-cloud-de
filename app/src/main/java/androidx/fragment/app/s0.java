package androidx.fragment.app;

import androidx.lifecycle.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: b */
    public int f2564b;

    /* renamed from: c */
    public int f2565c;

    /* renamed from: d */
    public int f2566d;

    /* renamed from: e */
    public int f2567e;

    /* renamed from: f */
    public int f2568f;

    /* renamed from: g */
    public boolean f2569g;

    /* renamed from: i */
    public String f2571i;

    /* renamed from: j */
    public int f2572j;

    /* renamed from: k */
    public CharSequence f2573k;

    /* renamed from: l */
    public int f2574l;

    /* renamed from: m */
    public CharSequence f2575m;

    /* renamed from: n */
    public ArrayList<String> f2576n;

    /* renamed from: o */
    public ArrayList<String> f2577o;

    /* renamed from: a */
    public ArrayList<a> f2563a = new ArrayList<>();

    /* renamed from: h */
    public boolean f2570h = true;

    /* renamed from: p */
    public boolean f2578p = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f2579a;

        /* renamed from: b */
        public r f2580b;

        /* renamed from: c */
        public boolean f2581c;

        /* renamed from: d */
        public int f2582d;

        /* renamed from: e */
        public int f2583e;

        /* renamed from: f */
        public int f2584f;

        /* renamed from: g */
        public int f2585g;

        /* renamed from: h */
        public k.c f2586h;

        /* renamed from: i */
        public k.c f2587i;

        public a() {
        }

        public a(int i10, r rVar) {
            this.f2579a = i10;
            this.f2580b = rVar;
            this.f2581c = false;
            k.c cVar = k.c.RESUMED;
            this.f2586h = cVar;
            this.f2587i = cVar;
        }

        public a(int i10, r rVar, int i11) {
            this.f2579a = i10;
            this.f2580b = rVar;
            this.f2581c = true;
            k.c cVar = k.c.RESUMED;
            this.f2586h = cVar;
            this.f2587i = cVar;
        }

        public a(r rVar, k.c cVar) {
            this.f2579a = 10;
            this.f2580b = rVar;
            this.f2581c = false;
            this.f2586h = rVar.Y;
            this.f2587i = cVar;
        }

        public a(a aVar) {
            this.f2579a = aVar.f2579a;
            this.f2580b = aVar.f2580b;
            this.f2581c = aVar.f2581c;
            this.f2582d = aVar.f2582d;
            this.f2583e = aVar.f2583e;
            this.f2584f = aVar.f2584f;
            this.f2585g = aVar.f2585g;
            this.f2586h = aVar.f2586h;
            this.f2587i = aVar.f2587i;
        }
    }

    public final void b(a aVar) {
        this.f2563a.add(aVar);
        aVar.f2582d = this.f2564b;
        aVar.f2583e = this.f2565c;
        aVar.f2584f = this.f2566d;
        aVar.f2585g = this.f2567e;
    }
}
