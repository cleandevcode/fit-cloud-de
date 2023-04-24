package o5;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o5.y;

/* loaded from: classes.dex */
public final class b0 implements y.e {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<String> f22679a;

    public b0(ArrayList<String> arrayList) {
        this.f22679a = arrayList;
    }

    @Override // o5.y.e
    public final void a(String str, String str2) {
        gm.l.f(str2, "value");
        ArrayList<String> arrayList = this.f22679a;
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
        gm.l.e(format, "java.lang.String.format(locale, format, *args)");
        arrayList.add(format);
    }
}
