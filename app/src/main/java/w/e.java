package w;

import android.database.Cursor;
import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;
import g9.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mf.h0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final Object f29490a;

    public /* synthetic */ e() {
        this.f29490a = new ArrayList(3);
    }

    public e(int i10) {
        if (i10 != 2) {
            this.f29490a = (v.n) v.k.a(v.n.class);
        } else {
            this.f29490a = new t();
        }
    }

    public static void b(r2.f fVar, pg.g gVar) {
        fVar.H(1, gVar.f24041a);
        fVar.H(2, gVar.f24042b);
        Date date = gVar.f24043c;
        gm.l.f(date, "date");
        fVar.p(3, dg.a.a(date));
        fVar.H(4, gVar.f24044d);
        String str = gVar.f24045e;
        if (str == null) {
            fVar.m0(5);
        } else {
            fVar.p(5, str);
        }
    }

    public final void a(oc.l lVar) {
        List list = (List) this.f29490a;
        if (lVar == null) {
            throw new NullPointerException("Set contributions cannot be null");
        }
        list.add(lVar);
    }

    public final void c(h0 h0Var) {
        ArrayList<pg.g> arrayList;
        String string;
        String string2;
        String str;
        Cursor U = ((r2.b) this.f29490a).U("SELECT * FROM MenstruationTimeline");
        if (U == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            try {
                try {
                    int o10 = p.b.o(U, "id");
                    int o11 = p.b.o(U, "userId");
                    int o12 = p.b.o(U, "date");
                    int o13 = p.b.o(U, "type");
                    int o14 = p.b.o(U, "extra");
                    while (U.moveToNext()) {
                        long j10 = U.getLong(o10);
                        long j11 = U.getLong(o11);
                        if (U.isNull(o12)) {
                            string = null;
                        } else {
                            string = U.getString(o12);
                        }
                        if (string != null) {
                            Date c10 = dg.a.c(string);
                            int i10 = U.getInt(o13);
                            if (U.isNull(o14)) {
                                string2 = null;
                            } else {
                                string2 = U.getString(o14);
                            }
                            if (i10 == 0) {
                                if (string2 != null) {
                                    JSONObject jSONObject = new JSONObject(string2);
                                    str = h0Var.a(WhMenstruationConfig.class).e(new WhMenstruationConfig(jSONObject.getInt("cycle"), jSONObject.getInt("duration"), c10));
                                }
                            } else {
                                str = string2;
                            }
                            arrayList2.add(new pg.g(j10, j11, c10, i10, str));
                        }
                    }
                } catch (Exception e10) {
                    p000do.a.a(e10);
                }
                U.close();
                arrayList = arrayList2;
            } catch (Throwable th2) {
                U.close();
                throw th2;
            }
        }
        ((r2.b) this.f29490a).o("DROP TABLE MenstruationTimeline");
        ((r2.b) this.f29490a).o("CREATE TABLE IF NOT EXISTS `MenstruationTimeline` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT NOT NULL, `type` INTEGER NOT NULL, `extra` TEXT)");
        if (arrayList != null && !arrayList.isEmpty()) {
            r2.f t10 = ((r2.b) this.f29490a).t("INSERT OR REPLACE INTO `MenstruationTimeline` (`id`,`userId`,`date`,`type`,`extra`) VALUES (nullif(?, 0),?,?,?,?)");
            try {
                for (pg.g gVar : arrayList) {
                    p000do.a.f13275a.b("MenstruationTimeline Migrate:%s", gVar.toString());
                    b(t10, gVar);
                    t10.F0();
                }
            } catch (Exception e11) {
                p000do.a.a(e11);
            }
        }
    }

    public final void d(g9.f fVar) {
        t tVar = (t) this.f29490a;
        g9.j jVar = new g9.j(fVar);
        tVar.f15058b.a(new g9.p(g9.i.f15035a, jVar));
        tVar.e();
    }

    public /* synthetic */ e(s2.a aVar) {
        this.f29490a = aVar;
    }
}
