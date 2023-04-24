package p5;

import androidx.fragment.app.i1;
import d6.m0;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import o5.a0;
import o5.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: f */
    public static final HashSet<String> f23895f;

    /* renamed from: a */
    public final JSONObject f23896a;

    /* renamed from: b */
    public final boolean f23897b;

    /* renamed from: c */
    public final boolean f23898c;

    /* renamed from: d */
    public final String f23899d;

    /* renamed from: e */
    public final String f23900e;

    /* loaded from: classes.dex */
    public static final class a {
        public static final String a(String str) {
            HashSet<String> hashSet = d.f23895f;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                gm.l.e(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    gm.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    gm.l.e(digest, "digest.digest()");
                    return x5.e.a(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (UnsupportedEncodingException unused) {
                m0 m0Var = m0.f12709a;
                v vVar = v.f22837a;
                return "1";
            } catch (NoSuchAlgorithmException unused2) {
                m0 m0Var2 = m0.f12709a;
                v vVar2 = v.f22837a;
                return "0";
            }
        }

        public static final void b(String str) {
            boolean z10;
            boolean contains;
            HashSet<String> hashSet = d.f23895f;
            if (str != null) {
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && str.length() <= 40) {
                    HashSet<String> hashSet2 = d.f23895f;
                    synchronized (hashSet2) {
                        contains = hashSet2.contains(str);
                        tl.l lVar = tl.l.f28297a;
                    }
                    if (!contains) {
                        Pattern compile = Pattern.compile("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$");
                        gm.l.e(compile, "compile(pattern)");
                        if (compile.matcher(str).matches()) {
                            synchronized (hashSet2) {
                                hashSet2.add(str);
                            }
                            return;
                        }
                        throw new o5.p(i1.d(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
                    }
                    return;
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            throw new o5.p(a0.a(new Object[]{str, 40}, 2, Locale.ROOT, "Identifier '%s' must be less than %d characters", "java.lang.String.format(locale, format, *args)"));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: a */
        public final String f23901a;

        /* renamed from: b */
        public final boolean f23902b;

        /* renamed from: c */
        public final boolean f23903c;

        /* renamed from: d */
        public final String f23904d;

        public b(String str, String str2, boolean z10, boolean z11) {
            this.f23901a = str;
            this.f23902b = z10;
            this.f23903c = z11;
            this.f23904d = str2;
        }

        private final Object readResolve() {
            return new d(this.f23901a, this.f23902b, this.f23903c, this.f23904d);
        }
    }

    static {
        new a();
        f23895f = new HashSet<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(java.lang.String r8, java.lang.String r9, java.lang.Double r10, android.os.Bundle r11, boolean r12, boolean r13, java.util.UUID r14) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.d.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID):void");
    }

    private final Object writeReplace() {
        String jSONObject = this.f23896a.toString();
        gm.l.e(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f23900e, this.f23897b, this.f23898c);
    }

    public final String toString() {
        return i1.d(new Object[]{this.f23896a.optString("_eventName"), Boolean.valueOf(this.f23897b), this.f23896a.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }

    public d(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f23896a = jSONObject;
        this.f23897b = z10;
        String optString = jSONObject.optString("_eventName");
        gm.l.e(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f23899d = optString;
        this.f23900e = str2;
        this.f23898c = z11;
    }
}
