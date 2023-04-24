package jm;

import java.util.Random;

/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // jm.c
    public final int a(int i10) {
        return ((-i10) >> 31) & (e().nextInt() >>> (32 - i10));
    }

    @Override // jm.c
    public final int b() {
        return e().nextInt();
    }

    @Override // jm.c
    public final int c(int i10) {
        return e().nextInt(i10);
    }

    public abstract Random e();
}
