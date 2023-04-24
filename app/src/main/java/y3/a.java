package y3;

import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class a extends f1 {

    /* renamed from: a */
    public final ComponentActivity f30921a;

    /* renamed from: b */
    public final Object f30922b;

    /* renamed from: c */
    public final androidx.lifecycle.y0 f30923c;

    /* renamed from: d */
    public final q2.a f30924d;

    public a(ComponentActivity componentActivity, Object obj, androidx.lifecycle.y0 y0Var, q2.a aVar) {
        this.f30921a = componentActivity;
        this.f30922b = obj;
        this.f30923c = y0Var;
        this.f30924d = aVar;
    }

    @Override // y3.f1
    public final ComponentActivity a() {
        return this.f30921a;
    }

    @Override // y3.f1
    public final Object b() {
        return this.f30922b;
    }

    @Override // y3.f1
    public final androidx.lifecycle.y0 c() {
        return this.f30923c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (gm.l.a(this.f30921a, aVar.f30921a) && gm.l.a(this.f30922b, aVar.f30922b) && gm.l.a(this.f30923c, aVar.f30923c) && gm.l.a(this.f30924d, aVar.f30924d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f30921a.hashCode() * 31;
        Object obj = this.f30922b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int hashCode3 = this.f30923c.hashCode();
        return this.f30924d.hashCode() + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ActivityViewModelContext(activity=");
        a10.append(this.f30921a);
        a10.append(", args=");
        a10.append(this.f30922b);
        a10.append(", owner=");
        a10.append(this.f30923c);
        a10.append(", savedStateRegistry=");
        a10.append(this.f30924d);
        a10.append(')');
        return a10.toString();
    }
}
