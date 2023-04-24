package yj;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final long f31778a;

    /* renamed from: b */
    public final String f31779b;

    public a(long j10, String str) {
        this.f31778a = j10;
        this.f31779b = str;
    }

    public final String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        return simpleDateFormat.format(new Date(this.f31778a)) + this.f31779b;
    }
}
