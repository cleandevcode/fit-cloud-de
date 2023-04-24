package j4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes.dex */
public final class s0 implements t0, i4.t {

    /* renamed from: a */
    public static final s0 f17466a = new s0();

    /* JADX WARN: Removed duplicated region for block: B:70:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(h4.a r11, java.lang.Class r12, e4.b r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r1 = r13.size()
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r12, r1)
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r1) goto L63
            java.lang.Object r5 = r13.get(r4)
            if (r5 != r13) goto L1a
            java.lang.reflect.Array.set(r2, r4, r2)
            goto L60
        L1a:
            boolean r6 = r12.isArray()
            if (r6 == 0) goto L31
            boolean r6 = r12.isInstance(r5)
            if (r6 == 0) goto L27
            goto L2d
        L27:
            e4.b r5 = (e4.b) r5
            java.lang.Object r5 = f(r11, r12, r5)
        L2d:
            java.lang.reflect.Array.set(r2, r4, r5)
            goto L60
        L31:
            boolean r6 = r5 instanceof e4.b
            if (r6 == 0) goto L54
            r6 = r5
            e4.b r6 = (e4.b) r6
            int r7 = r6.size()
            r8 = 0
            r9 = 0
        L3e:
            if (r8 >= r7) goto L4d
            java.lang.Object r10 = r6.get(r8)
            if (r10 != r13) goto L4a
            r6.set(r4, r2)
            r9 = 1
        L4a:
            int r8 = r8 + 1
            goto L3e
        L4d:
            if (r9 == 0) goto L54
            java.lang.Object[] r6 = r6.toArray()
            goto L55
        L54:
            r6 = r0
        L55:
            if (r6 != 0) goto L5d
            h4.k r6 = r11.f15771c
            java.lang.Object r6 = n4.n.b(r5, r12, r6)
        L5d:
            java.lang.reflect.Array.set(r2, r4, r6)
        L60:
            int r4 = r4 + 1
            goto Le
        L63:
            r13.f13348j = r2
            r13.f13349k = r12
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.s0.f(h4.a, java.lang.Class, e4.b):java.lang.Object");
    }

    @Override // i4.t
    public final int b() {
        return 14;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, byte[]] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        Type componentType;
        Class<?> cls;
        h4.c cVar = aVar.f15774f;
        int h02 = cVar.h0();
        Type type2 = 0;
        if (h02 == 8) {
            cVar.J(16);
            return null;
        } else if (h02 != 4 && h02 != 26) {
            if (type instanceof GenericArrayType) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
                if (componentType instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) componentType;
                    Type type3 = aVar.f15775g.f15837e;
                    if (type3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type3;
                        Type rawType = parameterizedType.getRawType();
                        if (rawType instanceof Class) {
                            TypeVariable<Class<T>>[] typeParameters = ((Class) rawType).getTypeParameters();
                            for (int i10 = 0; i10 < typeParameters.length; i10++) {
                                if (typeParameters[i10].getName().equals(typeVariable.getName())) {
                                    type2 = parameterizedType.getActualTypeArguments()[i10];
                                }
                            }
                        }
                        if (type2 instanceof Class) {
                            cls = type2;
                        } else {
                            cls = Object.class;
                        }
                    } else {
                        cls = n4.n.A(typeVariable.getBounds()[0]);
                    }
                } else {
                    cls = n4.n.A(componentType);
                }
            } else {
                componentType = ((Class) type).getComponentType();
                cls = componentType;
            }
            e4.b bVar = new e4.b();
            aVar.F(componentType, bVar, obj);
            return (T) f(aVar, cls, bVar);
        } else {
            ?? r82 = (T) cVar.R();
            cVar.J(16);
            if (r82.length == 0 && type != byte[].class) {
                return null;
            }
            return r82;
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            d1Var.X(e1.WriteNullListAsEmpty);
            return;
        }
        int length = objArr.length;
        int i11 = length - 1;
        if (i11 == -1) {
            d1Var.b("[]");
            return;
        }
        y0 y0Var = i0Var.f17411o;
        i0Var.q(y0Var, obj, obj2);
        try {
            d1Var.write(91);
            if (d1Var.q(e1.PrettyFormat)) {
                i0Var.f17407k++;
                i0Var.p();
                for (int i12 = 0; i12 < length; i12++) {
                    if (i12 != 0) {
                        d1Var.write(44);
                        i0Var.p();
                    }
                    i0Var.w(objArr[i12], Integer.valueOf(i12));
                }
                i0Var.f17407k--;
                i0Var.p();
                d1Var.write(93);
                return;
            }
            Class<?> cls = null;
            t0 t0Var = null;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj3 = objArr[i13];
                if (obj3 == null) {
                    d1Var.b("null,");
                } else {
                    if (i0Var.i(obj3)) {
                        i0Var.v(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            t0Var.e(i0Var, obj3, Integer.valueOf(i13), null, 0);
                        } else {
                            t0Var = i0Var.l(cls2);
                            t0Var.e(i0Var, obj3, Integer.valueOf(i13), null, 0);
                            cls = cls2;
                        }
                    }
                    d1Var.write(44);
                }
            }
            Object obj4 = objArr[i11];
            if (obj4 == null) {
                d1Var.b("null]");
            } else {
                if (i0Var.i(obj4)) {
                    i0Var.v(obj4);
                } else {
                    i0Var.w(obj4, Integer.valueOf(i11));
                }
                d1Var.write(93);
            }
        } finally {
            i0Var.f17411o = y0Var;
        }
    }
}
