package kj;

import al.j;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import gm.l;
import java.util.Locale;
import jj.k1;
import ph.q;
import wi.k;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final Application f18606a;

    /* renamed from: b */
    public final jj.g f18607b;

    /* renamed from: c */
    public Locale f18608c;

    /* renamed from: d */
    public Byte f18609d;

    /* renamed from: e */
    public final a f18610e;

    /* renamed from: f */
    public final j f18611f;

    public c(Application application, k kVar, k1 k1Var) {
        l.f(application, "application");
        this.f18606a = application;
        this.f18607b = k1Var;
        a aVar = new a(this);
        this.f18610e = aVar;
        ql.d<wi.d> dVar = kVar.f29908p;
        l.e(dVar, "stateSubject");
        this.f18611f = dVar.y(new q(4, new b(this)), yk.a.f31790e, yk.a.f31788c);
        application.registerComponentCallbacks(aVar);
    }

    public static final byte a(c cVar) {
        Locale locale;
        Byte b10 = cVar.f18609d;
        if (b10 == null) {
            Application application = cVar.f18606a;
            int i10 = Build.VERSION.SDK_INT;
            Configuration configuration = application.getResources().getConfiguration();
            if (i10 >= 24) {
                locale = configuration.getLocales().get(0);
            } else {
                locale = configuration.locale;
            }
            cVar.f18608c = locale;
            byte a10 = ak.b.a(locale);
            Byte valueOf = Byte.valueOf(a10);
            cVar.f18609d = Byte.valueOf(a10);
            b10 = valueOf;
        }
        return b10.byteValue();
    }

    public static final Locale b(c cVar, Configuration configuration) {
        cVar.getClass();
        return Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
    }
}
