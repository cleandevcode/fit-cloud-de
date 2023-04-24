package qb;

import android.support.v4.media.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final /* synthetic */ int f24675a;

    /* renamed from: b */
    public int f24676b;

    public b() {
        this.f24675a = 0;
        this.f24676b = 3;
    }

    public final String toString() {
        switch (this.f24675a) {
            case 1:
                return f3.a.a(Locale.US, "\n\tconnNum=%d", new Object[]{Integer.valueOf(this.f24676b)}, d.a("GetMultilinkConnNumRsp {"), "\n}");
            default:
                return super.toString();
        }
    }

    public b(int i10) {
        this.f24675a = 1;
        this.f24676b = i10;
    }
}
