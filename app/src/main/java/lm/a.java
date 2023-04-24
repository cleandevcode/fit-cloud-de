package lm;

import bi.r;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements Iterable<Character>, hm.a {

    /* renamed from: a */
    public final char f20064a;

    /* renamed from: b */
    public final char f20065b;

    /* renamed from: c */
    public final int f20066c = 1;

    public a(char c10, char c11) {
        this.f20064a = c10;
        this.f20065b = (char) r.A(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.f20064a, this.f20065b, this.f20066c);
    }
}
