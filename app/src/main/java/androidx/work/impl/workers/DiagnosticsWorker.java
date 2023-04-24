package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f3.c;
import f3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m2.y;
import o3.g;
import o3.h;
import o3.i;
import o3.k;
import o3.l;
import o3.p;
import o3.q;
import o3.r;
import o3.t;
import o3.u;
import o3.v;
import o8.b;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: g */
    public static final String f3747g = m.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String i(k kVar, t tVar, h hVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", str));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g a10 = ((i) hVar).a(pVar.f22625a);
            Integer num = null;
            if (a10 != null) {
                num = Integer.valueOf(a10.f22613b);
            }
            String str2 = pVar.f22625a;
            l lVar = (l) kVar;
            lVar.getClass();
            y h10 = y.h(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                h10.m0(1);
            } else {
                h10.p(1, str2);
            }
            lVar.f22619a.b();
            Cursor r10 = b.r(lVar.f22619a, h10);
            try {
                ArrayList arrayList2 = new ArrayList(r10.getCount());
                while (r10.moveToNext()) {
                    arrayList2.add(r10.getString(0));
                }
                r10.close();
                h10.j();
                sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f22625a, pVar.f22627c, num, pVar.f22626b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ((u) tVar).a(pVar.f22625a))));
            } catch (Throwable th2) {
                r10.close();
                h10.j();
                throw th2;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a.c h() {
        y yVar;
        int o10;
        int o11;
        int o12;
        int o13;
        int o14;
        int o15;
        int o16;
        int o17;
        int o18;
        int o19;
        int o20;
        int o21;
        int o22;
        int o23;
        ArrayList arrayList;
        h hVar;
        k kVar;
        t tVar;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WorkDatabase workDatabase = g3.l.d(this.f3618a).f14895c;
        q w10 = workDatabase.w();
        k u10 = workDatabase.u();
        t x10 = workDatabase.x();
        h t10 = workDatabase.t();
        r rVar = (r) w10;
        rVar.getClass();
        y h10 = y.h(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        h10.H(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        rVar.f22645a.b();
        Cursor r10 = b.r(rVar.f22645a, h10);
        try {
            o10 = p.b.o(r10, "required_network_type");
            o11 = p.b.o(r10, "requires_charging");
            o12 = p.b.o(r10, "requires_device_idle");
            o13 = p.b.o(r10, "requires_battery_not_low");
            o14 = p.b.o(r10, "requires_storage_not_low");
            o15 = p.b.o(r10, "trigger_content_update_delay");
            o16 = p.b.o(r10, "trigger_max_content_delay");
            o17 = p.b.o(r10, "content_uri_triggers");
            o18 = p.b.o(r10, "id");
            o19 = p.b.o(r10, "state");
            o20 = p.b.o(r10, "worker_class_name");
            o21 = p.b.o(r10, "input_merger_class_name");
            o22 = p.b.o(r10, "input");
            o23 = p.b.o(r10, "output");
            yVar = h10;
        } catch (Throwable th2) {
            th = th2;
            yVar = h10;
        }
        try {
            int o24 = p.b.o(r10, "initial_delay");
            int o25 = p.b.o(r10, "interval_duration");
            int o26 = p.b.o(r10, "flex_duration");
            int o27 = p.b.o(r10, "run_attempt_count");
            int o28 = p.b.o(r10, "backoff_policy");
            int o29 = p.b.o(r10, "backoff_delay_duration");
            int o30 = p.b.o(r10, "period_start_time");
            int o31 = p.b.o(r10, "minimum_retention_duration");
            int o32 = p.b.o(r10, "schedule_requested_at");
            int o33 = p.b.o(r10, "run_in_foreground");
            int o34 = p.b.o(r10, "out_of_quota_policy");
            int i11 = o23;
            ArrayList arrayList2 = new ArrayList(r10.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!r10.moveToNext()) {
                    break;
                }
                String string = r10.getString(o18);
                String string2 = r10.getString(o20);
                int i12 = o20;
                c cVar = new c();
                int i13 = o10;
                cVar.f14066a = v.c(r10.getInt(o10));
                if (r10.getInt(o11) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f14067b = z10;
                if (r10.getInt(o12) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cVar.f14068c = z11;
                if (r10.getInt(o13) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                cVar.f14069d = z12;
                if (r10.getInt(o14) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                cVar.f14070e = z13;
                int i14 = o18;
                cVar.f14071f = r10.getLong(o15);
                cVar.f14072g = r10.getLong(o16);
                cVar.f14073h = v.a(r10.getBlob(o17));
                p pVar = new p(string, string2);
                pVar.f22626b = v.e(r10.getInt(o19));
                pVar.f22628d = r10.getString(o21);
                pVar.f22629e = androidx.work.b.a(r10.getBlob(o22));
                int i15 = i11;
                pVar.f22630f = androidx.work.b.a(r10.getBlob(i15));
                int i16 = o19;
                i11 = i15;
                int i17 = o24;
                pVar.f22631g = r10.getLong(i17);
                int i18 = o21;
                int i19 = o25;
                pVar.f22632h = r10.getLong(i19);
                int i20 = o22;
                int i21 = o26;
                pVar.f22633i = r10.getLong(i21);
                int i22 = o27;
                pVar.f22635k = r10.getInt(i22);
                int i23 = o28;
                pVar.f22636l = v.b(r10.getInt(i23));
                o26 = i21;
                int i24 = o29;
                pVar.f22637m = r10.getLong(i24);
                int i25 = o30;
                pVar.f22638n = r10.getLong(i25);
                o30 = i25;
                int i26 = o31;
                pVar.f22639o = r10.getLong(i26);
                o31 = i26;
                int i27 = o32;
                pVar.f22640p = r10.getLong(i27);
                int i28 = o33;
                if (r10.getInt(i28) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f22641q = z14;
                int i29 = o34;
                pVar.f22642r = v.d(r10.getInt(i29));
                pVar.f22634j = cVar;
                arrayList.add(pVar);
                o34 = i29;
                o19 = i16;
                o21 = i18;
                o32 = i27;
                o10 = i13;
                arrayList2 = arrayList;
                o33 = i28;
                o24 = i17;
                o20 = i12;
                o18 = i14;
                o29 = i24;
                o22 = i20;
                o25 = i19;
                o27 = i22;
                o28 = i23;
            }
            r10.close();
            yVar.j();
            ArrayList d10 = rVar.d();
            ArrayList b10 = rVar.b();
            if (!arrayList.isEmpty()) {
                m c10 = m.c();
                String str = f3747g;
                i10 = 0;
                c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
                hVar = t10;
                kVar = u10;
                tVar = x10;
                m.c().d(str, i(kVar, tVar, hVar, arrayList), new Throwable[0]);
            } else {
                hVar = t10;
                kVar = u10;
                tVar = x10;
                i10 = 0;
            }
            if (!d10.isEmpty()) {
                m c11 = m.c();
                String str2 = f3747g;
                c11.d(str2, "Running work:\n\n", new Throwable[i10]);
                m.c().d(str2, i(kVar, tVar, hVar, d10), new Throwable[i10]);
            }
            if (!b10.isEmpty()) {
                m c12 = m.c();
                String str3 = f3747g;
                c12.d(str3, "Enqueued work:\n\n", new Throwable[i10]);
                m.c().d(str3, i(kVar, tVar, hVar, b10), new Throwable[i10]);
            }
            return new ListenableWorker.a.c();
        } catch (Throwable th3) {
            th = th3;
            r10.close();
            yVar.j();
            throw th;
        }
    }
}
