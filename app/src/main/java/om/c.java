package om;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c implements Serializable {

    /* renamed from: a */
    public final Pattern f23635a;

    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: a */
        public final String f23636a;

        /* renamed from: b */
        public final int f23637b;

        public a(String str, int i10) {
            this.f23636a = str;
            this.f23637b = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f23636a, this.f23637b);
            gm.l.e(compile, "compile(pattern, flags)");
            return new c(compile);
        }
    }

    public c(String str) {
        Pattern compile = Pattern.compile(str);
        gm.l.e(compile, "compile(pattern)");
        this.f23635a = compile;
    }

    public c(Pattern pattern) {
        this.f23635a = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f23635a.pattern();
        gm.l.e(pattern, "nativePattern.pattern()");
        return new a(pattern, this.f23635a.flags());
    }

    public final List a(CharSequence charSequence) {
        gm.l.f(charSequence, "input");
        int i10 = 0;
        l.p0(0);
        Matcher matcher = this.f23635a.matcher(charSequence);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(charSequence.subSequence(i10, matcher.start()).toString());
                i10 = matcher.end();
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            return arrayList;
        }
        return h7.a.p(charSequence.toString());
    }

    public final String toString() {
        String pattern = this.f23635a.toString();
        gm.l.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}
