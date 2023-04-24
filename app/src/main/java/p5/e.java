package p5;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import d6.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import no.nordicsemi.android.dfu.DfuBaseService;
import o5.v;
import yb.y;

/* loaded from: classes.dex */
public final class e implements g9.c, pn.k {

    /* renamed from: a */
    public Object f23905a;

    public /* synthetic */ e(int i10) {
        this.f23905a = new ArrayList(4);
    }

    public e(int i10, int i11) {
        if (i10 == 4) {
            this.f23905a = y.s().getFilesDir().getPath();
        } else if (i10 != 7) {
            this.f23905a = new HashMap();
        }
    }

    public static boolean l(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    StringBuilder a10 = android.support.v4.media.d.a("delete file failed : ");
                    a10.append(file2.getName());
                    m2.f.b(a10.toString());
                }
            } else if (file2.isDirectory()) {
                l(file2);
            }
        }
        return file.delete();
    }

    public static void m(r2.f fVar, pg.m mVar) {
        fVar.H(1, mVar.f24070d);
        String str = mVar.f24071e;
        if (str == null) {
            fVar.m0(2);
        } else {
            fVar.p(2, str);
        }
        String str2 = mVar.f24072f;
        if (str2 == null) {
            fVar.m0(3);
        } else {
            fVar.p(3, str2);
        }
        fVar.p(4, mVar.f24073g);
        fVar.H(5, mVar.f24074h);
        fVar.p(6, mVar.f24075i);
        fVar.j0(mVar.f24076j, 7);
        fVar.j0(mVar.f24077k, 8);
        String str3 = mVar.f24078l;
        if (str3 == null) {
            fVar.m0(9);
        } else {
            fVar.p(9, str3);
        }
        String str4 = mVar.f24079m;
        if (str4 == null) {
            fVar.m0(10);
        } else {
            fVar.p(10, str4);
        }
        fVar.H(11, mVar.f24080n);
        fVar.H(12, mVar.f24081o);
        fVar.H(13, mVar.f24082p);
        fVar.H(14, mVar.f24083q);
        fVar.H(15, mVar.f24053b);
        fVar.H(16, mVar.f24054c);
    }

    @Override // pn.k
    public final pn.p a(String str) {
        return (pn.p) ((Hashtable) this.f23905a).get(str);
    }

    @Override // pn.k
    public final Enumeration b() {
        return ((Hashtable) this.f23905a).keys();
    }

    @Override // pn.k
    public final void c(String str, String str2) {
        this.f23905a = new Hashtable();
    }

    @Override // pn.k
    public final void clear() {
        ((Hashtable) this.f23905a).clear();
    }

    @Override // pn.k
    public final void close() {
        ((Hashtable) this.f23905a).clear();
    }

    @Override // g9.c
    public final void d(g9.t tVar) {
        Exception exc;
        g9.h hVar = (g9.h) this.f23905a;
        if (!tVar.b()) {
            synchronized (tVar.f15057a) {
                exc = tVar.f15062f;
            }
            exc.getClass();
            hVar.b(exc);
        }
    }

    @Override // pn.k
    public final void e(String str, pn.p pVar) {
        ((Hashtable) this.f23905a).put(str, pVar);
    }

    @Override // pn.k
    public final boolean f(String str) {
        return ((Hashtable) this.f23905a).containsKey(str);
    }

    public final String g(String str) {
        return ((String) this.f23905a) + "/hms/component/".replace("component", str);
    }

    public final void h(String str, String str2) {
        boolean z10;
        File file = new File(g(str));
        File file2 = new File(g(str), a.b.b("hianalytics_", str));
        if (!file.exists() && file.mkdirs()) {
            m2.f.b("file directory is mkdirs");
        }
        if (file2.exists()) {
            z10 = true;
        } else {
            try {
                z10 = file2.createNewFile();
            } catch (IOException unused) {
                m2.f.h("hmsSdk", "create new file error!");
                z10 = false;
            }
        }
        if (z10) {
            gm.j.d(file2, str2);
        } else {
            m2.f.h("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    public final synchronized void i(s sVar) {
        Set<Map.Entry<a, List<d>>> set = null;
        if (!i6.a.b(sVar)) {
            Set<Map.Entry<a, List<d>>> entrySet = sVar.f23940a.entrySet();
            gm.l.e(entrySet, "events.entries");
            set = entrySet;
        }
        for (Map.Entry<a, List<d>> entry : set) {
            t o10 = o(entry.getKey());
            if (o10 != null) {
                for (d dVar : entry.getValue()) {
                    o10.a(dVar);
                }
            }
        }
    }

    public final void j(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length > 0) {
            ArrayList arrayList = (ArrayList) this.f23905a;
            arrayList.ensureCapacity(arrayList.size() + objArr.length);
            Collections.addAll((ArrayList) this.f23905a, objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable, java.io.FileInputStream] */
    public final String k(String str) {
        boolean z10;
        Throwable th2;
        ?? r32;
        String str2;
        byte[] bArr;
        int i10;
        byte[] bArr2;
        File file = new File(g(str), a.b.b("hianalytics_", str));
        if (file.exists()) {
            z10 = true;
        } else {
            try {
                z10 = file.createNewFile();
            } catch (IOException unused) {
                m2.f.h("hmsSdk", "create new file error!");
                z10 = false;
            }
        }
        if (z10) {
            String str3 = null;
            r9 = null;
            Closeable closeable = null;
            try {
                try {
                    r32 = new FileInputStream(file);
                    try {
                        bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                        byte[] bArr3 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                        i10 = 0;
                        while (true) {
                            int read = r32.read(bArr3);
                            if (read == -1) {
                                break;
                            } else if (read > 0) {
                                if (bArr.length - i10 >= read) {
                                    System.arraycopy(bArr3, 0, bArr, i10, read);
                                } else {
                                    byte[] bArr4 = new byte[(bArr.length + read) << 1];
                                    System.arraycopy(bArr, 0, bArr4, 0, i10);
                                    System.arraycopy(bArr3, 0, bArr4, i10, read);
                                    bArr = bArr4;
                                }
                                i10 += read;
                            }
                        }
                    } catch (FileNotFoundException unused2) {
                        closeable = r32;
                        str2 = "getInfoFromFile(): No files need to be read";
                        m2.f.h("hmsSdk", str2);
                        gm.j.c(closeable);
                        str3 = "";
                        return "";
                    } catch (IOException unused3) {
                        closeable = r32;
                        str2 = "getInfoFromFile(): stream.read or new string exception";
                        m2.f.h("hmsSdk", str2);
                        gm.j.c(closeable);
                        str3 = "";
                        return "";
                    } catch (Throwable th3) {
                        th2 = th3;
                        gm.j.c(r32);
                        throw th2;
                    }
                } catch (FileNotFoundException unused4) {
                } catch (IOException unused5) {
                }
                if (i10 == 0) {
                    gm.j.c(r32);
                    str3 = "";
                    return "";
                }
                if (i10 <= 0) {
                    bArr2 = new byte[0];
                } else {
                    byte[] bArr5 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr5, 0, i10);
                    bArr2 = bArr5;
                }
                String str4 = new String(bArr2, "UTF-8");
                gm.j.c(r32);
                return str4;
            } catch (Throwable th4) {
                String str5 = str3;
                th2 = th4;
                r32 = str5;
            }
        } else {
            String b10 = cc.b.b(128);
            gm.j.d(file, b10);
            return b10;
        }
    }

    public final synchronized int n() {
        int i10;
        int i11;
        i10 = 0;
        for (t tVar : ((HashMap) this.f23905a).values()) {
            synchronized (tVar) {
                if (!i6.a.b(tVar)) {
                    i11 = tVar.f23944c.size();
                } else {
                    i11 = 0;
                }
            }
            i10 += i11;
        }
        return i10;
    }

    public final synchronized t o(a aVar) {
        t tVar = (t) ((HashMap) this.f23905a).get(aVar);
        if (tVar == null) {
            Context a10 = v.a();
            d6.b bVar = d6.b.f12632f;
            d6.b a11 = b.a.a(a10);
            if (a11 != null) {
                tVar = new t(a11, gm.j.i(a10));
            }
        }
        if (tVar == null) {
            return null;
        }
        ((HashMap) this.f23905a).put(aVar, tVar);
        return tVar;
    }

    public final synchronized Set p() {
        Set keySet;
        keySet = ((HashMap) this.f23905a).keySet();
        gm.l.e(keySet, "stateMap.keys");
        return keySet;
    }

    public final void q() {
        ArrayList arrayList;
        ArrayList<pg.m> arrayList2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        int i10;
        int i11;
        String str;
        String str2;
        e eVar = this;
        Cursor U = ((r2.b) eVar.f23905a).U("SELECT * FROM UserEntity");
        if (U == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            try {
                try {
                    int o10 = p.b.o(U, "userId");
                    int o11 = p.b.o(U, "phone");
                    int o12 = p.b.o(U, "email");
                    int o13 = p.b.o(U, "nickName");
                    int o14 = p.b.o(U, "sex");
                    int o15 = p.b.o(U, "birthday");
                    int o16 = p.b.o(U, "height");
                    int o17 = p.b.o(U, "weight");
                    int o18 = p.b.o(U, "avatar");
                    int o19 = p.b.o(U, "identityId");
                    int o20 = p.b.o(U, "hasProfile");
                    int o21 = p.b.o(U, "hasPassword");
                    int o22 = p.b.o(U, "hasIdentity");
                    int o23 = p.b.o(U, "lastModifyTime");
                    ArrayList arrayList4 = arrayList3;
                    try {
                        int o24 = p.b.o(U, "dirty");
                        int o25 = p.b.o(U, "syncSuccessTime");
                        while (U.moveToNext()) {
                            int i12 = o22;
                            int i13 = o23;
                            long j10 = U.getLong(o10);
                            if (U.isNull(o11)) {
                                string = null;
                            } else {
                                string = U.getString(o11);
                            }
                            if (U.isNull(o12)) {
                                string2 = null;
                            } else {
                                string2 = U.getString(o12);
                            }
                            if (U.isNull(o13)) {
                                string3 = null;
                            } else {
                                string3 = U.getString(o13);
                            }
                            int i14 = U.getInt(o14);
                            if (U.isNull(o15)) {
                                string4 = null;
                            } else {
                                string4 = U.getString(o15);
                            }
                            float f10 = U.getFloat(o16);
                            float f11 = U.getFloat(o17);
                            if (U.isNull(o18)) {
                                string5 = null;
                            } else {
                                string5 = U.getString(o18);
                            }
                            if (U.isNull(o19)) {
                                string6 = null;
                            } else {
                                string6 = U.getString(o19);
                            }
                            int i15 = U.getInt(o20);
                            int i16 = U.getInt(o21);
                            int i17 = o10;
                            int i18 = U.getInt(i12);
                            long j11 = U.getLong(i13);
                            if (TextUtils.isEmpty(string3)) {
                                i10 = i13;
                                StringBuilder sb2 = new StringBuilder();
                                i11 = o11;
                                sb2.append("User");
                                sb2.append(j10);
                                str = sb2.toString();
                            } else {
                                i10 = i13;
                                i11 = o11;
                                str = string3;
                            }
                            if (TextUtils.isEmpty(string4)) {
                                str2 = hh.b.a();
                            } else {
                                str2 = string4;
                            }
                            pg.m mVar = new pg.m(j10, string, string2, str, i14, str2, f10, f11, string5, string6, i15, i16, i18, j11);
                            int i19 = o24;
                            mVar.f24053b = U.getInt(i19);
                            o24 = i19;
                            mVar.f24054c = U.getLong(o25);
                            arrayList = arrayList4;
                            try {
                                arrayList.add(mVar);
                                arrayList4 = arrayList;
                                o22 = i12;
                                o23 = i10;
                                o10 = i17;
                                o11 = i11;
                            } catch (Exception e10) {
                                e = e10;
                                p000do.a.a(e);
                                U.close();
                                arrayList2 = arrayList;
                                eVar = this;
                                ((r2.b) eVar.f23905a).o("DROP TABLE UserEntity");
                                ((r2.b) eVar.f23905a).o("CREATE TABLE IF NOT EXISTS `UserEntity` (`userId` INTEGER NOT NULL, `phone` TEXT, `email` TEXT, `nickName` TEXT NOT NULL, `sex` INTEGER NOT NULL, `birthday` TEXT NOT NULL, `height` REAL NOT NULL, `weight` REAL NOT NULL, `avatar` TEXT, `identityId` TEXT, `hasProfile` INTEGER NOT NULL, `hasPassword` INTEGER NOT NULL, `hasIdentity` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
                                if (arrayList2 == null) {
                                }
                                return;
                            }
                        }
                        arrayList = arrayList4;
                    } catch (Exception e11) {
                        e = e11;
                        arrayList = arrayList4;
                    }
                } catch (Exception e12) {
                    e = e12;
                    arrayList = arrayList3;
                }
                U.close();
                arrayList2 = arrayList;
                eVar = this;
            } catch (Throwable th2) {
                U.close();
                throw th2;
            }
        }
        ((r2.b) eVar.f23905a).o("DROP TABLE UserEntity");
        ((r2.b) eVar.f23905a).o("CREATE TABLE IF NOT EXISTS `UserEntity` (`userId` INTEGER NOT NULL, `phone` TEXT, `email` TEXT, `nickName` TEXT NOT NULL, `sex` INTEGER NOT NULL, `birthday` TEXT NOT NULL, `height` REAL NOT NULL, `weight` REAL NOT NULL, `avatar` TEXT, `identityId` TEXT, `hasProfile` INTEGER NOT NULL, `hasPassword` INTEGER NOT NULL, `hasIdentity` INTEGER NOT NULL, `lastModifyTime` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `syncSuccessTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
        if (arrayList2 == null && !arrayList2.isEmpty()) {
            r2.f t10 = ((r2.b) eVar.f23905a).t("INSERT OR REPLACE INTO `UserEntity` (`userId`,`phone`,`email`,`nickName`,`sex`,`birthday`,`height`,`weight`,`avatar`,`identityId`,`hasProfile`,`hasPassword`,`hasIdentity`,`lastModifyTime`,`dirty`,`syncSuccessTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            try {
                for (pg.m mVar2 : arrayList2) {
                    p000do.a.f13275a.b("UserEntity Migrate:%s", mVar2.toString());
                    m(t10, mVar2);
                    t10.F0();
                }
            } catch (Exception e13) {
                p000do.a.a(e13);
            }
        }
    }

    public final void r(b9.g gVar) {
        p8.a aVar = (p8.a) this.f23905a;
        aVar.f23955a = gVar;
        Iterator it = aVar.f23957c.iterator();
        while (it.hasNext()) {
            b9.g gVar2 = ((p8.a) this.f23905a).f23955a;
            ((p8.h) it.next()).b();
        }
        ((p8.a) this.f23905a).f23957c.clear();
        ((p8.a) this.f23905a).f23956b = null;
    }

    @Override // pn.k
    public final void remove(String str) {
        ((Hashtable) this.f23905a).remove(str);
    }

    public /* synthetic */ e(Object obj) {
        this.f23905a = obj;
    }
}
