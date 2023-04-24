package lm;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class c extends a implements g<Character> {
    static {
        new c((char) 1, (char) 0);
    }

    public c(char c10, char c11) {
        super(c10, c11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f20064a != cVar.f20064a || this.f20065b != cVar.f20065b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // lm.g
    public final Character f() {
        return Character.valueOf(this.f20064a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f20064a * 31) + this.f20065b;
    }

    @Override // lm.g
    public final Character i() {
        return Character.valueOf(this.f20065b);
    }

    public final boolean isEmpty() {
        if (gm.l.h(this.f20064a, this.f20065b) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f20064a + ".." + this.f20065b;
    }
}
