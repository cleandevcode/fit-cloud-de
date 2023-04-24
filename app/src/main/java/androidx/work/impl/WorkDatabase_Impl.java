package androidx.work.impl;

import a0.s1;
import android.content.Context;
import androidx.appcompat.widget.e2;
import g3.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import m2.g;
import m2.m;
import m2.t;
import m2.x;
import o3.c;
import o3.e;
import o3.f;
import o3.h;
import o3.i;
import o3.k;
import o3.l;
import o3.n;
import o3.o;
import o3.q;
import o3.r;
import o3.u;
import o8.b;
import p2.a;
import r2.c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: v */
    public static final /* synthetic */ int f3653v = 0;

    /* renamed from: o */
    public volatile r f3654o;

    /* renamed from: p */
    public volatile c f3655p;

    /* renamed from: q */
    public volatile u f3656q;

    /* renamed from: r */
    public volatile i f3657r;

    /* renamed from: s */
    public volatile l f3658s;

    /* renamed from: t */
    public volatile o f3659t;

    /* renamed from: u */
    public volatile f f3660u;

    /* loaded from: classes.dex */
    public class a extends x.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(12);
            WorkDatabase_Impl.this = r1;
        }

        @Override // m2.x.a
        public final void a(s2.a aVar) {
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            e2.b(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // m2.x.a
        public final void b(s2.a aVar) {
            e2.b(aVar, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.o("DROP TABLE IF EXISTS `WorkName`");
            aVar.o("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.o("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f3653v;
            List<? extends t.b> list = workDatabase_Impl.f20267g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.f20267g.get(i11).getClass();
                }
            }
        }

        @Override // m2.x.a
        public final void c(s2.a aVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f3653v;
            List<? extends t.b> list = workDatabase_Impl.f20267g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.f20267g.get(i11).getClass();
                    gm.l.f(aVar, "db");
                }
            }
        }

        @Override // m2.x.a
        public final void d(s2.a aVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f3653v;
            workDatabase_Impl.f20261a = aVar;
            aVar.o("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(aVar);
            List<? extends t.b> list = WorkDatabase_Impl.this.f20267g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.f20267g.get(i11).a(aVar);
                }
            }
        }

        @Override // m2.x.a
        public final void e() {
        }

        @Override // m2.x.a
        public final void f(s2.a aVar) {
            b.k(aVar);
        }

        @Override // m2.x.a
        public final x.b g(s2.a aVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new a.C0427a("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet a10 = j.a(hashMap, "prerequisite_id", new a.C0427a("prerequisite_id", "TEXT", true, 2, null, 1), 2);
            a10.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            a10.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new a.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
            hashSet.add(new a.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
            p2.a aVar2 = new p2.a("Dependency", hashMap, a10, hashSet);
            p2.a a11 = p2.a.a(aVar, "Dependency");
            if (!aVar2.equals(a11)) {
                return new x.b(s1.f("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", aVar2, "\n Found:\n", a11), false);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new a.C0427a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new a.C0427a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new a.C0427a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new a.C0427a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new a.C0427a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new a.C0427a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new a.C0427a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new a.C0427a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new a.C0427a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new a.C0427a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new a.C0427a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new a.C0427a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new a.C0427a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new a.C0427a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new a.C0427a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new a.C0427a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new a.C0427a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new a.C0427a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new a.C0427a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new a.C0427a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new a.C0427a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new a.C0427a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new a.C0427a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new a.C0427a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            HashSet a12 = j.a(hashMap2, "content_uri_triggers", new a.C0427a("content_uri_triggers", "BLOB", false, 0, null, 1), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new a.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
            hashSet2.add(new a.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
            p2.a aVar3 = new p2.a("WorkSpec", hashMap2, a12, hashSet2);
            p2.a a13 = p2.a.a(aVar, "WorkSpec");
            if (!aVar3.equals(a13)) {
                return new x.b(s1.f("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", aVar3, "\n Found:\n", a13), false);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new a.C0427a("tag", "TEXT", true, 1, null, 1));
            HashSet a14 = j.a(hashMap3, "work_spec_id", new a.C0427a("work_spec_id", "TEXT", true, 2, null, 1), 1);
            a14.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new a.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
            p2.a aVar4 = new p2.a("WorkTag", hashMap3, a14, hashSet3);
            p2.a a15 = p2.a.a(aVar, "WorkTag");
            if (!aVar4.equals(a15)) {
                return new x.b(s1.f("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", aVar4, "\n Found:\n", a15), false);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new a.C0427a("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet a16 = j.a(hashMap4, "system_id", new a.C0427a("system_id", "INTEGER", true, 0, null, 1), 1);
            a16.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p2.a aVar5 = new p2.a("SystemIdInfo", hashMap4, a16, new HashSet(0));
            p2.a a17 = p2.a.a(aVar, "SystemIdInfo");
            if (!aVar5.equals(a17)) {
                return new x.b(s1.f("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", aVar5, "\n Found:\n", a17), false);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new a.C0427a("name", "TEXT", true, 1, null, 1));
            HashSet a18 = j.a(hashMap5, "work_spec_id", new a.C0427a("work_spec_id", "TEXT", true, 2, null, 1), 1);
            a18.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new a.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
            p2.a aVar6 = new p2.a("WorkName", hashMap5, a18, hashSet4);
            p2.a a19 = p2.a.a(aVar, "WorkName");
            if (!aVar6.equals(a19)) {
                return new x.b(s1.f("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", aVar6, "\n Found:\n", a19), false);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new a.C0427a("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet a20 = j.a(hashMap6, "progress", new a.C0427a("progress", "BLOB", true, 0, null, 1), 1);
            a20.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p2.a aVar7 = new p2.a("WorkProgress", hashMap6, a20, new HashSet(0));
            p2.a a21 = p2.a.a(aVar, "WorkProgress");
            if (!aVar7.equals(a21)) {
                return new x.b(s1.f("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", aVar7, "\n Found:\n", a21), false);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new a.C0427a("key", "TEXT", true, 1, null, 1));
            p2.a aVar8 = new p2.a("Preference", hashMap7, j.a(hashMap7, "long_value", new a.C0427a("long_value", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
            p2.a a22 = p2.a.a(aVar, "Preference");
            return !aVar8.equals(a22) ? new x.b(s1.f("Preference(androidx.work.impl.model.Preference).\n Expected:\n", aVar8, "\n Found:\n", a22), false) : new x.b(null, true);
        }
    }

    @Override // m2.t
    public final m e() {
        return new m(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // m2.t
    public final r2.c f(g gVar) {
        x xVar = new x(gVar, new a(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = gVar.f20194a;
        String str = gVar.f20195b;
        if (context != null) {
            return gVar.f20196c.a(new c.b(context, str, xVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o3.b r() {
        o3.c cVar;
        if (this.f3655p != null) {
            return this.f3655p;
        }
        synchronized (this) {
            if (this.f3655p == null) {
                this.f3655p = new o3.c(this);
            }
            cVar = this.f3655p;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e s() {
        f fVar;
        if (this.f3660u != null) {
            return this.f3660u;
        }
        synchronized (this) {
            if (this.f3660u == null) {
                this.f3660u = new f(this);
            }
            fVar = this.f3660u;
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h t() {
        i iVar;
        if (this.f3657r != null) {
            return this.f3657r;
        }
        synchronized (this) {
            if (this.f3657r == null) {
                this.f3657r = new i(this);
            }
            iVar = this.f3657r;
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k u() {
        l lVar;
        if (this.f3658s != null) {
            return this.f3658s;
        }
        synchronized (this) {
            if (this.f3658s == null) {
                this.f3658s = new l(this);
            }
            lVar = this.f3658s;
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n v() {
        o oVar;
        if (this.f3659t != null) {
            return this.f3659t;
        }
        synchronized (this) {
            if (this.f3659t == null) {
                this.f3659t = new o(this);
            }
            oVar = this.f3659t;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q w() {
        r rVar;
        if (this.f3654o != null) {
            return this.f3654o;
        }
        synchronized (this) {
            if (this.f3654o == null) {
                this.f3654o = new r(this);
            }
            rVar = this.f3654o;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o3.t x() {
        u uVar;
        if (this.f3656q != null) {
            return this.f3656q;
        }
        synchronized (this) {
            if (this.f3656q == null) {
                this.f3656q = new u(this);
            }
            uVar = this.f3656q;
        }
        return uVar;
    }
}
