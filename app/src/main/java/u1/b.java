package u1;

import android.content.Context;
import gm.l;
import gm.m;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends m implements fm.a<File> {

    /* renamed from: b */
    public final /* synthetic */ Context f28469b;

    /* renamed from: c */
    public final /* synthetic */ c f28470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.f28469b = context;
        this.f28470c = cVar;
    }

    @Override // fm.a
    public final File m() {
        Context context = this.f28469b;
        l.e(context, "applicationContext");
        String str = this.f28470c.f28471a;
        l.f(str, "name");
        String k10 = l.k(".preferences_pb", str);
        l.f(k10, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), l.k(k10, "datastore/"));
    }
}
