package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import f3.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o3.p;
import p3.r;

/* loaded from: classes.dex */
public final class c implements k3.c, g3.a, r.b {

    /* renamed from: j */
    public static final String f3689j = m.e("DelayMetCommandHandler");

    /* renamed from: a */
    public final Context f3690a;

    /* renamed from: b */
    public final int f3691b;

    /* renamed from: c */
    public final String f3692c;

    /* renamed from: d */
    public final d f3693d;

    /* renamed from: e */
    public final k3.d f3694e;

    /* renamed from: h */
    public PowerManager.WakeLock f3697h;

    /* renamed from: i */
    public boolean f3698i = false;

    /* renamed from: g */
    public int f3696g = 0;

    /* renamed from: f */
    public final Object f3695f = new Object();

    public c(Context context, int i10, String str, d dVar) {
        this.f3690a = context;
        this.f3691b = i10;
        this.f3693d = dVar;
        this.f3692c = str;
        this.f3694e = new k3.d(context, dVar.f3701b, this);
    }

    @Override // p3.r.b
    public final void a(String str) {
        m.c().a(f3689j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    public final void b() {
        synchronized (this.f3695f) {
            this.f3694e.c();
            this.f3693d.f3702c.b(this.f3692c);
            PowerManager.WakeLock wakeLock = this.f3697h;
            if (wakeLock != null && wakeLock.isHeld()) {
                m.c().a(f3689j, String.format("Releasing wakelock %s for WorkSpec %s", this.f3697h, this.f3692c), new Throwable[0]);
                this.f3697h.release();
            }
        }
    }

    @Override // g3.a
    public final void c(String str, boolean z10) {
        m.c().a(f3689j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        b();
        if (z10) {
            Intent b10 = a.b(this.f3690a, this.f3692c);
            d dVar = this.f3693d;
            dVar.e(new d.b(this.f3691b, b10, dVar));
        }
        if (this.f3698i) {
            Intent intent = new Intent(this.f3690a, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            d dVar2 = this.f3693d;
            dVar2.e(new d.b(this.f3691b, intent, dVar2));
        }
    }

    public final void d() {
        this.f3697h = p3.m.a(this.f3690a, String.format("%s (%s)", this.f3692c, Integer.valueOf(this.f3691b)));
        m c10 = m.c();
        String str = f3689j;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f3697h, this.f3692c), new Throwable[0]);
        this.f3697h.acquire();
        p h10 = ((o3.r) this.f3693d.f3704e.f14895c.w()).h(this.f3692c);
        if (h10 == null) {
            g();
            return;
        }
        boolean b10 = h10.b();
        this.f3698i = b10;
        if (!b10) {
            m.c().a(str, String.format("No constraints for %s", this.f3692c), new Throwable[0]);
            f(Collections.singletonList(this.f3692c));
            return;
        }
        this.f3694e.b(Collections.singletonList(h10));
    }

    @Override // k3.c
    public final void e(ArrayList arrayList) {
        g();
    }

    @Override // k3.c
    public final void f(List<String> list) {
        if (!list.contains(this.f3692c)) {
            return;
        }
        synchronized (this.f3695f) {
            if (this.f3696g == 0) {
                this.f3696g = 1;
                m.c().a(f3689j, String.format("onAllConstraintsMet for %s", this.f3692c), new Throwable[0]);
                if (this.f3693d.f3703d.f(this.f3692c, null)) {
                    this.f3693d.f3702c.a(this.f3692c, this);
                } else {
                    b();
                }
            } else {
                m.c().a(f3689j, String.format("Already started work for %s", this.f3692c), new Throwable[0]);
            }
        }
    }

    public final void g() {
        synchronized (this.f3695f) {
            if (this.f3696g < 2) {
                this.f3696g = 2;
                m c10 = m.c();
                String str = f3689j;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f3692c), new Throwable[0]);
                Context context = this.f3690a;
                String str2 = this.f3692c;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d dVar = this.f3693d;
                dVar.e(new d.b(this.f3691b, intent, dVar));
                if (this.f3693d.f3703d.d(this.f3692c)) {
                    m.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f3692c), new Throwable[0]);
                    Intent b10 = a.b(this.f3690a, this.f3692c);
                    d dVar2 = this.f3693d;
                    dVar2.e(new d.b(this.f3691b, b10, dVar2));
                } else {
                    m.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f3692c), new Throwable[0]);
                }
            } else {
                m.c().a(f3689j, String.format("Already stopped work for %s", this.f3692c), new Throwable[0]);
            }
        }
    }
}
