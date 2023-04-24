package com.topstep.fitcloud.pro.function;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import bi.r;
import gm.l;
import hh.c;
import java.util.Calendar;
import java.util.Date;
import sf.j;
import sm.g1;

/* loaded from: classes2.dex */
public final class DateMonitor {

    /* renamed from: a */
    public final Calendar f9544a;

    /* renamed from: b */
    public final g1 f9545b;

    /* renamed from: c */
    public final g1 f9546c;

    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
            DateMonitor.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l.f(context, "context");
            l.f(intent, "intent");
            DateMonitor.a(DateMonitor.this);
        }
    }

    public DateMonitor(Context context) {
        Calendar calendar = Calendar.getInstance();
        this.f9544a = calendar;
        Date date = new Date();
        l.e(calendar, "calendar");
        g1 c10 = r.c(new j(c.d(calendar, date, 0), c.d(calendar, date, -29)));
        this.f9545b = c10;
        this.f9546c = c10;
        context.registerReceiver(new a(), new IntentFilter("android.intent.action.DATE_CHANGED"));
        f0.f2713i.f2719f.a(new g() { // from class: com.topstep.fitcloud.pro.function.DateMonitor.2
            @Override // androidx.lifecycle.g
            public final /* synthetic */ void c(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onDestroy(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onPause(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onResume(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final void onStart(u uVar) {
                DateMonitor.a(DateMonitor.this);
            }

            @Override // androidx.lifecycle.g
            public final void onStop(u uVar) {
            }
        });
    }

    public static final void a(DateMonitor dateMonitor) {
        Date date = new Date();
        Calendar calendar = dateMonitor.f9544a;
        l.e(calendar, "calendar");
        Date d10 = c.d(calendar, date, 0);
        if (!l.a(((j) dateMonitor.f9545b.getValue()).f26940a, d10)) {
            g1 g1Var = dateMonitor.f9545b;
            Calendar calendar2 = dateMonitor.f9544a;
            l.e(calendar2, "calendar");
            g1Var.setValue(new j(d10, c.d(calendar2, date, -29)));
        }
    }
}
