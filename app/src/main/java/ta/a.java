package ta;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class a<E> extends x<Object> {

    /* renamed from: c */
    public static final C0496a f27849c = new C0496a();

    /* renamed from: a */
    public final Class<E> f27850a;

    /* renamed from: b */
    public final q f27851b;

    /* renamed from: ta.a$a */
    /* loaded from: classes.dex */
    public class C0496a implements y {
        @Override // qa.y
        public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
            Type componentType;
            Type type = aVar.f30457b;
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z10) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new a(hVar, hVar.c(new xa.a<>(componentType)), sa.a.f(componentType));
        }
    }

    public a(qa.h hVar, x<E> xVar, Class<E> cls) {
        this.f27851b = new q(hVar, xVar, cls);
        this.f27850a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.x
    public final Object a(ya.a aVar) {
        if (aVar.h0() == 9) {
            aVar.X();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.D()) {
            arrayList.add(this.f27851b.a(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        if (this.f27850a.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.f27850a, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(newInstance, i10, arrayList.get(i10));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f27850a, size));
    }

    @Override // qa.x
    public final void b(ya.b bVar, Object obj) {
        if (obj == null) {
            bVar.y();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f27851b.b(bVar, Array.get(obj, i10));
        }
        bVar.k();
    }
}
