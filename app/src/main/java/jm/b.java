package jm;

import gm.l;
import java.util.Random;

/* loaded from: classes2.dex */
public final class b extends jm.a {

    /* renamed from: c */
    public final a f17995c = new a();

    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // jm.a
    public final Random e() {
        Random random = this.f17995c.get();
        l.e(random, "implStorage.get()");
        return random;
    }
}
