package cn.sharesdk.framework.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import cn.sharesdk.framework.utils.SSDKLog;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b */
    private static b f5106b;

    /* renamed from: a */
    private a f5107a = new a();

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f5106b == null) {
                f5106b = new b();
            }
            bVar = f5106b;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.database.Cursor] */
    public int a(String str) {
        Throwable th2;
        Cursor cursor;
        Exception e10;
        ?? sb2 = new StringBuilder("select ");
        sb2.append("count(*) from ");
        sb2.append(str);
        int i10 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f5107a.getClass().getMethod("getWritableDatabase", new Class[0]).invoke(this.f5107a, new Object[0]);
                cursor = (Cursor) sQLiteDatabase.getClass().getDeclaredMethod("rawQuery", String.class, String[].class).invoke(sQLiteDatabase, sb2.toString(), null);
            } catch (Exception e11) {
                cursor = null;
                e10 = e11;
            } catch (Throwable th3) {
                sb2 = 0;
                th2 = th3;
                sb2.close();
                throw th2;
            }
            try {
                boolean moveToNext = cursor.moveToNext();
                sb2 = cursor;
                if (moveToNext) {
                    i10 = cursor.getInt(0);
                    sb2 = cursor;
                }
            } catch (Exception e12) {
                e10 = e12;
                SSDKLog.b().b(e10);
                sb2 = cursor;
                sb2.close();
                return i10;
            }
            sb2.close();
            return i10;
        } catch (Throwable th4) {
            th2 = th4;
            sb2.close();
            throw th2;
        }
    }

    public int a(String str, String str2, String[] strArr) {
        int i10;
        try {
            i10 = this.f5107a.getWritableDatabase().delete(str, str2, strArr);
            try {
                SSDKLog.b().a("Deleted %d rows from table: %s", Integer.valueOf(i10), str);
            } catch (Exception e10) {
                e = e10;
                SSDKLog.b().b(e, "when delete database occur error table:%s,", str);
                return i10;
            }
        } catch (Exception e11) {
            e = e11;
            i10 = 0;
        }
        return i10;
    }

    public long a(String str, ContentValues contentValues) {
        try {
            return this.f5107a.getWritableDatabase().replace(str, null, contentValues);
        } catch (Exception e10) {
            SSDKLog.b().b(e10, "when insert database occur error table:%s,", str);
            return -1L;
        }
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        SQLiteDatabase writableDatabase = this.f5107a.getWritableDatabase();
        SSDKLog.b().a("Query table: %s", str);
        try {
            return writableDatabase.query(str, strArr, str2, strArr2, null, null, str3);
        } catch (Exception e10) {
            SSDKLog.b().b(e10, "when query database occur error table:%s,", str);
            return null;
        }
    }
}
