package rg;

import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
import java.util.Date;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a */
    public final long f25621a;

    /* renamed from: b */
    public final Date f25622b;

    /* renamed from: c */
    public final long f25623c;

    public e(long j10, @DateField Date date, long j11) {
        gm.l.f(date, "date");
        this.f25621a = j10;
        this.f25622b = date;
        this.f25623c = j11;
    }
}
