package qc;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f implements wk.e<Object, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f24707a;

    public f(ByteBuffer byteBuffer) {
        this.f24707a = byteBuffer;
    }

    @Override // wk.e
    public final Boolean apply(Object obj) {
        return Boolean.valueOf(this.f24707a.hasRemaining());
    }
}
