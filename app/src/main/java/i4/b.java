package i4;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b extends e {
    @Override // i4.e, i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, null, 0);
    }

    @Override // i4.e
    public final <T> T f(h4.a aVar, Type type, Object obj, String str, int i10) {
        Object E;
        SimpleDateFormat simpleDateFormat;
        Date date;
        SimpleDateFormat simpleDateFormat2;
        h4.c cVar = aVar.f15774f;
        Object obj2 = null;
        if (cVar.h0() == 2) {
            long j10 = cVar.j();
            cVar.J(16);
            if ("unixtime".equals(str)) {
                j10 *= 1000;
            }
            obj2 = Long.valueOf(j10);
        } else if (cVar.h0() == 4) {
            String W = cVar.W();
            if (str != null) {
                if ("yyyy-MM-dd HH:mm:ss.SSSSSSSSS".equals(str) && (type instanceof Class) && ((Class) type).getName().equals("java.sql.Timestamp")) {
                    return (T) n4.j.a(n4.n.P, W);
                }
                try {
                    simpleDateFormat = new SimpleDateFormat(str, aVar.f15774f.E0());
                } catch (IllegalArgumentException e10) {
                    if (str.contains("T")) {
                        try {
                            simpleDateFormat = new SimpleDateFormat(str.replaceAll("T", "'T'"), aVar.f15774f.E0());
                        } catch (IllegalArgumentException unused) {
                            throw e10;
                        }
                    } else {
                        simpleDateFormat = null;
                    }
                }
                if (e4.a.f13339a != null) {
                    simpleDateFormat.setTimeZone(aVar.f15774f.X());
                }
                try {
                    date = simpleDateFormat.parse(W);
                } catch (ParseException unused2) {
                    date = null;
                }
                if (date == null && e4.a.f13340b == Locale.CHINA) {
                    try {
                        simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
                    } catch (IllegalArgumentException e11) {
                        simpleDateFormat2 = simpleDateFormat;
                        if (str.contains("T")) {
                            try {
                                simpleDateFormat2 = new SimpleDateFormat(str.replaceAll("T", "'T'"), aVar.f15774f.E0());
                            } catch (IllegalArgumentException unused3) {
                                throw e11;
                            }
                        }
                    }
                    simpleDateFormat2.setTimeZone(aVar.f15774f.X());
                    try {
                        date = simpleDateFormat2.parse(W);
                    } catch (ParseException unused4) {
                        date = null;
                    }
                }
                if (date == null) {
                    if (str.equals("yyyy-MM-dd'T'HH:mm:ss.SSS") && W.length() == 19) {
                        try {
                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", e4.a.f13340b);
                            simpleDateFormat3.setTimeZone(e4.a.f13339a);
                            obj2 = simpleDateFormat3.parse(W);
                        } catch (ParseException unused5) {
                        }
                    }
                } else {
                    obj2 = date;
                }
            }
            if (obj2 == null) {
                cVar.J(16);
                String str2 = W;
                if (cVar.I(h4.b.AllowISO8601DateFormat)) {
                    h4.h hVar = new h4.h(W);
                    Date date2 = W;
                    if (hVar.t1(true)) {
                        date2 = hVar.f15824j.getTime();
                    }
                    hVar.close();
                    str2 = date2;
                }
                obj2 = str2;
            }
        } else if (cVar.h0() == 8) {
            cVar.nextToken();
        } else {
            if (cVar.h0() == 12) {
                cVar.nextToken();
                if (cVar.h0() == 4) {
                    if (e4.a.f13341c.equals(cVar.W())) {
                        cVar.nextToken();
                        aVar.a(17);
                        Class a10 = aVar.f15771c.a(cVar.W(), cVar.l0(), null);
                        if (a10 != null) {
                            type = a10;
                        }
                        aVar.a(4);
                        aVar.a(16);
                    }
                    cVar.D();
                    if (cVar.h0() == 2) {
                        long j11 = cVar.j();
                        cVar.nextToken();
                        E = Long.valueOf(j11);
                    } else {
                        StringBuilder a11 = android.support.v4.media.d.a("syntax error : ");
                        a11.append(cVar.z0());
                        throw new e4.d(a11.toString());
                    }
                } else {
                    throw new e4.d("syntax error");
                }
            } else if (aVar.f15779k == 2) {
                aVar.f15779k = 0;
                aVar.a(16);
                if (cVar.h0() == 4) {
                    if ("val".equals(cVar.W())) {
                        cVar.nextToken();
                        aVar.a(17);
                        E = aVar.E(null);
                    } else {
                        throw new e4.d("syntax error");
                    }
                } else {
                    throw new e4.d("syntax error");
                }
            } else {
                obj2 = aVar.E(null);
            }
            obj2 = E;
            aVar.a(13);
        }
        return (T) g(aVar, type, obj2);
    }

    public abstract Object g(h4.a aVar, Type type, Object obj);
}
