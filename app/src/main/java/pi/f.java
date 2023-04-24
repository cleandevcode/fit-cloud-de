package pi;

import bi.m0;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import vf.h;

/* loaded from: classes2.dex */
public final class f<T extends vf.h> extends u7.c {

    /* renamed from: a */
    public final List<T> f24262a;

    /* renamed from: b */
    public SimpleDateFormat f24263b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends T> list) {
        this.f24262a = list;
        Locale locale = m0.f4330a;
        if (locale != null) {
            this.f24263b = new SimpleDateFormat("H:mm", locale);
        } else {
            gm.l.l("systemLocale");
            throw null;
        }
    }

    @Override // u7.c
    public final String a(float f10) {
        int i10 = (int) f10;
        List<T> list = this.f24262a;
        int size = list != null ? list.size() : 0;
        List<T> list2 = this.f24262a;
        if (list2 == null || i10 >= size) {
            return "";
        }
        String format = this.f24263b.format(list2.get(i10).a());
        gm.l.e(format, "{\n            formatter.…ndex].itemTime)\n        }");
        return format;
    }
}
