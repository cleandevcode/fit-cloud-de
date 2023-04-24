package t7;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import s7.j;
import t7.k;

/* loaded from: classes.dex */
public abstract class f<T extends k> implements x7.d<T> {

    /* renamed from: a */
    public ArrayList f27807a;

    /* renamed from: b */
    public ArrayList f27808b;

    /* renamed from: c */
    public String f27809c;

    /* renamed from: f */
    public transient u7.c f27812f;

    /* renamed from: d */
    public j.a f27810d = j.a.LEFT;

    /* renamed from: e */
    public boolean f27811e = true;

    /* renamed from: g */
    public int f27813g = 3;

    /* renamed from: h */
    public float f27814h = Float.NaN;

    /* renamed from: i */
    public float f27815i = Float.NaN;

    /* renamed from: j */
    public boolean f27816j = true;

    /* renamed from: k */
    public boolean f27817k = true;

    /* renamed from: l */
    public a8.c f27818l = new a8.c();

    /* renamed from: m */
    public float f27819m = 17.0f;

    /* renamed from: n */
    public boolean f27820n = true;

    public f(String str) {
        this.f27807a = null;
        this.f27808b = null;
        this.f27809c = "DataSet";
        this.f27807a = new ArrayList();
        this.f27808b = new ArrayList();
        this.f27807a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.f27808b.add(-16777216);
        this.f27809c = str;
    }

    @Override // x7.d
    public final float B() {
        return this.f27814h;
    }

    @Override // x7.d
    public final int C(int i10) {
        ArrayList arrayList = this.f27807a;
        return ((Integer) arrayList.get(i10 % arrayList.size())).intValue();
    }

    @Override // x7.d
    public final void D() {
    }

    @Override // x7.d
    public final boolean F() {
        return this.f27812f == null;
    }

    @Override // x7.d
    public final void G() {
        this.f27816j = false;
    }

    @Override // x7.d
    public final int H(int i10) {
        ArrayList arrayList = this.f27808b;
        return ((Integer) arrayList.get(i10 % arrayList.size())).intValue();
    }

    @Override // x7.d
    public final List<Integer> J() {
        return this.f27807a;
    }

    @Override // x7.d
    public final void O() {
    }

    @Override // x7.d
    public final boolean R() {
        return this.f27816j;
    }

    @Override // x7.d
    public final void W(u7.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f27812f = bVar;
    }

    @Override // x7.d
    public final j.a X() {
        return this.f27810d;
    }

    @Override // x7.d
    public final a8.c Z() {
        return this.f27818l;
    }

    @Override // x7.d
    public final int a0() {
        return ((Integer) this.f27807a.get(0)).intValue();
    }

    @Override // x7.d
    public final int b() {
        return this.f27813g;
    }

    @Override // x7.d
    public final boolean c0() {
        return this.f27811e;
    }

    @Override // x7.d
    public final void g() {
    }

    public final void i0(int i10) {
        if (this.f27807a == null) {
            this.f27807a = new ArrayList();
        }
        this.f27807a.clear();
        this.f27807a.add(Integer.valueOf(i10));
    }

    @Override // x7.d
    public final boolean isVisible() {
        return this.f27820n;
    }

    @Override // x7.d
    public final boolean j() {
        return this.f27817k;
    }

    @Override // x7.d
    public final String n() {
        return this.f27809c;
    }

    @Override // x7.d
    public final void r() {
    }

    @Override // x7.d
    public final float t() {
        return this.f27819m;
    }

    @Override // x7.d
    public final u7.c u() {
        if (F()) {
            return a8.f.f393g;
        }
        return this.f27812f;
    }

    @Override // x7.d
    public final float w() {
        return this.f27815i;
    }
}
