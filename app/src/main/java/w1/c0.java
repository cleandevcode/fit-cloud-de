package w1;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    public volatile p0 f29546a;

    /* renamed from: b */
    public volatile g f29547b;

    static {
        o.a();
    }

    public final p0 a(p0 p0Var) {
        if (this.f29546a == null) {
            synchronized (this) {
                if (this.f29546a == null) {
                    try {
                        this.f29546a = p0Var;
                        this.f29547b = g.f29563b;
                    } catch (z unused) {
                        this.f29546a = p0Var;
                        this.f29547b = g.f29563b;
                    }
                }
            }
        }
        return this.f29546a;
    }

    public final g b() {
        if (this.f29547b != null) {
            return this.f29547b;
        }
        synchronized (this) {
            if (this.f29547b != null) {
                return this.f29547b;
            }
            this.f29547b = this.f29546a == null ? g.f29563b : this.f29546a.c();
            return this.f29547b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            p0 p0Var = this.f29546a;
            p0 p0Var2 = c0Var.f29546a;
            return (p0Var == null && p0Var2 == null) ? b().equals(c0Var.b()) : (p0Var == null || p0Var2 == null) ? p0Var != null ? p0Var.equals(c0Var.a(p0Var.b())) : a(p0Var2.b()).equals(p0Var2) : p0Var.equals(p0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
