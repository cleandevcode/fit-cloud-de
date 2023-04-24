package t5;

import android.widget.TextView;
import gm.l;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f27786a = new d();

    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.b(android.view.View):boolean");
    }

    public final boolean a(TextView textView) {
        int i10;
        if (i6.a.b(this)) {
            return false;
        }
        try {
            String i11 = f.i(textView);
            Pattern compile = Pattern.compile("\\s");
            l.e(compile, "compile(pattern)");
            l.f(i11, "input");
            String replaceAll = compile.matcher(i11).replaceAll("");
            l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i12 = length - 1;
                if (i12 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i13 = i12 - 1;
                        char charAt = replaceAll.charAt(i12);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int digit = Character.digit((int) charAt, 10);
                        if (digit >= 0) {
                            if (z10 && (digit = digit * 2) > 9) {
                                digit = (digit % 10) + 1;
                            }
                            i10 += digit;
                            z10 = !z10;
                            if (i13 < 0) {
                                break;
                            }
                            i12 = i13;
                        } else {
                            throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                        }
                    }
                } else {
                    i10 = 0;
                }
                if (i10 % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }
}
