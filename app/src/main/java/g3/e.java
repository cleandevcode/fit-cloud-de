package g3;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.p;
import o3.q;
import o3.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final String f14876a = f3.m.e("Schedulers");

    public static void a(androidx.work.a aVar, WorkDatabase workDatabase, List<d> list) {
        int i10;
        if (list != null && list.size() != 0) {
            q w10 = workDatabase.w();
            workDatabase.c();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i10 = aVar.f3644h / 2;
                } else {
                    i10 = aVar.f3644h;
                }
                r rVar = (r) w10;
                ArrayList c10 = rVar.c(i10);
                ArrayList b10 = rVar.b();
                if (c10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c10.iterator();
                    while (it.hasNext()) {
                        rVar.k(currentTimeMillis, ((p) it.next()).f22625a);
                    }
                }
                workDatabase.p();
                workDatabase.l();
                if (c10.size() > 0) {
                    p[] pVarArr = (p[]) c10.toArray(new p[c10.size()]);
                    for (d dVar : list) {
                        if (dVar.b()) {
                            dVar.a(pVarArr);
                        }
                    }
                }
                if (b10.size() > 0) {
                    p[] pVarArr2 = (p[]) b10.toArray(new p[b10.size()]);
                    for (d dVar2 : list) {
                        if (!dVar2.b()) {
                            dVar2.a(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.l();
                throw th2;
            }
        }
    }
}
