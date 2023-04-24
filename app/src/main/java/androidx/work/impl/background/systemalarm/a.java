package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import f3.m;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements g3.a {

    /* renamed from: d */
    public static final String f3680d = m.e("CommandHandler");

    /* renamed from: a */
    public final Context f3681a;

    /* renamed from: b */
    public final HashMap f3682b = new HashMap();

    /* renamed from: c */
    public final Object f3683c = new Object();

    public a(Context context) {
        this.f3681a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // g3.a
    public final void c(String str, boolean z10) {
        synchronized (this.f3683c) {
            g3.a aVar = (g3.a) this.f3682b.remove(str);
            if (aVar != null) {
                aVar.c(str, z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r11, android.content.Intent r12, androidx.work.impl.background.systemalarm.d r13) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.a.d(int, android.content.Intent, androidx.work.impl.background.systemalarm.d):void");
    }
}
