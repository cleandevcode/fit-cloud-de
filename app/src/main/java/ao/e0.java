package ao;

import ao.a0;
import ao.h0;
import ao.j;
import ao.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import zm.d;
import zm.p;
import zm.s;
import zm.t;

/* loaded from: classes2.dex */
public abstract class e0<T> {
    public static j b(d0 d0Var, Method method) {
        Type genericReturnType;
        boolean z10;
        Type[] genericParameterTypes;
        int i10;
        int i11;
        w<?>[] wVarArr;
        String str;
        String str2;
        w<?>[] wVarArr2;
        w<?> wVar;
        w<?> vVar;
        w<?> wVar2;
        String str3;
        String value;
        String str4;
        String value2;
        String str5;
        String value3;
        a0.a aVar = new a0.a(d0Var, method);
        Annotation[] annotationArr = aVar.f3770c;
        int length = annotationArr.length;
        int i12 = 0;
        loop0: while (true) {
            String str6 = "HEAD";
            w<?> wVar3 = null;
            if (i12 < length) {
                Annotation annotation = annotationArr[i12];
                if (annotation instanceof co.b) {
                    value = ((co.b) annotation).value();
                    str4 = "DELETE";
                } else if (annotation instanceof co.f) {
                    value = ((co.f) annotation).value();
                    str4 = "GET";
                } else if (annotation instanceof co.g) {
                    value3 = ((co.g) annotation).value();
                    aVar.b(str6, value3, false);
                    i12++;
                } else {
                    if (annotation instanceof co.n) {
                        value2 = ((co.n) annotation).value();
                        str5 = "PATCH";
                    } else if (annotation instanceof co.o) {
                        value2 = ((co.o) annotation).value();
                        str5 = "POST";
                    } else if (annotation instanceof co.p) {
                        value2 = ((co.p) annotation).value();
                        str5 = "PUT";
                    } else if (annotation instanceof co.m) {
                        value = ((co.m) annotation).value();
                        str4 = "OPTIONS";
                    } else {
                        if (annotation instanceof co.h) {
                            co.h hVar = (co.h) annotation;
                            aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
                        } else if (annotation instanceof co.k) {
                            String[] value4 = ((co.k) annotation).value();
                            if (value4.length != 0) {
                                p.a aVar2 = new p.a();
                                int length2 = value4.length;
                                for (int i13 = 0; i13 < length2; i13++) {
                                    str3 = value4[i13];
                                    int indexOf = str3.indexOf(58);
                                    if (indexOf == -1 || indexOf == 0 || indexOf == str3.length() - 1) {
                                        break loop0;
                                    }
                                    String substring = str3.substring(0, indexOf);
                                    String trim = str3.substring(indexOf + 1).trim();
                                    if ("Content-Type".equalsIgnoreCase(substring)) {
                                        try {
                                            zm.s.f32677f.getClass();
                                            aVar.f3787t = s.a.a(trim);
                                        } catch (IllegalArgumentException e10) {
                                            throw h0.j(aVar.f3769b, e10, "Malformed content type: %s", trim);
                                        }
                                    } else {
                                        aVar2.a(substring, trim);
                                    }
                                }
                                aVar.f3786s = aVar2.c();
                            } else {
                                throw h0.j(aVar.f3769b, null, "@Headers annotation is empty.", new Object[0]);
                            }
                        } else if (annotation instanceof co.l) {
                            if (aVar.f3783p) {
                                throw h0.j(aVar.f3769b, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                            aVar.f3784q = true;
                        } else if (!(annotation instanceof co.e)) {
                            continue;
                        } else if (aVar.f3784q) {
                            throw h0.j(aVar.f3769b, null, "Only one encoding annotation is allowed.", new Object[0]);
                        } else {
                            aVar.f3783p = true;
                        }
                        i12++;
                    }
                    aVar.b(str5, value2, true);
                    i12++;
                }
                String str7 = str4;
                value3 = value;
                str6 = str7;
                aVar.b(str6, value3, false);
                i12++;
            } else if (aVar.f3781n != null) {
                if (!aVar.f3782o) {
                    if (aVar.f3784q) {
                        throw h0.j(aVar.f3769b, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar.f3783p) {
                        throw h0.j(aVar.f3769b, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length3 = aVar.f3771d.length;
                aVar.f3789v = new w[length3];
                int i14 = length3 - 1;
                int i15 = 0;
                while (i15 < length3) {
                    w<?>[] wVarArr3 = aVar.f3789v;
                    Type type = aVar.f3772e[i15];
                    Annotation[] annotationArr2 = aVar.f3771d[i15];
                    boolean z11 = i15 == i14;
                    if (annotationArr2 != null) {
                        int length4 = annotationArr2.length;
                        int i16 = 0;
                        while (i16 < length4) {
                            Annotation annotation2 = annotationArr2[i16];
                            int i17 = length3;
                            int i18 = i14;
                            int i19 = length4;
                            if (annotation2 instanceof co.y) {
                                aVar.c(i15, type);
                                if (aVar.f3780m) {
                                    throw h0.k(aVar.f3769b, i15, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar.f3776i) {
                                    throw h0.k(aVar.f3769b, i15, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.f3777j) {
                                    throw h0.k(aVar.f3769b, i15, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.f3778k) {
                                    throw h0.k(aVar.f3769b, i15, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.f3779l) {
                                    throw h0.k(aVar.f3769b, i15, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.f3785r != null) {
                                    throw h0.k(aVar.f3769b, i15, "@Url cannot be used with @%s URL", aVar.f3781n);
                                }
                                aVar.f3780m = true;
                                if (type != zm.q.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw h0.k(aVar.f3769b, i15, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                wVar = new w.n(aVar.f3769b, i15);
                                wVarArr2 = wVarArr3;
                                str2 = str6;
                            } else {
                                if (annotation2 instanceof co.s) {
                                    aVar.c(i15, type);
                                    if (aVar.f3777j) {
                                        throw h0.k(aVar.f3769b, i15, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar.f3778k) {
                                        throw h0.k(aVar.f3769b, i15, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar.f3779l) {
                                        throw h0.k(aVar.f3769b, i15, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar.f3780m) {
                                        throw h0.k(aVar.f3769b, i15, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar.f3785r == null) {
                                        throw h0.k(aVar.f3769b, i15, "@Path can only be used with relative url on @%s", aVar.f3781n);
                                    }
                                    aVar.f3776i = true;
                                    co.s sVar = (co.s) annotation2;
                                    String value5 = sVar.value();
                                    if (!a0.a.f3767y.matcher(value5).matches()) {
                                        throw h0.k(aVar.f3769b, i15, "@Path parameter name must match %s. Found: %s", a0.a.f3766x.pattern(), value5);
                                    }
                                    if (!aVar.f3788u.contains(value5)) {
                                        throw h0.k(aVar.f3769b, i15, "URL \"%s\" does not contain \"{%s}\".", aVar.f3785r, value5);
                                    }
                                    aVar.f3768a.e(type, annotationArr2);
                                    wVar2 = new w.i<>(aVar.f3769b, i15, value5, sVar.encoded());
                                } else if (annotation2 instanceof co.t) {
                                    aVar.c(i15, type);
                                    co.t tVar = (co.t) annotation2;
                                    String value6 = tVar.value();
                                    boolean encoded = tVar.encoded();
                                    Class<?> f10 = h0.f(type);
                                    aVar.f3777j = true;
                                    if (Iterable.class.isAssignableFrom(f10)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw h0.k(aVar.f3769b, i15, f10.getSimpleName() + " must include generic type (e.g., " + f10.getSimpleName() + "<String>)", new Object[0]);
                                        }
                                        aVar.f3768a.e(h0.e(0, (ParameterizedType) type), annotationArr2);
                                        wVar2 = new u(new w.j(value6, encoded));
                                    } else if (f10.isArray()) {
                                        aVar.f3768a.e(a0.a.a(f10.getComponentType()), annotationArr2);
                                        wVar2 = new v(new w.j(value6, encoded));
                                    } else {
                                        aVar.f3768a.e(type, annotationArr2);
                                        wVar2 = new w.j(value6, encoded);
                                    }
                                } else {
                                    if (annotation2 instanceof co.v) {
                                        aVar.c(i15, type);
                                        boolean encoded2 = ((co.v) annotation2).encoded();
                                        Class<?> f11 = h0.f(type);
                                        aVar.f3778k = true;
                                        if (Iterable.class.isAssignableFrom(f11)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw h0.k(aVar.f3769b, i15, f11.getSimpleName() + " must include generic type (e.g., " + f11.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            aVar.f3768a.e(h0.e(0, (ParameterizedType) type), annotationArr2);
                                            wVar2 = new u(new w.l(encoded2));
                                        } else if (f11.isArray()) {
                                            aVar.f3768a.e(a0.a.a(f11.getComponentType()), annotationArr2);
                                            wVar2 = new v(new w.l(encoded2));
                                        } else {
                                            aVar.f3768a.e(type, annotationArr2);
                                            wVar = new w.l<>(encoded2);
                                            str2 = str6;
                                        }
                                    } else {
                                        str2 = str6;
                                        if (annotation2 instanceof co.u) {
                                            aVar.c(i15, type);
                                            Class<?> f12 = h0.f(type);
                                            aVar.f3779l = true;
                                            if (!Map.class.isAssignableFrom(f12)) {
                                                throw h0.k(aVar.f3769b, i15, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type g10 = h0.g(type, f12, Map.class);
                                            if (!(g10 instanceof ParameterizedType)) {
                                                throw h0.k(aVar.f3769b, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) g10;
                                            Type e11 = h0.e(0, parameterizedType);
                                            if (String.class != e11) {
                                                throw h0.k(aVar.f3769b, i15, "@QueryMap keys must be of type String: " + e11, new Object[0]);
                                            }
                                            aVar.f3768a.e(h0.e(1, parameterizedType), annotationArr2);
                                            wVar2 = new w.k<>(aVar.f3769b, i15, ((co.u) annotation2).encoded());
                                        } else if (annotation2 instanceof co.i) {
                                            aVar.c(i15, type);
                                            String value7 = ((co.i) annotation2).value();
                                            Class<?> f13 = h0.f(type);
                                            if (Iterable.class.isAssignableFrom(f13)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw h0.k(aVar.f3769b, i15, f13.getSimpleName() + " must include generic type (e.g., " + f13.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                aVar.f3768a.e(h0.e(0, (ParameterizedType) type), annotationArr2);
                                                wVar2 = new u(new w.d(value7));
                                            } else if (f13.isArray()) {
                                                aVar.f3768a.e(a0.a.a(f13.getComponentType()), annotationArr2);
                                                wVar2 = new v(new w.d(value7));
                                            } else {
                                                aVar.f3768a.e(type, annotationArr2);
                                                wVar = new w.d<>(value7);
                                            }
                                        } else if (annotation2 instanceof co.j) {
                                            if (type == zm.p.class) {
                                                wVar2 = new w.f(aVar.f3769b, i15);
                                            } else {
                                                aVar.c(i15, type);
                                                Class<?> f14 = h0.f(type);
                                                if (!Map.class.isAssignableFrom(f14)) {
                                                    throw h0.k(aVar.f3769b, i15, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type g11 = h0.g(type, f14, Map.class);
                                                if (!(g11 instanceof ParameterizedType)) {
                                                    throw h0.k(aVar.f3769b, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType2 = (ParameterizedType) g11;
                                                Type e12 = h0.e(0, parameterizedType2);
                                                if (String.class != e12) {
                                                    throw h0.k(aVar.f3769b, i15, "@HeaderMap keys must be of type String: " + e12, new Object[0]);
                                                }
                                                aVar.f3768a.e(h0.e(1, parameterizedType2), annotationArr2);
                                                wVar2 = new w.e<>(aVar.f3769b, i15);
                                            }
                                        } else if (annotation2 instanceof co.c) {
                                            aVar.c(i15, type);
                                            if (!aVar.f3783p) {
                                                throw h0.k(aVar.f3769b, i15, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                            co.c cVar = (co.c) annotation2;
                                            String value8 = cVar.value();
                                            boolean encoded3 = cVar.encoded();
                                            aVar.f3773f = true;
                                            Class<?> f15 = h0.f(type);
                                            if (Iterable.class.isAssignableFrom(f15)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw h0.k(aVar.f3769b, i15, f15.getSimpleName() + " must include generic type (e.g., " + f15.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                aVar.f3768a.e(h0.e(0, (ParameterizedType) type), annotationArr2);
                                                wVar2 = new u(new w.b(value8, encoded3));
                                            } else if (f15.isArray()) {
                                                aVar.f3768a.e(a0.a.a(f15.getComponentType()), annotationArr2);
                                                wVar2 = new v(new w.b(value8, encoded3));
                                            } else {
                                                aVar.f3768a.e(type, annotationArr2);
                                                wVar2 = new w.b(value8, encoded3);
                                            }
                                        } else if (annotation2 instanceof co.d) {
                                            aVar.c(i15, type);
                                            if (!aVar.f3783p) {
                                                throw h0.k(aVar.f3769b, i15, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                            }
                                            Class<?> f16 = h0.f(type);
                                            if (!Map.class.isAssignableFrom(f16)) {
                                                throw h0.k(aVar.f3769b, i15, "@FieldMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type g12 = h0.g(type, f16, Map.class);
                                            if (!(g12 instanceof ParameterizedType)) {
                                                throw h0.k(aVar.f3769b, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType3 = (ParameterizedType) g12;
                                            Type e13 = h0.e(0, parameterizedType3);
                                            if (String.class != e13) {
                                                throw h0.k(aVar.f3769b, i15, "@FieldMap keys must be of type String: " + e13, new Object[0]);
                                            }
                                            aVar.f3768a.e(h0.e(1, parameterizedType3), annotationArr2);
                                            aVar.f3773f = true;
                                            wVar2 = new w.c<>(aVar.f3769b, i15, ((co.d) annotation2).encoded());
                                        } else if (annotation2 instanceof co.q) {
                                            aVar.c(i15, type);
                                            if (!aVar.f3784q) {
                                                throw h0.k(aVar.f3769b, i15, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                            co.q qVar = (co.q) annotation2;
                                            aVar.f3774g = true;
                                            String value9 = qVar.value();
                                            Class<?> f17 = h0.f(type);
                                            if (!value9.isEmpty()) {
                                                wVarArr2 = wVarArr3;
                                                String[] strArr = {"Content-Disposition", android.support.v4.media.a.a("form-data; name=\"", value9, "\""), "Content-Transfer-Encoding", qVar.encoding()};
                                                zm.p.f32652b.getClass();
                                                zm.p c10 = p.b.c(strArr);
                                                if (Iterable.class.isAssignableFrom(f17)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw h0.k(aVar.f3769b, i15, f17.getSimpleName() + " must include generic type (e.g., " + f17.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    Type e14 = h0.e(0, (ParameterizedType) type);
                                                    if (!t.c.class.isAssignableFrom(h0.f(e14))) {
                                                        vVar = new u(new w.g(aVar.f3769b, i15, c10, aVar.f3768a.c(e14, annotationArr2, aVar.f3770c)));
                                                    } else {
                                                        throw h0.k(aVar.f3769b, i15, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                } else if (f17.isArray()) {
                                                    Class<?> a10 = a0.a.a(f17.getComponentType());
                                                    if (!t.c.class.isAssignableFrom(a10)) {
                                                        vVar = new v(new w.g(aVar.f3769b, i15, c10, aVar.f3768a.c(a10, annotationArr2, aVar.f3770c)));
                                                    } else {
                                                        throw h0.k(aVar.f3769b, i15, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                } else if (t.c.class.isAssignableFrom(f17)) {
                                                    throw h0.k(aVar.f3769b, i15, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                } else {
                                                    wVar = new w.g<>(aVar.f3769b, i15, c10, aVar.f3768a.c(type, annotationArr2, aVar.f3770c));
                                                }
                                                wVar = vVar;
                                            } else if (Iterable.class.isAssignableFrom(f17)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw h0.k(aVar.f3769b, i15, f17.getSimpleName() + " must include generic type (e.g., " + f17.getSimpleName() + "<String>)", new Object[0]);
                                                } else if (t.c.class.isAssignableFrom(h0.f(h0.e(0, (ParameterizedType) type)))) {
                                                    wVar = new u(w.m.f3899a);
                                                } else {
                                                    throw h0.k(aVar.f3769b, i15, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else if (f17.isArray()) {
                                                if (t.c.class.isAssignableFrom(f17.getComponentType())) {
                                                    wVar2 = new v(w.m.f3899a);
                                                } else {
                                                    throw h0.k(aVar.f3769b, i15, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else if (!t.c.class.isAssignableFrom(f17)) {
                                                throw h0.k(aVar.f3769b, i15, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            } else {
                                                wVar2 = w.m.f3899a;
                                            }
                                        } else {
                                            wVarArr2 = wVarArr3;
                                            if (annotation2 instanceof co.r) {
                                                aVar.c(i15, type);
                                                if (!aVar.f3784q) {
                                                    throw h0.k(aVar.f3769b, i15, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                aVar.f3774g = true;
                                                Class<?> f18 = h0.f(type);
                                                if (!Map.class.isAssignableFrom(f18)) {
                                                    throw h0.k(aVar.f3769b, i15, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type g13 = h0.g(type, f18, Map.class);
                                                if (!(g13 instanceof ParameterizedType)) {
                                                    throw h0.k(aVar.f3769b, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) g13;
                                                Type e15 = h0.e(0, parameterizedType4);
                                                if (String.class != e15) {
                                                    throw h0.k(aVar.f3769b, i15, "@PartMap keys must be of type String: " + e15, new Object[0]);
                                                }
                                                Type e16 = h0.e(1, parameterizedType4);
                                                if (t.c.class.isAssignableFrom(h0.f(e16))) {
                                                    throw h0.k(aVar.f3769b, i15, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                wVar = new w.h<>(aVar.f3769b, i15, aVar.f3768a.c(e16, annotationArr2, aVar.f3770c), ((co.r) annotation2).encoding());
                                            } else if (annotation2 instanceof co.a) {
                                                aVar.c(i15, type);
                                                if (aVar.f3783p || aVar.f3784q) {
                                                    throw h0.k(aVar.f3769b, i15, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (aVar.f3775h) {
                                                    throw h0.k(aVar.f3769b, i15, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    f<T, zm.z> c11 = aVar.f3768a.c(type, annotationArr2, aVar.f3770c);
                                                    aVar.f3775h = true;
                                                    wVar = new w.a<>(aVar.f3769b, i15, c11);
                                                } catch (RuntimeException e17) {
                                                    throw h0.l(aVar.f3769b, e17, i15, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation2 instanceof co.x) {
                                                aVar.c(i15, type);
                                                Class<?> f19 = h0.f(type);
                                                for (int i20 = i15 - 1; i20 >= 0; i20--) {
                                                    w<?> wVar4 = aVar.f3789v[i20];
                                                    if ((wVar4 instanceof w.o) && ((w.o) wVar4).f3902a.equals(f19)) {
                                                        Method method2 = aVar.f3769b;
                                                        StringBuilder a11 = android.support.v4.media.d.a("@Tag type ");
                                                        a11.append(f19.getName());
                                                        a11.append(" is duplicate of parameter #");
                                                        a11.append(i20 + 1);
                                                        a11.append(" and would always overwrite its value.");
                                                        throw h0.k(method2, i15, a11.toString(), new Object[0]);
                                                    }
                                                }
                                                wVar = new w.o<>(f19);
                                            } else {
                                                wVar = null;
                                            }
                                        }
                                        wVar = wVar2;
                                    }
                                    wVarArr2 = wVarArr3;
                                }
                                str2 = str6;
                                wVar = wVar2;
                                wVarArr2 = wVarArr3;
                            }
                            if (wVar != null) {
                                if (wVar3 != null) {
                                    throw h0.k(aVar.f3769b, i15, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                wVar3 = wVar;
                            }
                            i16++;
                            length3 = i17;
                            i14 = i18;
                            length4 = i19;
                            str6 = str2;
                            wVarArr3 = wVarArr2;
                        }
                        i10 = length3;
                        i11 = i14;
                        wVarArr = wVarArr3;
                        str = str6;
                    } else {
                        i10 = length3;
                        i11 = i14;
                        wVarArr = wVarArr3;
                        str = str6;
                        wVar3 = null;
                    }
                    if (wVar3 == null) {
                        if (z11) {
                            try {
                                if (h0.f(type) == xl.d.class) {
                                    aVar.f3790w = true;
                                    wVar3 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw h0.k(aVar.f3769b, i15, "No Retrofit annotation found.", new Object[0]);
                    }
                    wVarArr[i15] = wVar3;
                    i15++;
                    wVar3 = null;
                    length3 = i10;
                    i14 = i11;
                    str6 = str;
                }
                String str8 = str6;
                if (aVar.f3785r != null || aVar.f3780m) {
                    boolean z12 = aVar.f3783p;
                    if (z12 || aVar.f3784q || aVar.f3782o || !aVar.f3775h) {
                        if (!z12 || aVar.f3773f) {
                            if (aVar.f3784q && !aVar.f3774g) {
                                throw h0.j(aVar.f3769b, null, "Multipart method must contain at least one @Part.", new Object[0]);
                            }
                            a0 a0Var = new a0(aVar);
                            Type genericReturnType2 = method.getGenericReturnType();
                            if (h0.h(genericReturnType2)) {
                                throw h0.j(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                            }
                            if (genericReturnType2 != Void.TYPE) {
                                boolean z13 = a0Var.f3765k;
                                Annotation[] annotations = method.getAnnotations();
                                if (z13) {
                                    Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                                    if (type2 instanceof WildcardType) {
                                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                                    }
                                    if (h0.f(type2) == b0.class && (type2 instanceof ParameterizedType)) {
                                        type2 = h0.e(0, (ParameterizedType) type2);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    genericReturnType = new h0.b(null, b.class, type2);
                                    if (!h0.i(annotations, f0.class)) {
                                        Annotation[] annotationArr3 = new Annotation[annotations.length + 1];
                                        annotationArr3[0] = g0.f3812b;
                                        System.arraycopy(annotations, 0, annotationArr3, 1, annotations.length);
                                        annotations = annotationArr3;
                                    }
                                } else {
                                    genericReturnType = method.getGenericReturnType();
                                    z10 = false;
                                }
                                try {
                                    c<?, ?> a12 = d0Var.a(genericReturnType, annotations);
                                    Type a13 = a12.a();
                                    if (a13 != zm.a0.class) {
                                        if (a13 != b0.class) {
                                            if (a0Var.f3757c.equals(str8) && !Void.class.equals(a13)) {
                                                throw h0.j(method, null, "HEAD method must use Void as response type.", new Object[0]);
                                            }
                                            try {
                                                f<zm.c0, T> d10 = d0Var.d(a13, method.getAnnotations());
                                                d.a aVar3 = d0Var.f3798b;
                                                return !z13 ? new j.a(a0Var, aVar3, d10, a12) : z10 ? new j.c(a0Var, aVar3, d10, a12) : new j.b(a0Var, aVar3, d10, a12);
                                            } catch (RuntimeException e18) {
                                                throw h0.j(method, e18, "Unable to create converter for %s", a13);
                                            }
                                        }
                                        throw h0.j(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                    }
                                    StringBuilder a14 = android.support.v4.media.d.a("'");
                                    a14.append(h0.f(a13).getName());
                                    a14.append("' is not a valid response body type. Did you mean ResponseBody?");
                                    throw h0.j(method, null, a14.toString(), new Object[0]);
                                } catch (RuntimeException e19) {
                                    throw h0.j(method, e19, "Unable to create call adapter for %s", genericReturnType);
                                }
                            }
                            throw h0.j(method, null, "Service methods cannot return void.", new Object[0]);
                        }
                        throw h0.j(aVar.f3769b, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    }
                    throw h0.j(aVar.f3769b, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                throw h0.j(aVar.f3769b, null, "Missing either @%s URL or @Url parameter.", aVar.f3781n);
            } else {
                throw h0.j(aVar.f3769b, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
        throw h0.j(aVar.f3769b, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str3);
    }

    public abstract T a(Object[] objArr);
}
