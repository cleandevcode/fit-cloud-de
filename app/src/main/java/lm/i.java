package lm;

import java.util.NoSuchElementException;
import ul.w;

/* loaded from: classes2.dex */
public final class i extends w {

    /* renamed from: a */
    public final int f20074a;

    /* renamed from: b */
    public final int f20075b;

    /* renamed from: c */
    public boolean f20076c;

    /* renamed from: d */
    public int f20077d;

    public i(int i10, int i11, int i12) {
        this.f20074a = i12;
        this.f20075b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f20076c = z10;
        this.f20077d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20076c;
    }

    @Override // ul.w
    public final int nextInt() {
        int i10 = this.f20077d;
        if (i10 != this.f20075b) {
            this.f20077d = this.f20074a + i10;
        } else if (!this.f20076c) {
            throw new NoSuchElementException();
        } else {
            this.f20076c = false;
        }
        return i10;
    }
}
