package wa;

import java.sql.Date;
import java.sql.Timestamp;
import wa.a;
import wa.b;
import wa.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final boolean f29774a;

    /* renamed from: b */
    public static final a.C0544a f29775b;

    /* renamed from: c */
    public static final b.a f29776c;

    /* renamed from: d */
    public static final c.a f29777d;

    /* loaded from: classes.dex */
    public class a extends ta.d<Date> {
    }

    /* loaded from: classes.dex */
    public class b extends ta.d<Timestamp> {
    }

    static {
        boolean z10;
        c.a aVar;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f29774a = z10;
        if (z10) {
            f29775b = wa.a.f29768b;
            f29776c = wa.b.f29770b;
            aVar = c.f29772b;
        } else {
            aVar = null;
            f29775b = null;
            f29776c = null;
        }
        f29777d = aVar;
    }
}
