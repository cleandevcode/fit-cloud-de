package i3;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f3.m;
import g3.d;
import o3.p;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: b */
    public static final String f16428b = m.e("SystemAlarmScheduler");

    /* renamed from: a */
    public final Context f16429a;

    public b(Context context) {
        this.f16429a = context.getApplicationContext();
    }

    @Override // g3.d
    public final void a(p... pVarArr) {
        for (p pVar : pVarArr) {
            m.c().a(f16428b, String.format("Scheduling work with workSpecId %s", pVar.f22625a), new Throwable[0]);
            this.f16429a.startService(androidx.work.impl.background.systemalarm.a.b(this.f16429a, pVar.f22625a));
        }
    }

    @Override // g3.d
    public final boolean b() {
        return true;
    }

    @Override // g3.d
    public final void d(String str) {
        Context context = this.f16429a;
        String str2 = androidx.work.impl.background.systemalarm.a.f3680d;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f16429a.startService(intent);
    }
}
