package d6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: b */
    public static c f12643b;

    /* renamed from: a */
    public final Context f12644a;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Context context) {
            if (c.a() != null) {
                c.a();
                return;
            }
            c cVar = new c(context);
            if (!i6.a.b(c.class)) {
                try {
                    if (!i6.a.b(cVar)) {
                        g2.a a10 = g2.a.a(cVar.f12644a);
                        gm.l.e(a10, "getInstance(applicationContext)");
                        a10.b(cVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    }
                } catch (Throwable th2) {
                    i6.a.a(c.class, th2);
                }
            }
            if (!i6.a.b(c.class)) {
                try {
                    c.f12643b = cVar;
                } catch (Throwable th3) {
                    i6.a.a(c.class, th3);
                }
            }
            c.a();
        }
    }

    public c(Context context) {
        Context applicationContext = context.getApplicationContext();
        gm.l.e(applicationContext, "context.applicationContext");
        this.f12644a = applicationContext;
    }

    public static final /* synthetic */ c a() {
        if (i6.a.b(c.class)) {
            return null;
        }
        try {
            return f12643b;
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return null;
        }
    }

    public final void finalize() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            if (!i6.a.b(this)) {
                g2.a a10 = g2.a.a(this.f12644a);
                gm.l.e(a10, "getInstance(applicationContext)");
                a10.d(this);
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        if (i6.a.b(this)) {
            return;
        }
        try {
            Set<String> set = null;
            p5.m mVar = new p5.m(context, (String) null);
            if (intent == null) {
                stringExtra = null;
            } else {
                stringExtra = intent.getStringExtra("event_name");
            }
            String k10 = gm.l.k(stringExtra, "bf_");
            if (intent == null) {
                bundleExtra = null;
            } else {
                bundleExtra = intent.getBundleExtra("event_args");
            }
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String str : set) {
                    gm.l.e(str, "key");
                    Pattern compile = Pattern.compile("[^0-9a-zA-Z _-]");
                    gm.l.e(compile, "compile(pattern)");
                    String replaceAll = compile.matcher(str).replaceAll("-");
                    gm.l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    Pattern compile2 = Pattern.compile("^[ -]*");
                    gm.l.e(compile2, "compile(pattern)");
                    String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
                    gm.l.e(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                    Pattern compile3 = Pattern.compile("[ -]*$");
                    gm.l.e(compile3, "compile(pattern)");
                    String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("");
                    gm.l.e(replaceAll3, "nativePattern.matcher(in…).replaceAll(replacement)");
                    bundle.putString(replaceAll3, (String) bundleExtra.get(str));
                }
            }
            o5.v vVar = o5.v.f22837a;
            if (o5.q0.b()) {
                mVar.d(bundle, k10);
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
