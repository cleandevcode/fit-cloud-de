package lm;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b extends ul.j {

    /* renamed from: a */
    public final int f20067a;

    /* renamed from: b */
    public final int f20068b;

    /* renamed from: c */
    public boolean f20069c;

    /* renamed from: d */
    public int f20070d;

    public b(char c10, char c11, int i10) {
        this.f20067a = i10;
        this.f20068b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? gm.l.h(c10, c11) < 0 : gm.l.h(c10, c11) > 0) {
            z10 = false;
        }
        this.f20069c = z10;
        this.f20070d = z10 ? c10 : c11;
    }

    @Override // ul.j
    public final char a() {
        int i10 = this.f20070d;
        if (i10 != this.f20068b) {
            this.f20070d = this.f20067a + i10;
        } else if (!this.f20069c) {
            throw new NoSuchElementException();
        } else {
            this.f20069c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20069c;
    }
}
