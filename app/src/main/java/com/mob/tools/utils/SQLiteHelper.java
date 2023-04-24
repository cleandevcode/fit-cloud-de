package com.mob.tools.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class SQLiteHelper implements PublicMemberKeeper {

    /* loaded from: classes.dex */
    public static class SingleTableDB implements PublicMemberKeeper {

        /* renamed from: a */
        private String f9349a;

        /* renamed from: b */
        private String f9350b;

        /* renamed from: c */
        private SQLiteDatabase f9351c;

        /* renamed from: d */
        private LinkedHashMap<String, String> f9352d;

        /* renamed from: e */
        private HashMap<String, Boolean> f9353e;

        /* renamed from: f */
        private String f9354f;

        /* renamed from: g */
        private boolean f9355g;

        private SingleTableDB(String str, String str2) {
            this.f9349a = str;
            this.f9350b = str2;
            this.f9352d = new LinkedHashMap<>();
            this.f9353e = new HashMap<>();
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x0096 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.SQLiteHelper.SingleTableDB.a():void");
        }

        public void b() {
            SQLiteDatabase sQLiteDatabase = this.f9351c;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                this.f9351c = null;
            }
        }

        public String c() {
            return this.f9350b;
        }

        public void addField(String str, String str2, boolean z10) {
            if (this.f9351c == null) {
                this.f9352d.put(str, str2);
                this.f9353e.put(str, Boolean.valueOf(z10));
            }
        }
    }

    public static void close(SingleTableDB singleTableDB) {
        singleTableDB.b();
    }

    public static int delete(SingleTableDB singleTableDB, String str, String[] strArr) {
        singleTableDB.a();
        return singleTableDB.f9351c.delete(singleTableDB.c(), str, strArr);
    }

    public static SingleTableDB getDatabase(Context context, String str) {
        return getDatabase(context != null ? context.getDatabasePath(str).getPath() : null, str);
    }

    public static SingleTableDB getDatabase(String str, String str2) {
        return new SingleTableDB(str, str2);
    }

    public static long insert(SingleTableDB singleTableDB, ContentValues contentValues) {
        singleTableDB.a();
        return singleTableDB.f9351c.replace(singleTableDB.c(), null, contentValues);
    }

    public static Cursor query(SingleTableDB singleTableDB, String[] strArr, String str, String[] strArr2, String str2) {
        singleTableDB.a();
        return singleTableDB.f9351c.query(singleTableDB.c(), strArr, str, strArr2, null, null, str2);
    }

    public static int update(SingleTableDB singleTableDB, ContentValues contentValues, String str, String[] strArr) {
        singleTableDB.a();
        return singleTableDB.f9351c.update(singleTableDB.c(), contentValues, str, strArr);
    }
}
