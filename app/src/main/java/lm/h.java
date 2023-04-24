package lm;

import bi.r;

/* loaded from: classes2.dex */
public class h implements Iterable<Integer>, hm.a {

    /* renamed from: a */
    public final int f20071a;

    /* renamed from: b */
    public final int f20072b;

    /* renamed from: c */
    public final int f20073c;

    public h(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f20071a = i10;
        this.f20072b = r.A(i10, i11, i12);
        this.f20073c = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (this.f20071a != hVar.f20071a || this.f20072b != hVar.f20072b || this.f20073c != hVar.f20073c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f20071a * 31) + this.f20072b) * 31) + this.f20073c;
    }

    public boolean isEmpty() {
        if (this.f20073c > 0) {
            if (this.f20071a > this.f20072b) {
                return true;
            }
        } else if (this.f20071a < this.f20072b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: j */
    public final i iterator() {
        return new i(this.f20071a, this.f20072b, this.f20073c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f20073c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f20071a);
            sb2.append("..");
            sb2.append(this.f20072b);
            sb2.append(" step ");
            i10 = this.f20073c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f20071a);
            sb2.append(" downTo ");
            sb2.append(this.f20072b);
            sb2.append(" step ");
            i10 = -this.f20073c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
