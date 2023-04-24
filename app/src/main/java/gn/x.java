package gn;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class x extends IOException {

    /* renamed from: a */
    public final b f15680a;

    public x(b bVar) {
        super("stream was reset: " + bVar);
        this.f15680a = bVar;
    }
}
