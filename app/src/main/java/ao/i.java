package ao;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class i extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b0<?> b0Var) {
        super("HTTP " + b0Var.f3791a.f32532d + " " + b0Var.f3791a.f32531c);
        Objects.requireNonNull(b0Var, "response == null");
        zm.a0 a0Var = b0Var.f3791a;
        int i10 = a0Var.f32532d;
        String str = a0Var.f32531c;
    }
}
