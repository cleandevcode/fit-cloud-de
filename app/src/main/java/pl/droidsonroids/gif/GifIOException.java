package pl.droidsonroids.gif;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GifIOException extends IOException {

    /* renamed from: a */
    public final yn.b f24287a;

    /* renamed from: b */
    public final String f24288b;

    public GifIOException(int i10, String str) {
        yn.b bVar;
        yn.b[] values = yn.b.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                bVar = values[i11];
                if (bVar.f31819b == i10) {
                    break;
                }
                i11++;
            } else {
                bVar = yn.b.f31816d;
                bVar.f31819b = i10;
                break;
            }
        }
        this.f24287a = bVar;
        this.f24288b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.f24288b == null) {
            yn.b bVar = this.f24287a;
            bVar.getClass();
            return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(bVar.f31819b), bVar.f31818a);
        }
        StringBuilder sb2 = new StringBuilder();
        yn.b bVar2 = this.f24287a;
        bVar2.getClass();
        sb2.append(String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(bVar2.f31819b), bVar2.f31818a));
        sb2.append(": ");
        sb2.append(this.f24288b);
        return sb2.toString();
    }
}
