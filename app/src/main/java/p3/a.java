package p3;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b */
    public final /* synthetic */ g3.l f23797b;

    /* renamed from: c */
    public final /* synthetic */ UUID f23798c;

    public a(g3.l lVar, UUID uuid) {
        this.f23797b = lVar;
        this.f23798c = uuid;
    }

    @Override // p3.c
    public final void b() {
        WorkDatabase workDatabase = this.f23797b.f14895c;
        workDatabase.c();
        try {
            c.a(this.f23797b, this.f23798c.toString());
            workDatabase.p();
            workDatabase.l();
            g3.l lVar = this.f23797b;
            g3.e.a(lVar.f14894b, lVar.f14895c, lVar.f14897e);
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }
}
