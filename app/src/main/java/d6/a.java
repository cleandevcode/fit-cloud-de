package d6;

import android.content.Intent;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    public static final C0215a f12625d = new C0215a();

    /* renamed from: e */
    public static a f12626e;

    /* renamed from: a */
    public int f12627a;

    /* renamed from: b */
    public final UUID f12628b;

    /* renamed from: c */
    public Intent f12629c;

    /* renamed from: d6.a$a */
    /* loaded from: classes.dex */
    public static final class C0215a {
        public final synchronized boolean a(a aVar) {
            a aVar2;
            boolean z10;
            if (!i6.a.b(a.class)) {
                aVar2 = a.f12626e;
            } else {
                aVar2 = null;
            }
            if (!i6.a.b(a.class)) {
                a.f12626e = aVar;
            }
            if (aVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return z10;
        }
    }

    public a(int i10) {
        UUID randomUUID = UUID.randomUUID();
        gm.l.e(randomUUID, "randomUUID()");
        this.f12627a = i10;
        this.f12628b = randomUUID;
    }

    public final UUID a() {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            return this.f12628b;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            f12625d.a(this);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
