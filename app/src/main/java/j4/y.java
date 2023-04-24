package j4;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class y implements t0 {

    /* renamed from: b */
    public static final y f17473b = new y();

    /* renamed from: a */
    public final Member f17474a;

    public y() {
        this.f17474a = null;
    }

    public y(Member member) {
        this.f17474a = member;
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        Object invoke;
        int i11;
        Member member = this.f17474a;
        if (member == null) {
            d1 d1Var = i0Var.f17406j;
            Enum r22 = (Enum) obj;
            if (r22 == null) {
                d1Var.R();
                return;
            }
            String str = null;
            if (d1Var.f17363k && !d1Var.f17364l) {
                str = r22.name();
            } else if (d1Var.f17364l) {
                str = r22.toString();
            }
            if (str != null) {
                if (d1Var.q(e1.UseSingleQuotes)) {
                    i11 = 39;
                } else {
                    i11 = 34;
                }
                d1Var.write(i11);
                d1Var.write(str);
                d1Var.write(i11);
                return;
            }
            d1Var.L(r22.ordinal());
            return;
        }
        try {
            if (member instanceof Field) {
                invoke = ((Field) member).get(obj);
            } else {
                invoke = ((Method) member).invoke(obj, new Object[0]);
            }
            i0Var.s(invoke);
        } catch (Exception e10) {
            throw new e4.d("getEnumValue error", e10);
        }
    }
}
