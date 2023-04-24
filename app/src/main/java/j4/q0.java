package j4;

import cn.sharesdk.framework.InnerShareParams;
import java.io.File;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public final class q0 implements t0, i4.t {

    /* renamed from: c */
    public static Method f17462c = null;

    /* renamed from: d */
    public static boolean f17463d = false;

    /* renamed from: b */
    public static final q0 f17461b = new q0();

    /* renamed from: a */
    public static boolean f17460a = "true".equals(n4.g.e("fastjson.deserializer.fileRelativePathSupport"));

    public static void f(i0 i0Var, d1 d1Var, Iterator it) {
        d1Var.write(91);
        int i10 = 0;
        while (it.hasNext()) {
            if (i10 != 0) {
                d1Var.write(44);
            }
            i0Var.s(it.next());
            i10++;
        }
        d1Var.write(93);
    }

    @Override // i4.t
    public final int b() {
        return 4;
    }

    /* JADX WARN: Type inference failed for: r10v41, types: [T, java.text.SimpleDateFormat, java.text.DateFormat] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        Object E;
        String str;
        h4.c cVar = aVar.f15774f;
        int i10 = 0;
        if (type == InetSocketAddress.class) {
            if (cVar.h0() == 8) {
                cVar.nextToken();
                return null;
            }
            aVar.a(12);
            InetAddress inetAddress = null;
            while (true) {
                String W = cVar.W();
                cVar.J(17);
                if (W.equals(InnerShareParams.ADDRESS)) {
                    aVar.a(17);
                    inetAddress = (InetAddress) aVar.P(null, InetAddress.class);
                } else {
                    boolean equals = W.equals("port");
                    aVar.a(17);
                    if (equals) {
                        if (cVar.h0() == 2) {
                            int E2 = cVar.E();
                            cVar.nextToken();
                            i10 = E2;
                        } else {
                            throw new e4.d("port is not int");
                        }
                    } else {
                        aVar.D();
                    }
                }
                if (cVar.h0() == 16) {
                    cVar.nextToken();
                } else {
                    aVar.a(13);
                    return (T) new InetSocketAddress(inetAddress, i10);
                }
            }
        } else {
            if (aVar.f15779k == 2) {
                aVar.f15779k = 0;
                aVar.a(16);
                if (cVar.h0() == 4) {
                    if ("val".equals(cVar.W())) {
                        cVar.nextToken();
                        aVar.a(17);
                        E = aVar.E(null);
                        aVar.a(13);
                    } else {
                        throw new e4.d("syntax error");
                    }
                } else {
                    throw new e4.d("syntax error");
                }
            } else {
                E = aVar.E(null);
            }
            if (E == null) {
                str = null;
            } else if (E instanceof String) {
                str = (String) E;
            } else if (E instanceof e4.e) {
                e4.e eVar = (e4.e) E;
                if (type == Currency.class) {
                    String x10 = eVar.x("currency");
                    if (x10 != null) {
                        return (T) Currency.getInstance(x10);
                    }
                    String x11 = eVar.x("currencyCode");
                    if (x11 != null) {
                        return (T) Currency.getInstance(x11);
                    }
                }
                if (type == Map.Entry.class) {
                    return (T) eVar.entrySet().iterator().next();
                }
                return (T) n4.n.d(eVar, type, h4.k.f15845u);
            } else {
                throw new e4.d("expect string");
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            if (type == UUID.class) {
                return (T) UUID.fromString(str);
            }
            if (type == URI.class) {
                return (T) URI.create(str);
            }
            if (type == URL.class) {
                try {
                    return (T) new URL(str);
                } catch (MalformedURLException e10) {
                    throw new e4.d("create url error", e10);
                }
            } else if (type == Pattern.class) {
                return (T) Pattern.compile(str);
            } else {
                if (type == Locale.class) {
                    return (T) n4.n.h0(str);
                }
                if (type == SimpleDateFormat.class) {
                    ?? r10 = (T) new SimpleDateFormat(str, cVar.E0());
                    r10.setTimeZone(cVar.X());
                    return r10;
                } else if (type != InetAddress.class && type != Inet4Address.class && type != Inet6Address.class) {
                    if (type == File.class) {
                        if (str.indexOf("..") >= 0 && !f17460a) {
                            throw new e4.d("file relative path not support.");
                        }
                        return (T) new File(str);
                    } else if (type == TimeZone.class) {
                        return (T) TimeZone.getTimeZone(str);
                    } else {
                        if (type instanceof ParameterizedType) {
                            type = ((ParameterizedType) type).getRawType();
                        }
                        if (type == Class.class) {
                            aVar.f15771c.getClass();
                            return (T) n4.n.b0(str, false);
                        } else if (type == Charset.class) {
                            return (T) Charset.forName(str);
                        } else {
                            if (type == Currency.class) {
                                return (T) Currency.getInstance(str);
                            }
                            if (type == e4.g.class) {
                                return (T) new e4.g(str);
                            }
                            if (type instanceof Class) {
                                String name = ((Class) type).getName();
                                if (name.equals("java.nio.file.Path")) {
                                    try {
                                        if (f17462c == null && !f17463d) {
                                            f17462c = n4.n.b0("java.nio.file.Paths", false).getMethod("get", String.class, String[].class);
                                        }
                                        Method method = f17462c;
                                        if (method != null) {
                                            return (T) method.invoke(null, str, new String[0]);
                                        }
                                        throw new e4.d("Path deserialize erorr");
                                    } catch (IllegalAccessException e11) {
                                        throw new e4.d("Path deserialize erorr", e11);
                                    } catch (NoSuchMethodException unused) {
                                        f17463d = true;
                                    } catch (InvocationTargetException e12) {
                                        throw new e4.d("Path deserialize erorr", e12);
                                    }
                                }
                                throw new e4.d(a.b.b("MiscCodec not support ", name));
                            }
                            StringBuilder a10 = android.support.v4.media.d.a("MiscCodec not support ");
                            a10.append(type.toString());
                            throw new e4.d(a10.toString());
                        }
                    }
                } else {
                    try {
                        return (T) InetAddress.getByName(str);
                    } catch (UnknownHostException e13) {
                        throw new e4.d("deserialize inet adress error", e13);
                    }
                }
            }
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        String stringWriter;
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.R();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == SimpleDateFormat.class) {
            stringWriter = ((SimpleDateFormat) obj).toPattern();
            if (d1Var.q(e1.WriteClassName) && obj.getClass() != type) {
                d1Var.write(123);
                d1Var.y(e4.a.f13341c);
                i0Var.t(obj.getClass().getName());
                d1Var.E(',', "val", stringWriter);
                d1Var.write(125);
                return;
            }
        } else if (cls == Class.class) {
            stringWriter = ((Class) obj).getName();
        } else if (cls == InetSocketAddress.class) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
            InetAddress address = inetSocketAddress.getAddress();
            d1Var.write(123);
            if (address != null) {
                d1Var.y(InnerShareParams.ADDRESS);
                i0Var.s(address);
                d1Var.write(44);
            }
            d1Var.y("port");
            d1Var.L(inetSocketAddress.getPort());
            d1Var.write(125);
            return;
        } else if (obj instanceof File) {
            stringWriter = ((File) obj).getPath();
        } else if (obj instanceof InetAddress) {
            stringWriter = ((InetAddress) obj).getHostAddress();
        } else if (obj instanceof TimeZone) {
            stringWriter = ((TimeZone) obj).getID();
        } else if (obj instanceof Currency) {
            stringWriter = ((Currency) obj).getCurrencyCode();
        } else if (obj instanceof e4.j) {
            ((e4.j) obj).f(d1Var);
            return;
        } else if (obj instanceof Iterator) {
            f(i0Var, d1Var, (Iterator) obj);
            return;
        } else if (obj instanceof Iterable) {
            f(i0Var, d1Var, ((Iterable) obj).iterator());
            return;
        } else if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                String str = (String) key;
                if (value instanceof String) {
                    d1Var.I('{', str, (String) value);
                    d1Var.write(125);
                    return;
                }
                d1Var.write(123);
                d1Var.y(str);
            } else {
                d1Var.write(123);
                i0Var.s(key);
                d1Var.write(58);
            }
            i0Var.s(value);
            d1Var.write(125);
            return;
        } else if (obj.getClass().getName().equals("net.sf.json.JSONNull")) {
            d1Var.R();
            return;
        } else if (obj instanceof Node) {
            Node node = (Node) obj;
            try {
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                DOMSource dOMSource = new DOMSource(node);
                StringWriter stringWriter2 = new StringWriter();
                newTransformer.transform(dOMSource, new StreamResult(stringWriter2));
                stringWriter = stringWriter2.toString();
            } catch (TransformerException e10) {
                throw new e4.d("xml node to string error", e10);
            }
        } else {
            throw new e4.d("not support class : " + cls);
        }
        d1Var.Z(stringWriter);
    }
}
