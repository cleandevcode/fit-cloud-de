package x6;

import a7.a;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000do.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final Context f30364a;

    /* renamed from: b */
    public final tl.i f30365b;

    /* renamed from: c */
    public final tl.i f30366c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f30367a;

        /* renamed from: b */
        public final long f30368b;

        /* renamed from: c */
        public final long f30369c;

        public a(int i10, long j10, long j11) {
            this.f30367a = i10;
            this.f30368b = j10;
            this.f30369c = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f30367a == aVar.f30367a && this.f30368b == aVar.f30368b && this.f30369c == aVar.f30369c;
            }
            return false;
        }

        public final int hashCode() {
            long j10 = this.f30368b;
            long j11 = this.f30369c;
            return (((this.f30367a * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("SportTask(sportType=");
            a10.append(this.f30367a);
            a10.append(", userId=");
            a10.append(this.f30368b);
            a10.append(", aliveTimeMillis=");
            return d4.b.a(a10, this.f30369c, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends gm.m implements fm.a<SharedPreferences> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            h.this = r1;
        }

        @Override // fm.a
        public final SharedPreferences m() {
            return h.this.f30364a.getSharedPreferences("libSportCacheRecord", 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.a<a7.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            h.this = r1;
        }

        @Override // fm.a
        public final a7.a m() {
            return new a7.a(h.this.f30364a);
        }
    }

    public h(Context context) {
        gm.l.f(context, "context");
        this.f30364a = context;
        this.f30365b = new tl.i(new c());
        this.f30366c = new tl.i(new b());
    }

    public static y6.f f(String str) {
        try {
            List a10 = new om.c(",").a(str);
            if (a10.size() >= 5) {
                return new y6.f(Double.parseDouble((String) a10.get(0)), Double.parseDouble((String) a10.get(1)), Long.parseLong((String) a10.get(2)), Integer.parseInt((String) a10.get(3)), Boolean.parseBoolean((String) a10.get(4)));
            }
            return null;
        } catch (Exception e10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SportCache");
            bVar.q(e10);
            return null;
        }
    }

    public static String g(y6.f fVar) {
        return fVar.f31164a + ',' + fVar.f31165b + ',' + fVar.f31190c + ',' + fVar.f31191d + ',' + fVar.f31192e + "\r\n";
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.f30366c.getValue();
    }

    public final File b(y6.d dVar) {
        File file = new File(this.f30364a.getFilesDir(), "latlngs");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return new File(file, dVar.f31172f + ".txt");
    }

    public final a7.a c() {
        return (a7.a) this.f30365b.getValue();
    }

    public final y6.d d() {
        double longBitsToDouble;
        double longBitsToDouble2;
        boolean z10;
        a e10 = e();
        if (e10 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        y6.d dVar = new y6.d(e10.f30367a, e10.f30368b, a().getFloat("user_step_length", 65.0f), a().getFloat("user_weight", 70.0f), e10.f30369c, a().getLong("create_time_millis", currentTimeMillis));
        boolean z11 = false;
        dVar.f31173g = a().getBoolean("is_paused", false);
        int i10 = a().getInt("duration", 0);
        long j10 = currentTimeMillis - e10.f30369c;
        if (!dVar.f31173g && j10 > 0) {
            i10 += (int) (j10 / 1000);
        }
        dVar.f31174h = i10;
        dVar.f31175i = a().getFloat("distance", 0.0f);
        dVar.f31176j = a().getFloat("calorie", 0.0f);
        dVar.f31177k = a().getInt("step", 0);
        dVar.f31178l = a().getFloat("climb", 0.0f);
        int i11 = a().getInt("coord_type", -1);
        if (i11 != -1) {
            dVar.f31179m = Integer.valueOf(i11);
        }
        SharedPreferences a10 = a();
        gm.l.e(a10, "dataPreferences");
        if (!a10.contains("latest_track_lat")) {
            longBitsToDouble = 0.0d;
        } else {
            longBitsToDouble = Double.longBitsToDouble(a10.getLong("latest_track_lat", 0L));
        }
        SharedPreferences a11 = a();
        gm.l.e(a11, "dataPreferences");
        if (!a11.contains("latest_track_lng")) {
            longBitsToDouble2 = 0.0d;
        } else {
            longBitsToDouble2 = Double.longBitsToDouble(a11.getLong("latest_track_lng", 0L));
        }
        int i12 = a().getInt("latest_track_duration", 0);
        if (longBitsToDouble == 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (longBitsToDouble2 == 0.0d) {
                z11 = true;
            }
            if (!z11 && i12 != 0) {
                dVar.f31180n = new y6.f(longBitsToDouble, longBitsToDouble2, 0L, i12, false);
            }
        }
        return dVar;
    }

    public final a e() {
        int i10 = c().getInt("sport_type", -1);
        Integer valueOf = Integer.valueOf(i10);
        boolean z10 = false;
        if (valueOf != null && new lm.j(0, 2).k(valueOf.intValue())) {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        long j10 = c().getLong("user_id", 0L);
        if (j10 <= 0) {
            return null;
        }
        long j11 = c().getLong("alive_time_millis", 0L);
        if (j11 <= 0) {
            return null;
        }
        return new a(i10, j10, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0048, code lost:
        if (r7 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004a, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x005d, code lost:
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList h(y6.d r7) {
        /*
            r6 = this;
            java.lang.String r0 = "SportCache"
            java.io.File r7 = r6.b(r7)
            if (r7 == 0) goto L7e
            boolean r1 = r7.exists()
            if (r1 == 0) goto L7e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            gm.a0 r2 = new gm.a0
            r2.<init>()
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r2.f15485a = r3     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            gm.a0 r7 = new gm.a0     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r7.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
        L2e:
            T r3 = r2.f15485a     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r3 = r3.readLine()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r7.f15485a = r3     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r3 == 0) goto L44
            y6.f r3 = f(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r3 == 0) goto L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            goto L2e
        L44:
            T r7 = r2.f15485a     // Catch: java.lang.Exception -> L60
            java.io.BufferedReader r7 = (java.io.BufferedReader) r7     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L69
        L4a:
            r7.close()     // Catch: java.lang.Exception -> L60
            goto L69
        L4e:
            r7 = move-exception
            goto L6a
        L50:
            r7 = move-exception
            do.a$b r3 = p000do.a.f13275a     // Catch: java.lang.Throwable -> L4e
            r3.t(r0)     // Catch: java.lang.Throwable -> L4e
            r3.q(r7)     // Catch: java.lang.Throwable -> L4e
            T r7 = r2.f15485a     // Catch: java.lang.Exception -> L60
            java.io.BufferedReader r7 = (java.io.BufferedReader) r7     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L69
            goto L4a
        L60:
            r7 = move-exception
            do.a$b r2 = p000do.a.f13275a
            r2.t(r0)
            r2.q(r7)
        L69:
            return r1
        L6a:
            T r1 = r2.f15485a     // Catch: java.lang.Exception -> L74
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L7d
            r1.close()     // Catch: java.lang.Exception -> L74
            goto L7d
        L74:
            r1 = move-exception
            do.a$b r2 = p000do.a.f13275a
            r2.t(r0)
            r2.q(r1)
        L7d:
            throw r7
        L7e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.h.h(y6.d):java.util.ArrayList");
    }

    public final void i(long j10) {
        a7.a c10 = c();
        c10.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("alive_time_millis", Long.valueOf(j10));
        try {
            c10.f358a.getContentResolver().update(c10.a("apply"), contentValues, null, new String[]{String.valueOf(false)});
        } catch (Exception e10) {
            p000do.a.f13275a.q(e10);
        }
    }

    public final void j(y6.d dVar) {
        int i10;
        File[] listFiles;
        a7.a c10 = c();
        c10.getClass();
        a.SharedPreferences$EditorC0002a sharedPreferences$EditorC0002a = new a.SharedPreferences$EditorC0002a();
        sharedPreferences$EditorC0002a.putInt("sport_type", dVar.f31167a);
        sharedPreferences$EditorC0002a.putLong("user_id", dVar.f31168b);
        sharedPreferences$EditorC0002a.putLong("alive_time_millis", dVar.f31171e);
        sharedPreferences$EditorC0002a.apply();
        SharedPreferences.Editor putFloat = a().edit().putLong("create_time_millis", dVar.f31172f).putFloat("user_step_length", dVar.f31169c).putFloat("user_weight", dVar.f31170d).putBoolean("is_paused", dVar.f31173g).putInt("duration", dVar.f31174h).putFloat("distance", dVar.f31175i).putFloat("calorie", dVar.f31176j).putInt("step", dVar.f31177k).putFloat("climb", dVar.f31178l);
        Integer num = dVar.f31179m;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        SharedPreferences.Editor putInt = putFloat.putInt("coord_type", i10);
        gm.l.e(putInt, "dataPreferences.edit()\n …pe ?: INVALID_COORD_TYPE)");
        p.b.w(p.b.w(putInt, "latest_track_lat", 0.0d), "latest_track_lng", 0.0d).putInt("latest_track_duration", 0).apply();
        File file = new File(this.f30364a.getFilesDir(), "latlngs");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    public final void k(y6.d dVar, ArrayList arrayList) {
        File b10;
        FileOutputStream fileOutputStream;
        gm.l.f(arrayList, "latLngs");
        SharedPreferences.Editor putFloat = a().edit().putInt("duration", dVar.f31174h).putFloat("distance", dVar.f31175i).putFloat("calorie", dVar.f31176j).putInt("step", dVar.f31177k).putFloat("climb", dVar.f31178l);
        y6.f fVar = dVar.f31180n;
        if (fVar != null) {
            gm.l.e(putFloat, "editor");
            p.b.w(p.b.w(putFloat, "latest_track_lat", fVar.f31164a), "latest_track_lng", fVar.f31165b).putInt("latest_track_duration", fVar.f31191d);
        }
        putFloat.apply();
        if (arrayList.size() > 0 && (b10 = b(dVar)) != null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(b10, true);
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bytes = g((y6.f) it.next()).getBytes(om.a.f23623a);
                                gm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                                fileOutputStream.write(bytes);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception e10) {
                            e = e10;
                            fileOutputStream2 = fileOutputStream;
                            a.b bVar = p000do.a.f13275a;
                            bVar.t("SportCache");
                            bVar.q(e);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e11) {
                                    a.b bVar2 = p000do.a.f13275a;
                                    bVar2.t("SportCache");
                                    bVar2.q(e11);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                a.b bVar3 = p000do.a.f13275a;
                bVar3.t("SportCache");
                bVar3.q(e13);
            }
        }
    }
}
