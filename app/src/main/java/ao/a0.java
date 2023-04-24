package ao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a */
    public final Method f3755a;

    /* renamed from: b */
    public final zm.q f3756b;

    /* renamed from: c */
    public final String f3757c;

    /* renamed from: d */
    public final String f3758d;

    /* renamed from: e */
    public final zm.p f3759e;

    /* renamed from: f */
    public final zm.s f3760f;

    /* renamed from: g */
    public final boolean f3761g;

    /* renamed from: h */
    public final boolean f3762h;

    /* renamed from: i */
    public final boolean f3763i;

    /* renamed from: j */
    public final w<?>[] f3764j;

    /* renamed from: k */
    public final boolean f3765k;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: x */
        public static final Pattern f3766x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f3767y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final d0 f3768a;

        /* renamed from: b */
        public final Method f3769b;

        /* renamed from: c */
        public final Annotation[] f3770c;

        /* renamed from: d */
        public final Annotation[][] f3771d;

        /* renamed from: e */
        public final Type[] f3772e;

        /* renamed from: f */
        public boolean f3773f;

        /* renamed from: g */
        public boolean f3774g;

        /* renamed from: h */
        public boolean f3775h;

        /* renamed from: i */
        public boolean f3776i;

        /* renamed from: j */
        public boolean f3777j;

        /* renamed from: k */
        public boolean f3778k;

        /* renamed from: l */
        public boolean f3779l;

        /* renamed from: m */
        public boolean f3780m;

        /* renamed from: n */
        public String f3781n;

        /* renamed from: o */
        public boolean f3782o;

        /* renamed from: p */
        public boolean f3783p;

        /* renamed from: q */
        public boolean f3784q;

        /* renamed from: r */
        public String f3785r;

        /* renamed from: s */
        public zm.p f3786s;

        /* renamed from: t */
        public zm.s f3787t;

        /* renamed from: u */
        public LinkedHashSet f3788u;

        /* renamed from: v */
        public w<?>[] f3789v;

        /* renamed from: w */
        public boolean f3790w;

        public a(d0 d0Var, Method method) {
            this.f3768a = d0Var;
            this.f3769b = method;
            this.f3770c = method.getAnnotations();
            this.f3772e = method.getGenericParameterTypes();
            this.f3771d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f3781n;
            if (str3 == null) {
                this.f3781n = str;
                this.f3782o = z10;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (f3766x.matcher(substring).find()) {
                        throw h0.j(this.f3769b, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f3785r = str2;
                Matcher matcher = f3766x.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.f3788u = linkedHashSet;
                return;
            }
            throw h0.j(this.f3769b, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i10, Type type) {
            if (h0.h(type)) {
                throw h0.k(this.f3769b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public a0(a aVar) {
        this.f3755a = aVar.f3769b;
        this.f3756b = aVar.f3768a.f3799c;
        this.f3757c = aVar.f3781n;
        this.f3758d = aVar.f3785r;
        this.f3759e = aVar.f3786s;
        this.f3760f = aVar.f3787t;
        this.f3761g = aVar.f3782o;
        this.f3762h = aVar.f3783p;
        this.f3763i = aVar.f3784q;
        this.f3764j = aVar.f3789v;
        this.f3765k = aVar.f3790w;
    }
}
