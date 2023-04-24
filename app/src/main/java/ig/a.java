package ig;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class a extends IOException {

    /* renamed from: a */
    public final int f16818a;

    public a(int i10) {
        this.f16818a = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder a10 = android.support.v4.media.d.a("errorType=");
        a10.append(this.f16818a);
        return a10.toString();
    }
}
