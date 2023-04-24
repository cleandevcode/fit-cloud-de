package o3;

import android.database.Cursor;
import java.util.ArrayList;
import m2.a0;
import m2.y;
import o3.p;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a */
    public final m2.t f22645a;

    /* renamed from: b */
    public final a f22646b;

    /* renamed from: c */
    public final b f22647c;

    /* renamed from: d */
    public final c f22648d;

    /* renamed from: e */
    public final d f22649e;

    /* renamed from: f */
    public final e f22650f;

    /* renamed from: g */
    public final f f22651g;

    /* renamed from: h */
    public final g f22652h;

    /* renamed from: i */
    public final h f22653i;

    /* loaded from: classes.dex */
    public class a extends m2.i<p> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:204:0x01cd  */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r3v28 */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.io.ObjectOutputStream] */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // m2.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(r2.f r17, o3.p r18) {
            /*
                Method dump skipped, instructions count: 519
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o3.r.a.d(r2.f, java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public class b extends a0 {
        public b(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends a0 {
        public c(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class d extends a0 {
        public d(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class e extends a0 {
        public e(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class f extends a0 {
        public f(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class g extends a0 {
        public g(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class h extends a0 {
        public h(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    public class i extends a0 {
        public i(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(m2.t tVar) {
        this.f22645a = tVar;
        this.f22646b = new a(tVar);
        this.f22647c = new b(tVar);
        this.f22648d = new c(tVar);
        this.f22649e = new d(tVar);
        this.f22650f = new e(tVar);
        this.f22651g = new f(tVar);
        this.f22652h = new g(tVar);
        this.f22653i = new h(tVar);
        new i(tVar);
    }

    public final void a(String str) {
        this.f22645a.b();
        r2.f a10 = this.f22647c.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f22645a.c();
        try {
            a10.r();
            this.f22645a.p();
        } finally {
            this.f22645a.l();
            this.f22647c.c(a10);
        }
    }

    public final ArrayList b() {
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        y h10 = y.h(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        h10.H(1, 200);
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
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
            int i10 = o23;
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String string = r10.getString(o18);
                int i11 = o18;
                String string2 = r10.getString(o20);
                int i12 = o20;
                f3.c cVar = new f3.c();
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
                int i14 = o11;
                cVar.f14071f = r10.getLong(o15);
                cVar.f14072g = r10.getLong(o16);
                cVar.f14073h = v.a(r10.getBlob(o17));
                p pVar = new p(string, string2);
                pVar.f22626b = v.e(r10.getInt(o19));
                pVar.f22628d = r10.getString(o21);
                pVar.f22629e = androidx.work.b.a(r10.getBlob(o22));
                int i15 = i10;
                pVar.f22630f = androidx.work.b.a(r10.getBlob(i15));
                int i16 = o22;
                i10 = i15;
                int i17 = o24;
                pVar.f22631g = r10.getLong(i17);
                o24 = i17;
                int i18 = o12;
                int i19 = o25;
                pVar.f22632h = r10.getLong(i19);
                o25 = i19;
                int i20 = o26;
                pVar.f22633i = r10.getLong(i20);
                int i21 = o27;
                pVar.f22635k = r10.getInt(i21);
                int i22 = o28;
                o27 = i21;
                pVar.f22636l = v.b(r10.getInt(i22));
                o26 = i20;
                int i23 = o29;
                pVar.f22637m = r10.getLong(i23);
                o29 = i23;
                int i24 = o30;
                pVar.f22638n = r10.getLong(i24);
                o30 = i24;
                int i25 = o31;
                pVar.f22639o = r10.getLong(i25);
                o31 = i25;
                int i26 = o32;
                pVar.f22640p = r10.getLong(i26);
                int i27 = o33;
                if (r10.getInt(i27) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f22641q = z14;
                int i28 = o34;
                o33 = i27;
                pVar.f22642r = v.d(r10.getInt(i28));
                pVar.f22634j = cVar;
                arrayList.add(pVar);
                o34 = i28;
                o32 = i26;
                o22 = i16;
                o18 = i11;
                o20 = i12;
                o10 = i13;
                o11 = i14;
                o28 = i22;
                o12 = i18;
            }
            r10.close();
            yVar.j();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            r10.close();
            yVar.j();
            throw th;
        }
    }

    public final ArrayList c(int i10) {
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        y h10 = y.h(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        h10.H(1, i10);
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
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
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String string = r10.getString(o18);
                int i12 = o18;
                String string2 = r10.getString(o20);
                int i13 = o20;
                f3.c cVar = new f3.c();
                int i14 = o10;
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
                int i15 = o11;
                cVar.f14071f = r10.getLong(o15);
                cVar.f14072g = r10.getLong(o16);
                cVar.f14073h = v.a(r10.getBlob(o17));
                p pVar = new p(string, string2);
                pVar.f22626b = v.e(r10.getInt(o19));
                pVar.f22628d = r10.getString(o21);
                pVar.f22629e = androidx.work.b.a(r10.getBlob(o22));
                int i16 = i11;
                pVar.f22630f = androidx.work.b.a(r10.getBlob(i16));
                int i17 = o24;
                int i18 = o22;
                i11 = i16;
                pVar.f22631g = r10.getLong(i17);
                int i19 = o12;
                int i20 = o25;
                pVar.f22632h = r10.getLong(i20);
                o25 = i20;
                int i21 = o26;
                pVar.f22633i = r10.getLong(i21);
                int i22 = o27;
                pVar.f22635k = r10.getInt(i22);
                int i23 = o28;
                o27 = i22;
                pVar.f22636l = v.b(r10.getInt(i23));
                o26 = i21;
                int i24 = o29;
                pVar.f22637m = r10.getLong(i24);
                o29 = i24;
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
                o33 = i28;
                pVar.f22642r = v.d(r10.getInt(i29));
                pVar.f22634j = cVar;
                arrayList.add(pVar);
                o22 = i18;
                o34 = i29;
                o32 = i27;
                o24 = i17;
                o18 = i12;
                o20 = i13;
                o10 = i14;
                o11 = i15;
                o28 = i23;
                o12 = i19;
            }
            r10.close();
            yVar.j();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            r10.close();
            yVar.j();
            throw th;
        }
    }

    public final ArrayList d() {
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        y h10 = y.h(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
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
            int i10 = o23;
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String string = r10.getString(o18);
                int i11 = o18;
                String string2 = r10.getString(o20);
                int i12 = o20;
                f3.c cVar = new f3.c();
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
                int i14 = o11;
                cVar.f14071f = r10.getLong(o15);
                cVar.f14072g = r10.getLong(o16);
                cVar.f14073h = v.a(r10.getBlob(o17));
                p pVar = new p(string, string2);
                pVar.f22626b = v.e(r10.getInt(o19));
                pVar.f22628d = r10.getString(o21);
                pVar.f22629e = androidx.work.b.a(r10.getBlob(o22));
                int i15 = i10;
                pVar.f22630f = androidx.work.b.a(r10.getBlob(i15));
                int i16 = o22;
                i10 = i15;
                int i17 = o24;
                pVar.f22631g = r10.getLong(i17);
                o24 = i17;
                int i18 = o12;
                int i19 = o25;
                pVar.f22632h = r10.getLong(i19);
                o25 = i19;
                int i20 = o26;
                pVar.f22633i = r10.getLong(i20);
                int i21 = o27;
                pVar.f22635k = r10.getInt(i21);
                int i22 = o28;
                o27 = i21;
                pVar.f22636l = v.b(r10.getInt(i22));
                o26 = i20;
                int i23 = o29;
                pVar.f22637m = r10.getLong(i23);
                o29 = i23;
                int i24 = o30;
                pVar.f22638n = r10.getLong(i24);
                o30 = i24;
                int i25 = o31;
                pVar.f22639o = r10.getLong(i25);
                o31 = i25;
                int i26 = o32;
                pVar.f22640p = r10.getLong(i26);
                int i27 = o33;
                if (r10.getInt(i27) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f22641q = z14;
                int i28 = o34;
                o33 = i27;
                pVar.f22642r = v.d(r10.getInt(i28));
                pVar.f22634j = cVar;
                arrayList.add(pVar);
                o34 = i28;
                o32 = i26;
                o22 = i16;
                o18 = i11;
                o20 = i12;
                o10 = i13;
                o11 = i14;
                o28 = i22;
                o12 = i18;
            }
            r10.close();
            yVar.j();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            r10.close();
            yVar.j();
            throw th;
        }
    }

    public final ArrayList e() {
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        y h10 = y.h(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
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
            int i10 = o23;
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String string = r10.getString(o18);
                int i11 = o18;
                String string2 = r10.getString(o20);
                int i12 = o20;
                f3.c cVar = new f3.c();
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
                int i14 = o11;
                cVar.f14071f = r10.getLong(o15);
                cVar.f14072g = r10.getLong(o16);
                cVar.f14073h = v.a(r10.getBlob(o17));
                p pVar = new p(string, string2);
                pVar.f22626b = v.e(r10.getInt(o19));
                pVar.f22628d = r10.getString(o21);
                pVar.f22629e = androidx.work.b.a(r10.getBlob(o22));
                int i15 = i10;
                pVar.f22630f = androidx.work.b.a(r10.getBlob(i15));
                int i16 = o22;
                i10 = i15;
                int i17 = o24;
                pVar.f22631g = r10.getLong(i17);
                o24 = i17;
                int i18 = o12;
                int i19 = o25;
                pVar.f22632h = r10.getLong(i19);
                o25 = i19;
                int i20 = o26;
                pVar.f22633i = r10.getLong(i20);
                int i21 = o27;
                pVar.f22635k = r10.getInt(i21);
                int i22 = o28;
                o27 = i21;
                pVar.f22636l = v.b(r10.getInt(i22));
                o26 = i20;
                int i23 = o29;
                pVar.f22637m = r10.getLong(i23);
                o29 = i23;
                int i24 = o30;
                pVar.f22638n = r10.getLong(i24);
                o30 = i24;
                int i25 = o31;
                pVar.f22639o = r10.getLong(i25);
                o31 = i25;
                int i26 = o32;
                pVar.f22640p = r10.getLong(i26);
                int i27 = o33;
                if (r10.getInt(i27) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f22641q = z14;
                int i28 = o34;
                o33 = i27;
                pVar.f22642r = v.d(r10.getInt(i28));
                pVar.f22634j = cVar;
                arrayList.add(pVar);
                o34 = i28;
                o32 = i26;
                o22 = i16;
                o18 = i11;
                o20 = i12;
                o10 = i13;
                o11 = i14;
                o28 = i22;
                o12 = i18;
            }
            r10.close();
            yVar.j();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            r10.close();
            yVar.j();
            throw th;
        }
    }

    public final f3.s f(String str) {
        y h10 = y.h(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
        try {
            return r10.moveToFirst() ? v.e(r10.getInt(0)) : null;
        } finally {
            r10.close();
            h10.j();
        }
    }

    public final ArrayList g(String str) {
        y h10 = y.h(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                arrayList.add(r10.getString(0));
            }
            return arrayList;
        } finally {
            r10.close();
            h10.j();
        }
    }

    public final p h(String str) {
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
        p pVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        y h10 = y.h(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
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
            if (r10.moveToFirst()) {
                String string = r10.getString(o18);
                String string2 = r10.getString(o20);
                f3.c cVar = new f3.c();
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
                cVar.f14071f = r10.getLong(o15);
                cVar.f14072g = r10.getLong(o16);
                cVar.f14073h = v.a(r10.getBlob(o17));
                pVar = new p(string, string2);
                pVar.f22626b = v.e(r10.getInt(o19));
                pVar.f22628d = r10.getString(o21);
                pVar.f22629e = androidx.work.b.a(r10.getBlob(o22));
                pVar.f22630f = androidx.work.b.a(r10.getBlob(o23));
                pVar.f22631g = r10.getLong(o24);
                pVar.f22632h = r10.getLong(o25);
                pVar.f22633i = r10.getLong(o26);
                pVar.f22635k = r10.getInt(o27);
                pVar.f22636l = v.b(r10.getInt(o28));
                pVar.f22637m = r10.getLong(o29);
                pVar.f22638n = r10.getLong(o30);
                pVar.f22639o = r10.getLong(o31);
                pVar.f22640p = r10.getLong(o32);
                if (r10.getInt(o33) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                pVar.f22641q = z14;
                pVar.f22642r = v.d(r10.getInt(o34));
                pVar.f22634j = cVar;
            } else {
                pVar = null;
            }
            r10.close();
            yVar.j();
            return pVar;
        } catch (Throwable th3) {
            th = th3;
            r10.close();
            yVar.j();
            throw th;
        }
    }

    public final ArrayList i(String str) {
        y h10 = y.h(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            h10.m0(1);
        } else {
            h10.p(1, str);
        }
        this.f22645a.b();
        Cursor r10 = o8.b.r(this.f22645a, h10);
        try {
            int o10 = p.b.o(r10, "id");
            int o11 = p.b.o(r10, "state");
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                p.a aVar = new p.a();
                aVar.f22643a = r10.getString(o10);
                aVar.f22644b = v.e(r10.getInt(o11));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            r10.close();
            h10.j();
        }
    }

    public final int j(String str) {
        this.f22645a.b();
        r2.f a10 = this.f22650f.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f22645a.c();
        try {
            int r10 = a10.r();
            this.f22645a.p();
            return r10;
        } finally {
            this.f22645a.l();
            this.f22650f.c(a10);
        }
    }

    public final int k(long j10, String str) {
        this.f22645a.b();
        r2.f a10 = this.f22652h.a();
        a10.H(1, j10);
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f22645a.c();
        try {
            int r10 = a10.r();
            this.f22645a.p();
            return r10;
        } finally {
            this.f22645a.l();
            this.f22652h.c(a10);
        }
    }

    public final int l(String str) {
        this.f22645a.b();
        r2.f a10 = this.f22651g.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f22645a.c();
        try {
            int r10 = a10.r();
            this.f22645a.p();
            return r10;
        } finally {
            this.f22645a.l();
            this.f22651g.c(a10);
        }
    }

    public final void m(String str, androidx.work.b bVar) {
        this.f22645a.b();
        r2.f a10 = this.f22648d.a();
        byte[] b10 = androidx.work.b.b(bVar);
        if (b10 == null) {
            a10.m0(1);
        } else {
            a10.Q(1, b10);
        }
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f22645a.c();
        try {
            a10.r();
            this.f22645a.p();
        } finally {
            this.f22645a.l();
            this.f22648d.c(a10);
        }
    }

    public final void n(long j10, String str) {
        this.f22645a.b();
        r2.f a10 = this.f22649e.a();
        a10.H(1, j10);
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f22645a.c();
        try {
            a10.r();
            this.f22645a.p();
        } finally {
            this.f22645a.l();
            this.f22649e.c(a10);
        }
    }

    public final int o(f3.s sVar, String... strArr) {
        this.f22645a.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE workspec SET state=");
        sb2.append("?");
        sb2.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("?");
            if (i10 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        r2.f d10 = this.f22645a.d(sb2.toString());
        d10.H(1, v.f(sVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.m0(i11);
            } else {
                d10.p(i11, str);
            }
            i11++;
        }
        this.f22645a.c();
        try {
            int r10 = d10.r();
            this.f22645a.p();
            return r10;
        } finally {
            this.f22645a.l();
        }
    }
}
