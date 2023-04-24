package i2;

import android.os.Bundle;
import i2.b0;
import i2.m;
import i2.v;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import nm.e;

/* loaded from: classes.dex */
public abstract class h0<D extends v> {

    /* renamed from: a */
    public k0 f16284a;

    /* renamed from: b */
    public boolean f16285b;

    /* loaded from: classes.dex */
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    public abstract D a();

    public final k0 b() {
        k0 k0Var = this.f16284a;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public v c(D d10, Bundle bundle, b0 b0Var, a aVar) {
        return d10;
    }

    public void d(List list, b0 b0Var) {
        e.a aVar = new e.a(new nm.e(new nm.p(new ul.p(list), new i0(this, b0Var))));
        while (aVar.hasNext()) {
            b().d((j) aVar.next());
        }
    }

    public void e(m.a aVar) {
        this.f16284a = aVar;
        this.f16285b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(j jVar) {
        v vVar = jVar.f16294b;
        if (!(vVar instanceof v)) {
            vVar = null;
        }
        if (vVar == null) {
            return;
        }
        c0 c0Var = new c0();
        c0Var.f16254b = true;
        tl.l lVar = tl.l.f28297a;
        b0.a aVar = c0Var.f16253a;
        aVar.f16241a = c0Var.f16254b;
        aVar.f16242b = false;
        aVar.b(c0Var.f16255c, c0Var.f16256d);
        c(vVar, null, aVar.a(), null);
        b().b(jVar);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(j jVar, boolean z10) {
        gm.l.f(jVar, "popUpTo");
        List list = (List) b().f16318e.getValue();
        if (list.contains(jVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            j jVar2 = null;
            while (j()) {
                jVar2 = (j) listIterator.previous();
                if (gm.l.a(jVar2, jVar)) {
                    break;
                }
            }
            if (jVar2 != null) {
                b().c(jVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + jVar + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }
}
