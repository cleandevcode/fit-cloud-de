package i2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: a */
    public final int f16221a;

    /* renamed from: b */
    public final Bundle f16222b = new Bundle();

    public a(int i10) {
        this.f16221a = i10;
    }

    @Override // i2.w
    public final Bundle a() {
        return this.f16222b;
    }

    @Override // i2.w
    public final int b() {
        return this.f16221a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gm.l.a(a.class, obj.getClass()) && this.f16221a == ((a) obj).f16221a;
    }

    public final int hashCode() {
        return 31 + this.f16221a;
    }

    public final String toString() {
        return a1.b.a(android.support.v4.media.d.a("ActionOnlyNavDirections(actionId="), this.f16221a, ')');
    }
}
