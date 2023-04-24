package p3;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: b */
    public final /* synthetic */ g3.l f23799b;

    /* renamed from: c */
    public final /* synthetic */ String f23800c;

    /* renamed from: d */
    public final /* synthetic */ boolean f23801d;

    public b(g3.l lVar, String str, boolean z10) {
        this.f23799b = lVar;
        this.f23800c = str;
        this.f23801d = z10;
    }

    @Override // p3.c
    public final void b() {
        WorkDatabase workDatabase = this.f23799b.f14895c;
        workDatabase.c();
        try {
            Iterator it = ((o3.r) workDatabase.w()).g(this.f23800c).iterator();
            while (it.hasNext()) {
                c.a(this.f23799b, (String) it.next());
            }
            workDatabase.p();
            workDatabase.l();
            if (this.f23801d) {
                g3.l lVar = this.f23799b;
                g3.e.a(lVar.f14894b, lVar.f14895c, lVar.f14897e);
            }
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }
}
