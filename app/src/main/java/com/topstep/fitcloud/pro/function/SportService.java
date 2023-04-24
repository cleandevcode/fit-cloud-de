package com.topstep.fitcloud.pro.function;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloudpro.R;
import gm.l;
import kotlin.Metadata;
import lg.a;
import sf.r;
import x0.s;

@Metadata
/* loaded from: classes2.dex */
public final class SportService extends r {

    /* renamed from: s */
    public a f9568s;

    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    @Override // x6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i(y6.d r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.function.SportService.i(y6.d, java.util.ArrayList):java.lang.String");
    }

    @Override // x6.c
    public final void k(int i10) {
        int i11;
        int i12;
        Object systemService = getSystemService("notification");
        l.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        qi.l.c(this, (NotificationManager) systemService);
        SportingActivity.X.getClass();
        Intent intent = new Intent(this, SportingActivity.class);
        intent.putExtra("sport_type", i10);
        intent.putExtra("from_main", false);
        intent.setFlags(335544320);
        if (Build.VERSION.SDK_INT >= 31) {
            i11 = 201326592;
        } else {
            i11 = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, i11);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i12 = R.string.app_name;
                } else {
                    i12 = R.string.sport_type_climb;
                }
            } else {
                i12 = R.string.sport_type_od;
            }
        } else {
            i12 = R.string.sport_type_walk;
        }
        String string = getString(i12);
        l.e(string, "when (sportType) {\n     …tring.app_name)\n        }");
        s sVar = new s(this, "Sport");
        sVar.d(string);
        sVar.c(getString(R.string.sport_sporting));
        sVar.f30158t.icon = R.mipmap.ic_launcher;
        sVar.f30145g = activity;
        sVar.e(16, false);
        sVar.f30158t.when = System.currentTimeMillis();
        sVar.e(8, true);
        sVar.e(2, true);
        sVar.f30147i = 1;
        Notification a10 = sVar.a();
        a10.flags = a10.flags | 32 | 64;
        tl.l lVar = tl.l.f28297a;
        startForeground(10003, a10);
    }
}
