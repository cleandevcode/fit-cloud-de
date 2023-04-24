package ta;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import qa.x;
import ta.n;

/* loaded from: classes.dex */
public final class m extends n.b {

    /* renamed from: e */
    public final /* synthetic */ boolean f27881e;

    /* renamed from: f */
    public final /* synthetic */ Method f27882f;

    /* renamed from: g */
    public final /* synthetic */ Field f27883g;

    /* renamed from: h */
    public final /* synthetic */ boolean f27884h;

    /* renamed from: i */
    public final /* synthetic */ x f27885i;

    /* renamed from: j */
    public final /* synthetic */ qa.h f27886j;

    /* renamed from: k */
    public final /* synthetic */ xa.a f27887k;

    /* renamed from: l */
    public final /* synthetic */ boolean f27888l;

    /* renamed from: m */
    public final /* synthetic */ boolean f27889m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, boolean z10, boolean z11, boolean z12, Method method, Field field, boolean z13, x xVar, qa.h hVar, xa.a aVar, boolean z14, boolean z15) {
        super(str, str2, z10, z11);
        this.f27881e = z12;
        this.f27882f = method;
        this.f27883g = field;
        this.f27884h = z13;
        this.f27885i = xVar;
        this.f27886j = hVar;
        this.f27887k = aVar;
        this.f27888l = z14;
        this.f27889m = z15;
    }

    @Override // ta.n.b
    public final void a(ya.a aVar, int i10, Object[] objArr) {
        Object a10 = this.f27885i.a(aVar);
        if (a10 == null && this.f27888l) {
            StringBuilder a11 = android.support.v4.media.d.a("null is not allowed as value for record component '");
            a11.append(this.f27897b);
            a11.append("' of primitive type; at path ");
            a11.append(aVar.v());
            throw new qa.p(a11.toString());
        }
        objArr[i10] = a10;
    }

    @Override // ta.n.b
    public final void b(ya.a aVar, Object obj) {
        Object a10 = this.f27885i.a(aVar);
        if (a10 != null || !this.f27888l) {
            if (this.f27881e) {
                n.b(obj, this.f27883g);
            } else if (this.f27889m) {
                throw new qa.m(a.b.b("Cannot set value of 'static final' ", va.a.c(this.f27883g, false)));
            }
            this.f27883g.set(obj, a10);
        }
    }

    @Override // ta.n.b
    public final void c(ya.b bVar, Object obj) {
        Object obj2;
        x qVar;
        if (!this.f27898c) {
            return;
        }
        if (this.f27881e) {
            AccessibleObject accessibleObject = this.f27882f;
            if (accessibleObject == null) {
                accessibleObject = this.f27883g;
            }
            n.b(obj, accessibleObject);
        }
        Method method = this.f27882f;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e10) {
                throw new qa.m(android.support.v4.media.a.a("Accessor ", va.a.c(this.f27882f, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = this.f27883g.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.s(this.f27896a);
        if (this.f27884h) {
            qVar = this.f27885i;
        } else {
            qVar = new q(this.f27886j, this.f27885i, this.f27887k.f30457b);
        }
        qVar.b(bVar, obj2);
    }
}
