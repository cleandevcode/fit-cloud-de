package w1;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import w1.a;
import w1.p0;
import w1.s;
import w1.w;
import w1.w.a;

/* loaded from: classes.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends w1.a<MessageType, BuilderType> {
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public k1 unknownFields = k1.f29631f;
    public int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0538a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f29715a;

        /* renamed from: b */
        public MessageType f29716b;

        /* renamed from: c */
        public boolean f29717c = false;

        public a(MessageType messagetype) {
            this.f29715a = messagetype;
            this.f29716b = (MessageType) messagetype.k(f.NEW_MUTABLE_INSTANCE);
        }

        public static void m(w wVar, w wVar2) {
            z0 z0Var = z0.f29732c;
            z0Var.getClass();
            z0Var.a(wVar.getClass()).a(wVar, wVar2);
        }

        @Override // w1.q0
        public final w b() {
            return this.f29715a;
        }

        public final Object clone() {
            a aVar = (a) this.f29715a.k(f.NEW_BUILDER);
            MessageType i10 = i();
            aVar.l();
            m(aVar.f29716b, i10);
            return aVar;
        }

        public final MessageType h() {
            MessageType i10 = i();
            if (i10.g()) {
                return i10;
            }
            throw new i1();
        }

        public final MessageType i() {
            if (this.f29717c) {
                return this.f29716b;
            }
            MessageType messagetype = this.f29716b;
            messagetype.getClass();
            z0 z0Var = z0.f29732c;
            z0Var.getClass();
            z0Var.a(messagetype.getClass()).c(messagetype);
            this.f29717c = true;
            return this.f29716b;
        }

        public final void l() {
            if (this.f29717c) {
                MessageType messagetype = (MessageType) this.f29716b.k(f.NEW_MUTABLE_INSTANCE);
                m(messagetype, this.f29716b);
                this.f29716b = messagetype;
                this.f29717c = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b<T extends w<T, ?>> extends w1.b<T> {
        public b(T t10) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements q0 {
        public s<d> extensions = s.f29680d;

        @Override // w1.w, w1.p0
        public final a a() {
            a aVar = (a) k(f.NEW_BUILDER);
            aVar.l();
            a.m(aVar.f29716b, this);
            return aVar;
        }

        @Override // w1.w, w1.q0
        public final w b() {
            return (w) k(f.GET_DEFAULT_INSTANCE);
        }

        @Override // w1.w, w1.p0
        public final a f() {
            return (a) k(f.NEW_BUILDER);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements s.a<d> {
        @Override // w1.s.a
        public final void A() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // w1.s.a
        public final void o() {
        }

        @Override // w1.s.a
        public final void q() {
        }

        @Override // w1.s.a
        public final void r() {
        }

        @Override // w1.s.a
        public final a s(p0.a aVar, p0 p0Var) {
            a aVar2 = (a) aVar;
            aVar2.l();
            a.m(aVar2.f29716b, (w) p0Var);
            return aVar2;
        }

        @Override // w1.s.a
        public final q1 z() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends p0, Type> extends yb.y {
    }

    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        /* JADX INFO: Fake field, exist only in values array */
        GET_PARSER
    }

    public static <T extends w<?, ?>> T l(Class<T> cls) {
        w<?, ?> wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (wVar == null) {
            wVar = (T) ((w) n1.a(cls)).k(f.GET_DEFAULT_INSTANCE);
            if (wVar != null) {
                defaultInstanceMap.put(cls, wVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) wVar;
    }

    public static Object m(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends w<T, ?>> T n(T t10, i iVar, o oVar) {
        T t11 = (T) t10.k(f.NEW_MUTABLE_INSTANCE);
        try {
            z0 z0Var = z0.f29732c;
            z0Var.getClass();
            d1 a10 = z0Var.a(t11.getClass());
            j jVar = iVar.f29592d;
            if (jVar == null) {
                jVar = new j(iVar);
            }
            a10.e(t11, jVar, oVar);
            a10.c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof z) {
                throw ((z) e10.getCause());
            }
            throw new z(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof z) {
                throw ((z) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends w<?, ?>> void o(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    @Override // w1.p0
    public a a() {
        a aVar = (a) k(f.NEW_BUILDER);
        aVar.l();
        a.m(aVar.f29716b, this);
        return aVar;
    }

    @Override // w1.q0
    public w b() {
        return (w) k(f.GET_DEFAULT_INSTANCE);
    }

    @Override // w1.p0
    public final void d(k kVar) {
        z0 z0Var = z0.f29732c;
        z0Var.getClass();
        d1 a10 = z0Var.a(getClass());
        l lVar = kVar.f29623a;
        if (lVar == null) {
            lVar = new l(kVar);
        }
        a10.f(this, lVar);
    }

    @Override // w1.p0
    public final int e() {
        if (this.memoizedSerializedSize == -1) {
            z0 z0Var = z0.f29732c;
            z0Var.getClass();
            this.memoizedSerializedSize = z0Var.a(getClass()).h(this);
        }
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((w) k(f.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        z0 z0Var = z0.f29732c;
        z0Var.getClass();
        return z0Var.a(getClass()).g(this, (w) obj);
    }

    @Override // w1.p0
    public a f() {
        return (a) k(f.NEW_BUILDER);
    }

    @Override // w1.q0
    public final boolean g() {
        byte byteValue = ((Byte) k(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        z0 z0Var = z0.f29732c;
        z0Var.getClass();
        boolean d10 = z0Var.a(getClass()).d(this);
        k(f.SET_MEMOIZED_IS_INITIALIZED);
        return d10;
    }

    @Override // w1.a
    public final int h() {
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        z0 z0Var = z0.f29732c;
        z0Var.getClass();
        int i11 = z0Var.a(getClass()).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // w1.a
    public final void j(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public abstract Object k(f fVar);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        r0.c(this, sb2, 0);
        return sb2.toString();
    }
}
