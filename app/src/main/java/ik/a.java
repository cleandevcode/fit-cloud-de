package ik;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.r;
import androidx.lifecycle.v0;
import ih.v;
import java.util.Set;
import of.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: ik.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0299a {
        c a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        c a();
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public final Set<String> f17096a;

        /* renamed from: b */
        public final hk.a f17097b;

        public c(Set set, l lVar) {
            this.f17096a = set;
            this.f17097b = lVar;
        }
    }

    public static d a(ComponentActivity componentActivity, v0.b bVar) {
        c a10 = ((InterfaceC0299a) v.f(componentActivity, InterfaceC0299a.class)).a();
        a10.getClass();
        if (componentActivity.getIntent() != null) {
            componentActivity.getIntent().getExtras();
        }
        Set<String> set = a10.f17096a;
        bVar.getClass();
        return new d(set, bVar, a10.f17097b);
    }

    public static d b(r rVar, v0.b bVar) {
        c a10 = ((b) v.f(rVar, b.class)).a();
        a10.getClass();
        Bundle bundle = rVar.f2516f;
        Set<String> set = a10.f17096a;
        bVar.getClass();
        return new d(set, bVar, a10.f17097b);
    }
}
