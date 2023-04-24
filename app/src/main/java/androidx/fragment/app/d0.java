package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class d0<E> extends a0 {

    /* renamed from: a */
    public final Activity f2339a;

    /* renamed from: b */
    public final Context f2340b;

    /* renamed from: c */
    public final Handler f2341c;

    /* renamed from: d */
    public final k0 f2342d;

    public d0(x xVar) {
        Handler handler = new Handler();
        this.f2342d = new k0();
        this.f2339a = xVar;
        s.h1.i(xVar, "context == null");
        this.f2340b = xVar;
        this.f2341c = handler;
    }

    public abstract void H(PrintWriter printWriter, String[] strArr);

    public abstract x I();

    public abstract LayoutInflater J();

    public abstract boolean K(String str);

    public abstract void L();
}
