package com.mob.commons.cc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a */
    private t f8301a;

    /* renamed from: c */
    private HashMap<String, Object> f8303c;

    /* renamed from: e */
    private r f8305e;

    /* renamed from: f */
    private boolean f8306f;

    /* renamed from: b */
    private LinkedList<Object> f8302b = new LinkedList<>();

    /* renamed from: d */
    private HashMap<String, Class<?>> f8304d = new HashMap<>();

    public r(HashMap<String, Object> hashMap, t tVar) {
        this.f8301a = tVar;
        this.f8303c = new HashMap<>(hashMap);
    }

    public Object a() {
        return this.f8302b.pop();
    }

    public Object a(final Object obj, final boolean z10, Class<?>... clsArr) {
        return Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new InvocationHandler() { // from class: com.mob.commons.cc.r.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                Throwable th2;
                LinkedList<Object> b10;
                try {
                    Object obj3 = obj;
                    y yVar = obj3 != null ? obj3 instanceof y ? (y) obj3 : (y) ((Map) obj3).get(method.getName()) : null;
                    if (yVar != null) {
                        if (objArr == null) {
                            objArr = new Object[0];
                        }
                        if (z10) {
                            b10 = yVar.b(objArr);
                        } else {
                            try {
                                b10 = yVar.b(objArr);
                            } finally {
                                th2 = th;
                                try {
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (b10.isEmpty()) {
                            return null;
                        }
                        return b10.get(0);
                    }
                } catch (Throwable unused2) {
                }
                th2 = null;
                if (th2 == null) {
                    return null;
                }
                throw th2;
            }
        });
    }

    public Object a(String str) {
        for (r rVar = this; rVar != null; rVar = rVar.f8305e) {
            if (rVar.f8303c.containsKey(str)) {
                return rVar.f8303c.get(str);
            }
        }
        throw new RuntimeException(android.support.v4.media.a.a("Can not find \"", str, "\""));
    }

    public void a(Object obj) {
        this.f8302b.push(obj);
    }

    public void a(String str, Class<?> cls) {
        this.f8304d.put(str, cls);
    }

    public void a(Method method, int i10) {
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = a();
        }
        a(method, objArr);
    }

    public void a(Method method, Object[] objArr) {
        Object obj;
        if (Modifier.isStatic(method.getModifiers())) {
            obj = null;
        } else if (objArr.length <= 0) {
            throw new RuntimeException("receiver not found");
        } else {
            obj = objArr[0];
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                objArr2[i10] = objArr[i11];
                i10 = i11;
            }
            objArr = objArr2;
        }
        method.setAccessible(true);
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (method.getParameterTypes()[i12].isInterface()) {
                Object obj2 = objArr[i12];
                if (obj2 instanceof y) {
                    objArr[i12] = a(obj2, true, method.getParameterTypes()[i12]);
                }
            }
        }
        if (method.getReturnType() == Void.TYPE) {
            method.invoke(obj, objArr);
        } else {
            a(method.invoke(obj, objArr));
        }
    }

    public r b() {
        r rVar = new r(new HashMap(), this.f8301a);
        rVar.f8305e = this;
        return rVar;
    }

    public Class<?> b(String str) {
        for (r rVar = this; rVar != null; rVar = rVar.f8305e) {
            if (rVar.f8304d.containsKey(str)) {
                return rVar.f8304d.get(str);
            }
        }
        throw new RuntimeException(a.b.b("Can not find class ", str));
    }

    public r c() {
        return this.f8305e;
    }

    public int d() {
        return this.f8302b.size();
    }

    public void e() {
        this.f8306f = true;
    }

    public boolean f() {
        return this.f8306f;
    }

    public t g() {
        return this.f8301a;
    }

    public void b(String str, Object obj) {
        if (this.f8303c.containsKey(str)) {
            this.f8303c.put(str, obj);
            return;
        }
        r rVar = this.f8305e;
        if (rVar == null) {
            throw new RuntimeException(android.support.v4.media.a.a("\"", str, "\" has not defined"));
        }
        rVar.b(str, obj);
    }

    public void a(String str, Object obj) {
        if (this.f8303c.containsKey(str)) {
            throw new RuntimeException(android.support.v4.media.a.a("\"", str, "\" has defined"));
        }
        this.f8303c.put(str, obj);
    }
}
