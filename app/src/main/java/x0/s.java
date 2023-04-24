package x0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public Context f30139a;

    /* renamed from: e */
    public CharSequence f30143e;

    /* renamed from: f */
    public CharSequence f30144f;

    /* renamed from: g */
    public PendingIntent f30145g;

    /* renamed from: h */
    public PendingIntent f30146h;

    /* renamed from: i */
    public int f30147i;

    /* renamed from: k */
    public t f30149k;

    /* renamed from: l */
    public int f30150l;

    /* renamed from: m */
    public int f30151m;

    /* renamed from: n */
    public boolean f30152n;

    /* renamed from: p */
    public Bundle f30154p;

    /* renamed from: r */
    public String f30156r;

    /* renamed from: s */
    public boolean f30157s;

    /* renamed from: t */
    public Notification f30158t;
    @Deprecated

    /* renamed from: u */
    public ArrayList<String> f30159u;

    /* renamed from: b */
    public ArrayList<q> f30140b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<f0> f30141c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<q> f30142d = new ArrayList<>();

    /* renamed from: j */
    public boolean f30148j = true;

    /* renamed from: o */
    public boolean f30153o = false;

    /* renamed from: q */
    public int f30155q = 0;

    public s(Context context, String str) {
        Notification notification = new Notification();
        this.f30158t = notification;
        this.f30139a = context;
        this.f30156r = str;
        notification.when = System.currentTimeMillis();
        this.f30158t.audioStreamType = -1;
        this.f30147i = 0;
        this.f30159u = new ArrayList<>();
        this.f30157s = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        z zVar = new z(this);
        t tVar = zVar.f30162b.f30149k;
        if (tVar != null) {
            new Notification.BigTextStyle(zVar.f30161a).setBigContentTitle(null).bigText(((r) tVar).f30138b);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && i10 < 24) {
            zVar.f30161a.setExtras(zVar.f30163c);
        }
        Notification build = zVar.f30161a.build();
        zVar.f30162b.getClass();
        if (tVar != null) {
            zVar.f30162b.f30149k.getClass();
        }
        if (tVar != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return build;
    }

    public final void c(String str) {
        this.f30144f = b(str);
    }

    public final void d(String str) {
        this.f30143e = b(str);
    }

    public final void e(int i10, boolean z10) {
        Notification notification;
        int i11;
        if (z10) {
            notification = this.f30158t;
            i11 = i10 | notification.flags;
        } else {
            notification = this.f30158t;
            i11 = (~i10) & notification.flags;
        }
        notification.flags = i11;
    }

    public final void f(int i10, boolean z10) {
        this.f30150l = 100;
        this.f30151m = i10;
        this.f30152n = z10;
    }

    public final void g(r rVar) {
        if (this.f30149k != rVar) {
            this.f30149k = rVar;
            if (rVar.f30160a != this) {
                rVar.f30160a = this;
                g(rVar);
            }
        }
    }
}
