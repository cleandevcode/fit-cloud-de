package hn;

import gm.l;
import hn.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import zm.v;

/* loaded from: classes2.dex */
public final class f extends k {

    /* renamed from: d */
    public final Method f16173d;

    /* renamed from: e */
    public final Method f16174e;

    /* renamed from: f */
    public final Method f16175f;

    /* renamed from: g */
    public final Class<?> f16176g;

    /* renamed from: h */
    public final Class<?> f16177h;

    /* loaded from: classes2.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a */
        public boolean f16178a;

        /* renamed from: b */
        public String f16179b;

        /* renamed from: c */
        public final List<String> f16180c;

        public a(ArrayList arrayList) {
            this.f16180c = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            l.f(obj, "proxy");
            l.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (l.a(name, "supports") && l.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (l.a(name, "unsupported") && l.a(Void.TYPE, returnType)) {
                this.f16178a = true;
                return null;
            }
            if (l.a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f16180c;
                }
            }
            if ((l.a(name, "selectProtocol") || l.a(name, "select")) && l.a(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i10 = 0;
                            while (true) {
                                Object obj3 = list.get(i10);
                                if (obj3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                String str = (String) obj3;
                                if (!this.f16180c.contains(str)) {
                                    if (i10 == size) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    this.f16179b = str;
                                    return str;
                                }
                            }
                        }
                        String str2 = this.f16180c.get(0);
                        this.f16179b = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((l.a(name, "protocolSelected") || l.a(name, "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f16179b = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f16173d = method;
        this.f16174e = method2;
        this.f16175f = method3;
        this.f16176g = cls;
        this.f16177h = cls2;
    }

    @Override // hn.k
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f16175f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // hn.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends v> list) {
        l.f(list, "protocols");
        k.f16188c.getClass();
        try {
            this.f16173d.invoke(null, sSLSocket, Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{this.f16176g, this.f16177h}, new a(k.a.a(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // hn.k
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f16174e.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z10 = aVar.f16178a;
                if (!z10 && aVar.f16179b == null) {
                    k.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                    return null;
                } else if (z10) {
                    return null;
                } else {
                    return aVar.f16179b;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
