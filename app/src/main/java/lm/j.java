package lm;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class j extends h implements g<Integer> {

    /* renamed from: d */
    public static final j f20078d = new j(1, 0);

    public j(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // lm.h
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.f20071a != jVar.f20071a || this.f20072b != jVar.f20072b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // lm.g
    public final Integer f() {
        return Integer.valueOf(this.f20071a);
    }

    @Override // lm.h
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f20071a * 31) + this.f20072b;
    }

    @Override // lm.g
    public final Integer i() {
        return Integer.valueOf(this.f20072b);
    }

    @Override // lm.h
    public final boolean isEmpty() {
        if (this.f20071a > this.f20072b) {
            return true;
        }
        return false;
    }

    public final boolean k(int i10) {
        if (this.f20071a <= i10 && i10 <= this.f20072b) {
            return true;
        }
        return false;
    }

    @Override // lm.h
    public final String toString() {
        return this.f20071a + ".." + this.f20072b;
    }
}
