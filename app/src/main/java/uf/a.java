package uf;

import t0.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final int f28704a;

    /* renamed from: b */
    public final float f28705b;

    /* renamed from: c */
    public final int f28706c;

    public a() {
        this(0);
    }

    public a(float f10, int i10, int i11) {
        this.f28704a = i10;
        this.f28705b = f10;
        this.f28706c = i11;
    }

    public /* synthetic */ a(int i10) {
        this(5.0f, 8000, 240);
    }

    public static a a(a aVar, int i10, float f10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = aVar.f28704a;
        }
        if ((i12 & 2) != 0) {
            f10 = aVar.f28705b;
        }
        if ((i12 & 4) != 0) {
            i11 = aVar.f28706c;
        }
        return new a(f10, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f28704a == aVar.f28704a && Float.compare(this.f28705b, aVar.f28705b) == 0 && this.f28706c == aVar.f28706c;
        }
        return false;
    }

    public final int hashCode() {
        return e.b(this.f28705b, this.f28704a * 31, 31) + this.f28706c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ExerciseGoal(step=");
        a10.append(this.f28704a);
        a10.append(", distance=");
        a10.append(this.f28705b);
        a10.append(", calorie=");
        return a1.b.a(a10, this.f28706c, ')');
    }
}
