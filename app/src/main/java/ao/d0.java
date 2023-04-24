package ao;

import ao.c;
import ao.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import zm.d;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: b */
    public final d.a f3798b;

    /* renamed from: c */
    public final zm.q f3799c;

    /* renamed from: d */
    public final List<f.a> f3800d;

    /* renamed from: e */
    public final List<c.a> f3801e;

    /* renamed from: f */
    public final Executor f3802f;

    /* renamed from: a */
    public final ConcurrentHashMap f3797a = new ConcurrentHashMap();

    /* renamed from: g */
    public final boolean f3803g = false;

    public d0(d.a aVar, zm.q qVar, List list, List list2, Executor executor) {
        this.f3798b = aVar;
        this.f3799c = qVar;
        this.f3800d = list;
        this.f3801e = list2;
        this.f3802f = executor;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f3801e.indexOf(null) + 1;
        int size = this.f3801e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = this.f3801e.get(i10).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f3801e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f3801e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final e0<?> b(Method method) {
        e0<?> e0Var;
        e0<?> e0Var2 = (e0) this.f3797a.get(method);
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (this.f3797a) {
            e0Var = (e0) this.f3797a.get(method);
            if (e0Var == null) {
                e0Var = e0.b(this, method);
                this.f3797a.put(method, e0Var);
            }
        }
        return e0Var;
    }

    public final <T> f<T, zm.z> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f3800d.indexOf(null) + 1;
        int size = this.f3800d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<T, zm.z> a10 = this.f3800d.get(i10).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f3800d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f3800d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<zm.c0, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f3800d.indexOf(null) + 1;
        int size = this.f3800d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<zm.c0, T> fVar = (f<zm.c0, T>) this.f3800d.get(i10).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f3800d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f3800d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f3800d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3800d.get(i10).getClass();
        }
    }
}
