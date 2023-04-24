package m4;

import j4.i0;
import j4.t0;
import java.lang.reflect.Type;
import springfox.documentation.spring.web.json.Json;

/* loaded from: classes.dex */
public final class a implements t0 {

    /* renamed from: a */
    public static final a f20354a = new a();

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        i0Var.m().write(((Json) obj).value());
    }
}
