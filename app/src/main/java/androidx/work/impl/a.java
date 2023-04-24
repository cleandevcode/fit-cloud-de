package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.appcompat.widget.e2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static C0038a f3662a = new C0038a();

    /* renamed from: b */
    public static b f3663b = new b();

    /* renamed from: c */
    public static c f3664c = new c();

    /* renamed from: d */
    public static d f3665d = new d();

    /* renamed from: e */
    public static e f3666e = new e();

    /* renamed from: f */
    public static f f3667f = new f();

    /* renamed from: g */
    public static g f3668g = new g();

    /* renamed from: androidx.work.impl.a$a */
    /* loaded from: classes.dex */
    public class C0038a extends n2.a {
        public C0038a() {
            super(1, 2);
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo", "DROP TABLE IF EXISTS alarmInfo", "INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    public class b extends n2.a {
        public b() {
            super(3, 4);
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                aVar.o("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends n2.a {
        public c() {
            super(4, 5);
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            aVar.o("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar.o("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    public class d extends n2.a {
        public d() {
            super(6, 7);
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            aVar.o("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    public class e extends n2.a {
        public e() {
            super(7, 8);
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            aVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    public class f extends n2.a {
        public f() {
            super(8, 9);
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            aVar.o("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public class g extends n2.a {
        public g() {
            super(11, 12);
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            aVar.o("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends n2.a {

        /* renamed from: c */
        public final Context f3669c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f3669c = context;
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            if (this.f21931b >= 10) {
                aVar.a(new Object[]{"reschedule_needed", 1});
            } else {
                this.f3669c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends n2.a {

        /* renamed from: c */
        public final Context f3670c;

        public i(Context context) {
            super(9, 10);
            this.f3670c = context;
        }

        @Override // n2.a
        public final void a(s2.a aVar) {
            aVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f3670c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j10 = 0;
                long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j10 = 1;
                }
                aVar.i();
                try {
                    aVar.a(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                    aVar.a(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                    sharedPreferences.edit().clear().apply();
                    aVar.K();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = this.f3670c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar.i();
                try {
                    aVar.a(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                    aVar.a(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                    sharedPreferences2.edit().clear().apply();
                    aVar.K();
                } finally {
                }
            }
        }
    }
}
