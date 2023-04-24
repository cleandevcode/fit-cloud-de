package a7;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.d;
import gm.l;
import java.util.Map;
import java.util.Set;
import x6.k;

/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a */
    public final Context f358a;

    /* renamed from: b */
    public final String f359b;

    /* renamed from: a7.a$a */
    /* loaded from: classes.dex */
    public final class SharedPreferences$EditorC0002a implements SharedPreferences.Editor {

        /* renamed from: a */
        public final ContentValues f360a = new ContentValues();

        /* renamed from: b */
        public boolean f361b;

        public SharedPreferences$EditorC0002a() {
            a.this = r1;
        }

        public final boolean a(String str) {
            try {
            } catch (Exception e10) {
                p000do.a.f13275a.q(e10);
            }
            if (a.this.f358a.getContentResolver().update(a.this.a(str), this.f360a, null, new String[]{String.valueOf(this.f361b)}) > 0) {
                return true;
            }
            return false;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a("apply");
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.f361b = true;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            return a("commit");
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
            l.f(str, "key");
            this.f360a.put(str, Boolean.valueOf(z10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f10) {
            l.f(str, "key");
            this.f360a.put(str, Float.valueOf(f10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i10) {
            l.f(str, "key");
            this.f360a.put(str, Integer.valueOf(i10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j10) {
            l.f(str, "key");
            this.f360a.put(str, Long.valueOf(j10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            l.f(str, "key");
            this.f360a.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            l.f(str, "key");
            throw new UnsupportedOperationException();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            l.f(str, "key");
            this.f360a.putNull(str);
            return this;
        }
    }

    public a(Context context) {
        l.f(context, "context");
        this.f358a = context;
        this.f359b = "libSportCacheShared";
    }

    public static void b(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } catch (Exception e10) {
                p000do.a.f13275a.q(e10);
            }
        }
    }

    public final Uri a(String str) {
        StringBuilder a10 = d.a("content://");
        k.f30377a.getClass();
        String str2 = k.f30379c;
        if (str2 != null) {
            a10.append(str2);
            a10.append('/');
            a10.append(this.f359b);
            a10.append('/');
            a10.append(str);
            a10.append('/');
            Uri parse = Uri.parse(a10.toString());
            l.e(parse, "parse(\"${ContentResolver…ty}/$name/$pathSegment/\")");
            return parse;
        }
        l.l("authority");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0043, code lost:
        if (r7.intValue() == 1) goto L6;
     */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            gm.l.f(r10, r0)
            java.lang.String r0 = "contains"
            android.net.Uri r2 = r9.a(r0)
            r0 = 1
            r7 = 0
            r8 = 0
            android.content.Context r1 = r9.f358a     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3 = 0
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r5[r8] = r10     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r10 == 0) goto L56
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            if (r1 == 0) goto L56
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            boolean r2 = r10.isNull(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            if (r2 == 0) goto L34
            goto L3c
        L34:
            int r1 = r10.getInt(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
        L3c:
            if (r7 != 0) goto L3f
            goto L56
        L3f:
            int r1 = r7.intValue()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            if (r1 != r0) goto L56
            goto L57
        L46:
            r0 = move-exception
            r7 = r10
            goto L5c
        L49:
            r0 = move-exception
            r7 = r10
            goto L50
        L4c:
            r10 = move-exception
            goto L5d
        L4e:
            r10 = move-exception
            r0 = r10
        L50:
            do.a$b r10 = p000do.a.f13275a     // Catch: java.lang.Throwable -> L5b
            r10.q(r0)     // Catch: java.lang.Throwable -> L5b
            r10 = r7
        L56:
            r0 = 0
        L57:
            b(r10)
            return r0
        L5b:
            r0 = move-exception
        L5c:
            r10 = r0
        L5d:
            b(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.a.contains(java.lang.String):boolean");
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC0002a();
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0061 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getBoolean(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "key"
            gm.l.f(r11, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = "boolean"
            android.net.Uri r3 = r10.a(r1)
            r1 = 1
            r8 = 0
            r9 = 0
            android.content.Context r2 = r10.f358a     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r4 = 0
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r6[r8] = r11     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            if (r11 == 0) goto L47
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r2 == 0) goto L47
            java.lang.String r2 = "value"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            boolean r3 = r11.isNull(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r3 == 0) goto L39
            r0 = r9
            goto L47
        L39:
            int r2 = r11.getInt(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            goto L47
        L42:
            r12 = move-exception
            goto L64
        L44:
            r2 = move-exception
            r9 = r11
            goto L50
        L47:
            b(r11)
            goto L58
        L4b:
            r11 = move-exception
            r12 = r11
            goto L63
        L4e:
            r11 = move-exception
            r2 = r11
        L50:
            do.a$b r11 = p000do.a.f13275a     // Catch: java.lang.Throwable -> L4b
            r11.q(r2)     // Catch: java.lang.Throwable -> L4b
            b(r9)
        L58:
            if (r0 == 0) goto L5e
            int r12 = r0.intValue()
        L5e:
            if (r12 != r1) goto L61
            goto L62
        L61:
            r1 = 0
        L62:
            return r1
        L63:
            r11 = r9
        L64:
            b(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.a.getBoolean(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.database.Cursor] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float getFloat(java.lang.String r10, float r11) {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            gm.l.f(r10, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r11)
            java.lang.String r1 = "float"
            android.net.Uri r3 = r9.a(r1)
            r1 = 0
            android.content.Context r2 = r9.f358a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r7 = 0
            r6[r7] = r10     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r10 == 0) goto L4f
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            if (r2 == 0) goto L4f
            java.lang.String r2 = "value"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            boolean r3 = r10.isNull(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            if (r3 == 0) goto L39
            r0 = r1
            goto L4f
        L39:
            float r1 = r10.getFloat(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            goto L4f
        L42:
            r1 = move-exception
            goto L4a
        L44:
            r10 = move-exception
            goto L5c
        L46:
            r10 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
        L4a:
            do.a$b r2 = p000do.a.f13275a     // Catch: java.lang.Throwable -> L59
            r2.q(r1)     // Catch: java.lang.Throwable -> L59
        L4f:
            b(r10)
            if (r0 == 0) goto L58
            float r11 = r0.floatValue()
        L58:
            return r11
        L59:
            r11 = move-exception
            r1 = r10
            r10 = r11
        L5c:
            b(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.a.getFloat(java.lang.String, float):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.database.Cursor] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getInt(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            gm.l.f(r10, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = "int"
            android.net.Uri r3 = r9.a(r1)
            r1 = 0
            android.content.Context r2 = r9.f358a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r7 = 0
            r6[r7] = r10     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r10 == 0) goto L4f
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            if (r2 == 0) goto L4f
            java.lang.String r2 = "value"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            boolean r3 = r10.isNull(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            if (r3 == 0) goto L39
            r0 = r1
            goto L4f
        L39:
            int r1 = r10.getInt(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            goto L4f
        L42:
            r1 = move-exception
            goto L4a
        L44:
            r10 = move-exception
            goto L5c
        L46:
            r10 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
        L4a:
            do.a$b r2 = p000do.a.f13275a     // Catch: java.lang.Throwable -> L59
            r2.q(r1)     // Catch: java.lang.Throwable -> L59
        L4f:
            b(r10)
            if (r0 == 0) goto L58
            int r11 = r0.intValue()
        L58:
            return r11
        L59:
            r11 = move-exception
            r1 = r10
            r10 = r11
        L5c:
            b(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.a.getInt(java.lang.String, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.database.Cursor] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long getLong(java.lang.String r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            gm.l.f(r10, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.String r1 = "long"
            android.net.Uri r3 = r9.a(r1)
            r1 = 0
            android.content.Context r2 = r9.f358a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r7 = 0
            r6[r7] = r10     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r10 == 0) goto L4f
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            if (r2 == 0) goto L4f
            java.lang.String r2 = "value"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            boolean r3 = r10.isNull(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            if (r3 == 0) goto L39
            r0 = r1
            goto L4f
        L39:
            long r1 = r10.getLong(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L59
            goto L4f
        L42:
            r1 = move-exception
            goto L4a
        L44:
            r10 = move-exception
            goto L5c
        L46:
            r10 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
        L4a:
            do.a$b r2 = p000do.a.f13275a     // Catch: java.lang.Throwable -> L59
            r2.q(r1)     // Catch: java.lang.Throwable -> L59
        L4f:
            b(r10)
            if (r0 == 0) goto L58
            long r11 = r0.longValue()
        L58:
            return r11
        L59:
            r11 = move-exception
            r1 = r10
            r10 = r11
        L5c:
            b(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.a.getLong(java.lang.String, long):long");
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        l.f(str, "key");
        Cursor cursor = null;
        try {
            try {
                cursor = this.f358a.getContentResolver().query(a("string"), null, null, new String[]{str}, null);
                if (cursor != null && cursor.moveToFirst()) {
                    str2 = cursor.getString(cursor.getColumnIndex("value"));
                }
            } catch (Exception e10) {
                p000do.a.f13275a.q(e10);
            }
            return str2;
        } finally {
            b(cursor);
        }
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        l.f(str, "key");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException();
    }
}
