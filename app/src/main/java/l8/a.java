package l8;

import android.util.Log;
import i8.i;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final String f19402a;

    /* renamed from: b */
    public final String f19403b;

    /* renamed from: c */
    public final int f19404c;

    public a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f19403b = sb2;
        this.f19402a = str;
        new i(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f19402a, i10)) {
            i10++;
        }
        this.f19404c = i10;
    }

    public final void a(String str, Object... objArr) {
        boolean z10;
        if (this.f19404c <= 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String str2 = this.f19402a;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, this.f19403b.concat(str));
        }
    }
}
