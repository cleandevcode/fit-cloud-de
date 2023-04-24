package f1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: a */
    public final LocaleList f14037a;

    public m(Object obj) {
        this.f14037a = (LocaleList) obj;
    }

    @Override // f1.l
    public final Object a() {
        return this.f14037a;
    }

    public final boolean equals(Object obj) {
        return this.f14037a.equals(((l) obj).a());
    }

    @Override // f1.l
    public final Locale get() {
        return this.f14037a.get(0);
    }

    public final int hashCode() {
        return this.f14037a.hashCode();
    }

    public final String toString() {
        return this.f14037a.toString();
    }
}
