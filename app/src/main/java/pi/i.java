package pi;

import android.content.Context;
import android.text.format.DateFormat;
import bi.m0;
import com.topstep.fitcloudpro.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import vf.i;

/* loaded from: classes2.dex */
public final class i<T extends vf.i> extends u7.c {

    /* renamed from: a */
    public final Context f24268a;

    /* renamed from: b */
    public final List<T> f24269b;

    /* renamed from: c */
    public SimpleDateFormat f24270c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Context context, List<? extends T> list) {
        this.f24268a = context;
        this.f24269b = list;
        Locale locale = m0.f4330a;
        if (locale != null) {
            String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "M.d");
            gm.l.e(bestDateTimePattern, "pattern");
            String Y = om.h.Y(om.h.Y(om.h.Y(bestDateTimePattern, "/", "."), "-", "."), " ", "");
            if (om.h.U(Y, ".", false)) {
                Y = Y.substring(0, Y.length() - 1);
                gm.l.e(Y, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale locale2 = m0.f4330a;
            if (locale2 != null) {
                this.f24270c = new SimpleDateFormat(Y, locale2);
                return;
            } else {
                gm.l.l("systemLocale");
                throw null;
            }
        }
        gm.l.l("systemLocale");
        throw null;
    }

    @Override // u7.c
    public final String a(float f10) {
        String format;
        String str;
        int i10 = (int) f10;
        if (i10 >= this.f24269b.size()) {
            return "";
        }
        if (i10 == this.f24269b.size() - 1) {
            format = this.f24268a.getString(R.string.data_time_today);
            str = "{\n            context.ge…ata_time_today)\n        }";
        } else {
            format = this.f24270c.format(this.f24269b.get(i10).a());
            str = "{\n            formatter.…ex].recordDate)\n        }";
        }
        gm.l.e(format, str);
        return format;
    }
}
