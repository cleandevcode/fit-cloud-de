package x0;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    public final Bundle f30127a;

    /* renamed from: b */
    public IconCompat f30128b;

    /* renamed from: c */
    public final h0[] f30129c;

    /* renamed from: d */
    public boolean f30130d;

    /* renamed from: e */
    public boolean f30131e;

    /* renamed from: f */
    public final int f30132f;

    /* renamed from: g */
    public final boolean f30133g;
    @Deprecated

    /* renamed from: h */
    public int f30134h;

    /* renamed from: i */
    public CharSequence f30135i;

    /* renamed from: j */
    public PendingIntent f30136j;

    /* renamed from: k */
    public boolean f30137k;

    public q(int i10, String str, PendingIntent pendingIntent) {
        IconCompat b10;
        if (i10 == 0) {
            b10 = null;
        } else {
            b10 = IconCompat.b("", i10);
        }
        Bundle bundle = new Bundle();
        this.f30131e = true;
        this.f30128b = b10;
        if (b10 != null) {
            int i11 = b10.f2191a;
            if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
                i11 = IconCompat.a.c(b10.f2192b);
            }
            if (i11 == 2) {
                this.f30134h = b10.c();
            }
        }
        this.f30135i = s.b(str);
        this.f30136j = pendingIntent;
        this.f30127a = bundle;
        this.f30129c = null;
        this.f30130d = true;
        this.f30132f = 0;
        this.f30131e = true;
        this.f30133g = false;
        this.f30137k = false;
    }
}
