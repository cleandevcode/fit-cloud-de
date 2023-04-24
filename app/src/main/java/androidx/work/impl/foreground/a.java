package androidx.work.impl.foreground;

import android.content.Context;
import android.content.Intent;
import f3.g;
import f3.m;
import g3.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k3.c;
import k3.d;
import n3.e;
import o3.p;
import r3.b;

/* loaded from: classes.dex */
public final class a implements c, g3.a {

    /* renamed from: k */
    public static final String f3724k = m.e("SystemFgDispatcher");

    /* renamed from: a */
    public Context f3725a;

    /* renamed from: b */
    public l f3726b;

    /* renamed from: c */
    public final r3.a f3727c;

    /* renamed from: d */
    public final Object f3728d = new Object();

    /* renamed from: e */
    public String f3729e;

    /* renamed from: f */
    public final LinkedHashMap f3730f;

    /* renamed from: g */
    public final HashMap f3731g;

    /* renamed from: h */
    public final HashSet f3732h;

    /* renamed from: i */
    public final d f3733i;

    /* renamed from: j */
    public InterfaceC0040a f3734j;

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0040a {
    }

    public a(Context context) {
        this.f3725a = context;
        l d10 = l.d(context);
        this.f3726b = d10;
        r3.a aVar = d10.f14896d;
        this.f3727c = aVar;
        this.f3729e = null;
        this.f3730f = new LinkedHashMap();
        this.f3732h = new HashSet();
        this.f3731g = new HashMap();
        this.f3733i = new d(this.f3725a, aVar, this);
        this.f3726b.f14898f.a(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f14086a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f14087b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f14088c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f14086a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f14087b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f14088c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // g3.a
    public final void c(String str, boolean z10) {
        boolean z11;
        Map.Entry entry;
        synchronized (this.f3728d) {
            try {
                p pVar = (p) this.f3731g.remove(str);
                if (pVar != null) {
                    z11 = this.f3732h.remove(pVar);
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f3733i.b(this.f3732h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar = (g) this.f3730f.remove(str);
        if (str.equals(this.f3729e) && this.f3730f.size() > 0) {
            Iterator it = this.f3730f.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f3729e = (String) entry.getKey();
            if (this.f3734j != null) {
                g gVar2 = (g) entry.getValue();
                InterfaceC0040a interfaceC0040a = this.f3734j;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0040a;
                systemForegroundService.f3720b.post(new n3.c(systemForegroundService, gVar2.f14086a, gVar2.f14088c, gVar2.f14087b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f3734j;
                systemForegroundService2.f3720b.post(new e(systemForegroundService2, gVar2.f14086a));
            }
        }
        InterfaceC0040a interfaceC0040a2 = this.f3734j;
        if (gVar != null && interfaceC0040a2 != null) {
            m.c().a(f3724k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(gVar.f14086a), str, Integer.valueOf(gVar.f14087b)), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0040a2;
            systemForegroundService3.f3720b.post(new e(systemForegroundService3, gVar.f14086a));
        }
    }

    @Override // k3.c
    public final void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                m.c().a(f3724k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                l lVar = this.f3726b;
                ((b) lVar.f14896d).a(new p3.l(lVar, str, true));
            }
        }
    }

    @Override // k3.c
    public final void f(List<String> list) {
    }
}
