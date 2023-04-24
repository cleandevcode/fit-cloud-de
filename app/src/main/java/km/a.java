package km;

import gm.l;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public final class a extends jm.a {
    @Override // jm.c
    public final int d(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // jm.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.e(current, "current()");
        return current;
    }
}
