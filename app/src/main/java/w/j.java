package w;

import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.SportLatLng;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mf.l0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final /* synthetic */ int f29496a;

    /* renamed from: b */
    public Object f29497b;

    public /* synthetic */ j(int i10, Object obj) {
        this.f29496a = i10;
        this.f29497b = obj;
    }

    public static j a(byte[] bArr) {
        byte[] bArr2;
        ad.a aVar;
        if (bArr != null && bArr.length >= 1) {
            if (bArr.length < 1) {
                aVar = null;
            } else {
                int i10 = bArr[0] & 255;
                int length = bArr.length - 1;
                if (length > 0) {
                    bArr2 = new byte[length];
                    System.arraycopy(bArr, 1, bArr2, 0, length);
                } else {
                    bArr2 = null;
                }
                aVar = new ad.a(i10, bArr2);
            }
            if (aVar == null) {
                return null;
            }
            return new j(2, aVar);
        }
        ge.b.n("invalid packet");
        return null;
    }

    public static void b(r2.f fVar, ng.a aVar) {
        fVar.H(1, aVar.f22350a);
        fVar.p(2, aVar.f22351b);
        fVar.p(3, aVar.f22352c);
        fVar.H(4, aVar.f22353d);
        fVar.j0(aVar.f22354e, 5);
        fVar.j0(aVar.f22355f, 6);
        fVar.H(7, aVar.f22356g);
        fVar.j0(aVar.f22357h, 8);
        fVar.H(9, aVar.f22358i);
        fVar.H(10, aVar.f22359j);
        fVar.H(11, 0L);
    }

    public final void c() {
        ArrayList<ng.a> arrayList;
        String string;
        String string2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - 1);
        Date time = calendar.getTime();
        gm.l.f(time, "date");
        Cursor m10 = ((r2.b) this.f29497b).m("SELECT * FROM SportRecord WHERE time>=? AND uploadFlag=0", new Object[]{dg.a.b(time)});
        if (m10 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            try {
                try {
                    int o10 = p.b.o(m10, "userId");
                    int o11 = p.b.o(m10, "sportId");
                    int o12 = p.b.o(m10, CrashHianalyticsData.TIME);
                    int o13 = p.b.o(m10, "duration");
                    int o14 = p.b.o(m10, "distance");
                    int o15 = p.b.o(m10, "calorie");
                    int o16 = p.b.o(m10, "step");
                    int o17 = p.b.o(m10, "climb");
                    int o18 = p.b.o(m10, "locationType");
                    int o19 = p.b.o(m10, "sportType");
                    int o20 = p.b.o(m10, "heartRates");
                    while (m10.moveToNext()) {
                        long j10 = m10.getLong(o10);
                        String string3 = m10.getString(o11);
                        if (m10.isNull(o12)) {
                            string = null;
                        } else {
                            string = m10.getString(o12);
                        }
                        if (string != null) {
                            int i10 = m10.getInt(o13);
                            float f10 = m10.getFloat(o14);
                            float f11 = m10.getFloat(o15);
                            int i11 = m10.getInt(o16);
                            float f12 = m10.getFloat(o17);
                            int i12 = m10.getInt(o18);
                            int i13 = m10.getInt(o19);
                            if (m10.isNull(o20)) {
                                string2 = null;
                            } else {
                                string2 = m10.getString(o20);
                            }
                            arrayList2.add(new ng.a(j10, string3, string, i10, f10, f11, i11, f12, i12, i13, d(string3), string2));
                        }
                    }
                } catch (Exception e10) {
                    p000do.a.a(e10);
                }
                m10.close();
                arrayList = arrayList2;
            } catch (Throwable th2) {
                m10.close();
                throw th2;
            }
        }
        ((r2.b) this.f29497b).o("DROP TABLE SportRecord");
        ((r2.b) this.f29497b).o("DROP TABLE SportLatLng");
        ((r2.b) this.f29497b).o("CREATE TABLE IF NOT EXISTS `SportRecord` (`userId` INTEGER NOT NULL, `sportId` TEXT NOT NULL, `time` TEXT NOT NULL, `duration` INTEGER NOT NULL, `distance` REAL NOT NULL, `calorie` REAL NOT NULL, `step` INTEGER NOT NULL, `climb` REAL NOT NULL, `locationType` INTEGER NOT NULL, `sportType` INTEGER NOT NULL, `uploadFlag` INTEGER NOT NULL, PRIMARY KEY(`sportId`))");
        ((r2.b) this.f29497b).o("CREATE TABLE IF NOT EXISTS `SportDetail` (`sportId` TEXT NOT NULL, `time` TEXT NOT NULL, `latLngs` TEXT, `heartRates` TEXT, PRIMARY KEY(`sportId`))");
        if (arrayList != null && !arrayList.isEmpty()) {
            r2.f t10 = ((r2.b) this.f29497b).t("INSERT OR REPLACE INTO `SportRecord` (`userId`,`sportId`,`time`,`duration`,`distance`,`calorie`,`step`,`climb`,`locationType`,`sportType`,`uploadFlag`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            r2.f t11 = ((r2.b) this.f29497b).t("INSERT OR REPLACE INTO `SportDetail` (`sportId`,`time`,`latLngs`,`heartRates`) VALUES (?,?,?,?)");
            try {
                for (ng.a aVar : arrayList) {
                    p000do.a.f13275a.b("SportRecordTemp Migrate:%s", aVar.toString());
                    b(t10, aVar);
                    t10.F0();
                    t11.p(1, aVar.f22351b);
                    t11.p(2, aVar.f22352c);
                    String str = aVar.f22360k;
                    if (str == null) {
                        t11.m0(3);
                    } else {
                        t11.p(3, str);
                    }
                    String str2 = aVar.f22361l;
                    if (str2 == null) {
                        t11.m0(4);
                    } else {
                        t11.p(4, str2);
                    }
                    t11.F0();
                }
            } catch (Exception e11) {
                p000do.a.a(e11);
            }
        }
    }

    public final String d(String str) {
        Cursor m10 = ((r2.b) this.f29497b).m("SELECT * FROM SportLatLng WHERE sportId=?", new Object[]{str});
        if (m10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                int o10 = p.b.o(m10, "lat");
                int o11 = p.b.o(m10, "lng");
                int o12 = p.b.o(m10, "timestamp");
                int o13 = p.b.o(m10, "duration");
                int o14 = p.b.o(m10, "isRestart");
                while (m10.moveToNext()) {
                    arrayList.add(new SportLatLng(m10.getDouble(o10), m10.getDouble(o11), m10.getLong(o12), m10.getInt(o13), m10.getInt(o14)));
                }
            } catch (Exception e10) {
                p000do.a.a(e10);
            }
            m10.close();
            if (arrayList.isEmpty() || arrayList.isEmpty()) {
                return null;
            }
            return qg.a.f24816a.b(l0.d(List.class, SportLatLng.class)).e(arrayList);
        } catch (Throwable th2) {
            m10.close();
            throw th2;
        }
    }

    public final String toString() {
        switch (this.f29496a) {
            case 2:
                StringBuilder a10 = android.support.v4.media.d.a("GetAncScenarioChooseInfoRsp {");
                StringBuilder a11 = android.support.v4.media.d.a("\n\tgroupNum=");
                a11.append(((ad.a) this.f29497b).f454a);
                a10.append(a11.toString());
                a10.append("\n\tgroupScenario=" + he.a.a(((ad.a) this.f29497b).f455b));
                a10.append("\n}");
                return a10.toString();
            default:
                return super.toString();
        }
    }
}
