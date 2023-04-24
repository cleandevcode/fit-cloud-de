package com.topstep.fitcloud.pro.shared.data.db;

import a0.s1;
import android.content.Context;
import androidx.appcompat.widget.e2;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import g3.j;
import gm.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.g;
import m2.m;
import m2.t;
import m2.x;
import mg.a1;
import mg.a3;
import mg.a6;
import mg.b1;
import mg.c3;
import mg.c6;
import mg.c7;
import mg.d7;
import mg.d9;
import mg.e;
import mg.e1;
import mg.e9;
import mg.h1;
import mg.h7;
import mg.hb;
import mg.i0;
import mg.j0;
import mg.j3;
import mg.l9;
import mg.la;
import mg.ma;
import mg.p3;
import mg.pa;
import mg.s8;
import mg.sa;
import mg.sb;
import mg.t3;
import mg.v7;
import mg.w1;
import mg.w3;
import mg.wa;
import mg.x4;
import mg.y4;
import mg.z1;
import o8.b;
import p2.a;
import r2.c;

/* loaded from: classes2.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public volatile w1 A;
    public volatile h7 B;
    public volatile t3 C;
    public volatile j3 D;

    /* renamed from: n */
    public volatile sb f10053n;

    /* renamed from: o */
    public volatile wa f10054o;

    /* renamed from: p */
    public volatile e9 f10055p;

    /* renamed from: q */
    public volatile pa f10056q;

    /* renamed from: r */
    public volatile a1 f10057r;

    /* renamed from: s */
    public volatile e1 f10058s;

    /* renamed from: t */
    public volatile s8 f10059t;

    /* renamed from: u */
    public volatile c7 f10060u;

    /* renamed from: v */
    public volatile a3 f10061v;

    /* renamed from: w */
    public volatile x4 f10062w;

    /* renamed from: x */
    public volatile i0 f10063x;

    /* renamed from: y */
    public volatile la f10064y;

    /* renamed from: z */
    public volatile a6 f10065z;

    /* loaded from: classes2.dex */
    public class a extends x.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(11);
            AppDatabase_Impl.this = r1;
        }

        @Override // m2.x.a
        public final void a(s2.a aVar) {
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `UserEntity` (`userId` INTEGER NOT NULL, `phone` TEXT, `email` TEXT, `nickName` TEXT NOT NULL, `sex` INTEGER NOT NULL, `birthday` TEXT NOT NULL, `height` REAL NOT NULL, `weight` REAL NOT NULL, `avatar` TEXT, `identityId` TEXT, `hasProfile` INTEGER NOT NULL, `hasPassword` INTEGER NOT NULL, `hasIdentity` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))", "CREATE TABLE IF NOT EXISTS `UnitConfigEntity` (`userId` INTEGER NOT NULL, `length` INTEGER NOT NULL, `weight` INTEGER NOT NULL, `temperature` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))", "CREATE TABLE IF NOT EXISTS `DeviceBindEntity` (`userId` INTEGER NOT NULL, `address` TEXT, `name` TEXT, `hardwareInfo` TEXT, `isUnBind` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))", "CREATE TABLE IF NOT EXISTS `ExerciseGoalEntity` (`userId` INTEGER NOT NULL, `step` INTEGER NOT NULL, `distance` REAL NOT NULL, `calorie` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `StringTypedEntity` (`userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`userId`, `type`))", "CREATE TABLE IF NOT EXISTS `UsedDialEntity` (`projectNum` TEXT NOT NULL, `dialNum` INTEGER NOT NULL, `lcd` INTEGER NOT NULL, `toolVersion` TEXT NOT NULL, `binVersion` INTEGER NOT NULL, `imgUrl` TEXT, `deviceImgUrl` TEXT, `binUrl` TEXT NOT NULL, `name` TEXT, `binSize` INTEGER NOT NULL, PRIMARY KEY(`projectNum`, `dialNum`))", "CREATE TABLE IF NOT EXISTS `CityEntity` (`cid` TEXT NOT NULL, `locality` TEXT NOT NULL, `lat` REAL, `lng` REAL, `errorCount` INTEGER NOT NULL, PRIMARY KEY(`cid`))", "CREATE TABLE IF NOT EXISTS `CityKeyEntity` (`key` TEXT NOT NULL, `cid` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`key`))");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `DeviceShellEntity` (`projectNum` TEXT NOT NULL, `time` INTEGER NOT NULL, `url` TEXT, PRIMARY KEY(`projectNum`))", "CREATE TABLE IF NOT EXISTS `StepItem` (`userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `device` TEXT NOT NULL, `step` INTEGER NOT NULL, `distance` REAL NOT NULL, `calorie` REAL NOT NULL, `transformFlag` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))", "CREATE TABLE IF NOT EXISTS `StepRecord` (`device` TEXT, `step` INTEGER NOT NULL, `distance` REAL NOT NULL, `calorie` REAL NOT NULL, `uploadFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `SleepRecord` (`userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `deepSleep` INTEGER NOT NULL, `lightSleep` INTEGER NOT NULL, `soberSleep` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `SleepDetail` (`userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `deepSleep` INTEGER NOT NULL, `lightSleep` INTEGER NOT NULL, `soberSleep` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `detail` TEXT, `uploadFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))", "CREATE TABLE IF NOT EXISTS `HeartRateItem` (`heartRate` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `uploadFlag` INTEGER NOT NULL, `transformFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))", "CREATE TABLE IF NOT EXISTS `HeartRateRecord` (`avgHeartRate` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `HeartRateSyncInfo` (`userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `OxygenItem` (`oxygen` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `uploadFlag` INTEGER NOT NULL, `transformFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))", "CREATE TABLE IF NOT EXISTS `OxygenRecord` (`avgOxygen` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `OxygenSyncInfo` (`userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `BloodPressureItem` (`sbp` INTEGER NOT NULL, `dbp` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `uploadFlag` INTEGER NOT NULL, `transformFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `BloodPressureRecord` (`avgSbp` INTEGER NOT NULL, `avgDbp` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `BloodPressureSyncInfo` (`userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `TemperatureItem` (`body` REAL NOT NULL, `wrist` REAL NOT NULL, `userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `uploadFlag` INTEGER NOT NULL, `transformFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))", "CREATE TABLE IF NOT EXISTS `TemperatureRecord` (`avgBody` REAL NOT NULL, `avgWrist` REAL NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `TemperatureSyncInfo` (`userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `PressureItem` (`pressure` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `time` TEXT NOT NULL, `uploadFlag` INTEGER NOT NULL, `transformFlag` INTEGER NOT NULL, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`userId`, `time`))", "CREATE TABLE IF NOT EXISTS `PressureRecord` (`avgPressure` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))", "CREATE TABLE IF NOT EXISTS `PressureSyncInfo` (`userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `lastModifyTime` INTEGER NOT NULL, PRIMARY KEY(`userId`, `date`))");
            e2.b(aVar, "CREATE TABLE IF NOT EXISTS `EcgRecord` (`userId` INTEGER NOT NULL, `ecgId` TEXT NOT NULL, `time` TEXT NOT NULL, `type` INTEGER NOT NULL, `sampleBase` INTEGER NOT NULL, `scaleValue` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `deviceAddress` TEXT, `detail` TEXT, `reports` TEXT, `uploadFlag` INTEGER NOT NULL, PRIMARY KEY(`ecgId`))", "CREATE TABLE IF NOT EXISTS `SportRecord` (`userId` INTEGER NOT NULL, `sportId` TEXT NOT NULL, `time` TEXT NOT NULL, `duration` INTEGER NOT NULL, `distance` REAL NOT NULL, `calorie` REAL NOT NULL, `step` INTEGER NOT NULL, `climb` REAL NOT NULL, `locationType` INTEGER NOT NULL, `sportType` INTEGER NOT NULL, `uploadFlag` INTEGER NOT NULL, PRIMARY KEY(`sportId`))", "CREATE TABLE IF NOT EXISTS `SportDetail` (`sportId` TEXT NOT NULL, `time` TEXT NOT NULL, `latLngs` TEXT, `heartRates` TEXT, PRIMARY KEY(`sportId`))", "CREATE TABLE IF NOT EXISTS `MenstruationTimeline` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `type` INTEGER NOT NULL, `extra` TEXT)");
            aVar.o("CREATE TABLE IF NOT EXISTS `NotificationOtherEntity` (`userId` INTEGER NOT NULL, `appName` TEXT NOT NULL, `packageName` TEXT NOT NULL, PRIMARY KEY(`userId`, `packageName`))");
            aVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '85d87cb5484a18a30c01e55dc58e662e')");
        }

        @Override // m2.x.a
        public final void b(s2.a aVar) {
            e2.b(aVar, "DROP TABLE IF EXISTS `UserEntity`", "DROP TABLE IF EXISTS `UnitConfigEntity`", "DROP TABLE IF EXISTS `DeviceBindEntity`", "DROP TABLE IF EXISTS `ExerciseGoalEntity`");
            e2.b(aVar, "DROP TABLE IF EXISTS `StringTypedEntity`", "DROP TABLE IF EXISTS `UsedDialEntity`", "DROP TABLE IF EXISTS `CityEntity`", "DROP TABLE IF EXISTS `CityKeyEntity`");
            e2.b(aVar, "DROP TABLE IF EXISTS `DeviceShellEntity`", "DROP TABLE IF EXISTS `StepItem`", "DROP TABLE IF EXISTS `StepRecord`", "DROP TABLE IF EXISTS `SleepRecord`");
            e2.b(aVar, "DROP TABLE IF EXISTS `SleepDetail`", "DROP TABLE IF EXISTS `HeartRateItem`", "DROP TABLE IF EXISTS `HeartRateRecord`", "DROP TABLE IF EXISTS `HeartRateSyncInfo`");
            e2.b(aVar, "DROP TABLE IF EXISTS `OxygenItem`", "DROP TABLE IF EXISTS `OxygenRecord`", "DROP TABLE IF EXISTS `OxygenSyncInfo`", "DROP TABLE IF EXISTS `BloodPressureItem`");
            e2.b(aVar, "DROP TABLE IF EXISTS `BloodPressureRecord`", "DROP TABLE IF EXISTS `BloodPressureSyncInfo`", "DROP TABLE IF EXISTS `TemperatureItem`", "DROP TABLE IF EXISTS `TemperatureRecord`");
            e2.b(aVar, "DROP TABLE IF EXISTS `TemperatureSyncInfo`", "DROP TABLE IF EXISTS `PressureItem`", "DROP TABLE IF EXISTS `PressureRecord`", "DROP TABLE IF EXISTS `PressureSyncInfo`");
            e2.b(aVar, "DROP TABLE IF EXISTS `EcgRecord`", "DROP TABLE IF EXISTS `SportRecord`", "DROP TABLE IF EXISTS `SportDetail`", "DROP TABLE IF EXISTS `MenstruationTimeline`");
            aVar.o("DROP TABLE IF EXISTS `NotificationOtherEntity`");
            List<? extends t.b> list = AppDatabase_Impl.this.f20267g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AppDatabase_Impl.this.f20267g.get(i10).getClass();
                }
            }
        }

        @Override // m2.x.a
        public final void c(s2.a aVar) {
            List<? extends t.b> list = AppDatabase_Impl.this.f20267g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AppDatabase_Impl.this.f20267g.get(i10).getClass();
                    l.f(aVar, "db");
                }
            }
        }

        @Override // m2.x.a
        public final void d(s2.a aVar) {
            AppDatabase_Impl.this.f20261a = aVar;
            AppDatabase_Impl.this.m(aVar);
            List<? extends t.b> list = AppDatabase_Impl.this.f20267g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AppDatabase_Impl.this.f20267g.get(i10).a(aVar);
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
            HashMap hashMap = new HashMap(16);
            hashMap.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap.put("phone", new a.C0427a("phone", "TEXT", false, 0, null, 1));
            hashMap.put("email", new a.C0427a("email", "TEXT", false, 0, null, 1));
            hashMap.put("nickName", new a.C0427a("nickName", "TEXT", true, 0, null, 1));
            hashMap.put("sex", new a.C0427a("sex", "INTEGER", true, 0, null, 1));
            hashMap.put("birthday", new a.C0427a("birthday", "TEXT", true, 0, null, 1));
            hashMap.put("height", new a.C0427a("height", "REAL", true, 0, null, 1));
            hashMap.put("weight", new a.C0427a("weight", "REAL", true, 0, null, 1));
            hashMap.put("avatar", new a.C0427a("avatar", "TEXT", false, 0, null, 1));
            hashMap.put("identityId", new a.C0427a("identityId", "TEXT", false, 0, null, 1));
            hashMap.put("hasProfile", new a.C0427a("hasProfile", "INTEGER", true, 0, null, 1));
            hashMap.put("hasPassword", new a.C0427a("hasPassword", "INTEGER", true, 0, null, 1));
            hashMap.put("hasIdentity", new a.C0427a("hasIdentity", "INTEGER", true, 0, null, 1));
            hashMap.put("lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1));
            hashMap.put("dirty", new a.C0427a("dirty", "INTEGER", true, 0, null, 1));
            p2.a aVar2 = new p2.a("UserEntity", hashMap, j.a(hashMap, "syncSuccessTime", new a.C0427a("syncSuccessTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a10 = p2.a.a(aVar, "UserEntity");
            if (!aVar2.equals(a10)) {
                return new x.b(s1.f("UserEntity(com.topstep.fitcloud.pro.shared.data.entity.UserEntity).\n Expected:\n", aVar2, "\n Found:\n", a10), false);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap2.put("length", new a.C0427a("length", "INTEGER", true, 0, null, 1));
            hashMap2.put("weight", new a.C0427a("weight", "INTEGER", true, 0, null, 1));
            hashMap2.put("temperature", new a.C0427a("temperature", "INTEGER", true, 0, null, 1));
            hashMap2.put("lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1));
            hashMap2.put("dirty", new a.C0427a("dirty", "INTEGER", true, 0, null, 1));
            p2.a aVar3 = new p2.a("UnitConfigEntity", hashMap2, j.a(hashMap2, "syncSuccessTime", new a.C0427a("syncSuccessTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a11 = p2.a.a(aVar, "UnitConfigEntity");
            if (!aVar3.equals(a11)) {
                return new x.b(s1.f("UnitConfigEntity(com.topstep.fitcloud.pro.shared.data.entity.UnitConfigEntity).\n Expected:\n", aVar3, "\n Found:\n", a11), false);
            }
            HashMap hashMap3 = new HashMap(8);
            hashMap3.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap3.put(InnerShareParams.ADDRESS, new a.C0427a(InnerShareParams.ADDRESS, "TEXT", false, 0, null, 1));
            hashMap3.put("name", new a.C0427a("name", "TEXT", false, 0, null, 1));
            hashMap3.put("hardwareInfo", new a.C0427a("hardwareInfo", "TEXT", false, 0, null, 1));
            hashMap3.put("isUnBind", new a.C0427a("isUnBind", "INTEGER", true, 0, null, 1));
            hashMap3.put("lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1));
            hashMap3.put("dirty", new a.C0427a("dirty", "INTEGER", true, 0, null, 1));
            p2.a aVar4 = new p2.a("DeviceBindEntity", hashMap3, j.a(hashMap3, "syncSuccessTime", new a.C0427a("syncSuccessTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a12 = p2.a.a(aVar, "DeviceBindEntity");
            if (!aVar4.equals(a12)) {
                return new x.b(s1.f("DeviceBindEntity(com.topstep.fitcloud.pro.shared.data.entity.DeviceBindEntity).\n Expected:\n", aVar4, "\n Found:\n", a12), false);
            }
            HashMap hashMap4 = new HashMap(7);
            hashMap4.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap4.put("step", new a.C0427a("step", "INTEGER", true, 0, null, 1));
            hashMap4.put("distance", new a.C0427a("distance", "REAL", true, 0, null, 1));
            hashMap4.put("calorie", new a.C0427a("calorie", "INTEGER", true, 0, null, 1));
            hashMap4.put("lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1));
            hashMap4.put("dirty", new a.C0427a("dirty", "INTEGER", true, 0, null, 1));
            p2.a aVar5 = new p2.a("ExerciseGoalEntity", hashMap4, j.a(hashMap4, "syncSuccessTime", new a.C0427a("syncSuccessTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a13 = p2.a.a(aVar, "ExerciseGoalEntity");
            if (!aVar5.equals(a13)) {
                return new x.b(s1.f("ExerciseGoalEntity(com.topstep.fitcloud.pro.shared.data.entity.ExerciseGoalEntity).\n Expected:\n", aVar5, "\n Found:\n", a13), false);
            }
            HashMap hashMap5 = new HashMap(3);
            hashMap5.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap5.put("type", new a.C0427a("type", "INTEGER", true, 2, null, 1));
            p2.a aVar6 = new p2.a("StringTypedEntity", hashMap5, j.a(hashMap5, "data", new a.C0427a("data", "TEXT", false, 0, null, 1), 0), new HashSet(0));
            p2.a a14 = p2.a.a(aVar, "StringTypedEntity");
            if (!aVar6.equals(a14)) {
                return new x.b(s1.f("StringTypedEntity(com.topstep.fitcloud.pro.shared.data.entity.StringTypedEntity).\n Expected:\n", aVar6, "\n Found:\n", a14), false);
            }
            HashMap hashMap6 = new HashMap(10);
            hashMap6.put("projectNum", new a.C0427a("projectNum", "TEXT", true, 1, null, 1));
            hashMap6.put("dialNum", new a.C0427a("dialNum", "INTEGER", true, 2, null, 1));
            hashMap6.put("lcd", new a.C0427a("lcd", "INTEGER", true, 0, null, 1));
            hashMap6.put("toolVersion", new a.C0427a("toolVersion", "TEXT", true, 0, null, 1));
            hashMap6.put("binVersion", new a.C0427a("binVersion", "INTEGER", true, 0, null, 1));
            hashMap6.put("imgUrl", new a.C0427a("imgUrl", "TEXT", false, 0, null, 1));
            hashMap6.put("deviceImgUrl", new a.C0427a("deviceImgUrl", "TEXT", false, 0, null, 1));
            hashMap6.put("binUrl", new a.C0427a("binUrl", "TEXT", true, 0, null, 1));
            hashMap6.put("name", new a.C0427a("name", "TEXT", false, 0, null, 1));
            p2.a aVar7 = new p2.a("UsedDialEntity", hashMap6, j.a(hashMap6, "binSize", new a.C0427a("binSize", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a15 = p2.a.a(aVar, "UsedDialEntity");
            if (!aVar7.equals(a15)) {
                return new x.b(s1.f("UsedDialEntity(com.topstep.fitcloud.pro.shared.data.entity.UsedDialEntity).\n Expected:\n", aVar7, "\n Found:\n", a15), false);
            }
            HashMap hashMap7 = new HashMap(5);
            hashMap7.put("cid", new a.C0427a("cid", "TEXT", true, 1, null, 1));
            hashMap7.put("locality", new a.C0427a("locality", "TEXT", true, 0, null, 1));
            hashMap7.put("lat", new a.C0427a("lat", "REAL", false, 0, null, 1));
            hashMap7.put("lng", new a.C0427a("lng", "REAL", false, 0, null, 1));
            p2.a aVar8 = new p2.a("CityEntity", hashMap7, j.a(hashMap7, "errorCount", new a.C0427a("errorCount", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a16 = p2.a.a(aVar, "CityEntity");
            if (!aVar8.equals(a16)) {
                return new x.b(s1.f("CityEntity(com.topstep.fitcloud.pro.shared.data.entity.CityEntity).\n Expected:\n", aVar8, "\n Found:\n", a16), false);
            }
            HashMap hashMap8 = new HashMap(3);
            hashMap8.put("key", new a.C0427a("key", "TEXT", true, 1, null, 1));
            hashMap8.put("cid", new a.C0427a("cid", "TEXT", true, 0, null, 1));
            p2.a aVar9 = new p2.a("CityKeyEntity", hashMap8, j.a(hashMap8, CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a17 = p2.a.a(aVar, "CityKeyEntity");
            if (!aVar9.equals(a17)) {
                return new x.b(s1.f("CityKeyEntity(com.topstep.fitcloud.pro.shared.data.entity.CityKeyEntity).\n Expected:\n", aVar9, "\n Found:\n", a17), false);
            }
            HashMap hashMap9 = new HashMap(3);
            hashMap9.put("projectNum", new a.C0427a("projectNum", "TEXT", true, 1, null, 1));
            hashMap9.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "INTEGER", true, 0, null, 1));
            p2.a aVar10 = new p2.a("DeviceShellEntity", hashMap9, j.a(hashMap9, InnerShareParams.URL, new a.C0427a(InnerShareParams.URL, "TEXT", false, 0, null, 1), 0), new HashSet(0));
            p2.a a18 = p2.a.a(aVar, "DeviceShellEntity");
            if (!aVar10.equals(a18)) {
                return new x.b(s1.f("DeviceShellEntity(com.topstep.fitcloud.pro.shared.data.entity.DeviceShellEntity).\n Expected:\n", aVar10, "\n Found:\n", a18), false);
            }
            HashMap hashMap10 = new HashMap(7);
            hashMap10.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap10.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap10.put("device", new a.C0427a("device", "TEXT", true, 0, null, 1));
            hashMap10.put("step", new a.C0427a("step", "INTEGER", true, 0, null, 1));
            hashMap10.put("distance", new a.C0427a("distance", "REAL", true, 0, null, 1));
            hashMap10.put("calorie", new a.C0427a("calorie", "REAL", true, 0, null, 1));
            p2.a aVar11 = new p2.a("StepItem", hashMap10, j.a(hashMap10, "transformFlag", new a.C0427a("transformFlag", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a19 = p2.a.a(aVar, "StepItem");
            if (!aVar11.equals(a19)) {
                return new x.b(s1.f("StepItem(com.topstep.fitcloud.pro.shared.data.entity.data.StepItemEntity).\n Expected:\n", aVar11, "\n Found:\n", a19), false);
            }
            HashMap hashMap11 = new HashMap(9);
            hashMap11.put("device", new a.C0427a("device", "TEXT", false, 0, null, 1));
            hashMap11.put("step", new a.C0427a("step", "INTEGER", true, 0, null, 1));
            hashMap11.put("distance", new a.C0427a("distance", "REAL", true, 0, null, 1));
            hashMap11.put("calorie", new a.C0427a("calorie", "REAL", true, 0, null, 1));
            hashMap11.put("uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1));
            hashMap11.put("uploadAttempts", new a.C0427a("uploadAttempts", "INTEGER", true, 0, null, 1));
            hashMap11.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap11.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar12 = new p2.a("StepRecord", hashMap11, j.a(hashMap11, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a20 = p2.a.a(aVar, "StepRecord");
            if (!aVar12.equals(a20)) {
                return new x.b(s1.f("StepRecord(com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity).\n Expected:\n", aVar12, "\n Found:\n", a20), false);
            }
            HashMap hashMap12 = new HashMap(6);
            hashMap12.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap12.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap12.put("deepSleep", new a.C0427a("deepSleep", "INTEGER", true, 0, null, 1));
            hashMap12.put("lightSleep", new a.C0427a("lightSleep", "INTEGER", true, 0, null, 1));
            hashMap12.put("soberSleep", new a.C0427a("soberSleep", "INTEGER", true, 0, null, 1));
            p2.a aVar13 = new p2.a("SleepRecord", hashMap12, j.a(hashMap12, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a21 = p2.a.a(aVar, "SleepRecord");
            if (!aVar13.equals(a21)) {
                return new x.b(s1.f("SleepRecord(com.topstep.fitcloud.pro.shared.data.entity.data.SleepRecordEntity).\n Expected:\n", aVar13, "\n Found:\n", a21), false);
            }
            HashMap hashMap13 = new HashMap(9);
            hashMap13.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap13.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap13.put("deepSleep", new a.C0427a("deepSleep", "INTEGER", true, 0, null, 1));
            hashMap13.put("lightSleep", new a.C0427a("lightSleep", "INTEGER", true, 0, null, 1));
            hashMap13.put("soberSleep", new a.C0427a("soberSleep", "INTEGER", true, 0, null, 1));
            hashMap13.put("lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1));
            hashMap13.put("detail", new a.C0427a("detail", "TEXT", false, 0, null, 1));
            hashMap13.put("uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1));
            p2.a aVar14 = new p2.a("SleepDetail", hashMap13, j.a(hashMap13, "uploadAttempts", new a.C0427a("uploadAttempts", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a22 = p2.a.a(aVar, "SleepDetail");
            if (!aVar14.equals(a22)) {
                return new x.b(s1.f("SleepDetail(com.topstep.fitcloud.pro.shared.data.entity.data.SleepDetailEntity).\n Expected:\n", aVar14, "\n Found:\n", a22), false);
            }
            HashMap hashMap14 = new HashMap(6);
            hashMap14.put("heartRate", new a.C0427a("heartRate", "INTEGER", true, 0, null, 1));
            hashMap14.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap14.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap14.put("uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1));
            hashMap14.put("transformFlag", new a.C0427a("transformFlag", "INTEGER", true, 0, null, 1));
            p2.a aVar15 = new p2.a("HeartRateItem", hashMap14, j.a(hashMap14, "uploadAttempts", new a.C0427a("uploadAttempts", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a23 = p2.a.a(aVar, "HeartRateItem");
            if (!aVar15.equals(a23)) {
                return new x.b(s1.f("HeartRateItem(com.topstep.fitcloud.pro.shared.data.entity.data.HeartRateItemEntity).\n Expected:\n", aVar15, "\n Found:\n", a23), false);
            }
            HashMap hashMap15 = new HashMap(4);
            hashMap15.put("avgHeartRate", new a.C0427a("avgHeartRate", "INTEGER", true, 0, null, 1));
            hashMap15.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap15.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar16 = new p2.a("HeartRateRecord", hashMap15, j.a(hashMap15, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a24 = p2.a.a(aVar, "HeartRateRecord");
            if (!aVar16.equals(a24)) {
                return new x.b(s1.f("HeartRateRecord(com.topstep.fitcloud.pro.shared.data.entity.data.HeartRateRecordEntity).\n Expected:\n", aVar16, "\n Found:\n", a24), false);
            }
            HashMap hashMap16 = new HashMap(3);
            hashMap16.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap16.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar17 = new p2.a("HeartRateSyncInfo", hashMap16, j.a(hashMap16, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a25 = p2.a.a(aVar, "HeartRateSyncInfo");
            if (!aVar17.equals(a25)) {
                return new x.b(s1.f("HeartRateSyncInfo(com.topstep.fitcloud.pro.shared.data.entity.data.HeartRateSyncInfo).\n Expected:\n", aVar17, "\n Found:\n", a25), false);
            }
            HashMap hashMap17 = new HashMap(6);
            hashMap17.put("oxygen", new a.C0427a("oxygen", "INTEGER", true, 0, null, 1));
            hashMap17.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap17.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap17.put("uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1));
            hashMap17.put("transformFlag", new a.C0427a("transformFlag", "INTEGER", true, 0, null, 1));
            p2.a aVar18 = new p2.a("OxygenItem", hashMap17, j.a(hashMap17, "uploadAttempts", new a.C0427a("uploadAttempts", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a26 = p2.a.a(aVar, "OxygenItem");
            if (!aVar18.equals(a26)) {
                return new x.b(s1.f("OxygenItem(com.topstep.fitcloud.pro.shared.data.entity.data.OxygenItemEntity).\n Expected:\n", aVar18, "\n Found:\n", a26), false);
            }
            HashMap hashMap18 = new HashMap(4);
            hashMap18.put("avgOxygen", new a.C0427a("avgOxygen", "INTEGER", true, 0, null, 1));
            hashMap18.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap18.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar19 = new p2.a("OxygenRecord", hashMap18, j.a(hashMap18, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a27 = p2.a.a(aVar, "OxygenRecord");
            if (!aVar19.equals(a27)) {
                return new x.b(s1.f("OxygenRecord(com.topstep.fitcloud.pro.shared.data.entity.data.OxygenRecordEntity).\n Expected:\n", aVar19, "\n Found:\n", a27), false);
            }
            HashMap hashMap19 = new HashMap(3);
            hashMap19.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap19.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar20 = new p2.a("OxygenSyncInfo", hashMap19, j.a(hashMap19, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a28 = p2.a.a(aVar, "OxygenSyncInfo");
            if (!aVar20.equals(a28)) {
                return new x.b(s1.f("OxygenSyncInfo(com.topstep.fitcloud.pro.shared.data.entity.data.OxygenSyncInfo).\n Expected:\n", aVar20, "\n Found:\n", a28), false);
            }
            HashMap hashMap20 = new HashMap(7);
            hashMap20.put("sbp", new a.C0427a("sbp", "INTEGER", true, 0, null, 1));
            hashMap20.put("dbp", new a.C0427a("dbp", "INTEGER", true, 0, null, 1));
            hashMap20.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap20.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap20.put("uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1));
            hashMap20.put("transformFlag", new a.C0427a("transformFlag", "INTEGER", true, 0, null, 1));
            p2.a aVar21 = new p2.a("BloodPressureItem", hashMap20, j.a(hashMap20, "uploadAttempts", new a.C0427a("uploadAttempts", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a29 = p2.a.a(aVar, "BloodPressureItem");
            if (!aVar21.equals(a29)) {
                return new x.b(s1.f("BloodPressureItem(com.topstep.fitcloud.pro.shared.data.entity.data.BloodPressureItemEntity).\n Expected:\n", aVar21, "\n Found:\n", a29), false);
            }
            HashMap hashMap21 = new HashMap(5);
            hashMap21.put("avgSbp", new a.C0427a("avgSbp", "INTEGER", true, 0, null, 1));
            hashMap21.put("avgDbp", new a.C0427a("avgDbp", "INTEGER", true, 0, null, 1));
            hashMap21.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap21.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar22 = new p2.a("BloodPressureRecord", hashMap21, j.a(hashMap21, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a30 = p2.a.a(aVar, "BloodPressureRecord");
            if (!aVar22.equals(a30)) {
                return new x.b(s1.f("BloodPressureRecord(com.topstep.fitcloud.pro.shared.data.entity.data.BloodPressureRecordEntity).\n Expected:\n", aVar22, "\n Found:\n", a30), false);
            }
            HashMap hashMap22 = new HashMap(3);
            hashMap22.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap22.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar23 = new p2.a("BloodPressureSyncInfo", hashMap22, j.a(hashMap22, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a31 = p2.a.a(aVar, "BloodPressureSyncInfo");
            if (!aVar23.equals(a31)) {
                return new x.b(s1.f("BloodPressureSyncInfo(com.topstep.fitcloud.pro.shared.data.entity.data.BloodPressureSyncInfo).\n Expected:\n", aVar23, "\n Found:\n", a31), false);
            }
            HashMap hashMap23 = new HashMap(7);
            hashMap23.put("body", new a.C0427a("body", "REAL", true, 0, null, 1));
            hashMap23.put("wrist", new a.C0427a("wrist", "REAL", true, 0, null, 1));
            hashMap23.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap23.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap23.put("uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1));
            hashMap23.put("transformFlag", new a.C0427a("transformFlag", "INTEGER", true, 0, null, 1));
            p2.a aVar24 = new p2.a("TemperatureItem", hashMap23, j.a(hashMap23, "uploadAttempts", new a.C0427a("uploadAttempts", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a32 = p2.a.a(aVar, "TemperatureItem");
            if (!aVar24.equals(a32)) {
                return new x.b(s1.f("TemperatureItem(com.topstep.fitcloud.pro.shared.data.entity.data.TemperatureItemEntity).\n Expected:\n", aVar24, "\n Found:\n", a32), false);
            }
            HashMap hashMap24 = new HashMap(5);
            hashMap24.put("avgBody", new a.C0427a("avgBody", "REAL", true, 0, null, 1));
            hashMap24.put("avgWrist", new a.C0427a("avgWrist", "REAL", true, 0, null, 1));
            hashMap24.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap24.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar25 = new p2.a("TemperatureRecord", hashMap24, j.a(hashMap24, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a33 = p2.a.a(aVar, "TemperatureRecord");
            if (!aVar25.equals(a33)) {
                return new x.b(s1.f("TemperatureRecord(com.topstep.fitcloud.pro.shared.data.entity.data.TemperatureRecordEntity).\n Expected:\n", aVar25, "\n Found:\n", a33), false);
            }
            HashMap hashMap25 = new HashMap(3);
            hashMap25.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap25.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar26 = new p2.a("TemperatureSyncInfo", hashMap25, j.a(hashMap25, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a34 = p2.a.a(aVar, "TemperatureSyncInfo");
            if (!aVar26.equals(a34)) {
                return new x.b(s1.f("TemperatureSyncInfo(com.topstep.fitcloud.pro.shared.data.entity.data.TemperatureSyncInfo).\n Expected:\n", aVar26, "\n Found:\n", a34), false);
            }
            HashMap hashMap26 = new HashMap(6);
            hashMap26.put("pressure", new a.C0427a("pressure", "INTEGER", true, 0, null, 1));
            hashMap26.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap26.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 2, null, 1));
            hashMap26.put("uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1));
            hashMap26.put("transformFlag", new a.C0427a("transformFlag", "INTEGER", true, 0, null, 1));
            p2.a aVar27 = new p2.a("PressureItem", hashMap26, j.a(hashMap26, "uploadAttempts", new a.C0427a("uploadAttempts", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a35 = p2.a.a(aVar, "PressureItem");
            if (!aVar27.equals(a35)) {
                return new x.b(s1.f("PressureItem(com.topstep.fitcloud.pro.shared.data.entity.data.PressureItemEntity).\n Expected:\n", aVar27, "\n Found:\n", a35), false);
            }
            HashMap hashMap27 = new HashMap(4);
            hashMap27.put("avgPressure", new a.C0427a("avgPressure", "INTEGER", true, 0, null, 1));
            hashMap27.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap27.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar28 = new p2.a("PressureRecord", hashMap27, j.a(hashMap27, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a36 = p2.a.a(aVar, "PressureRecord");
            if (!aVar28.equals(a36)) {
                return new x.b(s1.f("PressureRecord(com.topstep.fitcloud.pro.shared.data.entity.data.PressureRecordEntity).\n Expected:\n", aVar28, "\n Found:\n", a36), false);
            }
            HashMap hashMap28 = new HashMap(3);
            hashMap28.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap28.put("date", new a.C0427a("date", "TEXT", true, 2, null, 1));
            p2.a aVar29 = new p2.a("PressureSyncInfo", hashMap28, j.a(hashMap28, "lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a37 = p2.a.a(aVar, "PressureSyncInfo");
            if (!aVar29.equals(a37)) {
                return new x.b(s1.f("PressureSyncInfo(com.topstep.fitcloud.pro.shared.data.entity.data.PressureSyncInfo).\n Expected:\n", aVar29, "\n Found:\n", a37), false);
            }
            HashMap hashMap29 = new HashMap(11);
            hashMap29.put("userId", new a.C0427a("userId", "INTEGER", true, 0, null, 1));
            hashMap29.put("ecgId", new a.C0427a("ecgId", "TEXT", true, 1, null, 1));
            hashMap29.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 0, null, 1));
            hashMap29.put("type", new a.C0427a("type", "INTEGER", true, 0, null, 1));
            hashMap29.put("sampleBase", new a.C0427a("sampleBase", "INTEGER", true, 0, null, 1));
            hashMap29.put("scaleValue", new a.C0427a("scaleValue", "INTEGER", true, 0, null, 1));
            hashMap29.put("lastModifyTime", new a.C0427a("lastModifyTime", "INTEGER", true, 0, null, 1));
            hashMap29.put("deviceAddress", new a.C0427a("deviceAddress", "TEXT", false, 0, null, 1));
            hashMap29.put("detail", new a.C0427a("detail", "TEXT", false, 0, null, 1));
            hashMap29.put("reports", new a.C0427a("reports", "TEXT", false, 0, null, 1));
            p2.a aVar30 = new p2.a("EcgRecord", hashMap29, j.a(hashMap29, "uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a38 = p2.a.a(aVar, "EcgRecord");
            if (!aVar30.equals(a38)) {
                return new x.b(s1.f("EcgRecord(com.topstep.fitcloud.pro.shared.data.entity.data.EcgRecordEntity).\n Expected:\n", aVar30, "\n Found:\n", a38), false);
            }
            HashMap hashMap30 = new HashMap(11);
            hashMap30.put("userId", new a.C0427a("userId", "INTEGER", true, 0, null, 1));
            hashMap30.put("sportId", new a.C0427a("sportId", "TEXT", true, 1, null, 1));
            hashMap30.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 0, null, 1));
            hashMap30.put("duration", new a.C0427a("duration", "INTEGER", true, 0, null, 1));
            hashMap30.put("distance", new a.C0427a("distance", "REAL", true, 0, null, 1));
            hashMap30.put("calorie", new a.C0427a("calorie", "REAL", true, 0, null, 1));
            hashMap30.put("step", new a.C0427a("step", "INTEGER", true, 0, null, 1));
            hashMap30.put("climb", new a.C0427a("climb", "REAL", true, 0, null, 1));
            hashMap30.put("locationType", new a.C0427a("locationType", "INTEGER", true, 0, null, 1));
            hashMap30.put("sportType", new a.C0427a("sportType", "INTEGER", true, 0, null, 1));
            p2.a aVar31 = new p2.a("SportRecord", hashMap30, j.a(hashMap30, "uploadFlag", new a.C0427a("uploadFlag", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
            p2.a a39 = p2.a.a(aVar, "SportRecord");
            if (!aVar31.equals(a39)) {
                return new x.b(s1.f("SportRecord(com.topstep.fitcloud.pro.shared.data.entity.data.SportRecordEntity).\n Expected:\n", aVar31, "\n Found:\n", a39), false);
            }
            HashMap hashMap31 = new HashMap(4);
            hashMap31.put("sportId", new a.C0427a("sportId", "TEXT", true, 1, null, 1));
            hashMap31.put(CrashHianalyticsData.TIME, new a.C0427a(CrashHianalyticsData.TIME, "TEXT", true, 0, null, 1));
            hashMap31.put("latLngs", new a.C0427a("latLngs", "TEXT", false, 0, null, 1));
            p2.a aVar32 = new p2.a("SportDetail", hashMap31, j.a(hashMap31, "heartRates", new a.C0427a("heartRates", "TEXT", false, 0, null, 1), 0), new HashSet(0));
            p2.a a40 = p2.a.a(aVar, "SportDetail");
            if (!aVar32.equals(a40)) {
                return new x.b(s1.f("SportDetail(com.topstep.fitcloud.pro.shared.data.entity.data.SportDetailEntity).\n Expected:\n", aVar32, "\n Found:\n", a40), false);
            }
            HashMap hashMap32 = new HashMap(5);
            hashMap32.put("id", new a.C0427a("id", "INTEGER", true, 1, null, 1));
            hashMap32.put("userId", new a.C0427a("userId", "INTEGER", true, 0, null, 1));
            hashMap32.put("date", new a.C0427a("date", "TEXT", true, 0, null, 1));
            hashMap32.put("type", new a.C0427a("type", "INTEGER", true, 0, null, 1));
            p2.a aVar33 = new p2.a("MenstruationTimeline", hashMap32, j.a(hashMap32, "extra", new a.C0427a("extra", "TEXT", false, 0, null, 1), 0), new HashSet(0));
            p2.a a41 = p2.a.a(aVar, "MenstruationTimeline");
            if (!aVar33.equals(a41)) {
                return new x.b(s1.f("MenstruationTimeline(com.topstep.fitcloud.pro.shared.data.entity.MenstruationTimeline).\n Expected:\n", aVar33, "\n Found:\n", a41), false);
            }
            HashMap hashMap33 = new HashMap(3);
            hashMap33.put("userId", new a.C0427a("userId", "INTEGER", true, 1, null, 1));
            hashMap33.put(MLApplicationSetting.BundleKeyConstants.AppInfo.appName, new a.C0427a(MLApplicationSetting.BundleKeyConstants.AppInfo.appName, "TEXT", true, 0, null, 1));
            p2.a aVar34 = new p2.a("NotificationOtherEntity", hashMap33, j.a(hashMap33, MLApplicationSetting.BundleKeyConstants.AppInfo.packageName, new a.C0427a(MLApplicationSetting.BundleKeyConstants.AppInfo.packageName, "TEXT", true, 2, null, 1), 0), new HashSet(0));
            p2.a a42 = p2.a.a(aVar, "NotificationOtherEntity");
            return !aVar34.equals(a42) ? new x.b(s1.f("NotificationOtherEntity(com.topstep.fitcloud.pro.shared.data.entity.NotificationOtherEntity).\n Expected:\n", aVar34, "\n Found:\n", a42), false) : new x.b(null, true);
        }
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final y4 A() {
        a6 a6Var;
        if (this.f10065z != null) {
            return this.f10065z;
        }
        synchronized (this) {
            if (this.f10065z == null) {
                this.f10065z = new a6(this);
            }
            a6Var = this.f10065z;
        }
        return a6Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final c6 B() {
        c7 c7Var;
        if (this.f10060u != null) {
            return this.f10060u;
        }
        synchronized (this) {
            if (this.f10060u == null) {
                this.f10060u = new c7(this);
            }
            c7Var = this.f10060u;
        }
        return c7Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final d7 C() {
        h7 h7Var;
        if (this.B != null) {
            return this.B;
        }
        synchronized (this) {
            if (this.B == null) {
                this.B = new h7(this);
            }
            h7Var = this.B;
        }
        return h7Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final v7 D() {
        s8 s8Var;
        if (this.f10059t != null) {
            return this.f10059t;
        }
        synchronized (this) {
            if (this.f10059t == null) {
                this.f10059t = new s8(this);
            }
            s8Var = this.f10059t;
        }
        return s8Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final d9 E() {
        e9 e9Var;
        if (this.f10055p != null) {
            return this.f10055p;
        }
        synchronized (this) {
            if (this.f10055p == null) {
                this.f10055p = new e9(this);
            }
            e9Var = this.f10055p;
        }
        return e9Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final l9 F() {
        la laVar;
        if (this.f10064y != null) {
            return this.f10064y;
        }
        synchronized (this) {
            if (this.f10064y == null) {
                this.f10064y = new la(this);
            }
            laVar = this.f10064y;
        }
        return laVar;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final ma G() {
        pa paVar;
        if (this.f10056q != null) {
            return this.f10056q;
        }
        synchronized (this) {
            if (this.f10056q == null) {
                this.f10056q = new pa(this);
            }
            paVar = this.f10056q;
        }
        return paVar;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final hb H() {
        sb sbVar;
        if (this.f10053n != null) {
            return this.f10053n;
        }
        synchronized (this) {
            if (this.f10053n == null) {
                this.f10053n = new sb(this);
            }
            sbVar = this.f10053n;
        }
        return sbVar;
    }

    @Override // m2.t
    public final m e() {
        return new m(this, new HashMap(0), new HashMap(0), "UserEntity", "UnitConfigEntity", "DeviceBindEntity", "ExerciseGoalEntity", "StringTypedEntity", "UsedDialEntity", "CityEntity", "CityKeyEntity", "DeviceShellEntity", "StepItem", "StepRecord", "SleepRecord", "SleepDetail", "HeartRateItem", "HeartRateRecord", "HeartRateSyncInfo", "OxygenItem", "OxygenRecord", "OxygenSyncInfo", "BloodPressureItem", "BloodPressureRecord", "BloodPressureSyncInfo", "TemperatureItem", "TemperatureRecord", "TemperatureSyncInfo", "PressureItem", "PressureRecord", "PressureSyncInfo", "EcgRecord", "SportRecord", "SportDetail", "MenstruationTimeline", "NotificationOtherEntity");
    }

    @Override // m2.t
    public final c f(g gVar) {
        x xVar = new x(gVar, new a(), "85d87cb5484a18a30c01e55dc58e662e", "061023d0159abbbfbaaa31ef264aa622");
        Context context = gVar.f20194a;
        String str = gVar.f20195b;
        if (context != null) {
            return gVar.f20196c.a(new c.b(context, str, xVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // m2.t
    public final List g(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new n2.a[0]);
    }

    @Override // m2.t
    public final Set<Class<Object>> i() {
        return new HashSet();
    }

    @Override // m2.t
    public final Map<Class<?>, List<Class<?>>> j() {
        HashMap hashMap = new HashMap();
        hashMap.put(hb.class, Collections.emptyList());
        hashMap.put(sa.class, Collections.emptyList());
        hashMap.put(d9.class, Collections.emptyList());
        hashMap.put(ma.class, Collections.emptyList());
        int i10 = a1.f20635g;
        hashMap.put(j0.class, Collections.emptyList());
        hashMap.put(b1.class, Collections.emptyList());
        hashMap.put(v7.class, Collections.emptyList());
        hashMap.put(c6.class, Collections.emptyList());
        hashMap.put(z1.class, Collections.emptyList());
        hashMap.put(w3.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(l9.class, Collections.emptyList());
        hashMap.put(y4.class, Collections.emptyList());
        hashMap.put(h1.class, Collections.emptyList());
        hashMap.put(d7.class, Collections.emptyList());
        hashMap.put(p3.class, Collections.emptyList());
        hashMap.put(c3.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final e r() {
        i0 i0Var;
        if (this.f10063x != null) {
            return this.f10063x;
        }
        synchronized (this) {
            if (this.f10063x == null) {
                this.f10063x = new i0(this);
            }
            i0Var = this.f10063x;
        }
        return i0Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final j0 s() {
        a1 a1Var;
        if (this.f10057r != null) {
            return this.f10057r;
        }
        synchronized (this) {
            if (this.f10057r == null) {
                this.f10057r = new a1(this);
            }
            a1Var = this.f10057r;
        }
        return a1Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final sa t() {
        wa waVar;
        if (this.f10054o != null) {
            return this.f10054o;
        }
        synchronized (this) {
            if (this.f10054o == null) {
                this.f10054o = new wa(this);
            }
            waVar = this.f10054o;
        }
        return waVar;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final b1 u() {
        e1 e1Var;
        if (this.f10058s != null) {
            return this.f10058s;
        }
        synchronized (this) {
            if (this.f10058s == null) {
                this.f10058s = new e1(this);
            }
            e1Var = this.f10058s;
        }
        return e1Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final h1 v() {
        w1 w1Var;
        if (this.A != null) {
            return this.A;
        }
        synchronized (this) {
            if (this.A == null) {
                this.A = new w1(this);
            }
            w1Var = this.A;
        }
        return w1Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final z1 w() {
        a3 a3Var;
        if (this.f10061v != null) {
            return this.f10061v;
        }
        synchronized (this) {
            if (this.f10061v == null) {
                this.f10061v = new a3(this);
            }
            a3Var = this.f10061v;
        }
        return a3Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final c3 x() {
        j3 j3Var;
        if (this.D != null) {
            return this.D;
        }
        synchronized (this) {
            if (this.D == null) {
                this.D = new j3(this);
            }
            j3Var = this.D;
        }
        return j3Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final p3 y() {
        t3 t3Var;
        if (this.C != null) {
            return this.C;
        }
        synchronized (this) {
            if (this.C == null) {
                this.C = new t3(this);
            }
            t3Var = this.C;
        }
        return t3Var;
    }

    @Override // com.topstep.fitcloud.pro.shared.data.db.AppDatabase
    public final w3 z() {
        x4 x4Var;
        if (this.f10062w != null) {
            return this.f10062w;
        }
        synchronized (this) {
            if (this.f10062w == null) {
                this.f10062w = new x4(this);
            }
            x4Var = this.f10062w;
        }
        return x4Var;
    }
}
